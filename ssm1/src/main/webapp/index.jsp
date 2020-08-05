<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>签到</title>
</head>
<body>
<%--<a href="${pageContext.request.contextPath}/addStudent">进入书籍页面</a>--%>
<form action="${pageContext.request.contextPath}/addStudent" method="post">
    学号：<input type="text" name="id"/><br/>
    姓名：<input type="text" name="name"/><br/>
    专业：<input type="text" name="major"/><br/>
<input type="submit" value="提交"/>
</form>
</body>
</html>

