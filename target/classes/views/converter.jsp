<%@page language="java" pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0.1 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>自定义信息转换</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<div id="resp"></div>
<input type="button" value="请求" onclick="req()">
<script src="/assets/js/jquery.js"></script>
<script>
    function req() {
        $.ajax({
            url: "convert",
            data: "1-zhang",
            type: "POST",
            contentType:"application/x-wisely",
            success: function (data) {
                $("#resp").html(data);
            },
            error: function (data) {
                alert(data);
            }
        });
    }
</script>
</body>
</html>
