package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/ServletHeaders")
public class Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String metodoHttp = request.getMethod();
		String uri=request.getRequestURI();
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Resultado Servlet</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>Headers HTTP:</h1>");
		out.print("Método request HTTP: " + metodoHttp);
		out.print("<br>");
		out.print("URI utilizada: "+uri);
//		Imprimimos todos los cabeceros disponibles
		Enumeration cabeceros=request.getHeaderNames();
		while(cabeceros.hasMoreElements()) {
			String nombreCabecero=(String) cabeceros.nextElement();
			out.print("<b>"+nombreCabecero+"</b>");
			out.print(request.getHeader(nombreCabecero));
			out.print("<br>");
		}
		out.print("</body>");
		out.print("</html>");
		out.close();
	}
}
