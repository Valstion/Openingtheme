package introduction;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalTime;

public class Demo {
    @Test

    public void test01IfNumberIsEven() {
        //duomenys testo veiksmas palyginimas
        int actualInput = 4;
        int actualRezults;
        int expectedRezults = 0;
        //testo veiksmas
        actualRezults = actualInput % 2;
        //palyginimas
        Assert.assertEquals(actualRezults, expectedRezults);

    }

    @Test
    public void test02IfNumberIsnotEven() {

        int actualInput = 5;
        int actualRezults;
        int expectedRezults = 1;


        actualRezults = actualInput % 2;

        Assert.assertTrue(actualRezults == expectedRezults,
                "Actual: " + actualRezults + ", Expected: " + expectedRezults);
    }

    @Test
    public void testifTimeNowIsnow19() {
        //duomenys
        int expectedrezultsIsnNot = 19;
        int actualTime;
        boolean isSameTime;
        //Test veiksmas
        actualTime = LocalTime.now().getHour();
        isSameTime = expectedrezultsIsnNot == actualTime;  // expected false
        //Palyginimas
        Assert.assertFalse(isSameTime, String.format("Expected: %s, Acutal: %s", expectedrezultsIsnNot, actualTime)
        );

    }
}
