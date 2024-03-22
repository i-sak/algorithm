<%@page import="board.dao.BoardDAO"%>
<%@page import="board.bean.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int su = (int)request.getAttribute("su");
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
<script type="text/javascript">
	// onload : html전체 로딩된 이후에 실행됨
	window.onload = function() {
		 if(${su>0} ) {
			alert("작성하신 글을 저장하였습니다.")
			location.href="boardList.do?pg=1";
		 } else { 
			alert("작성하신 글을 저장하지 못했습니다.")
			location.href="boardWriteForm.jsp";
		 } 
	}
</script>
</head>
<body>

<% 	if (su>0) { %>
	<p>작성하신 글을 저장하였습니다.</p>
<%	} else { %>
	<p>작성하신 글을 저장하지 못했습니다.</p>
<% 	} %>

</body>
</html>