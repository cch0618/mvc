<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String cp = request.getContextPath();
%>
<html>
<head>
	<title>회원가입1</title>
</head>
<body>
<div>
	<h1>회원가입</h1>
</div>
<hr>
<form action="/insertsignup.action" method="post">
<div>
	<div>
		아이디 <span id="errID" class="errMsg">영문,숫자 혼합 8 ~ 16자</span>
		<div>
			<input type="text" name="user_id" id="user_id" placeholder="ID를 입력하세요">
			<button type="button">중복확인</button>
		</div>
	</div>
	<div>
		비밀번호<span id="errPWD" class="errMsg">영문,숫자 혼합 8 ~ 16자</span>
		<div>
			<input type="text" name="user_pwd" id="user_pwd" placeholder="Password를 입력하세요">
		</div>
	</div>
	<div>
		이름<span id="errName" class="errMsg">이름 형식에 맞지 않습니다.</span>
		<div>
			<input type="text" name="user_name" id="user_name" placeholder="이름을 입력하세요">
		</div>
	</div>
	<div>
	    <button type="submit" value="우왕">
	</div>
</div>
</form>
</body>
</html>
