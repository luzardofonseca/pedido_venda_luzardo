package com.algaworks.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class PesquisaProdutosBean {
	
	private List<Integer> produtosfiltrados;
	
	

	public PesquisaProdutosBean() {
		produtosfiltrados = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			produtosfiltrados.add(i);
			
		}
	}



	public List<Integer> getProdutosfiltrados() {
		return produtosfiltrados;
	}
	

}
