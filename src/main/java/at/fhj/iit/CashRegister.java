package at.fhj.iit;
/**
 * represents a cash register which can be used to sell drinks
 */
public class CashRegister implements Drink.Drinks {
    /**
     * all vars to calculate the sells per day, per person,...
     */
    private double nonAlkSells;
    private double AlkSellsUnder;
    private double AlkSellsOver;
    private final String name;

    public CashRegister(String name) {
        this.name = name;
    }
    /**
     * Getter for name
     *
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * Getter for sells
     *
     * @return all sells
     */
    public double getTotalSells() {
        return nonAlkSells + AlkSellsUnder + AlkSellsOver;
    }
    @Override
    public void selling(Drink a) {
        if(a.getAlcoholPercent() == 0)
            nonAlkSells += a.getVolume() * 2;
        else if(a.getAlcoholPercent() <= 16)
            AlkSellsUnder += a.getVolume() * 20;
        else if(a.getAlcoholPercent() > 16)
            AlkSellsOver += a.getVolume() * 40;
    }
}
