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
	<h1>우선생산제품</h1><br>
<fieldset>
	<legend><td>　　우선생산제품 조회<td></legend><br><br>
<form action="/first" method="post">
	ㆍ제품코드<input type="text" name="code"><br>
	ㆍ제품이름<input type="text" name="name"><br>
	ㆍ제품원가<input type="number" name="firstcost"><br>
	ㆍ목표수량<input type="number" name="targercount"><br>
	ㆍ재고수량<input type="number" name="stock"><br>
	ㆍ출고가　<input type="number" name="factoryprice"><br>
	ㆍ그룹이름<select name="items1">
			<option value="com">컴퓨터</option>
			<option value="hp">핸드폰소모품</option>
			<option value="frige">냉장고소모품</option>
		</select><br>
			<input type = "submit"  value = 조회>
			<input type = "submit"  value = 수정>
			<input type = "submit"  value = 메인화면>
	</td>
    </tr>
    </form>

</fieldset>
</body>
</html>