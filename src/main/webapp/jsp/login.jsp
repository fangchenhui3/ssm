<%--
  Created by IntelliJ IDEA.
  User: fangchenhui
  Date: 2017/3/3
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
    <meta name="keywords" content="" />
    <meta name="description" content="" />
    <title>imyzone的练兵场</title>
    <script src="${pageContext.request.contextPath}/lib/jquery-1.11.0.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/log.css" />
    <script>
        $(function() {
            $('#login #password').focus(function() {
                $('#owl-login').addClass('password');
            }).blur(function() {
                $('#owl-login').removeClass('password');
            });
        });
    </script>
</head>
<body>
<div id="login">
    <div class="wrapper">
        <div class="login">
            <form action="/user/login.do" method="post" class="container offset1 loginform">
                <div id="owl-login">
                    <div class="hand"></div>
                    <div class="hand hand-r"></div>
                    <div class="arms">
                        <div class="arm"></div>
                        <div class="arm arm-r"></div>
                    </div>
                </div>
                <div class="pad">
                    <%--<input type="hidden" name="_csrf" value="9IAtUxV2CatyxHiK2LxzOsT6wtBE6h8BpzOmk=" id="">--%>
                    <div class="control-group">
                        <div class="controls">
                            <label for="email" class="control-label fa fa-envelope"></label>
                            <input id="email" type="email" name="email" placeholder="Email" tabindex="1" autofocus="autofocus" class="form-control input-medium">
                        </div>
                    </div>
                    <div class="control-group">
                        <div class="controls">
                            <label for="password" class="control-label fa fa-asterisk"></label>
                            <input id="password" type="password" name="password" placeholder="Password" tabindex="2" class="form-control input-medium">
                        </div>
                    </div>
                </div>
                <div class="form-actions"><a href="http://www.lanrentuku.com/" tabindex="5" class="btn pull-left btn-link text-muted">忘记密码?</a><a href="http://www.lanrentuku.com/" tabindex="6" class="btn btn-link text-muted">注册</a>
                    <button type="submit" tabindex="4" class="btn btn-primary">登录</button>
                </div>
            </form>
        </div>
    </div>


</div>

</body>
</html>
</html>
