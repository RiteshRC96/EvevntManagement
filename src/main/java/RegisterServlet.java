@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String userEmail = request.getParameter("userEmail");

        // Logic to store registration into database (not shown)
        response.sendRedirect("success.jsp");
    }
}
