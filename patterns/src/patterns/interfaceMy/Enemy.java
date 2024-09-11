package patterns.interfaceMy;

// interface Enemy have method attackPlayer, which implemented and override in 2 other classes.
// that method serve same purposes but have different inside for Slime and Zombie classes, because zombie and slime have different attacks
public interface Enemy {

    //declare method attackPlayer
    public void attackPlayer();
}
