<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.boxed {
	text-align: center;
	margin-left: auto;
	margin-right: auto;
	background-image: url('iplimage.jpg');
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
	text-align: center;
	padding-top: 20%;
}
.button:hover{
background-color:black;
  color: white;
}
</style>
</head>
<body class="boxed">
<h1 style="margin-left: auto;margin-right: auto;font-family:Cursive;margin-top: 15px;">Ipl</h1>


	<!-- <a href="add.jsp" style="font-size:45px;
font-style: bold;margin-top:100%;
text-decoration: none;color:black;font-style:bold;  ">
Add Team
</a><br> -->
	<a href="add.jsp"><input type="button" value="Add team" class="button"
		style="background-color: transparent;
		margin-left:auto;
		margin-right:auto; 
		color: black; 
		padding: 15px 32px; 
		text-align: center; 
		text-decoration: none; 
		display: inline-block; 
		font-size: 25px;
		font-weight:bold; 
		margin: 4px 2px; 
		cursor: pointer;
		border: 2px solid black;"></a>

	<a href="ok.jsp"><input type="button" value="Show Teams" class="button"
		style="background-color: transparent;
		margin-left:auto;
		margin-right:auto; 
		color: black; 
		padding: 15px 32px; 
		text-align: center; 
		text-decoration: none; 
		display: inline-block; 
		font-weight:bold;
		font-size: 25px;
		
		margin: 4px 2px; 
		cursor: pointer;
		border: 2px solid black;"></a>
		<!-- style="font-size: 45px; font-style: bold; margin-top: 100%; text-decoration: none; color: black; font-style: bold;">
		Show All Teams </a> -->


</body>
</html>