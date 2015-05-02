package br.com.waiso.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.waiso.entity.Cachorro;

import com.google.gson.Gson;

@WebServlet("/Controller")
public class Controller2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Controller2() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//capturar os dados do html
		Cachorro cachorro = new Cachorro();
		cachorro.setNome(request.getParameter("nome"));
		cachorro.setRaca(request.getParameter("raca"));
		cachorro.setTamanho(Double.parseDouble(request.getParameter("tamanho")));
		cachorro.setIdade( Integer.parseInt( request.getParameter("idade") ));
		cachorro.setSexo(request.getParameter("sexo").charAt(0));
		
		//persistir os dados da pessoa
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		out.print(new Gson().toJson(cachorro));
		out.flush();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Tentaram acessar via GET");
	}

}
