
public class perssone {
 public   String nom ;
  public  String prenom ;
  public  int date ;
  public  String adresse ;
  public  String tel ;

  public void Affichaege (){
System.out.println(" NOm"+nom+    "\nprenom"+prenom+ "\nadress"+adresse+  "\ntel"+tel);
  }
  perssone (String nom ,String prenom, int date,String adresse,String tel){
        this.nom = nom ;
        this.prenom = prenom ;
        this.date =date ;
        this.adresse = adresse ;
        this.tel =tel ;
  }
}
