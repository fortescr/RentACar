package br.rentacarClient.ejb;

import java.util.List;

import br.rentacarJPA.entidades.Automovel;

public interface AutomovelEJB {

	void salvar(Automovel automovel);
	List<Automovel> buscarTodos();
}
