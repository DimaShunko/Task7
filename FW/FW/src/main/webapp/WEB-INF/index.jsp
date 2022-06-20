<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Time or date</title>
</head>
<body>
    <%@ page import="example.fw.timeOrDate" %>

    <h1>Time or date</h1>

    <h2>
        <%String cmd = request.getParameter("cmd");
        String com = timeOrDate.commands(cmd);%>
        <%= com%>
    </h2>

</body>
</html>