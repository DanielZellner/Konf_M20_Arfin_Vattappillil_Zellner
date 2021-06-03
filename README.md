# Konf_M20_Arfin_Vattappillil_Zellner

## first Task
Zellner: to set all up
Zellner: Cocktail class created, extends Drink class
Arfin: I've created a class name vodka, which is extends in Drink class. 
Vattappillil; Created a class called Lemonade, extends Drink class. 

## second Task, 25.04.2021
### Arfin:
I worked with IntelliJ IDEA. Explaining how I creadted  the VodkaTestclass: I created the VodkaTest with right click on Vodka class then generate -> Test... -> then you can choose which methos you want to test... we tested all the methods such getVolume, getAlcohol, isAlcoholic, toString and finally my VodkaTest class was created..After that I downloaded the IntelliJ IDEA version 16 but did not work -> then I got an Error. Then I downloaded another version 15 and then my VodkaTest worked perfectly. The VodakaTest worked 100%. Explaining how to run: left click on the symbol "Run" and choose "Run VodkaTest(1) with Coverage". Finally we added it on our repository. $ git pull -> $ git branch vodka_branch -> $ git branch -> $ git checkout vodka_branch -> git status -> git add -> git push -u orgin <vodka_branch>; 
### Zellner:
I created the CocktailTest to Test the Cocktail class, I basically started to create a new test folder in the SRC folder, where a package was created again (at.fhj.iit), for each method you write a test to cover 100% of the test cases, the constructor is not included, because normally this is not necessary. CocktailTest covers 100% of Cocktail up. Basically how the testing work:
you have a method like: isAlcoholic(), this method returns true, so in your test you check if the outcome of the merhod is actually true.
### Vattappillil:
I opened IntelliJ and generated a test class. I had to download some specific JDK Versions and at first there were many problems because all of my imports didn't work. After some time repairing I tested everything and my Testclass was at 100%. 
Quellen: [Stackoverflow](https://stackoverflow.com/), da wir Probleme mit der 16er Version hatten und deshalb die 15er Version brauchten. (Fehlermedlung: Could not initialize class org.jetbrains.jps.builders.JpsBuildBundle)
### Test-Results: (after the removal of the mistakes)
|Class     | Class, %   | Method, %  | Line, %      |
|----------|------------|------------|--------------|
|Cocktails | 100% (1/1) | 100% (7/7) | 100% (13/13) | 
|Lemonade	 | 100% (1/1) | 100% (5/5) | 100% (7/7)   |
|Vodka	   | 100% (1/1) | 100% (5/5) | 100% (7/7)   |

## Between second an third task 17.05
Mistakes that were made in the first and the second task are mostly removed, and readme update, for easier reading

## Third task:
### Zellner:
#### 03.06.2021 
##### 16:52
I created a Cash-Register class and a days class with JUnits-Tests with 100% coverage and a few updates in the main class to see if it works. At the moment it is all the selling branch and will be futher merged into the main branch
##### 16:55
Update and information to the selling branch:
The reason why i created to classes to implement the selling process, is the simple reason that now i have days class which can save all cash register user by their object, so basically one day object is definded through several cash register objects through a list.
```
public class Days {
    private ArrayList<CashRegister> DaysList = new ArrayList<>();
```
the selling process is definded through a interface
```
 @Override
    public void selling(Drink a) {
        if(a.getAlcoholPercent() == 0)
            nonAlkSells += a.getVolume() * 2;
        else if(a.getAlcoholPercent() <= 16)
            AlkSellsUnder += a.getVolume() * 20;
        else if(a.getAlcoholPercent() > 16)
            AlkSellsOver += a.getVolume() * 40;
    }
```
