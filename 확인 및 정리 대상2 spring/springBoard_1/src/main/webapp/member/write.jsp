<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<c:if test="${su == 0 }">
<p>회원 가입 실패</p>
</c:if>
<c:if test="${su > 0 }">
<p>회원 가입 성공</p>
</c:if>
<a href="../main/index">메인화면</a>
</body>
</html>










