public class Trap {
    private Korotyshka prey;
    private String name;

    public Trap(String name) {
        this.name = name;
        prey = null;
    }

    public void catchKorotyshka(Korotyshka korotyshka){
        korotyshka.catchLeg();
        System.out.println(korotyshka + " попал в " + this);
        prey = korotyshka;
    }

    public void release(){
        prey.releaseLeg();
        System.out.println(this + " отпустила " + prey);
        prey = null;
    }
    @Override
    public String toString() {
        return name;
    }

    public Korotyshka getPrey() {
        return prey;
    }
}
