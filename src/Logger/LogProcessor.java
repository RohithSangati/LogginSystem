package Logger;

public class LogProcessor {
	LogProcessor next;

	LogProcessor(LogProcessor next) {
		this.next = next;
	}

	public void log(LogLevel level, String message) {
		if (this.next != null) {
			next.log(level, message);
		}
	}
}