package com.algaworks.cursojavaee;

import java.io.Serializable;

public class MetodoPagamento implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String descricao;
	private String nomeIcone;
		
	public MetodoPagamento() {
		
	}

	public MetodoPagamento(String descricao, String nomeIcone) {
		this.descricao = descricao;
		this.nomeIcone = nomeIcone;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNomeIcone() {
		return nomeIcone;
	}

	public void setNomeIcone(String nomeIcone) {
		this.nomeIcone = nomeIcone;
	}
	
	
}
