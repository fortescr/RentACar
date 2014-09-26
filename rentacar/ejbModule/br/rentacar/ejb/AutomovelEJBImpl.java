package br.rentacar.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.rentacarClient.ejb.AutomovelEJB;
import br.rentacarJPA.entidades.Automovel;

@Stateless
public class AutomovelEJBImpl implements AutomovelEJB {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void salvar(Automovel automvel) {
		entityManager.merge(automvel);
	}

	@Override
	public List<Automovel> buscarTodos() {
		return entityManager.createQuery("select a from Automovel a").getResultList();
	}

}
