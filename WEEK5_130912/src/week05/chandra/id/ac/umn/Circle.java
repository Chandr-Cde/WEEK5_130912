package week05.chandra.id.ac.umn;

public class Circle extends Shape {
	
	private double radius;
	
	public Circle() {}
	public Circle(double radius, String color) {
		super(color);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double getPerimer() {
		return Math.PI *2* radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
