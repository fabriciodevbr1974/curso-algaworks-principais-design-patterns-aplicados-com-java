package com.algaworks.logger.console;

import java.time.LocalDateTime;

import com.algaworks.maladireta.loggers.Logger;

public class LoggerConsole implements Logger{

	@Override
	public void log(String message) {
		System.out.println(LocalDateTime.now().toString() + " CONSOLE " + message);
	}

}

