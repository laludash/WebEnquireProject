<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Set User Detail</h1>
<form action="setStudent" method ="post" > 
id :  <input type= "text"  name= "id"> <br>
name :<input type= "text"  name= "name"> <br>
city  :<input type= "text"  name= "city"> <br>
email :  <input type= "text"  name= "email"> <br>
password :<input type= "text"  name= "password"> <br>
<input type ="submit" value="save">
</form>
<h1>Get User Detail</h1>
<form action="getStudent" method="get"  > 
id :<input type= "text"  name= "id"> <br>
<input type ="submit" >
</form>
<h1>WELCOME TO LOGIN PAGE</h1>
<form action="login" >
Email :  <input type= "text"  name= "email"> <br>
Password :<input type= "password"  name= "password"> <br>

<input type ="submit" value="login">
</form>
</body>
</html>
