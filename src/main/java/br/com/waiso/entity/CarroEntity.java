package br.com.waiso.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="carro")
public class CarroEntity implements Serializable{

	private static final long serialVersionUID = -3689382195454890010L;

	@Id @GeneratedValue
	private Integer id;
	private String montadora;
	private String modelo;

	
	public CarroEntity(){
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMontadora() {
		return montadora;
	}
	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	
	public String toString() {
        return String.format("id:%d,montadora:%s,modelo:%d", id, montadora, modelo);
    }
}
