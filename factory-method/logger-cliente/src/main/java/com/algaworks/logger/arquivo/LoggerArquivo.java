package com.algaworks.logger.arquivo;

import java.time.LocalDateTime;

import com.algaworks.maladireta.loggers.Logger;

public class LoggerArquivo implements Logger{

	@Override
	public void log(String message) {
		System.out.println(LocalDateTime.now().toString() + " ARQUIVO " + message);

	}

}
