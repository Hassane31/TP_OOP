package tp_5.exo_1;
import java.util.Scanner;
public class ClassCompt {
    Scanner input = new Scanner( System.in);
    public double solde ;
    private int code ;
    public String nom_client ;

  ClassCompt (String nom_client , int code ){
    this.code = code ;
    this.nom_client = nom_client ;
  }
//getters and setters 
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
//les methodes 
public void crediter (){
   System.out.println("Give Me code :");
    int code1 = input.nextInt();
    if (this.code==code1){
        System.out.println("give me Rising :");
        double montant = input.nextDouble();
        if ( montant > 0) {
            solde += montant;  }
        else System.out.println("  your Rising < 0 !!!"); 
    }
    else System.out.println("Wrong Code !!!");
}

public void debiter ( ){
    System.out.println("Give Me code :");
    int code = input.nextInt();
    if (this.code==code){
        System.out.println("give me Rising :");
        double montant = input.nextDouble();
        if (( montant > 0)&& ( montant > solde)) {
            solde -= montant; 
        } 
        else System.out.println("  your Rising < 0 OR montant > your solde !!!"); 
    }else System.out.println( "wrong Code !?!?!");
    
}
public void AffichageCompte(){
    int code1 = input.nextInt();
    if(this.code == code1){
System.out.println( "COMPTE :\n Name : "+nom_client+" \nSolde : "+solde);}
else {
    System.out.println(" Wrong code ?!?!?");
}
}
}
