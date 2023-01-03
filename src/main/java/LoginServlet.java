import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if(request.getSession().getAttribute("isLoggedIn") != null){
            if((boolean) request.getSession().getAttribute("isLoggedIn")) {
                System.out.println("isLoggedIn = true");
                response.sendRedirect("/profile");
            }
            else{
                System.out.println("isLoggedIn = false");
                request.getRequestDispatcher("/login.jsp").forward(request, response);
            }
        } else {
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean validAttempt = username.equals("admin") && password.equals("password");

        if (validAttempt) {
            request.getSession().setAttribute("isLoggedIn", true);
            request.getSession().setAttribute("user", "admin");
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/login");
        }
    }
}