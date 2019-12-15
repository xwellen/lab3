public class Korotyshka extends Human implements Action, ActionWithSubject {

    private String name;

    public Korotyshka(String name) {
        this.name = name;
    }

    //    public String getName() {
//        return this.name;
//    }

//    @Override
//    public void setName(String name) {
//        this.name = name;
//    }

    @Override
    public void stop() {
        System.out.println("Korotyshka stops!");
    }

    @Override
    public void catchUp(Korotyshka K) {

        System.out.println(this.name + "Catching Up" + name);
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

        System.out.println(name + ": " + action + " " + object);
    }
}
