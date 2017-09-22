<%@page language="java" pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0.1 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>文件上传</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
    <div class="upload">
        <form action="upload" method="post" enctype="multipart/form-data">
            <input type="file" name="file">
            <input type="submit" value="上传">
        </form>
    </div>
</body>
</html>
