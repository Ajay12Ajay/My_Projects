<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<%@ include file="Header.jsp"%>
	<form action="LoginCtl" method="post">

		<hr>
		<div align="center">
			<table>
				<tr>
					<th>Login Id</th>
					<td><input type="text" name="loginId"></td>
				</tr>
				<tr>
					<th>Password</th>
					<td><input type="text" name="password"></td>
				</tr>
				<tr>

					<td><input type="submit" value="signIn" name="operation"></td>
					<td><input type="submit" value="signUp" name="operation"></td>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>