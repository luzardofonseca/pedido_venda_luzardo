package com.algaworks.pedidovenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.algaworks.pedidovenda.entity.Cliente;

@ManagedBean
@ViewScoped
public class AdicionarClienteBean implements Serializable {
	 
	private static final long serialVersionUID = 1L;
	
	private List<Cliente> clientes = new ArrayList<>();	
	private Cliente clienteSelecionado;
	private Cliente nomeCliente = new Cliente();
	
	
	public AdicionarClienteBean() {
		clientes.add(new Cliente("Antonio", "85999999999"));
		clientes.add(new Cliente("Joaquim", "85888888888"));
		clientes.add(new Cliente("Ana", "85888888888"));
		clientes.add(new Cliente("Beatriz", "85666666666"));
	
	}
	
	public void incluirCliente() {
		clientes.add(nomeCliente);
		nomeCliente = new Cliente();
	}

	public void excluirCliente() {
		clientes.remove(clienteSelecionado);
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public Cliente getClienteSelecionado() {
		return clienteSelecionado;
	}

	public void setClienteSelecionado(Cliente clienteSelecionado) {
		this.clienteSelecionado = clienteSelecionado;
	}

	public Cliente getNomeCliente() {
		return nomeCliente;
	}

	
	
	
}
