package com.algaworks.pedidovenda.entity;

import java.io.Serializable;

public class EnderecoCliente implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String logradouro;
	
	private String numero;
	
	private String complemento;
	
	private String cep;
	
	private String cidadeUF;
	
	
public EnderecoCliente(String logradouro, String numero, String complemento, String cep, String cidadeUF) {
		//super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cep = cep;
		this.cidadeUF = cidadeUF;
	}

//getters e setters
	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidadeUF() {
		return cidadeUF;
	}

	public void setCidadeUF(String cidadeUF) {
		this.cidadeUF = cidadeUF;
	}
	
	
	
	

}
