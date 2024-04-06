package web;

import java.io.IOException;

import dao.IproductDao;
import dao.ProductDaoImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class controleurServlet extends HttpServlet{
	private IproductDao metier;
	
	@Override
	public void init() throws ServletException {
		metier = new ProductDaoImpl();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("products.jsp").forward(req, resp);
	}
}