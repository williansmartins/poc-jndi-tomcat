package br.com.waiso.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.waiso.dao.especific.PessoaDAOImpl;
import br.com.waiso.dao.generic.JpaGenericDao;
import br.com.waiso.entity.PessoaEntity;

import com.google.gson.Gson;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	JpaGenericDao<PessoaEntity> dao = new PessoaDAOImpl();
       
    public Controller() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//capturar os dados do html
		PessoaEntity pessoa = new PessoaEntity();
		pessoa.setNome(request.getParameter("nome"));
		pessoa.setIdade( Integer.parseInt( request.getParameter("idade") ));
		pessoa.setSexo(request.getParameter("sexo").charAt(0));
		
		//persistir os dados da pessoa
		dao.insert(pessoa);
		
		//devolver para o front a resposta de sucesso
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		out.print("Sucesso ao inserir a pessoa: " + new Gson().toJson(pessoa));
		out.flush();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Tentaram acessar via GET");
	}

}
