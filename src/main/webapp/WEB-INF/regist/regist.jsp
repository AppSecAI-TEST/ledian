<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="/static/css/style.css" rel='stylesheet' type='text/css' />
</head>
<body>
<div class="main">
    <div class="header" >
        <h1>注册乐点商家</h1>
    </div>
    <%--http://demo.cssmoban.com/cssthemes2/dgfp_16_cvl/index.html--%>
    <%--<p>Lorem iopsum dolor sit amit,consetetur sadipscing eliter,sed diam voluptua.At vero  eso et accusam et justo duo dolores et ea rebum. </p>--%>
    <div class="content">
    <form name="regist" id="regist" action="./regist">
        <ul class="left-form">
            <%--<h2>New Account:</h2>--%>
            <li>
                <input type="text"  name="name"  placeholder="phoneNo" required/>
                <a href="#" class="icon ticker"> </a>
                <div class="clear"> </div>
            </li>
            <li>
                <input type="password" name="password"  placeholder="password" required/>
                <a href="#" class="icon into"> </a>
                <div class="clear"> </div>
            </li>
            <li>
                <input type="password" name="passwordConfirm"   placeholder="password" required/>
                <a href="#" class="icon into"> </a>
                <div class="clear"> </div>
            </li>
            <%--<label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i> </i>Please inform me of upcoming  w3layouts, Promotions and news</label>--%>
            <input type="submit"  value="加入">
            <div class="clear"> </div>
        </ul>

        <div class="clear"> </div>

    </form>
    </div>
    <!-----start-copyright---->
    <div class="copy-right">
        <p>乐点科技有限公司</p>
    </div>
    <!-----//end-copyright---->

</div>


</body>
</html>