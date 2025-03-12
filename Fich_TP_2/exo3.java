package Fich_TP_2;

public class exo3 {
    public static void main(String[] args) {
        int a=3 ,b=5 ;
        int x=3,y=5 ,z=2,r=6;
        char lettre ='i',car='j';
        System.out.println("A != B : "+(a!=b));
        System.out.println("A + 2 == B : "+(a+2==b));
        System.out.println("A+8 < 2*B : "+(a+8<2*b));
        System.out.println("lettre <= car : "+(lettre<=car));
        System.out.println("lettre == 'w' : "+(lettre == 'w'));
        System.out.println("X<Y && Z<R : "+((x<y)&&(z<r)));
        System.out.println("X>Y || Z<R : "+((x>y)||(z<r)));
        System.out.println("!(Z<R) : "+!(z<r));

    }
    
}
