package com.algaworks.cursojavaee;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class ContratoTreinamentoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String razaoSocial;
	private String CNPJ;
	private String cidade;
	private String modalidade;
	private Date dataContrato;
	private String formaPagamento;
	private List<String> cursos;
	

	private MetodoPagamento metodoPagamento;

	private List<String> formasPagamentos = new ArrayList<>();
	private List<String> cidades = new ArrayList<>();

	public static final List<MetodoPagamento> METODOPAGAMENTOS = new ArrayList<MetodoPagamento>();

	static {
		METODOPAGAMENTOS.add(new MetodoPagamento("Cartao de Credito", "cartao_credito"));
		METODOPAGAMENTOS.add(new MetodoPagamento("Cheque", "cheque"));
		METODOPAGAMENTOS.add(new MetodoPagamento("Boleto", "boleto"));
	}
	
	public ContratoTreinamentoBean() {
		
		cidades.add("Alemanha");
		cidades.add("Argelia");
		cidades.add("Argentina");
		cidades.add("Belgica");
		cidades.add("Bolivia");
		cidades.add("Brasil");
		cidades.add("Bulgaria");
		cidades.add("Espanha");
		cidades.add("Estados Unidos");
		cidades.add("Guiana Francesa");
	}
	
	public List<String> sugerirCidade(String consulta){
		List<String> cidadesSugeridas = new ArrayList<>();
		for (String cidade : this.cidades) {
			if(cidade.toLowerCase().startsWith(consulta.toLowerCase())){
				cidadesSugeridas.add(cidade);
				
			}
			
		}
		
		return cidadesSugeridas;
	}

	public void atualizar() {
				
		System.out.println("Cidade é "+ this.cidade + ", Data de Nascimento = " + this.dataContrato + ", Metodo de Pagamento: " + this.metodoPagamento.getDescricao() + " e Forma de Pagamento: "
				+ formaPagamento);

		for (String curso : this.cursos) {
			System.out.println("curso: "+ curso);
		}

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil Atualizado!"));
	}
	
	

	public void carregarFormaPagamento() {
		formasPagamentos.clear();

		if ("Cartao de Credito".equals(metodoPagamento.getDescricao())) {
			formasPagamentos.add("À vista");
			formasPagamentos.add("1x");
			formasPagamentos.add("2x");
			formasPagamentos.add("3x");
			formasPagamentos.add("4x");
			formasPagamentos.add("5x");
			formasPagamentos.add("6x");
		} else if ("Cheque".equals(metodoPagamento.getDescricao())) {
			formasPagamentos.add("À vista");
			formasPagamentos.add("Entrada + 30 dias");
		} else if ("Boleto".equals(metodoPagamento.getDescricao())) {
			formasPagamentos.add("À vista");
		}
	}

	/* métodos gtters e setters */
	public List<String> getCursos() {
		return cursos;
	}

	public void setCursos(List<String> cursos) {
		this.cursos = cursos;
	}

	public List<String> getFormasPagamentos() {
		return formasPagamentos;
	}

	public List<MetodoPagamento> getMetodopagamentos() {
		return METODOPAGAMENTOS;
	}

	public MetodoPagamento getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public Date getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

}
