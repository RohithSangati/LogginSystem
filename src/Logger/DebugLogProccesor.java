package Logger;

public class DebugLogProccesor extends LogProcessor {

	public DebugLogProccesor(LogProcessor next) {
		super(next);
	}

	public void log(LogLevel level, String message) {
		if (level == LogLevel.DEBUG) {
			System.out.println("Debug : " + message);
		} else {
			super.log(level, message);
		}
	}

}
