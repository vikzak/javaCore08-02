package fizio;

public class Track extends Fizio{
    private int lengthTrack;

    public Track(String name, int lengthTrack) {
        super(name);
        this.lengthTrack = lengthTrack;
    }

    public int getLengthTrack() {
        return lengthTrack;
    }

    public void setLengthTrack(int lengthTrack) {
        this.lengthTrack = lengthTrack;
    }

    @Override
    public boolean moving(Actions actions) {
        //System.out.printf("Трасса: s%, длинною: $s - ",super.getName(),this.lengthTrack);
        System.out.printf("Трасса: " + super.getName() + ", длина: " + this.lengthTrack + "м.\n");
        actions.run();
        if (getLengthTrack() <= actions.getRunLength()){
            System.out.printf("Статус: пройдена\n");
            return true;
        } else {
            System.out.printf("Статус: не пройдена\n");
            return false;
        }
    }
}
