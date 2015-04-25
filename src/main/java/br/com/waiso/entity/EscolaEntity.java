package br.com.waiso.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="escola")
public class EscolaEntity implements Serializable{

	private static final long serialVersionUID = -3689382195454890010L;

	@Id @GeneratedValue
	private Integer id;
	private String nome;
	private String curso;
	private String endereco;
	private Integer numero;
	
	public EscolaEntity(){
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	
	public String toString() {
        return String.format("id:%d,nome:%s,idade:%d,sexo:%s", id, nome, curso, endereco,numero);
    }

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
}
