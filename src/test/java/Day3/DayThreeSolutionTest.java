package Day3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

public class DayThreeSolutionTest {

    private final DayThreeSolution dayThreeSolution = new DayThreeSolution();

    @Test
    public void calculateGammaTest() {

    }

    @Test
    public void calculateEpsilonTest() {

    }

    @Test
    public void multiplyGammaAndEpsilonTest() {
        int result = this.dayThreeSolution.multiplyGammaAndEpsilon(3,4);
        Assertions.assertEquals(12, result);
    }
}
