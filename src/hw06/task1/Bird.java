package hw06.task1;

public abstract class Bird {
    protected String feathers;
    protected boolean  legEggs;
    public abstract void fly();

    public Bird(String feathers, boolean legEggs) {
        this.feathers = feathers;
        this.legEggs = legEggs;
    }

}

