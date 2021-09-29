package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.ServletException;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import java.util.ArrayList;

import model.Restaurante;

@SuppressWarnings("serial")
@WebServlet("/gastronomiaServlet")
public class GastronomiaServlet extends HttpServlet{

	public void doPost(HttpServletRequest request,
			HttpServletResponse response)
					throws IOException, ServletException{

		// obtaining req params
		String nomeP = request.getParameter("txtNome");
		String enderecoP = request.getParameter("txtEndereco");
		String tipoComidaP = request.getParameter("txtTipoComida");
		int faixaPrecoP = Integer.parseInt(request.getParameter("faixaPreco"));
		int classificacaoP = Integer.parseInt(request.getParameter("classificacao"));
		String paginaDestino;

		// validates if some param has not informed
		if(nomeP.isBlank()
				|| enderecoP.isBlank()
				|| tipoComidaP.isBlank()
				|| faixaPrecoP == 0
				|| classificacaoP == 0) {
			request.setAttribute("Mensagem","Erro de POST - dados inv�lidos ao criar o restaurante.");
			paginaDestino ="/erro.jsp";
		}
		else {

			Restaurante novoRestaurante = new Restaurante(nomeP, enderecoP, tipoComidaP, faixaPrecoP, classificacaoP );
			request.setAttribute("Restaurante", novoRestaurante);
			paginaDestino ="/Views/Gastronomia/sucesso_post.jsp";
		}

		// redirect
		RequestDispatcher dispatcher = getServletContext()
				.getRequestDispatcher(paginaDestino);

		dispatcher.forward(request, response);
	}

	public void doGet(HttpServletRequest request,
			HttpServletResponse response)
					throws IOException, ServletException{

		// obtaining req params
		String nomeP = request.getParameter("txtNome");
		String enderecoP = request.getParameter("txtEndereco");
		String tipoComidaP = request.getParameter("");
		String strClassificacaoP = request.getParameter("classificacao");
		String strFaixaPrecoP = request.getParameter("faixaPreco");

		int faixaPrecoP = 0;
		int classificacaoP = 0;

		if(strFaixaPrecoP != null) {
			try {
				faixaPrecoP = Integer.parseInt(strFaixaPrecoP);
			}
			catch (NumberFormatException e) {
				faixaPrecoP = 0;
			}
		}

		// classification filter param
		if(strClassificacaoP != null) {
			try {
				classificacaoP = Integer.parseInt(strClassificacaoP);
			}
			catch(NumberFormatException e) {
				classificacaoP = 0;
			}
		}

		ArrayList<Restaurante> listaRestaurantes = mockupListaRestaurantes();
		String paginaDestino = "/Views/Gastronomia/listaRestaurantes.jsp";
		request.setAttribute("listaRestaurantes", listaRestaurantes);

		// redirect
		RequestDispatcher dispatcher = getServletContext()
				.getRequestDispatcher(paginaDestino);
		dispatcher.forward(request, response);
	}


	private ArrayList<Restaurante> mockupListaRestaurantes() {
		ArrayList<Restaurante> lista = new ArrayList<Restaurante>();
		lista.add(new Restaurante("Restaurante Camargo", "Rua do Camargo", "Mineira", 3, 3));
		lista.add(new Restaurante("Bistro Viena", "Rua Paris", "Francesa", 5, 4));
		lista.add(new Restaurante("Point da Esfiha", "Rua uzbequistao", "�rabe", 4, 4));
		lista.add(new Restaurante("Habibs", "Rua tingalapa, 500", "�rabe", 4, 3));
		lista.add(new Restaurante("Varanda Santa Monica", "Rua tilu�pe, 100", "Caseira", 5, 5));
		return lista;
	}
}
