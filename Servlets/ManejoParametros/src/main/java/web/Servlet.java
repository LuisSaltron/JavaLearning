package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		Leemos los parametros del formulario
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");

		System.out.println("Usuario:" + usuario);
		System.out.println("Password: " + password);

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<p>El parámetro usuario es: " + usuario);
		out.println("<br>");
		out.println("<p>El parámetro password es: " + password);
		out.println("</body>");
		out.println("</html>");
	}
}
