package com.algaworks.maladireta.loggers;

public abstract class LoggerLib {

	protected abstract Logger logger();
	
	public void enviar(String message) {
		logger().log(message);
	}
	
	
}
