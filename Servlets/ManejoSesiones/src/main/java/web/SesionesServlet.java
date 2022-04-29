package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/SesionesServlets")
public class SesionesServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession();
		String titulo = null;

		// PEdir el atributo contadorVisitas a la sesión
		Integer contadorVisitas = (Integer) session.getAttribute("contadorVisitas");
		// si es nulo es la primera vez que accedemos a la aplicación
		if (contadorVisitas == null) {
			contadorVisitas = 1;
			titulo = "Bienvenido por primera vez";
		} else {
			contadorVisitas++;
			titulo = "Bienvenido una vez más";
		}
		// Agregamos el nuevo valor a la sesión
		session.setAttribute("contadorVisitas", contadorVisitas);

		PrintWriter out = response.getWriter();
		out.println("Número de visitas: " + contadorVisitas);
		out.println("ID de la sesión: " + session.getId());
	}
}
