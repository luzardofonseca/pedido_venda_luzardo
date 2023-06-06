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

	private List<EnderecoCliente> enderecoClientes = new ArrayList<>();;
	private EnderecoCliente enderecoSelecionado;
	private EnderecoCliente enderecoCliente = new EnderecoCliente();

	public CadastroClienteBean() {

	}

	public void incluirEndereco() {
		System.out.println(enderecoCliente.getLogradouro());
		enderecoClientes.add(enderecoCliente);
		enderecoCliente = new EnderecoCliente();
	}

	public void excluirEndereco() {
		enderecoClientes.remove(enderecoSelecionado);
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
			nomeTipo = "CPF";

		} else {
			masksCpfCnpj = "99.999.999/9999-99";
			nomeTipo = "CNPJ";
		}
	}

	// getteres e setters
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

	public List<EnderecoCliente> getEnderecoClientes() {
		return enderecoClientes;
	}

	public void setEnderecoClientes(List<EnderecoCliente> enderecoClientes) {
		this.enderecoClientes = enderecoClientes;
	}

	public EnderecoCliente getEnderecoSelecionado() {
		return enderecoSelecionado;
	}

	public void setEnderecoSelecionado(EnderecoCliente enderecoSelecionado) {
		this.enderecoSelecionado = enderecoSelecionado;
	}

	public EnderecoCliente getEnderecoCliente() {
		return enderecoCliente;
	}

	public void setEnderecoCliente(EnderecoCliente enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

}
