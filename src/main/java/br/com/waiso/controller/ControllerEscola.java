package br.com.waiso.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.waiso.entity.EscolaEntity;
import br.com.waiso.entity.PessoaEntity;

import com.google.gson.Gson;

@WebServlet("/ControllerEscola")
public class ControllerEscola extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ControllerEscola() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//capturar os dados do html
		EscolaEntity escola = new EscolaEntity();
		escola.setNome(request.getParameter("nome"));
		escola.setEndereco(request.getParameter("endereco"));
		escola.setNumero(Integer.parseInt( request.getParameter("numero") ));
		escola.setCurso(request.getParameter("curso"));
		
		//persistir os dados da pessoa
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		out.print(new Gson().toJson(escola));
		out.flush();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Tentaram acessar via GET");
	}

}
