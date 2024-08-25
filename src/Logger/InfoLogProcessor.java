package Logger;

public class InfoLogProcessor extends LogProcessor {

	public InfoLogProcessor(LogProcessor next) {
		super(next);
	}

	public void log(LogLevel level, String message) {
		if (level == LogLevel.INFO) {
			System.out.println("Info : " + message);
		} else {
			super.log(level, message);
		}
	}

}