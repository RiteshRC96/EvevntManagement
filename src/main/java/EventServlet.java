@WebServlet("/event")
public class EventServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String eventName = request.getParameter("eventName");
        String eventDate = request.getParameter("eventDate");

        // Logic to store event into database (not shown)
        response.sendRedirect("success.jsp");
    }
}
