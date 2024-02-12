package repositories;

import java.util.ArrayList;
import java.util.List;

import contato.Contato;

public class ContatosCSV implements Contatos{
	
	@Override
	public List<Contato> listar(){
		List<Contato> lista = new ArrayList<>();
		lista.add(new Contato("Edward", "62988882222"));
		lista.add(new Contato("Marcelo", "62955556666"));
		lista.add(new Contato("Marcos", "62911116666"));
		return lista;
	}

}
