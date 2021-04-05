package JAVA1.LAB1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho va ten:");
        String hoTen = sc.nextLine();

        System.out.println("Nhap diem trung binh:");
        double diemTB = sc.nextDouble();

        System.out.printf("%s %f diem",hoTen,diemTB);
    }
}
