package at.fhj.iit;

public class Main {

    public static void main(String[] args){

        Liquid l = new Liquid("Wein", 0.125, 13);
        Liquid w = new Liquid("Whiskey", 0.125, 40);
        System.out.println(l.getName());
        System.out.println(l.getVolume());
        System.out.println(w.getName());
        System.out.println(w.getVolume());

        Drink d = new SimpleDrink("Rotwein",l);
        Drink wCola = new Cocktails("Jack Daniels",w);
        System.out.println(d);
        System.out.println(wCola);
    }
}
