package br.com.waiso.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "cachorro")
public class Cachorro implements Serializable {

	private static final long serialVersionUID = -3689382195454890010L;

	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private String raca;
	private double tamanho;
	private Integer idade;
	private char sexo;

	public Cachorro() {

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

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String toString() {
		return String.format(
				"id:%d,nome:%s,raca:%r,tamanho:%t,idade:%d,sexo:%s", id, nome,
				raca, tamanho, idade, sexo);
	}
}
