import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet(name = "FirstServlet")
public class FirstServlet extends HttpServlet {


    private static final String EMAIL = "a@a.com";
    private static final String PASSWORD = "a";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String Email = request.getParameter("email");
        String Password = request.getParameter("password");

        try (PrintWriter writer = response.getWriter()) {
            if(EMAIL.equalsIgnoreCase(Email) && PASSWORD.equals(Password)) {
                writer.println("Login Successful");
            } else {
                writer.println("Login Failed");
            }
        }
}



}
