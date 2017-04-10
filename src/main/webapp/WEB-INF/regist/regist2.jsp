<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="${pageContext.request.contextPath}/static/css/style.css" rel='stylesheet' type='text/css' />
</head>
<body>
<div class="main">
    <div class="header" >
        <h1>注册乐点商家</h1>
    </div>
    <%--http://demo.cssmoban.com/cssthemes2/dgfp_16_cvl/index.html--%>
    <%--<p>Lorem iopsum dolor sit amit,consetetur sadipscing eliter,sed diam voluptua.At vero  eso et accusam et justo duo dolores et ea rebum. </p>--%>
    <form>
        <ul class="left-form">
            <%--<h2>New Account:</h2>--%>
            <li>
                <input type="text"   placeholder="Username" required/>
                <a href="#" class="icon ticker" style="background:url(/static/images/spirit.png)  no-repeat 0px 0px;"> </a>
                <div class="clear"> </div>
            </li>
            <li>
                <input type="text"   placeholder="Email" required/>
                <a href="#" class="icon ticker" style="background:url(${pageContext.request.contextPath}/static/images/spirit.png)  no-repeat 0px 0px;"> </a>
                <div class="clear"> </div>
            </li>
            <li>
                <input type="password"   placeholder="password" required/>
                <a href="#" class="icon into"> </a>
                <div class="clear"> </div>
            </li>
            <li>
                <input type="password"   placeholder="password" required/>
                <a href="#" class="icon into"> </a>
                <div class="clear"> </div>
            </li>
            <%--<label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i> </i>Please inform me of upcoming  w3layouts, Promotions and news</label>--%>
            <input type="submit" onClick="myFunction()" value="加入">
            <div class="clear"> </div>
        </ul>
        <img src="${pageContext.request.contextPath}/static/images/spirit.png">
        <%--<ul class="right-form">--%>
            <%--<h3>Login:</h3>--%>
            <%--<div>--%>
                <%--<li><input type="text"  placeholder="Username" required/></li>--%>
                <%--<li> <input type="password"  placeholder="Password" required/></li>--%>
                <%--<h4>I forgot my Password!</h4>--%>
                <%--<input type="submit" onClick="myFunction()" value="Login" >--%>
            <%--</div>--%>
            <%--<div class="clear"> </div>--%>
        <%--</ul>--%>
        <div class="clear"> </div>

    </form>

</div>
<!-----start-copyright---->
<div class="copy-right">
    <p>乐点科技有限公司</p>
</div>
<!-----//end-copyright---->


</body>
</html>