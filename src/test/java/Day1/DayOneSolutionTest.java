package Day1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DayOneSolutionTest {

    private final DayOneSolution dayOneSolution = new DayOneSolution();

    @Test
    public void taskOneTest() {
        int increases = dayOneSolution.getIncreases();
        System.out.println(increases);
        Assertions.assertTrue(increases >= 0);
    }

    @Test
    public void taskTwoTest() {
        int increases = dayOneSolution.getIncreasesSlidingWindow();
        System.out.println(increases);
        Assertions.assertTrue(increases >= 0);
    }
}
