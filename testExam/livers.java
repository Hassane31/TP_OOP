package testExam;
public class livers {

    public String reference ;
    public String titer;
    private int stock ;
    public double prixU ;
    public double TVA ;
//Q 2
    public int get_stock (){
        return stock;
    }
    public void set_stock (int s){
        stock = s;
    }
//Q 2
    public void stocker (int qte ,double prix){
      stock += qte;
        prixU = prix;
        }
        
        livers ( int s ){
            stock = s ;
        }   
    }

