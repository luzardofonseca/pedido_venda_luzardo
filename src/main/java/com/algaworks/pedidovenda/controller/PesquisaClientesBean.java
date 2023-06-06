package com.algaworks.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.algaworks.pedidovenda.entity.Cliente;

@ManagedBean
@RequestScoped
public class PesquisaClientesBean {
	
	public static String[] nomeEmpresas = {"Supermercado João das Couves Ltda","Maria Conceição da Abadia", "Supermercado Preço Bom"};
	public static String[] tipoEmpresas = {"Física","Juridica"};
	public static String[] cnpjcpfEmpresas = {"02493738000183","04593855399", "08111344000112"};
	
	private List<Cliente> clientes;

	public PesquisaClientesBean() {		
		clientes = new ArrayList<Cliente>();		
		for (int i = 0; i < 50; i++) {			
			adicionarCliente();			
		}		
	}

	private void adicionarCliente() {
		clientes.add(new Cliente(getNomeEmpresaAletario(), getTipoEmpresa(), getCnpjcpfEmpresas()));		
	}

	private String getNomeEmpresaAletario() {
		int posicao= (int) Math.round(Math.random()* (nomeEmpresas.length-1));
		return nomeEmpresas[posicao];
	}
	
	private String getTipoEmpresa() {
		int posicao= (int) Math.round(Math.random()* (tipoEmpresas.length-1));
		return tipoEmpresas[posicao];
	}
	
	private String getCnpjcpfEmpresas() {
		int posicao= (int) Math.round(Math.random()* (tipoEmpresas.length-1));
		return cnpjcpfEmpresas[posicao];
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	
	
	
	

}
