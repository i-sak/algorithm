<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%	// 데이터
	request.setCharacterEncoding("utf-8");
	//String name = request.getParameter("name");
	//String id = request.getParameter("id");
	// 쿠키로 전달된 데이터 받기
/*	
	String name = null;
	String id = null;
	// 특정 쿠키를 얻을 수 없어서 모든 쿠키를 얻어 와야함
	
	Cookie[] cookies = request.getCookies();
	if(cookies != null) {
		for(int i=0; i<cookies.length; i++) {
			if(cookies[i].getName().equals("memName")) {
				name = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
			} else if(cookies[i].getName().equals("memId")) {
				id = cookies[i].getValue();
			}
		}
	}
*/
	//세션으로 전달된 데이터 받기
	String name = (String) session.getAttribute("memName");
	String id = (String) session.getAttribute("memId");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
<img src="../image/tumi.png" width="30" height="30"
	onclick="location.href='../main/index.jsp'"
	style="cursor: pointer;">
<%=id %>님이 로그인	
<br><br>
<input type="button" value="로그아웃" onclick="location.href='logout.jsp'">
</body>
</html>















