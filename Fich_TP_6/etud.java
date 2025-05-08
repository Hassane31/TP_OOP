

public class etud extends perssone{
    public String dep ;
    public double moy1,moy2 ;


    public double moyAnuelle (){
        return (moy1+moy2)/2.0;
    }
    public String obeservation (){
        if (this.moyAnuelle() >= 10){
            return "admis" ;
        }
        else return "ajourne" ;
    }
    
}
