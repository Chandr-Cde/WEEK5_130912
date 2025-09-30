package week05.chandra.id.ac.umn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("-------------Program Menghitung Bangun Datar-------------");
        System.out.println("1. Lingkaran");
        System.out.println("2. Persegi");
        System.out.println("3. Persegi Panjang");
        System.out.println("4. Segitiga");
        System.out.println("5. Keluar");
        System.out.print("Pilihan: ");

        int choice = s.nextInt();

        switch (choice) {
            case 1:
                hitungLingkaran(s);
                break;
            case 2:
                hitungPersegi(s);
                break;
            case 3:
                hitungPersegiPanjang(s);
                break;
            case 4:
                hitungSegitiga(s);
                break;
            case 5:
                System.out.println("Keluar program");
                break;
            default:
                System.out.println("Input tidak valid");
        }

        s.close();
    }

    private static void hitungLingkaran(Scanner s) {
        System.out.println("-----------Lingkaran------------");
        System.out.print("Masukan jari-jari lingkaran : ");
        double radius = s.nextDouble();
        System.out.print("Warna : ");
        String color = s.next();
        Circle circle = new Circle(radius, color);
        System.out.println("Jari-Jari : " + circle.getRadius());
        System.out.println("Keliling Lingkaran : " + circle.getPerimer());
        System.out.println("Luas Lingkaran : " + circle.getArea());
    }

    private static void hitungPersegi(Scanner s) {
        System.out.println("--------Persegi---------");
        System.out.print("Masukan panjang sisi : ");
        double side = s.nextDouble();
        System.out.print("Warna : ");
        String color = s.next();
        Persegi persegi = new Persegi(side, color);
        System.out.println("Keliling Persegi : " + persegi.getPerimer());
        System.out.println("Luas Persegi : " + persegi.getArea());
    }

    private static void hitungPersegiPanjang(Scanner s) {
        System.out.println("--------Persegi Panjang----------");
        System.out.print("Masukan panjang : ");
        double length = s.nextDouble();
        System.out.print("Masukan lebar : ");
        double width = s.nextDouble();
        System.out.print("Warna : ");
        String color = s.next();
        PersegiPanjang pp = new PersegiPanjang(length, width, color);
        System.out.println("Keliling Persegi Panjang : " + pp.getPerimer());
        System.out.println("Luas Persegi Panjang : " + pp.getArea());
    }

    private static void hitungSegitiga(Scanner s) {
        System.out.println("---------Segitiga Siku-Siku---------");
        System.out.print("Masukan alas : ");
        double base = s.nextDouble();
        System.out.print("Masukan tinggi : ");
        double height = s.nextDouble();
        System.out.print("Warna : ");
        String color = s.next();
        Segitiga segitiga = new Segitiga(base, height, color);
        System.out.println("Keliling Segitiga : " + segitiga.getPerimeter());
        System.out.println("Luas Segitiga : " + segitiga.getArea());
    }
}
