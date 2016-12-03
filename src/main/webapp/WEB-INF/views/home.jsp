<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<p> <a href="${apgeContext.request.contextPath}/term_credit">학기별 이수 학점 조회</a>
<p> <a href="${apgeContext.request.contextPath}/division_credit">이수 구분별 학점 조회</a> 
<p> <a href="${apgeContext.request.contextPath}/application">수강 신청하기</a> 
<p> <a href="${apgeContext.request.contextPath}/application_menu">수강 신청 조회 메뉴</a> 
</body>
</html>
