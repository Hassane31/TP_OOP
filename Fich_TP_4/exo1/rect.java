package Fich_TP_4.exo1;
public class rect {
    // variables
    public double largeur ;
    public double hauteur ;

    // methods
    public double surface(double largeur , double hauteur){
        return (largeur * hauteur);
    }

    public double perimeter(double largeur , double hauteur){
        return (surface(largeur, hauteur)/ 2.0) ;
    }

    public void affichage_rectangle(double largeur , double hauteur){
        System.out.println("the surface of the rectangle is: " + surface(largeur, hauteur));
        System.out.println("the premiter of the rectangle is: " + perimeter(largeur, hauteur));
    }
}
