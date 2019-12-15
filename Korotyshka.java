public class Korotyshka extends Human implements Action, ActionWithSubject {
    private boolean legCatched;
    private String name;

    public Korotyshka(String name) {
        this.name = name;
        legCatched = false;
    }


    @Override
    public void act(String action) {

        System.out.println(name + ": " + action);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void act(String action, Object object) {

        System.out.println(name + " " + action + " " + object);
    }

    @Override
    public boolean isLegCatched() {
        return legCatched;
    }

    @Override
    public void catchLeg() {

    }

    @Override
    public void releaseLeg() {

    }
}
