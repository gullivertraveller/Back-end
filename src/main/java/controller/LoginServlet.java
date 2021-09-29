package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import model.Usuario;


@SuppressWarnings("serial")
@WebServlet("/loginServlet")
public class LoginServlet  extends HttpServlet{

	public void doPost(HttpServletRequest request,
			HttpServletResponse response)
					throws IOException, ServletException{

		String txtLogin = request.getParameter("txtLogin");
		String txtSenha = request.getParameter("txtSenha");
		String paginaDestino;

		// login simulation
		if (txtLogin.equals("admin") && txtSenha.equals("admin")) {

			Usuario usuario = new Usuario();
			usuario.setLogin("admin");
			usuario.setNome("ADMIN Gulliver");
			usuario.setEmail("admin@gulliver.com");

			// storage user session
			request.getSession().setAttribute("User", usuario);

			paginaDestino ="/listaModulosServlet";
		}
		else {
			// invalid usr
			request.setAttribute("Mensagem","Erro de LOGIN - utilize admin/admin");
			paginaDestino ="/erro.jsp";
		}

		// redirect
		RequestDispatcher dispatcher = getServletContext()
				.getRequestDispatcher(paginaDestino);

		dispatcher.forward(request, response);
	}
}
