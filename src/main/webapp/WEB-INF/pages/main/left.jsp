<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link href="<c:url value='/resources/styles/left.css' />" rel="stylesheet" type="text/css"/>
    <script src="<c:url value='/resources/js/jquery.cookie.js' />"></script>
    <script src="<c:url value='/resources/js/leftmenu.js' />"></script>
</head>
<script type="text/javascript">
    $(document).ready(function () {
        leftMenuOnload();
    });
</script>
<body>

<input type="hidden" id="MenuBottom" value=",3,7"/>

<div class="wrap">
    <div class="leftBg">功能菜单</div>
    <div class="user">
        <div class="userName">您好，admin！ 欢迎登录系统<span><a href="#" class="redLink">[注销]</a></span></div>
    </div>
    <ul id="menu">
        <li class="item default" id="li_1"><a href="#" class="title" name="1" id="a1">设备设施管理</a>
            <ul id="opt_1" class="optiton">
                <li class="plus" id="t1"><a href="#">基础信息管理</a></li>
                <li class="text" style="display:none" id="tt1">
                    <ul style="display:block;" class="list">
                        <li><a href="1_1_1.html" target="mainFrame">标志牌信息管理</a></li>
                        <li><a href="1_1_2.html" target="mainFrame">信号灯信息管理</a></li>
                        <li class="joinBottom"><a href="1_1_3.html" target="mainFrame">手持终端地图管理</a></li>
                    </ul>
                </li>
                <!--  -->
                <li class="plus" id="t2"><a href="#">系统设备管理</a></li>
                <li class="text" style="display:none" id="tt2">
                    <ul style="display:block" class="list">
                        <li><a href="1_2_1.html" target="mainFrame">手持终端管理</a></li>
                        <li><a href="1_2_2.html" target="mainFrame">RFID读写器管理</a></li>
                        <li class="joinBottom"><a href="1_2_3.html" target="mainFrame">Zigbee设备管理</a></li>
                    </ul>
                </li>

                <li class="plusBottom" id="t3"><a href="#">数据采集管理</a></li>
                <li class="text" style="display:none" id="tt3">
                    <ul style="display:block" class="list">
                        <li><a href="1_3_1.html" target="mainFrame">标志牌采集管理</a></li>
                        <li class="joinBottom"><a href="1_3_2.html" target="mainFrame">信号灯采集管理</a></li>
                    </ul>
                </li>
            </ul>
        </li>


        <li class="item default" id="li_2"><a href="#" class="title" name="2" id="a2">设施巡检管理</a>
            <ul id="opt_2" class="optiton">
                <li><a href="2_1.html" target="mainFrame">任务制定</a></li>
                <li class="joinBottom"><a href="2_2.html" target="mainFrame">任务下达跟踪</a></li>
            </ul>
        </li>


        <li class="item default" id="li_3"><a href="#" class="title" name="3" id="a3">状态信息检测</a>
            <ul id="opt_3" class="optiton">
                <li><a href="3_1.html" target="mainFrame">标志牌状态监测</a></li>
                <li><a href="3_2.html" target="mainFrame">手持终端状态监测</a></li>
                <li class="joinBottom"><a href="3_3.html" target="mainFrame">信号灯状态监测</a></li>
            </ul>
        </li>

        <li class="item default" id="li_4"><a href="#" class="title" name="4" id="a4">故障处置跟踪</a>
            <ul id="opt_4" class="optiton">
                <li><a href="4_1.html" target="mainFrame">标志牌故障处理跟踪</a></li>
                <li class="joinBottom"><a href="4_2.html" target="mainFrame">交通信号灯故障处理</a></li>
            </ul>
        </li>

        <li class="item default" id="li_5"><a href="#" class="title" name="5" id="a5">历史信息管理</a>
            <ul id="opt_5" class="optiton">
                <li><a href="5_1.html" target="mainFrame">标志牌历史信息</a></li>
                <li class="joinBottom"><a href="5_2.html" target="mainFrame">交通信号灯历史信息</a></li>
            </ul>
        </li>

        <li class="item default" id="li_6"><a href="#" class="title" name="6" id="a6">综合查询统计</a>
            <ul id="opt_6" class="optiton">
                <li><a href="6_1.html" target="mainFrame">标志牌查询</a></li>
                <li class="joinBottom"><a href="6_2.html" target="mainFrame">交通信号灯查询</a></li>
            </ul>
        </li>

        <li class="item default" id="li_7"><a href="#" class="title" name="7" id="a7">系统管理</a>
            <ul id="opt_7" class="optiton">
                <li><a href="7_1.html" target="mainFrame">修改密码</a></li>
                <li><a href="main.html" target="mainFrame">系统首页</a></li>
                <li><a href="#">系统日志</a></li>
                <li class="joinBottom"><a href="#">退出系统</a></li>
            </ul>
        </li>
    </ul>

</div>
</body>
</html>