package br.rentacarWeb.mb;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.rentacarClient.ejb.AutomovelEJB;
import br.rentacarJPA.entidades.Automovel;

@ManagedBean
@ViewScoped
public class AutomovelMB {

	@EJB
	private AutomovelEJB automovelEJB;
	
	private Automovel automovel;
	private List<Automovel> automoveis;
	
	@PostConstruct
	private void init(){
		automovel = new Automovel();
		automoveis = new ArrayList<Automovel>();
		automoveis = automovelEJB.buscarTodos();
	}
	
	public String salvar(){
		automovelEJB.salvar(automovel);
		automoveis = automovelEJB.buscarTodos();
		return "";
	}
	
	public Automovel getAutomovel() {
		return automovel;
	}
	public void setAutomovel(Automovel automovel) {
		this.automovel = automovel;
	}
	public List<Automovel> getAutomoveis() {
		return automoveis;
	}
	public void setAutomoveis(List<Automovel> automoveis) {
		this.automoveis = automoveis;
	}
}
