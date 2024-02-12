package maladireta;

import repositories.Contatos;
import repositories.ContatosCSV;

public class MalaDiretaCSV extends MalaDireta{

	@Override
	protected Contatos todos() {
		return new ContatosCSV();
	}

}
