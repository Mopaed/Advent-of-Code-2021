package Day1;

import helper.FileHelper;

import java.util.List;

public class DayOneSolution {

    private List<String> getInput() {
        FileHelper fileHelper = new FileHelper();
        return fileHelper.loadInput("src/main/resources/Day1/dayOneInput.txt");
    }

    public int getIncreases() {
        List<String> inputs = this.getInput();
        int increases = 0;
        String lastNumberInput = "";
        for (String input : inputs) {
            if ("".equals(lastNumberInput)) {
                lastNumberInput = input;
                continue;
            }
            if (Integer.parseInt(lastNumberInput) < Integer.parseInt(input)) {
                increases++;
            }
            lastNumberInput = input;
        }
        return increases;
    }

    public int getIncreasesSlidingWindow() {
        List<String> inputs = this.getInput();
        List<Integer> inputInts = inputs.stream().map(input -> Integer.parseInt(input)).toList();
        int increases = 0;
        int lastWindowSum = 0;
        for (int i = 0; i < inputInts.size(); i++) {
            if (i + 2 > inputInts.size()-1) {
                break;
            }
            int acutualWindowSum = inputInts.get(i) + inputInts.get(i +1) + inputInts.get(i + 2);
            if(i == 0) {
                lastWindowSum = acutualWindowSum;
                continue;
            }
            if(lastWindowSum < acutualWindowSum) {
                increases++;
            }
            lastWindowSum = acutualWindowSum;
        }
        return increases;
    }
}
