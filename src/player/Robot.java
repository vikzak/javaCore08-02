package player;
import fizio.Actions;
public class Robot implements Actions {
    private String name;
    private int runLengthLimit;
    private double jumpHeightLimit;

    public Robot(String name, int runLengthLimit, double jumpHeightLimit) {
        this.name = name;
        this.runLengthLimit = runLengthLimit;
        this.jumpHeightLimit = jumpHeightLimit;
    }

    @Override
    public void run() {
        System.out.printf("Робот:%s может пробежать дистанцию %sм.\n",this.name,this.getRunLength());
    }

    @Override
    public void jump() {
        System.out.printf("Робот:%s может прыгнуть на %sм.\n",this.name,this.getJumpHeight());
    }

    @Override
    public int getRunLength() {
        return this.runLengthLimit;
    }

    @Override
    public double getJumpHeight() {
        return this.jumpHeightLimit;
    }
}
