package br.edu.imed;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String u = request.getParameter("username");
		String s = request.getParameter("password");
		
		Usuario u2 = new Usuario(u, s);
		
		List<Usuario> usuarios = ListaUsuarios.obterUsuarios();
				
		if (usuarios.contains(u2)) {
			response.sendRedirect("loading.html");
		}
		
		else {
			response.sendRedirect("acesso-negado.html");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("login.html");
		String nome = (String)request.getParameter("username");
		String senha = (String)request.getParameter("password");
		
		Usuario u = new Usuario(nome, senha);
		
		CadastroUsuario.cadastrarUsuario(u);
	}

}
