package com.algaworks.pedidovenda.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class MessagesBean {
	public void adicionarMensagemErro() {
		FacesContext context = FacesContext.getCurrentInstance();

		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Resumo da Mensagem de Erro",
				"Menagem de Erro Completa");
		
		context.addMessage("destinoErro", msg);

	}

	public void adicionarAvisoFlutuante() {
		FacesContext context = FacesContext.getCurrentInstance();

		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO	, "Resumo do Aviso Flutuante",
				"Menagem Flutuante Completa");
		
		context.addMessage("destinoAviso", msg);

	}

}
