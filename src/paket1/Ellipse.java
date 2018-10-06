package paket1;
public class Ellipse {
    private double a;
    private double b;
 
public Ellipse() {
    }

    public Ellipse(double a, double b) {
        if (a >= 0)
            this.a = a;
        if (b >= 0)
            this.b = b;
    }
 
    public double getSquare() {
        return Math.PI * a * b;
    }
 
    public double getPerimeter() {
        return 4 * (Math.PI * a * b + (a - b) * (a - b)) / (a + b);
    }
}