package week05.chandra.id.ac.umn;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Masukan jari-jari lingkaran : ");
		double radius = s.nextDouble();
		System.out.println("Masukan warna : ");
		String color = s.next();
		
		Circle circle = new Circle(radius,color);
		System.out.println("\t Lingkaran \t");
		System.out.println("Warna : " +circle.getColor());
		System.out.println("Jari-Jari : " +circle.getRadius());
		System.out.println("Keliling Lingkaran :" +circle.getPerimer());
		System.out.println("Luas Lingkaran : " +circle.getArea());
		s.close();
	}

}
