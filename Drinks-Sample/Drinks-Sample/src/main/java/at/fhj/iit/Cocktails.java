package at.fhj.iit;

public class Cocktails extends Drink{

	public Cocktails(String name) {
		super(name);
	}
	protected Liquid l;

    /**
     * Creates a Cocktails object with given name and liquid
     *
     * @param name name of drink
     * @param l only one liquid in drink, because it's a simple drink an not e.g. a cocktail
     */
    Cocktails(String name, Liquid l){
        super(name);
        this.l = l;
    }

    /**
     * Returns volume of liquid l
     *
     * @return the volume of drink in litre
     */
    @Override
    public double getVolume() {
        return l.getVolume();
    }

    /**
     * Returns alcohol volume percent of liquid l
     *
     * @return alcohol volume percent
     */
    @Override
    public double getAlcoholPercent() {
        return l.getAlcoholPercent();
    }

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        if(l.getAlcoholPercent() > 0){
            return true;
        }
        return false;
    }

    public void setL(Liquid l) {
        this.l = l;
    }

    public String toString(){
        return "Cocktail called " + name + " with " + l.getAlcoholPercent() + " percent alcohol by volume";
    }
}

