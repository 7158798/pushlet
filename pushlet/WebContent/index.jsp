<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="ajax-pushlet-client.js"></script>
<script type="text/javascript">
	    PL._init(); 
        PL.joinListen("/test/pushlet");	
		function onData(event) { 
			var data = decodeURIComponent(event.get("data"));
			console.debug(data);
			var json = JSON.parse(data);
			console.debug(json.code);
			console.debug(decodeURIComponent(event.get("data")));
			//console.debug(event.get("data"));
			//console.debug(decodeURI(event.get("data")));
		}
</script>
</head>
<body>this is index.jsp
</body>
</html>