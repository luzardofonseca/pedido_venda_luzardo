package com.algaworks.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.algaworks.pedidovenda.entity.Cliente;
import com.algaworks.pedidovenda.entity.Usuario;

@ManagedBean
@RequestScoped
public class PesquisaUsuariosBean {
	
	private static final String[] nomes = { "João", "Maria", "José", "Eduardo", "Sebastião", "Mariana", "Francisco",
			"Manoel", "Fernanda", "Gabriela", "Mário", "Marcos" };
	
	private static final String[] sobrenomes = { "Souza", "Silva", "Andrade", "Machado", "Júnior", "Albuquerque",
			"Alencar", "Assis", "Batista", "Camargo", "Coelho", "Costa", "Dias", "Rosa", "Leal", "Lima", "Leite"};
	
	public static String[] emails = {"tomas@gmail.com","gugu@gmail.com", "antonio@gmail.com","toni@hotmail.com","tomate@hotmail.com"};
	
	private List<Usuario> usuarios;

	public PesquisaUsuariosBean() {
		
		usuarios = new ArrayList<Usuario>();
		
		for (int i = 0; i < 50; i++) {
			
			adicionarUsuario();
			
		}
		
	}

	private void adicionarUsuario() {
		usuarios.add(new Usuario(getNomeAletario() + " "+ getSobrenomeAleatorio(), getEmail()));
		
	}

	private String getNomeAletario() {
		int posicao= (int) Math.round(Math.random()* (nomes.length-1));
		return nomes[posicao];
	}
	private String getSobrenomeAleatorio() {
		int posicao = (int) Math.round(Math.random() * (sobrenomes.length - 1));
		return sobrenomes[posicao];
	}

	private String getEmail() {
		int posicao= (int) Math.round(Math.random()* (emails.length-1));
		return emails[posicao];
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	
	
	
	

}
