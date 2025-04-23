package Fich_TP_1;

import java.util.Scanner;

public class exo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("A= ?");
        int a = input.nextInt();
        System.out.println("B=?");
        int b = input.nextInt();
        input.close();
        float r = (float) a / b;
        System.out.println("A/B=" + r);
    }
}
