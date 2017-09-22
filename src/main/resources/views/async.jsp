<%@page language="java" pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0.1 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>异步展示</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>

<script src="/assets/js/jquery.js"></script>
<script>
    deferred();

    function deferred() {
        $.get('defer',function (data) {
            console.log(data);
            deferred();
        });
    }
</script>

</body>
</html>
