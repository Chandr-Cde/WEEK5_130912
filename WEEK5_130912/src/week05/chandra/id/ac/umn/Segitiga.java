package week05.chandra.id.ac.umn;

public class Segitiga extends Shape {

    private double base;
    private double height;

    public Segitiga() {}

    public Segitiga(double base, double height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getBase() { return base; }
    public double getHeight() { return height; }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public double getPerimeter() {
        double hypotenuse = Math.sqrt((base * base) + (height * height));
        return base + height + hypotenuse;
    }
}
