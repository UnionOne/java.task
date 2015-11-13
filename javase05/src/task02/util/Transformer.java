package task02.util;

import task02.core.Timer;

/**
 * Created by Union.one on 13.11.2015.
 */
public class Transformer {

    public int transformTimeToSeconds(Timer timer) {
        return timer.getHour() * 3600 + timer.getMinute() * 60 + timer.getSecond();
    }

    public void transformSecondsToTime(Timer timer, int seconds) {
        timer.setHour(seconds / 3600);
        seconds = seconds - timer.getHour() * 3600;
        timer.setMinute(seconds / 60);
        seconds = seconds - timer.getMinute() * 60;
        timer.setSecond(seconds);
    }
}
