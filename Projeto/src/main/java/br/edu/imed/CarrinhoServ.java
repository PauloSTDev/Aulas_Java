package br.edu.imed;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class CarrinhoServ
 */
@WebServlet("/CarrinhoServ")
public class CarrinhoServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarrinhoServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id1 = request.getParameter("id1");
	
		
		if (id1 == null) {
			
		}
		if (id1.equals("Comprar passagem para Holanda")) {
			
			response.sendRedirect("Pagamento.jsp");	
		}if (id1.equals("Comprar Passagem para Disney")) {
			
			response.sendRedirect("Pagamento1.html");
		}if (id1.equals("Comprar Passagem para as maldivas")) {
			response.sendRedirect("Pagamento2.html");
		}if (id1.equals("Comprar Passagem para o México")) {
			response.sendRedirect("Pagamento3.html");
		}if (id1.equals("Comprar Passagem para a praia")) {
			response.sendRedirect("Pagamento4.html");
		}if (id1.equals("Comprar Passagem para a Irlanda")) {
			response.sendRedirect("Pagamento5.html");
		}if (id1.equals("Comprar Passagem para a Hungria")) {
			response.sendRedirect("Pagamento6.html");	
		}if (id1.equals("Comprar Passagem para Istambul")) {
			response.sendRedirect("Pagamento7.html");	
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}