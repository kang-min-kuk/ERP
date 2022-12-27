<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>생산관리 시스템</title>
</head>
<body>
<h1>생산관리 시스템</h1><br>
<fieldset>
<legend><td>생산관리 메인메뉴</legend></td>
	<button class="insert" type="button" onclick="location.href='/insert'">제품입력</button>
	<button class="search" type="button" onclick="location.href='/search'">제품조회</button>
</fieldset>

</body>
</html>