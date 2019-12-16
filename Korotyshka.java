import java.util.Objects;

public class Korotyshka extends Human implements Action,ActionWithSubject{
    private boolean legCatched;
    private String name;

    public Korotyshka(String name) {
        this.name = name;
        this.legCatched = false;
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


    public boolean isLegCatched() {
        return legCatched;
    }

    @Override
    public void catchLeg() {
        this.legCatched = true;
    }

    @Override
    public void releaseLeg() {
        this.legCatched = false;
    }

    public void releaseTrap(Trap trap){
        System.out.println(this + " освобождает " + trap.getPrey() + " из " + trap);
        trap.release();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        else return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(legCatched, name);
    }
}