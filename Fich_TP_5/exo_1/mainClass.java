package Fich_TP_5.exo_1;
public class mainClass {
    public static void main(String[] args) {
        ClassCompt compt1 = new ClassCompt("LYNA ",1221) ;
       System.out.println("crediter ->");  
         compt1.crediter();
         System.out.println("Display ->");
         compt1.AffichageCompte();
         System.out.println("debiter ->");
         compt1.debiter();
         System.out.println("Display ->");
         compt1.AffichageCompte();   
    }
    
}
