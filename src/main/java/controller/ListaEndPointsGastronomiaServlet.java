package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Usuario;

@SuppressWarnings("serial")
@WebServlet("/listaEndPointsGastronomiaServlet")
public class ListaEndPointsGastronomiaServlet  extends HttpServlet{

	public void doGet(HttpServletRequest request,
			HttpServletResponse response)
					throws IOException, ServletException{
		String paginaDestino;

		// validates if the user is logged in
		Usuario user = (Usuario)request.getSession().getAttribute("User");
		if(user == null) {

			// user is not autenticated
			request.setAttribute("Mensagem","Erro de AUTH - Usu�rio n�o autenticado.");
			paginaDestino ="/erro.jsp";
		}
		else {
			paginaDestino = "/Views/Gastronomia/listaEndpointsGastronomia.jsp";
		}

		// redirect
		RequestDispatcher dispatcher = getServletContext()
				.getRequestDispatcher(paginaDestino);
		dispatcher.forward(request, response);
	}
}
