<html>
<head><title>Events</title></head>
<body>
    <h1>Event Management System</h1>
    <a href="createEvent.jsp">Create New Event</a>
    <h2>Available Events:</h2>
    <table>
        <tr><th>Event Name</th><th>Event Date</th><th>Action</th></tr>
        <%
            // Here you will fetch events from a database
            // Example event
            out.println("<tr><td>CodeFest</td><td>2024-10-01</td><td><a href='registerEvent.jsp'>Register</a></td></tr>");
        %>
    </table>
</body>
</html>
