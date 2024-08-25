import Logger.DebugLogProccesor;
import Logger.ErrorLogProccesor;
import Logger.InfoLogProcessor;
import Logger.LogLevel;
import Logger.LogProcessor;

public class Main {

	public static void main(String[] args) {
		LogProcessor logger = new InfoLogProcessor(new DebugLogProccesor(new ErrorLogProccesor(null)));
		logger.log(LogLevel.INFO, "Hello! this is info log");
		logger.log(LogLevel.DEBUG, "Hello this is debug log");
		logger.log(LogLevel.ERROR, "Hello! this is error log");
	}

}
