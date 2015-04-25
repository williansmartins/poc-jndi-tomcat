package br.com.waiso.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.waiso.entity.CarroEntity;

import com.google.gson.Gson;

@WebServlet("/CarroController")
public class CarroController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CarroController() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//capturar os dados do html
		CarroEntity carro = new CarroEntity();
		carro.setMontadora(request.getParameter("montadora"));
		carro.setModelo(request.getParameter("modelo") );
		
		//persistir os dados da pessoa
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		out.print(new Gson().toJson(carro));
		out.flush();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Tentaram acessar via GET");
	}

}
