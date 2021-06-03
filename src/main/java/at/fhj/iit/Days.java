package at.fhj.iit;

import java.util.ArrayList;

/**
 * represents a day
 */
public class Days {
    private ArrayList<CashRegister> DaysList = new ArrayList<>();
    private final int day;
    /**
     * Constructor for days
     *
     * @param day for the day
     */
    public Days(int day) {
        this.day = day;
    }
    /**
     * Getter for days-list
     *
     * @return list
     */
    public ArrayList<CashRegister> getDays() {
        return DaysList;
    }

    public String toString(){
        String text = "";
        for (int i = 0; i < getDays().size(); i++) {
            text += "Cashier called " + getDays().get(i).getName() + " with a total sells of " + Math.round(getDays().get(i).getTotalSells()) + "€ ,on the " + day + " day.\n";
        }
        return text;
    }
}
