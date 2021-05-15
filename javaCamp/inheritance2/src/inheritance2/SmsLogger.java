package inheritance2;

public class SmsLogger extends Logger{
	@Override
	public void log() {
		System.out.println("Sms yollandi.");
	}
}
