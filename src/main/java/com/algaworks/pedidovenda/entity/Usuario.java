package com.algaworks.pedidovenda.entity;

import java.io.Serializable;

public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String email;
	

	
	public Usuario(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}
	//getters e setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
