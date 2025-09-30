package week05.chandra.id.ac.umn;

public class Persegi extends Shape {
    
    private double side;
    
    public Persegi() {}
    public Persegi(double side, String color) {
        super(color);
        this.side = side;
    }
    
    public double getSide() {
        return side;
    }
    
    public double getArea() {
        return side * side;
    }
    
    public double getPerimer() {
        return 4 * side;
    }
}