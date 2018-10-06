package paket2;
import paket1.*;
public class My_Class extends Ellipse{
 
    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        Ellipse ellipse = new Ellipse(a, b);
        System.out.println("Площадь еллипса " + ellipse.getSquare());
        System.out.println("Периметр еллипса " + ellipse.getPerimeter());
    }
}