package com.algaworks.maladireta;

import javax.swing.JOptionPane;

import com.algaworks.maladireta.maladireta.MalaDireta;
import com.algaworks.maladireta.xml.MalaDiretaXML;

public class NovoClienteCadastrado {

	public static void main(String[] args) {

		MalaDireta malaDireta = new MalaDiretaXML("contatos.xml");
		String mensagem = JOptionPane.showInputDialog(null, "Digite a mensagem do e-mail:");

		boolean status = malaDireta.enviarEmail(mensagem);
		JOptionPane.showConfirmDialog(null, "E-mails enviados: " + status);
	}

}
