package com.example.exercise17_1.logging;

public class LoggerImpl implements Logger{

	public void log(String logstring) {
		java.util.logging.Logger.getLogger("BankLogger").info(logstring);		
	}

}
