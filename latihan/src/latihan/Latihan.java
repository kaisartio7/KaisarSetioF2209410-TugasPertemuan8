/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
class Segitiga {
    private double side1;
    private double side2;
    private double side3;

    // Konstruktor tanpa argumen untuk segitiga default
    public Segitiga() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    // Konstruktor untuk segitiga dengan sisi-sisi tertentu
    public Segitiga(double s1, double s2, double s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    // Metode pengakses untuk sisi-sisi segitiga
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    // Metode untuk menghitung luas segitiga menggunakan rumus Heron
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        //menghitung akar quadrat dari nilai yang diberikan
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Metode untuk menghitung keliling segitiga
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // Metode untuk menampilkan deskripsi segitiga
    @Override
    public String toString() {
        return "Segitiga: sisi1 = " + side1 + ", sisi2 = " + side2 + ", sisi3 = " + side3;
    }
}
public class Latihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan panjang sisi-sisi segitiga:");
        System.out.print("Sisi 1: ");
        double sisi1 = input.nextDouble();
        System.out.print("Sisi 2: ");
        double sisi2 = input.nextDouble();
        System.out.print("Sisi 3: ");
        double sisi3 = input.nextDouble();

        System.out.print("Masukkan warna segitiga: ");
        String warna = input.next();

        System.out.print("Apakah segitiga terisi? (true/false): ");
        boolean terisi = input.nextBoolean();

        Segitiga segitiga = new Segitiga(sisi1, sisi2, sisi3);

        System.out.println("Deskripsi Segitiga:");
        System.out.println(segitiga);
        System.out.println("Luas Segitiga: " + segitiga.getArea());
        System.out.println("Keliling Segitiga: " + segitiga.getPerimeter());
        System.out.println("Warna Segitiga: " + warna);
        System.out.println("Segitiga Terisi: " + terisi);

        input.close();
    }
    
}
