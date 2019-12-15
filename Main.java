public class Main {

    public static void main(String[] args) {
        Korotyshka klops = new Korotyshka("Klops");
        Korotyshka niznayka = new Korotyshka("Niznayka");
        Korotyshka milordic = new Korotyshka("Milordic");
        Korotyshka cezarino = new Korotyshka("Cezarino");
        Korotyshka fix = new Korotyshka("Fix");
        Korotyshka fex = new Korotyshka("Fex");
        Plants[] plantsWithStrawberry = new Plants[1];
        plantsWithStrawberry[0] = Plants.Strawberry;
        Garden strawberryGarden = new Garden(plantsWithStrawberry);
        Plants[] plantsWithTomatosAndCucumbers = new Plants[2];
        plantsWithTomatosAndCucumbers[0] = Plants.Tomatoes;
        plantsWithTomatosAndCucumbers[1] = Plants.Cucumber;
        Garden gardenTomCuc = new Garden(plantsWithTomatosAndCucumbers);
        klops.act("самолично бросился догонять", niznayka + ".");
        milordic.act("Отойти от", strawberryGarden + ".");
        milordic.act("подойти к " + gardenTomCuc + ".");
        fix.act("подбежал к", niznayka + ".");
        fex.act("подбежал к", niznayka + ".");
    }


}
