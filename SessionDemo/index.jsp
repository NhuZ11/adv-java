<html>
<head>
    <title>Session Information</title>
</head>
<body>
    <h2>Session Information</h2>
    <%
        // Remove the declaration of HttpSession since it's implicitly available
        if (session != null) {
            String username = (String) session.getAttribute("username");
            out.println("Username: " + username + "<br>");
            out.println("Session ID: " + session.getId() + "<br>");
            out.println("Creation Time: " + new java.util.Date(session.getCreationTime()) + "<br>");
            out.println("Last Accessed Time: " + new java.util.Date(session.getLastAccessedTime()) + "<br>");
        } else {
            out.println("No session found. Please visit the servlet first to create a session.");
        }
    %>
</body>
</html>
