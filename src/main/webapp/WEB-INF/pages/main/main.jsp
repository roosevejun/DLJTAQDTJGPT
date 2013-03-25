<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
    <script src="<c:url value='/resources/js/jquery.min.js' />"></script>
    <script src="<c:url value='/resources/js/jquery.cookie.js' />"></script>
    <script src="<c:url value='/resources/js/operamasks-ui.min.js' />"></script>
    <link href="<c:url value='/resources/styles/operamasks/apusic/om-apusic.css' />" rel="stylesheet"
          type="text/css"/>
    <%--<link href="<c:url value='/resources/styles/demo.css' />" rel="stylesheet" type="text/css"/>--%>
    <link href="<c:url value='/resources/styles/layout.css' />" rel="stylesheet" type="text/css"/>
    <style type="text/css">

    </style>
    <script type="text/javascript">
        $(document).ready(function () {
            $('#borderLayout').omBorderLayout({
                panels: [
                    {
                        id: "top-panel",
                        header: false,
                        region: "north",
                        height: 65,
                        url: 'top.do',
                        loadingMessage: "正在加载头数据.....",
                        onError: function (xmlHttpRequest, textStatus, errorThrown) {
                            $(this).html("加载数据失败，请稍后重试。");
                        }
                    },
                    {
                        id: "left-panel",
                        title: "功能菜单",
                        header: false,
//                        iconCls:'myCls',
                        expandToBottom: false,
                        resizable: true,
                        collapsible: true,
                        region: "west",
                        url: 'left.do',
                        loadingMessage: "正在加载头数据.....",
                        onError: function (xmlHttpRequest, textStatus, errorThrown) {
                            $(this).html("加载数据失败，请稍后重试。");
                        },
                        width: 190
                    },
                    {
                        id: "center-panel",
                        header: false,
                        region: "center",
//                        url: 'left.do',
                        loadingMessage: "正在加载头数据.....",
                        onError: function (xmlHttpRequest, textStatus, errorThrown) {
                            $(this).html("加载数据失败，请稍后重试。");
                        }
                    },
                    {
                        id: "copyright-panel",
                        header: false,
                        region: "south",
                        url: 'copyright.do',
                        loadingMessage: "正在加载头数据.....",
                        onError: function (xmlHttpRequest, textStatus, errorThrown) {
                            $(this).html("加载数据失败，请稍后重试。");
                        },
                        height: 26
                    }
                ],
                hideCollapsBtn: true,
                spacing:2
            });
        });
    </script>
</head>
<body>
<div id="borderLayout">
    <div id="top-panel">
        <div id="top" style="height: 100%;width: 100%;padding: 0;margin: 0;">页面头部</div>
    </div>
    <div id="center-panel" style="padding: 0 10px;">中间</div>
    <div id="left-panel"> </div>
    <div id="copyright-panel">copyright</div>
</div>
</body>
</html>