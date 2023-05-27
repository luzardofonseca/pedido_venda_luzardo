package com.algaworks.pedidovenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CadastroUsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String grupo;

	private List<String> grupos;

	public CadastroUsuarioBean() {
		grupos = new ArrayList<String>();
		
		grupos.add("Auxiliares");
		grupos.add("vendedores");
		grupos.add("Administradores");
	}

	// getters e setters
	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public List<String> getGrupos() {
		return grupos;
	}

}
