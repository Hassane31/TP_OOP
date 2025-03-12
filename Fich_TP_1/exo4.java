package Fich_TP_1;

import java.util.Scanner;

public class exo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("A=?");
        int a = input.nextInt();
        System.out.println("B=?");
        int b = input.nextInt();
        input.close();
        System.out.println("A/B=" + (a / b));
        System.out.println("rest A/B=" + (a % b));
    }
}
