package player;

public class Human {
    private String name;
    private int runLengthLimit;
    private double jumpHeightLimit;

    public Human(String name, int runLengthLimit, double jumpHeightLimit) {
        this.name = name;
        this.runLengthLimit = runLengthLimit;
        this.jumpHeightLimit = jumpHeightLimit;
    }

    public String getName() {
        return name;
    }

    public int getRunLengthLimit() {
        return runLengthLimit;
    }

    public double getJumpHeightLimit() {
        return jumpHeightLimit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRunLengthLimit(int runLengthLimit) {
        this.runLengthLimit = runLengthLimit;
    }

    public void setJumpHeightLimit(double jumpHeightLimit) {
        this.jumpHeightLimit = jumpHeightLimit;
    }

/*    public void createHuman(){
        int i = 0;
        Human human[0] = new Human("Vasya",500,0.90);
    }*/
}
