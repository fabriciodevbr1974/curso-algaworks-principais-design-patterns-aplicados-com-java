package com.algaworks.logger;

import com.algaworks.logger.arquivo.LoggerArquivoCliente;
import com.algaworks.maladireta.loggers.LoggerLib;

public class LoggerArquivoApp {
	
	public static void main(String[] args) {
		LoggerLib logger = new LoggerArquivoCliente();
		logger.enviar("Oi Fabricio");
	}

}
