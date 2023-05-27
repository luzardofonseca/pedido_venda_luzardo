package com.algaworks.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class CadastroPedidoBean {

	private List<Integer> itens;

	public CadastroPedidoBean() {

	}

	@PostConstruct
	private void inicializar() {
		itens = new ArrayList<>();
		itens.add(1);
	}

	public List<Integer> getItens() {	
		return itens;
	}

}