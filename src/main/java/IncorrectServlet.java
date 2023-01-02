import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet(name = "IncorrectServlet", urlPatterns = "/IncorrectServlet")
public class IncorrectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String destination = "/ggresult.jsp";
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
        String result = "<h1>You Lost</h1>";
        request.setAttribute("result", result);
        requestDispatcher.forward(request, response);
        response.sendRedirect("/ggresult.jsp");
    }


}