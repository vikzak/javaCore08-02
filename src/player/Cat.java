package player;

public class Cat {
    private String name;
    private int runLengthLimit;
    private double jumpHeightLimit;

    public Cat(String name, int runLengthLimit, double jumpHeightLimit) {
        this.name = name;
        this.runLengthLimit = runLengthLimit;
        this.jumpHeightLimit = jumpHeightLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRunLengthLimit() {
        return runLengthLimit;
    }

    public void setRunLengthLimit(int runLengthLimit) {
        this.runLengthLimit = runLengthLimit;
    }

    public double getJumpHeightLimit() {
        return jumpHeightLimit;
    }

    public void setJumpHeightLimit(double jumpHeightLimit) {
        this.jumpHeightLimit = jumpHeightLimit;
    }
}
