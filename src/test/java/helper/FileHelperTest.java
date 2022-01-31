package helper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FileHelperTest {

    private final FileHelper fileHelper = new FileHelper();

    @Test
    public void loadInput() {
        List<String> loadedInput = this.fileHelper.loadInput("src/test/resources/testInput.txt");
        Assertions.assertTrue(loadedInput.size() == 1);
        Assertions.assertEquals("Hello, World!", loadedInput.get(0));
    }
}
