package Fich_TP_2;
import java.util.Scanner;
public class exo1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String nom_produit = input.next();
        float prix_unitaire_achat = input.nextFloat();
        int quantite_achetee = input.nextInt();
        input.close();
        //display
        System.out.println("nom_produit : "+nom_produit);
        System.out.println("Prix_unitaire_achat : "+prix_unitaire_achat);
        System.out.println("Quantite achetee : "+quantite_achetee);
    }
    
}
