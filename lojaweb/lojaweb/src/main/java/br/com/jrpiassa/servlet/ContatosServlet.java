package br.com.jrpiassa.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/contatos")
public class ContatosServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 141228629487786231L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet contatos");
		RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/view/contatos/contatos.jsp");
		rd.forward(req, resp);
	}

}
