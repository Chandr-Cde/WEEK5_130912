package week05.chandra.id.ac.umn;

public class PersegiPanjang extends Shape {
    
    private double length;
    private double width;
    
    public PersegiPanjang() {}
    public PersegiPanjang(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }
    
    public double getLength() {
        return length;
    }
    
    public double getWidth() {
        return width;
    }
    
    public double getArea() {
        return length * width;
    }
    
    public double getPerimer() {
        return 2 * (length + width);
    }
}