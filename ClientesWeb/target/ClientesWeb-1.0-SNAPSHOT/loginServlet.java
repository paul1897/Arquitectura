// LoginServlet.java
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Simular la autenticación (puedes reemplazar esto con una verificación real)
        if ("admin".equals(username) && "1234".equals(password)) {
            request.setAttribute("username", username);
            request.getRequestDispatcher("success.jsp").forward(request, response);
        } else {
            response.sendRedirect("login.jsp?error=1"); // Redirigir a login.jsp en caso de error
        }
    }
}
