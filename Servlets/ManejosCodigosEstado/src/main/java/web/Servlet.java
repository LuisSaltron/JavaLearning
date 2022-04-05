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
	@SuppressWarnings("static-access")
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String usuarioOk = "lucho";
		String passwordOk = "123";

		String usuarioForm = request.getParameter("usuario");
		String passwordForm = request.getParameter("password");
		PrintWriter out = response.getWriter();

		if (usuarioForm.equals(usuarioOk) && passwordOk.equals(passwordForm)) {
			out.print("<h1>Datos correctos</h2>");
		} else {
			response.sendError(response.SC_UNAUTHORIZED, "Credenciales incorrectas");
		}
	}
}
