package com.algaworks.logger.arquivo;

import com.algaworks.maladireta.loggers.Logger;
import com.algaworks.maladireta.loggers.LoggerLib;

public class LoggerArquivoCliente extends LoggerLib{

	@Override
	protected Logger logger() {
		return new LoggerArquivo();
	}

}
