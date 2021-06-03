package at.fhj.iit;

public class Main {

    public static void main(String[] args){

        Liquid l = new Liquid("Wein", 0.125, 13);
        Liquid w = new Liquid("Whiskey", 0.125, 40);
	    Liquid v = new Liquid("Vodka", 0.234, 30);
	    Liquid g = new Liquid("Gin", 0.125, 40);
        Liquid c = new Liquid("Cola", 1, 0);

        System.out.println(l.getName());
        System.out.println(l.getVolume());
        System.out.println(w.getName());
        System.out.println(w.getVolume());
	    System.out.println(v.getName());
        System.out.println(v.getVolume());
        System.out.println(c.getName());
        System.out.println(c.getVolume());
        System.out.println();

        Drink d = new SimpleDrink("Rotwein",l);
        System.out.println(d);
        Drink wCola = new Cocktails("Jack Daniels",w);
        System.out.println(wCola);
        Drink d1 = new SimpleDrink("Vodka",v);
        System.out.println(d1);
        Drink g1 = new SimpleDrink("Gin",g);
        System.out.println(g1);
        Drink cola = new Lemonade("Cola", c);
        System.out.println(cola);
        System.out.println();

        Days day1 = new Days(1);
        day1.getDays().add(new CashRegister("Bob"));
        day1.getDays().add(new CashRegister("Hilde"));
        day1.getDays().add(new CashRegister("Jeff"));

        day1.getDays().get(0).selling(cola);
        day1.getDays().get(1).selling(g1);
        day1.getDays().get(2).selling(d);

        System.out.println(day1);

        Days day2 = new Days(2);
        day2.getDays().add(new CashRegister("Joe"));
        day2.getDays().add(new CashRegister("John"));
        day2.getDays().add(new CashRegister("Jacki"));

        day2.getDays().get(0).selling(wCola);
        day2.getDays().get(1).selling(d1);
        day2.getDays().get(2).selling(cola);
        day2.getDays().get(2).selling(d1);
        day2.getDays().get(2).selling(d);
        day2.getDays().get(2).selling(cola);

        System.out.println(day2);
    }
}
