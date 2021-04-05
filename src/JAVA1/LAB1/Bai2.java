package JAVA1.LAB1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chieu dai:");
        double dai = sc.nextDouble();

        System.out.println("Chieu rong:");
        double rong = sc.nextDouble();

        double dienTich = dai*rong;
        double chuVi = (dai + rong)*2;
        System.out.printf("Dien tich : %f\n", dienTich);
        System.out.printf("Chu vi : %f\n", chuVi);
    }
}
