
import java.util.Scanner;
import Fich_TP_4.exo1.rect;
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        rect rec = new rect() ;

     
        double larg ;
        double haut ;

       
        System.out.print("Enter the haut: ");
        haut = input.nextDouble();
        System.out.print("Enter the larg: ");
        larg = input.nextDouble();

        rec.affichage_rectangle(larg, haut);
input.close();
        
    }
}