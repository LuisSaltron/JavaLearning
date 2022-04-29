package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Suponemos que el usuario visita por primera vez
		boolean nuevoUsuario = true;
		String mensaje = "";
		// Obtener arreglo de Cookies
		Cookie[] cookies = request.getCookies();

		// Buscamos si ya existe una cookie creada con anterioridad
		// se llama visitante recurrente
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("visitanteRecurrente") && cookie.getValue().equals("si")) {
					nuevoUsuario = false;
					break;
				}
			}
		}
		if (nuevoUsuario) {
			Cookie visitanteCookie = new Cookie("visitanteRecurrente", "si");
			response.addCookie(visitanteCookie);
			mensaje = "Gracias por visitar nuestro sitio por primera vez";
		} else {
			mensaje = "Gracias por visitar nuevamente nuestro sitio";
		}
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("Mensaje: " + mensaje);
		out.close();
	}
}
