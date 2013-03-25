<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>页面头</title>
    <link href="<c:url value='/resources/styles/top.css' />" rel="stylesheet" type="text/css"/>
</head>

<body>
<table width="100%"  border="0" cellspacing="0" cellpadding="0" style="background:url(<c:url value='/resources/images/index_04.jpg'/>) repeat-x;border-bottom:1px solid #7C99C3; ">
    <tr>
        <td width="476"><img src="<c:url value='/resources/images/index_03.jpg'/>" width="476" height="61" alt=""></td>
        <td width="166">&nbsp;</td>
        <td width="414" height="61" style="background:url(<c:url value='/resources/images/index_06.jpg'/>) top right no-repeat;position:relative ">
            <div class="topStyle"><a  href="main.html" target="mainFrame" class="whiteLink">系统首页</a> | <a  href="7_1.html" target="mainFrame" class="whiteLink">修改密码</a> | <a href="#" class="whiteLink">重新登录</a> | <a href="#" class="whiteLink">退出系统</a><img src="<c:url value='/resources/images/index.png'/>" /></div>
        </td>
    </tr>
</table>

</body>
</html>