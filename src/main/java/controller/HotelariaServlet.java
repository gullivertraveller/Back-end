package controller;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import model.Hotel;

@SuppressWarnings("serial")
@WebServlet("/hotelariaServlet")
public class HotelariaServlet extends HttpServlet{

	public void doPost(HttpServletRequest request,
			HttpServletResponse response)
					throws IOException, ServletException{

		// obtainig req param
		String nomeP = request.getParameter("txtNome");
		String enderecoP = request.getParameter("txtEndereco");
		double valorDiariaP = Double.parseDouble(request.getParameter("valorDiaria"));
		int classificacaoP = Integer.parseInt(request.getParameter("classificacao"));
		String paginaDestino;

		// validates if some param has not informed
		if(nomeP.isBlank()
				|| enderecoP.isBlank()
				|| valorDiariaP == 0
				|| classificacaoP == 0) {
			request.setAttribute("Mensagem","Erro de POST - dados inv�lidos ao criar o hotel.");
			paginaDestino ="/erro.jsp";
		}
		else {

			Hotel novoHotel = new Hotel(nomeP, enderecoP, valorDiariaP, classificacaoP);
			request.setAttribute("Hotel", novoHotel);
			paginaDestino ="/Views/Hotelaria/sucesso_post.jsp";
		}

		// redirect
		RequestDispatcher dispatcher = getServletContext()
				.getRequestDispatcher(paginaDestino);
		dispatcher.forward(request, response);
	}

	public void doGet(HttpServletRequest request,
			HttpServletResponse response)
					throws IOException, ServletException{

		// obtainig req params
		String nomeP = request.getParameter("txtNome");
		String enderecoP = request.getParameter("txtEndereco");
		String strClassificacaoP = request.getParameter("classificacao");
		String strValorDiariaP = request.getParameter("valorDiaria");
		int classificacaoP = 0;
		double valorDiariaP = 0;

		// price filter
		if(strValorDiariaP != null) {
			try {
				valorDiariaP = Double.parseDouble(strValorDiariaP);
			}
			catch (NumberFormatException e) {
				valorDiariaP = 0;
			}
		}

		// classification filter
		if(strClassificacaoP != null) {
			try {
				classificacaoP = Integer.parseInt(strClassificacaoP);
			}
			catch(NumberFormatException e) {
				classificacaoP = 0;
			}
		}


		ArrayList<Hotel> listaHoteis = mockupListaHoteis();
		String paginaDestino = "/Views/Hotelaria/listaHoteis.jsp";
		request.setAttribute("listaHoteis", listaHoteis);

		// redirect
		RequestDispatcher dispatcher = getServletContext()
				.getRequestDispatcher(paginaDestino);
		dispatcher.forward(request, response);
	}


	private ArrayList<Hotel> mockupListaHoteis() {
		ArrayList<Hotel> lista = new ArrayList<Hotel>();
		lista.add(new Hotel("Grand Hotel", "Rua do Grand Hotel", 200, 3));
		lista.add(new Hotel("Petit Hotel", "Rua do Petit Hotel", 100, 2));
		lista.add(new Hotel("Master Hotel", "Rua do Master Hotel", 400, 4));
		lista.add(new Hotel("Big Hotel Plaza", "Rua do Big Hotel Plaza", 380, 4));
		lista.add(new Hotel("Hotelza�o Top", "Rua do Hotelza�o", 500, 5));
		return lista;
	}
}
