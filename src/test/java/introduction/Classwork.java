package introduction;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

import static java.util.Calendar.MONDAY;

public class Classwork {
    //  public class void(){


    // }

    @Test

    public void testGreenifDividedBy() {
        //duomenys testo veiksmas palyginimas


        int actualInput = 995;
        int expectedRezults = 0;
        int actualRezults;

        //testo veiksmas
        actualRezults = actualInput % 3;

        //palyginimas
        Assert.assertTrue(actualRezults == expectedRezults,
                "Actual: " + actualRezults + ", Expected: " + expectedRezults);
    }


    @Test
    public void testifDayOfTheWEEK() {
        //duomenys
        DayOfWeek expectedWeekDay = DayOfWeek.THURSDAY;
        //Test veiksmas
        DayOfWeek actualWeekDay = LocalDate.now().getDayOfWeek();
        boolean isTheSame = actualWeekDay == expectedWeekDay;

        //Palyginimas
        Assert.assertTrue(isTheSame, String.format("Expected: %s, Acutal: %s", expectedWeekDay, actualWeekDay));

    }

    @Test
    public void testCount() {
        int expectedEven = 4;
        int actualNumber = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                actualNumber++;
            }
        }
        Assert.assertEquals(expectedEven, actualNumber);
    }


}
