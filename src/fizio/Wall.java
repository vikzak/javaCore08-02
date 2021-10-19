package fizio;

public class Wall extends Fizio {
    private double wallHeight;

    public Wall(String name, double wallHeight) {
        super(name);
        this.wallHeight = wallHeight;
    }

    public double getWallHeight() {
        return wallHeight;
    }

    public void setWallHeight(double wallHeight) {
        this.wallHeight = wallHeight;
    }


    @Override
    public boolean moving(Actions actions) {
        //System.out.printf("Препятствие: s%, высотой: $s - ",super.getName(),this.wallHeight);
        System.out.printf("Препятствие: " + super.getName() + ", высотой: " + this.wallHeight +"м.\n");
        actions.jump();
        if (getWallHeight() <= actions.getJumpHeight()){
            System.out.printf("преодолено\n");
            return true;
        } else {
            System.out.printf("не преодолено\n");
            return false;
        }
    }
}
