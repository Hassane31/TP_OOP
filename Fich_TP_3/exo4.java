package Fich_TP_3;

public class exo4 {
    public static void main(String[] args) {
        int T[]={1,45,78,98,4};
        for(int i=1 ;i<4;i++){
            int X ;
            for(int j=0;j<4;j++){
if(T[j]<=T[i]){
    X=T[i];T[i]=T[j];T[j]=X;
}
            }
          
            }
            System.out.println("T=");
            for(int i=0;i<4;i++){
                System.out.println(""+T[i]);
        }

    }
}
