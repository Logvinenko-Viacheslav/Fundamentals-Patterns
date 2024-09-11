package patterns.immutable;

// Creating class with immutable fields and methods, "final" keyword is modifier which makes non-changeable (impossible to inherit or override).
public class MyMath {

    // PI value is math constant, so it shouldn't be changed
    public final double pi = 3.14159265359;

    // The mathematical formulas for calculating the area of a circle by radius/diameter are constant, so they shouldn't be changed
    public final double areaOfCircleByRadius(double r) { return this.pi*Math.pow(r, 2); }
    public final double areaOfCircleByDiameter(double d) { return this.pi*Math.pow(d, 2)/4; }
}
