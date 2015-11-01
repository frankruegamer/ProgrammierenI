import java.text.DecimalFormat;
import java.time.LocalTime;

public class Uhrzeit {
	public static void main (String[] args) {
		LocalTime now = LocalTime.now();
		int stunden = now.getHour();
		int minuten = now.getMinute();
		int sekunden = now.getSecond();
		int secsSinceMidnight = stunden*3600 + minuten*60 + sekunden;
		System.out.printf("Sekunden seit Mitternacht: %d%n", secsSinceMidnight);
		int remainingSecs = 86400 - secsSinceMidnight;
		System.out.printf("Verbleibende Sekunden: %d%n", remainingSecs);
		DecimalFormat prozent = new DecimalFormat("###.00%");
		System.out.printf("%s des Tages vergangen", prozent.format(secsSinceMidnight/86400.0));
	}
}
