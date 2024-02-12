package repositories;

import java.util.ArrayList;
import java.util.List;

import contato.Contato;

public class ContatosXML implements Contatos{
	
	@Override
	public List<Contato> listar(){
		List<Contato> lista = new ArrayList<>();
		lista.add(new Contato("Fabricio", "62984138625"));
		lista.add(new Contato("Celma", "62984138709"));
		return lista;
	}

}
