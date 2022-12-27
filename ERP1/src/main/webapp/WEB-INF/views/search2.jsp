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
	<h1>생산관리 조회&수정화면</h1><br>
<fieldset>
	<legend><td>　　생산관리 조회화면<td></legend><br><br>

			제품코드  ${selectsearch.code} <br>
			제품이름  ${selectsearch.name} <br>
			제품원가  ${selectsearch.firstcost} <br>
			목표수량  ${selectsearch.targetcount} <br>
			재고수량  ${selectsearch.stock} <br>
			출고가  ${selectsearch.factoryprice} <br>
			그룹이름  ${selectsearch.groupcode} <br>


			<a href="/"><button>메인화면</button></a>
			<a href="/delete?code=${selectsearch.code}"><button>삭제하기</button></a>
	<!-- 	<a href="/selectmodify"><button>수정하기</button></a> -->
	</td>
    </tr>
	</form>
</fieldset>
</body>
</html>