package maladireta;

import repositories.Contatos;
import repositories.ContatosXML;

public class MalaDiretaXML extends MalaDireta{

	@Override
	protected Contatos todos() {
		return new ContatosXML();
	}

}
