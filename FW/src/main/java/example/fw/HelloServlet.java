package example.fw;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //1 выриант без jsp
//        response.setContentType("text/html; charset=UTF-8");
//        PrintWriter pw = response.getWriter();
//        String cmd = request.getParameter("cmd");
//        String com = timeOrDate.commands(cmd);
//
//        pw.println("<html>");
//        pw.println("<h1>Time or date</h1>");
//        pw.println("<h2>" + com + "</h2>");
//        pw.println("</html>");

        //2 вариант с jsp
        request.getRequestDispatcher("/index.jsp").include(request,response);
    }

}