package com.algaworks.cursojavaee;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("metodopagamento")
public class MetodoPagamentoConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if(value != null) {
			for (MetodoPagamento metodoPagamento : ContratoTreinamentoBean.METODOPAGAMENTOS) {
				if(value.equals(metodoPagamento.getNomeIcone())) {
					return metodoPagamento;
							
				}
			}
		}
		
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value != null && !value.equals("")) {
			MetodoPagamento metodoPagamento =  (MetodoPagamento) value;
			return metodoPagamento.getNomeIcone();
		}
		
		return null;
	}
	
}
