<%@page language="java" pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0.1 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>推送事件</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<div id="msgFromPush"></div>
<script src="/assets/js/jquery.js"></script>
<script>
    if(!!window.EventSource){
        var source = new EventSource('push');

        var s = '';

        source.addEventListener('message',function (e) {
            s+=e.data+"<br/>"
            $("#msgFromPush").html(s);
        })

        source.addEventListener('open',function (e) {
            console.log("链接打开");
        });

        source.addEventListener('error',function (e) {
            if(e.readyState == EventSource.CLOSED){
                console.log("链接关闭");
            }else{
                console.log(e.readyState);
            }
        },false);

    }else{
        console.log("您的浏览器不支持SSE");
    }
</script>
</body>
</html>
