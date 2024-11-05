<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String mensaje;

    // Validación simple de usuario y contraseña (reemplazar con lógica real)
    if ("admin".equals(username) && "admin123".equals(password)) {
        mensaje = "Inicio de sesión exitoso.";
        response.sendRedirect("success.jsp"); // Redirigir a success.jsp
    } else {
        mensaje = "Usuario o contraseña incorrectos.";
        out.println("<html><body>");
        out.println("<h2>" + mensaje + "</h2>");
        out.println("<a href='login.jsp'>Intentar de nuevo</a>");
        out.println("</body></html>");
    }
%>
