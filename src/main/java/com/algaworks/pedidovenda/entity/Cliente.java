package com.algaworks.pedidovenda.entity;

import java.io.Serializable;

public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String tipo;
	private String cnpjcpf;
	private String telefone;
	
	
	
	public Cliente() {
		
	}

	public Cliente(String nome, String telefone) {
		
		this.nome = nome;
		this.telefone = telefone;
	}

	public Cliente(String nome, String tipo, String cnpjcpf) {
		//super();
		this.nome = nome;
		this.tipo = tipo;
		this.cnpjcpf = cnpjcpf;
	}
	
	public Cliente(String nome, String tipo, String cnpjcpf, String telefone) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.cnpjcpf = cnpjcpf;
		this.telefone = telefone;
	}

	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCnpjcpf() {
		return cnpjcpf;
	}
	public void setCnpjcpf(String cnpjcpf) {
		this.cnpjcpf = cnpjcpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	

}
