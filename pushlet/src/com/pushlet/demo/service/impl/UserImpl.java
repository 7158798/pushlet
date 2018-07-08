package com.pushlet.demo.service.impl;

import org.springframework.stereotype.Service;

import com.pushlet.demo.service.User;

@Service("user")
public class UserImpl implements User{

	public String get() {
		String json = "{\r\n" + 
				"	\"code\": \"200\",\r\n" + 
				"	\"message\": \"成功\",\r\n" + 
				"	\"data\": {\r\n" + 
				"		\"name\": \"张三\",\r\n" + 
				"		\"age\": \"29\"\r\n" + 
				"	}\r\n" + 
				"}";
		return json;
	}

}
