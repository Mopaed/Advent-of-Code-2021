package helper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {

    public List<String> loadInput(String filepath) {
        List<String> inputLines = new ArrayList<String>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath))) {
            inputLines.addAll(bufferedReader.lines().toList());
        }catch (IOException ex) {
            ex.printStackTrace();
        }
        return inputLines;
    }
}
