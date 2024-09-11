package patterns.interfaceMy;

// implements class Enemy interface
public class Zombie implements Enemy{

    //zombie implement attackPlayer method
    @Override
    public void attackPlayer(){System.out.println("Zombie attacking player");}
}
