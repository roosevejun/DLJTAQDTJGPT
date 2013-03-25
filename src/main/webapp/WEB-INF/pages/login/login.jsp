<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="keywords" content="通途农村公路管理服务平台"/>
    <meta name="description"
          content="基于云计算模式，为广大农村公路管理机构提供服务的平台系统。该系统采用云计算的SaaS模式，即主要计算功能放置于云端，利用强劲的服务器集群系统、完善的硬件保护措施，24小时不间断的为用户提供高质量服务。"/>
    <meta name="ROBOTS" content="ALL">
    <meta name="GOOGLEBOT" content="index, follow">
    <title>通途农村公路管理服务平台</title>

    <link href="<c:url value='/resources/styles/style.css' />" rel="stylesheet" type="text/css"/>
</head>

<body>

<table width="960" border="0" cellspacing="0" cellpadding="0"
       style="border-bottom:2px solid #d21213;margin-bottom:10px;margin-top:5px">
    <tr>
        <td width="782"><img src="<c:url value='/resources/images/logo.gif'/>" width="352" height="59"/></td>
        <td width="178" style="text-align:right">
            <ul class="lineText">
                <li><a href="http://www.ahtongtu.com.cn" target="_blank" class="f666Link">安徽通途</a></li>
                <li>|</li>
                <li><a href="login.html" class="f666Link">登录</a></li>
                <li>|</li>
                <li><a href="setp1.html" class="f666Link">注册</a></li>
            </ul>
        </td>
    </tr>
</table>
<form method="post" id="fm1">
    <table width="960" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
            <td width="365"
                style="background:url(<c:url value='/resources/images/logo_bg.gif'/>) no-repeat;padding-top:30px;">
                <table width="88%" border="0" cellpadding="0" cellspacing="0" class="tab">
                    <tr>
                        <td width="8%" rowspan="4">&nbsp;</td>
                        <td width="67%" height="39"><input name="username" type="text" class="input" id="user" value="用户名"
                                                           onblur="if(this.value.length&lt;1)this.value=this.defaultValue;"
                                                           onfocus="if(this.value==this.defaultValue)this.value=''"/></td>
                        <td width="25%"><a href="#" class="blueLink">登录帐号？</a></td>
                    </tr>
                    <tr>
                        <td height="39"><input name="password" type="text" class="input" id="pws" value="密码"
                                               onblur="if(this.value.length&lt;1)this.value=this.defaultValue;"
                                               onfocus="if(this.value==this.defaultValue)this.value=''"/></td>
                        <td><a href="#" class="blueLink">忘记密码？</a></td>
                    </tr>
                    <tr>
                        <td height="38">
                            <div style="position:relative">
                                <input type="checkbox" name="checkbox" id="checkbox"/>两周内自动登录
                                <div id="tips">为了您的信息安全，请不要在网吧或公用电脑上使用此功能！</div>
                            </div>
                        </td>
                        <td rowspan="2">&nbsp;</td>
                    </tr>
                    <tr>
                        <td height="45">
                            <input type="hidden" name="_eventId" value="submit" />
                            <input type="submit" style="margin-right:18px;" value="" accesskey="l"  tabindex="4"  class="btnLogin">
                        </td>
                    </tr>
                    <tr>
                        <td height="30" colspan="3">&nbsp;</td>
                    </tr>
                </table>
                <ul class="bottomUL">
                    <li><a href="#" class="blueLink">什么是数字证书？</a></li>
                    <li><a href="#" class="blueLink">保护您的密码，请阅读密码安全</a></li>
                </ul>
            </td>
            <td width="30">&nbsp;</td>
            <td width="565"><a href="#"><img src="<c:url value='/resources/images/l_web.jpg'/>" alt="农村公路管理服务平台" width="565"
                                             height="200"/></a><a href="#"><img
                    src="<c:url value='/resources/images/l_phone.jpg'/>" alt="农村公路管理服务平台移动客户端" width="565"
                    height="209"/></a></td>
        </tr>
    </table>
</form>
<table width="960" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr>
        <td style="border-top:1px solid #ddd;">
            <div class="copyright">
                <ul>
                    <li><a href="#" class="f666Link">关于我们</a></li>
                    <li>|</li>
                    <li><a href="#" class="f666Link">网站地图</a></li>
                    <li>|</li>
                    <li><a href="#" class="f666Link">法律声明</a></li>
                    <li>|</li>
                    <li><a href="#" class="f666Link">服务条款</a></li>
                    <li>|</li>
                    <li><a href="#" class="f666Link">隐私声明</a></li>
                </ul>
                <div>www.anhuitongtu.cn © 2006-2012 All rights reserved. 版权所有：安徽省通途信息技术有限公司<br/>
                    服务热线：0551-5371656 0551-5371658 传真：0551-5371659 皖ICP备：09136547l号
                </div>
            </div>

        </td>
    </tr>
</table>

</body>
</html>