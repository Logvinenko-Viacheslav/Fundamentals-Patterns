package patterns.interfaceMy;

// implements class Enemy interface
public class Slime implements Enemy{

    //slime implement attackPlayer method
    @Override
    public void attackPlayer(){System.out.println("Slime attacking player");}
}
