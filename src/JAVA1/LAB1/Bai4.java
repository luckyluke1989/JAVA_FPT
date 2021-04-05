package JAVA1.LAB1;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a:");
        double a = sc.nextDouble();

        System.out.println("b:");
        double b = sc.nextDouble();

        System.out.println("c:");
        double c = sc.nextDouble();

        double delTa = Math.pow(b,2) - 4*a*c;
        double canDelta = Math.sqrt(delTa);

        System.out.println(canDelta);
    }
}
