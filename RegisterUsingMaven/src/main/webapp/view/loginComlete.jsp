<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%! User user; %>
<%user=(User)request.getAttribute("user"); %>

<%= "ID:"+user.getId() %><br/>
<%= "Name:"+user.getName() %><br/>
<%= "Age:"+user.getAge() %><br/>
<%= "E-mail:"+user.getMail() %>

</body>
</html>