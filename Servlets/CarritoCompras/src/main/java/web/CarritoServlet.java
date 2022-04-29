package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		HttpSession session = request.getSession();
		// Recuperar la lista de objetos
		List<String> articulos = (List<String>) session.getAttribute("articulos");
		// verificamos si la lista de articulos existe
		if (articulos == null) {
			articulos = new ArrayList<>();
			session.setAttribute("articulos", articulos);
		}

		String articuloNuevo = request.getParameter("articulo");
		if (articuloNuevo != null && !articuloNuevo.trim().equals("")) {
			articulos.add(articuloNuevo);
		}

		PrintWriter out = response.getWriter();
		out.println("Lista de artículos");
		out.println("<br>");
		for (String art : articulos) {
			out.println("<li>" + art + "</li>");
		}
		out.println("<br>");
		out.println("<a href='/CarritoCompras'> Regresar </a>");
		out.close();
	}
}
