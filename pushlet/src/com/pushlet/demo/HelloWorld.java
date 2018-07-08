package com.pushlet.demo;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.pushlet.demo.service.User;

import nl.justobjects.pushlet.core.Event;
import nl.justobjects.pushlet.core.EventPullSource;

@Controller
public class HelloWorld {

	
	private static User user;
	
	
	public static class testEvent extends EventPullSource {

		protected long getSleepTime() {
			// TODO Auto-generated method stub
			return 3000;
		}

		@Override
		protected Event pullEvent() {
			Event event = Event.createDataEvent("/test/pushlet");
			
			ApplicationContext cxt = new ClassPathXmlApplicationContext("springmvc-servlet.xml");
			
			user = (User) cxt.getBean("user");
			
			String text = "{\"code\":\"200\",\"message\":\"sess\",\"data\":{\"name\":\"33\",\"age\":\"29\"}}";
			try {
				event.setField("data",URLEncoder.encode(text,"utf-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return event;
		}
		
	}
	
	
}
