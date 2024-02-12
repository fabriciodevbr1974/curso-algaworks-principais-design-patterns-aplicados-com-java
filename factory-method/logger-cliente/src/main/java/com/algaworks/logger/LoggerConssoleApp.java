package com.algaworks.logger;

import com.algaworks.logger.console.LoggerConsoleCliente;
import com.algaworks.maladireta.loggers.LoggerLib;

public class LoggerConssoleApp {
	
	public static void main(String[] args) {
		LoggerLib logger = new LoggerConsoleCliente();
		logger.enviar("Oi Fabricio");
	}

}
