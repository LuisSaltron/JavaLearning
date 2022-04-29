package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/GeneracionExcelServlet")
public class GeneracionExcelServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("aplication/vnd.ms-excel");
		response.setHeader("Content-Disposition", "attachment;filename=excelEjemplo.xls");
		response.setHeader("Pragma", "no-chache"); // No guardar cache
		response.setHeader("Cache-control", "no-store"); // no guardar cache
		response.setHeader("Expires", "-1"); // que expire de inmediato

		PrintWriter out = response.getWriter();
		out.println("\tValores");
		out.println("\t1");
		out.println("\t2");
		out.println("Total\t=SUMA(b2:b3)");
		out.close();
	}

}
