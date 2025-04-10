package Fich_TP_3.exo1;
import java.util.Scanner;
class mainclass {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in );

       System.out.println("Donner N : ");

       int n = input.nextInt();

       input.close();

       licence somme = new licence();

       System.out.println(" S ="+somme.calc(n));
        
    }
}

    
