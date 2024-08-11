package telran.datetime;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.*;

public class DateTimeTest
{
    @Test
    void localDateTest()
    {
        LocalDate currentDate = LocalDate.now();
        LocalDateTime currentTime = LocalDateTime.now();
        ZonedDateTime currentZonedTime = ZonedDateTime.now();
        Instant currentInstant = Instant.now();

        System.out.printf("Current date is %s (in ISO format) \n", currentDate);
        System.out.printf("Current date & time is %s (in ISO format) \n", currentTime);
        System.out.printf("Current zoned date & time is %s (in ISO format) \n", currentZonedTime);
        System.out.printf("Current instant is %s (in ISO format) \n", currentInstant);
    }
}
