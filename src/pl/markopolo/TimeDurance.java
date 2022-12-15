package pl.markopolo;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeDurance {
    public String countDurance(String begin, String end) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("h:m a");

        LocalTime time1 = LocalTime.parse(begin.toUpperCase(), format);
        LocalTime time2 = LocalTime.parse(end.toUpperCase(), format);

        Duration dur = Duration.between(time1, time2);

        return (dur.toHours() + "hours " + dur.toMinutesPart() + " minutes ");
    }
}
