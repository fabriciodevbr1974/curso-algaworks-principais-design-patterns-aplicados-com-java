package com.algaworks.logger.console;

import com.algaworks.maladireta.loggers.Logger;
import com.algaworks.maladireta.loggers.LoggerLib;

public class LoggerConsoleCliente extends LoggerLib{

	@Override
	protected Logger logger() {
		return new LoggerConsole();
	}

}
