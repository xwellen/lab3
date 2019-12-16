public class Main {

    public static void main(String[] args) {
        Korotyshka klops = new Korotyshka("Klops");
        Korotyshka niznayka = new Korotyshka("Niznayka");
        Korotyshka milordic = new Korotyshka("Milordic");
        Korotyshka cezarino = new Korotyshka("Cezarino");
        Korotyshka fix = new Korotyshka("Fix");
        Korotyshka fex = new Korotyshka("Fex");
        Trap trapPolyakov = new Trap("ловушка полякова");
        Plants[] plantsWithStrawberry = new Plants[1];
        plantsWithStrawberry[0] = Plants.Strawberry;
        Garden strawberryGarden = new Garden(plantsWithStrawberry);
        Plants[] plantsWithTomatosAndCucumbers = new Plants[2];
        plantsWithTomatosAndCucumbers[0] = Plants.Tomatoes;
        plantsWithTomatosAndCucumbers[1] = Plants.Cucumber;
        Garden gardenTomatosAndCucumber = new Garden(plantsWithTomatosAndCucumbers);

        Korotyshka[] korotyshkas = {klops,niznayka,milordic,cezarino,fix,fex};
        for (int i = 0; i < korotyshkas.length; i++) {
            korotyshkas[i].act(" остановился.");
        }
                                                                                                                    //Коротышки остановились.
        klops.act("самолично бросился догонять", niznayka + ".");                                    //Клопс самолично бросился догонять Незнайку
        trapPolyakov.catchKorotyshka(klops); //клопс попался в ловушку
        fix.act("подбежал к", niznayka + ".");                                                          //Фикс и
        fex.act("подбежал к", niznayka + ".");                                                         //Фекс подбежали к нему
        fix.act("начал освобождать ногу из капкана коротышки", niznayka);
        fex.act("начал освобождать ногу из капкана коротышки", niznayka);
        fix.releaseTrap(trapPolyakov);
        //и принялись освобождать его ногу из капкана. (Фикс)
        //и принялись освобождать его ногу из капкана. (Фекс)
        Korotyshka[] gardenWorkeres = {niznayka,milordic,cezarino};                                                       //В это время Незнайка, Милордик
        for (int i = 0; i < gardenWorkeres.length; i++) {                                                                      //и Цезарино перенесли
            gardenWorkeres[i].act("перенёс поле своей деятельности с ", strawberryGarden + ".");               //на грядки с огурцами
            gardenWorkeres[i].act("перенёс поле своей деятельности на грядки c " + gardenTomatosAndCucumber + ".");     //перенесли поле своей деятельности с клубники
        }                                                                                                                   //и помидорами.
        strawberryGarden.isMessed();
        gardenTomatosAndCucumber.isMessed();

        gardenTomatosAndCucumber.messGarden(1.0);

        gardenTomatosAndCucumber.isMessed();//В одну минуту там все было перепутано, и уже трудно было разобрать, где росли огурцы и где помидоры.

    }


}