package pl.tomaszdziurko.jvm_bloggers.utils;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateTimeUtilities {

    public static LocalDateTime convertDateToLocalDateTime(Date date) {
        return date.toInstant().atZone(ZoneId.of(NowProvider.ZONE_NAME)).toLocalDateTime();
    }

    public static int daysBetweenDateAndLastFriday(LocalDateTime date) {
        int dateDayOfWeek = date.getDayOfWeek().getValue();
        int fridayDayOfWeek = DayOfWeek.FRIDAY.getValue();

        if (dateDayOfWeek > fridayDayOfWeek) {
            return dateDayOfWeek - fridayDayOfWeek;
        } else {
            return 7 - (fridayDayOfWeek - dateDayOfWeek);
        }
    }

}
