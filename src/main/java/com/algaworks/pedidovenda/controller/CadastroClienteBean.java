package com.algaworks.pedidovenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.algaworks.pedidovenda.entity.EnderecoCliente;

@ManagedBean
@ViewScoped
public class CadastroClienteBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String tipo;
	
	private String nomeTipo;

	private String cpfcnpj;

	private String masksCpfCnpj;
	
	private List<EnderecoCliente> enderecosClientes;
	

	public void setEnderecosClientes(List<EnderecoCliente> enderecosClientes) {
		this.enderecosClientes = enderecosClientes;
	}

	public CadastroClienteBean() {
		
		enderecosClientes = new ArrayList<EnderecoCliente>();
		
		enderecosClientes.add(new EnderecoCliente("Rua da Tabocas", "321", "apt 102", "60.000-230", "FORTALEZA/CE"));
		enderecosClientes.add(new EnderecoCliente("Rua da jonata", "401", "apt 100", "60.430-230", "CAUCAIA/CE"));
		enderecosClientes.add(new EnderecoCliente("Rua dos Indios", "102", "perto do acougue", "61.410-230", "IGUATU/CE"));
	}

	public void atualizar() {
		System.out.println("Tipo" + this.tipo);
		System.out.println("cnpnj" + this.cpfcnpj);
		System.out.println("qual o tipo de mascara" + this.masksCpfCnpj);
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil Atualizado!"));
	}

	public void carregarMascara() {

		if (getTipo().equalsIgnoreCase("PF")) {
			masksCpfCnpj = "999.999.999-99";
			nomeTipo="CPF";
			
		} else {
			masksCpfCnpj = "99.999.999/9999-99";
			nomeTipo = "CNPJ";
		}
	}
	
	
	
	//getteres e setters
	public String getCpfcnpj() {
		return cpfcnpj;
	}
	
	public void setCpfcnpj(String cpfcnpj) {
		this.cpfcnpj = cpfcnpj;
	}

	public void setMasksCpfCnpj(String masksCpfCnpj) {
		this.masksCpfCnpj = masksCpfCnpj;
	}

	public String getMasksCpfCnpj() {
		return masksCpfCnpj;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNomeTipo() {
		return nomeTipo;
	}
	
	public List<EnderecoCliente> getEnderecosClientes() {
		return enderecosClientes;
	}
	
}
