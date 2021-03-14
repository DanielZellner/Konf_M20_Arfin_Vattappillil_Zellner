package at.fhj.iit;
/**
 * represents a simple drink vodka which can be used in drinks
 */
public abstract class Vodka extends Drink{
	
	/**
     * uses only one vodka
	   */
	  protected Liquid v;

	  /**
	    * Creates a SimpleDrink object with given name and liquid
	    *
	    * @param name name of drink
	    * @param l only one liquid in drink, because it's a simple drink an not e.g. a cocktail
	    */
	  Vodka(String name, Liquid v){
	      super(name);
	      this.v = v;
	  }
	  /**
	     * Returns volume of liquid v
	     *
	     * @return the volume of drink in litre
	     */
	  
	  public double getVolume() {
	        return v.getVolume();
	    }

	    /**
	     * Returns alcohol volume percent of vodka l
	     *
	     * @return alcohol volume percent
	     */
	    @Override
	    public double getAlcoholPercent() {
	        return v.getAlcoholPercent();
	    }

	    /**
	     * Gives information if drink is alcoholic or not
	     *
	     * @return true when alcoholic liquids are present, otherwise false
	     */
	    @Override
	    public boolean isAlcoholic() {
	        if(v.getAlcoholPercent() > 0){
	            return true;
	        }
	        return false;
	    }

	    public String toString(){
	        return "Simple Drink called " + name + " with " + v.getAlcoholPercent() + " percent alcohol by volume";
	    }
	}

	   
	    


	

	  