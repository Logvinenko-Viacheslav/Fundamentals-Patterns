import patterns.abstractSupperclassMy.Healer;
import patterns.abstractSupperclassMy.Medic;
import patterns.abstractSupperclassMy.Priest;
import patterns.immutable.MyMath;
import patterns.interfaceMy.Enemy;
import patterns.interfaceMy.Slime;
import patterns.interfaceMy.Zombie;
import patterns.markerInterface.ColdLocations;
import patterns.markerInterface.IceSpikesForest;
import patterns.markerInterface.SnowyPlains;

public class Main {
    public static void main(String[] args) {
        Main prog = new Main();
        System.out.println("hello world");
        prog.run();
    }

    private void run(){
        //Immutable
        //create object
        MyMath obj1 = new MyMath();

        //process method + see constant
        System.out.println(obj1.areaOfCircleByRadius(3) +"   "+obj1.pi);

        //trying change field
        /*try{
            //obj1.pi = 66.3;
        }catch(Exception e){
            System.out.println("can't change immutable field");
        }*/
        //can't even build that code, duo this problem so i commented line 19.
        //actually, standard java class java.lang.Math have keyword "final" and fields/methods have keywords static.
        //About that keywords - they both used for immutable purposes, but have some differences.


        //Interface
        //results of implementing interface to classes
        //interface design pattern is fundamental in achieving abstraction and polymorphism, which are key principles
        //of object-oriented programming.
        Slime slime = new Slime();
        slime.attackPlayer();
        Zombie zombie = new Zombie();
        zombie.attackPlayer();

        //AbstractSupperclass
        //In this pattern, the abstract superclass provides a base structure and common behaviors, while subclasses
        //provide specific implementations for abstract methods.
        Medic medic = new Medic();
        Priest priest = new Priest();
        medic.healAlert();
        medic.healPlayer();
        priest.healAlert();
        priest.healPlayer();
        // Both healers share the healAlert method from the abstract class
        // Both healer implement the abstract method healPlayer in their own way

        //Marker Interface
        IceSpikesForest forest = new IceSpikesForest();
        SnowyPlains plains = new SnowyPlains();
        checkMarker(forest);
        checkMarker(plains);


        //Functional design
        //Functional design in software engineering focuses on what the system should do, emphasizing the functions,
        //inputs, and outputs rather than how the system will be implemented.
        //This Main.java is example of Functional design

        //Delegation Pattern
        //The Delegation Pattern is a design pattern in which an object hands off or delegates some of its responsibilities
        //to another helper object.
        //MyMath.java is example of Delegation Pattern. Math purposes moved from Main.java to helper MyMath.java.
    }

    //function which check if object have ColdLocations marker
    //is an interface with no methods or fields. It is used to "mark" a class as having some special property
    public static void checkMarker(Object obj) {
        if (obj instanceof ColdLocations) {
            System.out.println(obj.getClass().getSimpleName() + " is marked with ColdLocations.");
        } else {
            System.out.println(obj.getClass().getSimpleName() + " is NOT marked with ColdLocations.");
        }
    }


}