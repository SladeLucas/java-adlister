import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getSession().getAttribute("isLoggedIn") == null ){
            System.out.println("hello from profile if");
            response.sendRedirect("/login");
        }
        else if((boolean) request.getSession().getAttribute("isLoggedIn")){
            System.out.println("hello from profile else-if");
            request.getRequestDispatcher("/profile.jsp").forward(request, response);
        } else {
            System.out.println("hello from profile else");
            response.sendRedirect("/login");
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Hello from profile.doPost()");
        doGet(req,resp);
    }
}