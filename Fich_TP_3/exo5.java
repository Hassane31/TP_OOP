package Fich_TP_3;
import java.util.Scanner;

public class exo5 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("donner N =");
        int n = input.nextInt();
        if(n==0){ System.out.println("factoriel "+n+" est :0");}
        else {
        System.out.println("factoriel "+n+" est :"+fact(n));}
       input.close();
    }
   static int fact (int n){
        int f=1;
        for(int i = 1 ;i<=n;i++){
            f*=i;

        }
        return f;
    }
}
