package maladireta;

import repositories.Contatos;

public abstract class MalaDireta {

	
	protected abstract Contatos todos();
	
	public void enviar() {
		Contatos contatos = todos();
		contatos.listar().forEach(c -> System.out.println(c.getNome()));
	}
	
}
