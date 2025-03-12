package Fich_TP_1;

public class exo5 {
    public static void main (String[] args){
    int valeur=7,chiffre=2,i1,i2;
    float f1,f2;
    i1=valeur/chiffre;   System.out.println("i1="+i1);
    i2=chiffre/valeur;   System.out.println("i2="+i2);
    f1=(float)valeur/chiffre;   System.out.println("f1="+f1);
    f2=(float)valeur/chiffre+0.5f;   System.out.println("f2="+f2);
    i1=(int)f1;   System.out.println("i1="+i1);
    i2=(int)f2;   System.out.println("i2="+i2);
    f1=(float)valeur/(float)chiffre;   System.out.println("f1="+f1);
    f2=(float)valeur/(float)chiffre+0.5f;   System.out.println("f2="+f2);
    i1=(int)f1;   System.out.println("i1="+i1);
    i2=(int)f2;   System.out.println("i2="+i2);
    }
}
