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
<h1>생산관리 등록화면</h1><br>
<fieldset>
	<legend><td>　　생산관리 등록화면<td></legend><br><br>
		<form action="/selectinsert" method="get">
			ㆍ제품코드<input type="text" name="code" ><br>
			ㆍ제품이름<input type="text" name="name"><br>
			ㆍ제품원가<input type="text" name="firstcost"><br>
			ㆍ목표수량<input type="text" name="targetcount"><br>
			ㆍ재고수량<input type="text" name="stock"><br>
			ㆍ출고가　<input type="text" name="factoryprice"><br>
			ㆍ그룹이름<select name="groupcode"> <!--name은 DB 컬럼과 같게 -->
					<option value="A">컴퓨터</option>
					<option value="B">핸드폰소모품</option>
					<option value="C">냉장고소모품</option>
					</select><br>
						<input type = "submit"  value = 등록>
		</form>
						<a href="/"><button>메인화면</button></a>
</fieldset>
</body>
</html>