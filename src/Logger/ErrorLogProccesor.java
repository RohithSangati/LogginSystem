package Logger;

public class ErrorLogProccesor extends LogProcessor {

	public ErrorLogProccesor(LogProcessor next) {
		super(next);
	}
	
	public void log(LogLevel level,String message) {
		if(level == LogLevel.ERROR) {
			System.out.println("Error : "+message);
		}else {
			super.log(level, message);
		}
	}
	
}
