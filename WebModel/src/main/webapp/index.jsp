<%--
  Created by IntelliJ IDEA.
  User: Administration
  Date: 2019/1/16
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript" src="/web/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
    $(function () {
        $("#btn").click(function () {
            $.ajax({
                url:"http://127.0.0.1:8882/controller/test.action",
                type:"post",
                success:function (res) {
                    alert("success")
                },
                error:function (res) {
                    alert("error")
                }
            });
        });

        $("#btn1").click(function () {
            var name=$("#name").val();
            var password=$("#password").val();
            var salt=$("#salt").val();
            $.ajax({
                url:"http://127.0.0.1:8882/controller/regist.action",
                type:"post",
                data:{"name":name,"password":password,"salt":salt},
                success:function (res) {
                    alert("success")
                },
                error:function (res) {
                    alert("error")
                }
            });
        });
    });
</script>
<body>
    <button id="btn">测试</button>
    姓名：<input type="text" name="name" id="name"/>
    密码：<input type="text" name="password" id="password"/>
    盐：<input type="text" name="salt" id="salt"/>
    <button name="btn1" id="btn1" value="注册"/>

</body>
</html>
