package controller;

import java.util.ArrayList;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import model.Usuario;
import java.io.IOException;
import model.Modulo;
import javax.servlet.ServletException;

@SuppressWarnings("serial")
@WebServlet("/listaModulosServlet")
public class ListaModulosServlet  extends HttpServlet{

	public void doGet(HttpServletRequest request,
			HttpServletResponse response)
					throws IOException, ServletException{

		String paginaDestino;

		//Valida se o usuario est� logado
		Usuario user = (Usuario)request.getSession().getAttribute("User");
		if(user == null) {
			//Usuario n�o autenticado
			request.setAttribute("Mensagem","Erro de AUTH - Usu�rio n�o autenticado.");
			paginaDestino ="/erro.jsp";
		}
		else {
			ArrayList<Modulo> modulosSistema = new ArrayList<Modulo>();

			//adiciona modulos dispon�veis (apenas backend)
			modulosSistema.add(new Modulo("Hotelaria", "listaEndPointsHotelariaServlet"));
			modulosSistema.add(new Modulo("Gastronomia", "listaEndPointsGastronomiaServlet"));

			request.setAttribute("Modulos", modulosSistema);

			paginaDestino ="/Views/listaModulosSistema.jsp";
		}

		// Realiza o redirect
		RequestDispatcher dispatcher = getServletContext()
				.getRequestDispatcher(paginaDestino);

		dispatcher.forward(request, response);
	}

	public void doPost(HttpServletRequest request,
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

			ArrayList<Modulo> modulosSistema = new ArrayList<Modulo>();

			// adds the available modules
			modulosSistema.add(new Modulo("Hotelaria", "listaEndPointsHotelariaServlet"));
			modulosSistema.add(new Modulo("Gastronomia", "listaEndPointsGastronomiaServlet"));
			request.setAttribute("Modulos", modulosSistema);
			paginaDestino ="/Views/listaModulosSistema.jsp";
		}

		// redirect
		RequestDispatcher dispatcher = getServletContext()
				.getRequestDispatcher(paginaDestino);

		dispatcher.forward(request, response);
	}
}
