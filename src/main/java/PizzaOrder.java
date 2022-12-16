import java.io.*;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet(name = "/pizza-order", urlPatterns = "/pizza-order")
public class PizzaOrder extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        String sauce = request.getParameter("sauce");

        String crust = request.getParameter("crust");

        String size = request.getParameter("size");

        String[] toppings = request.getParameterValues("check");

        String address = request.getParameter("address");

        PrintWriter out = response.getWriter();
        out.println("<h2> Your Pizza crust: "+crust+"</h2>");
        out.println("<h2> Your Pizza sauce: "+sauce+"</h2>");
        out.println("<h2> Your Pizza size: "+size+ "</h2>");

        for (int i = 0; i < toppings.length; i++) {
            if (i == 0) {
                out.println("<h2>Your toppings: <br> " + toppings[i] + "</h2>");
            } else {
                out.println("<h2>"+ toppings[i] + "</h2>");
            }

        }
        out.println("<h2>Delivering to this address: " + address + "</h2>");

    }

}

