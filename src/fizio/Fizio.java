package fizio;

public abstract class Fizio {
    private String name;

    public Fizio(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract boolean moving(Actions actions);
}
