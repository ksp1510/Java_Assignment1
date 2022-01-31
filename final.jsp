<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Final Page</title>
<link rel="stylesheet" href="Style.css"></link>
</head>
<body>
<header>
	<div><img alt="logo" src="logo.jpg"></div>
	<div><h2>Marksheet</h2></div>
	</header>
	<main>
	<div id="studata">
	<p>First Name: <%= request.getParameter("fname")%></p>
	<p>Last Name: <%= request.getParameter("lname")%></p>
	<p>Enrollment Number: <%= request.getParameter("enrollnum")%></p>
	</div>
	
	<br>
	<div id="grades">
	<p>Average marks: <%= request.getParameter("avg")%></p>
	<p>Minimum marks: <%= request.getParameter("minValue")%></p>
	<p>Maximum marks: <%= request.getParameter("maxValue")%></p>
	<p>Grade: <%= request.getParameter("grade")%></p>
	</div>
	</main>
	<footer><p><h4>Team Name</h4></p><p>Misita Sankhala (C0807324)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Kishankumar Patel (C0805822)
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Suman Rani (C0796394)<br>Sonia (C0804808)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	Ramandeep Kaur(C0789784)</p></footer>
</body>
</html>