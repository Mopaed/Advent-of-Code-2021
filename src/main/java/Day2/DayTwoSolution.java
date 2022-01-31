package Day2;

import helper.FileHelper;

import java.util.List;

public class DayTwoSolution {
    private int depth = 0;
    private int distance = 0;
    private int aim = 0;


    private void resetDepth() {
        this.depth = 0;
    }

    private void resetDistance() {
        this.distance = 0;
    }

    public int partOne() {
        List<String> inputs = this.getInput();
        inputs.forEach(input -> {
            if (input.startsWith("forward")) {
                this.updateDistance(input);
            } else {
                this.updateDepth(input);
            }
        });
        return this.depth * this.distance;
    }

    public int partTwo() {
        this.resetDistance();
        this.resetDepth();
        this.aim = 0;
        List<String> inputs = this.getInput();
        inputs.forEach(input -> {
            if (input.startsWith("for")) {
                int moves = this.getMovesNumber(input);
                this.distance += moves;
                if(this.aim != 0){
                    this.depth += this.aim * moves;
                }
            } else {
                int moves = this.getMovesNumber(input);
                if(input.startsWith("up")){
                    this.aim -= moves;
                } else {
                    this.aim += moves;
                }
            }
        });
        return this.depth * this.distance;
    }


    private void updateDepth(String input) {
        int upDownMoves = getMovesNumber(input);
        if (input.startsWith("up")) {
            this.depth -= upDownMoves;
        } else {
            this.depth += upDownMoves;
        }
    }

    private void updateDistance(String input) {
        int forwardMoves = getMovesNumber(input);
        this.distance += forwardMoves;
    }

    private List<String> getInput() {
        FileHelper fileHelper = new FileHelper();
        return fileHelper.loadInput("src/main/resources/Day2/dayTwoInput.txt");
    }

    private int getMovesNumber(String input) {
        return Integer.parseInt(input.substring(input.length() - 1));
    }
}
