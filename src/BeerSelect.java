import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class BeerSelect extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        String c = request.getParameter("color");
        BeerExpert ex = new BeerExpert();
        List brands = ex.getBrands(c);

        //response.setContentType("text/html");
        //PrintWriter out = response.getWriter();
        //out.println("Beer Select Advice<br>");

        request.setAttribute("styles", brands);
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");

        view.forward(request, response);
    }
}
