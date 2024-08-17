<%@ page import="mathpackage.MathUtility" %>
<html>
<head>
    <title>Using Imported Package in JSP</title>
</head>
<body>
    <h2>Using a Custom Package in JSP</h2>
    <%
        int number = 5;
        int square = MathUtility.square(number);
        out.println("The square of " + number + " is: " + square);
    %>
</body>
</html>
