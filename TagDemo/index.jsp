<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple JSP Tags Example</title>
</head>
<body>
    <h1>Different JSP Tags Example</h1>

    <!-- <%-- Declaration Tag --%> -->
    <%
        String message = "Hello, World!";
    %>
<!-- 
    <%-- Expression Tag --%> -->
    <h2>Message: <%= message %></h2>

    <%-- Scriptlet Tag --%>
    <%
        int number = 10;
        int square = number * number;
    %>
    <p>The square of <%= number %> is: <%= square %></p>

    <%-- Using a Loop in Scriptlet --%>
    <h3>First 5 Numbers:</h3>
    <ul>
    <%
        for (int i = 1; i <= 5; i++) {
    %>
        <li><%= i %></li>
    <%
        }
    %>
    </ul>
</body>
</html>
