<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>乐点点</title>
</head>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-1.10.2.min.js"></script>
<script type="text/javascript">
//    function sub(){
//        var name=$("#id").val();
//        alert(name);
//    }
    $.post("./regist", function(data){
        alert("Data Loaded: " + data);
    });
</script>
<body>
    <form id="regist" action="./regist">
        用户<input type="text" id="name" name="name">
        密码<input type="text" id="password" name="password">
        <%--<input type="button" onclick="sub" name="aaaa">--%>
        <input type="submit">
    </form>

</body>
</html>
