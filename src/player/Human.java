package player;
import fizio.Actions;
public class Human implements Actions {
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

    public void setName(String name) {
        this.name = name;
    }

    public void setRunLengthLimit(int runLengthLimit) {
        this.runLengthLimit = runLengthLimit;
    }

    public void setJumpHeightLimit(double jumpHeightLimit) {
        this.jumpHeightLimit = jumpHeightLimit;
    }

    @Override
    public void run (){
        System.out.printf("Человек:%s может пробежать дистанцию %sм.\n",this.name,this.getRunLength());
    }

    @Override
    public void jump (){
        System.out.printf("Человек:%s может прыгнуть на %sм.\n",this.name,this.getJumpHeight());
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
