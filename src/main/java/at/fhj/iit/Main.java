package at.fhj.iit;

public class Main {

    public static void main(String[] args){

        Liquid l = new Liquid("Wein", 0.125, 13);
        Liquid w = new Liquid("Whiskey", 0.125, 40);
	Liquid v = new Liquid("Vodka", 0.234, 30);
	Liquid g = new Liquid("Gin", 0.125, 40);
        System.out.println(l.getName());
        System.out.println(l.getVolume());
        System.out.println(w.getName());
        System.out.println(w.getVolume());
	System.out.println(v.getName());
        System.out.println(v.getVolume());

        Drink d = new SimpleDrink("Rotwein",l);
        Drink wCola = new Cocktails("Jack Daniels",w);
        System.out.println(d);
        System.out.println(wCola);
        Drink d1 = new SimpleDrink("Vodka",v);
        System.out.println(d1);
        Drink g1 = new SimpleDrink("Gin",v);
        System.out.println(g1);
    }
}
