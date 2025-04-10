package Fich_TP_3.exo2;
import java.util.Scanner;

public class classM {
    Scanner input = new Scanner(System.in);
  
   private  String month;
   private int year;

    public  void setMonth() {
        String month = input.next();
    }

    public  void setYear() {
        int year = input.nextInt();
    }

public  void Nbr_days (M){
    switch (month) {
        case "January" : System.out.println("31 day");
            break;
            case "March" : System.out.println("31 day");
            break;
            case "April" : System.out.println("30 day");
            break;
            case "May" : System.out.println("31 day");
            break;
            case "June" : System.out.println("30 day");
            break;
            case "Julay" : System.out.println("31 day");
            break;
            case "August" : System.out.println("31 day");
            break;
            case "September" : System.out.println("30 day");
            break;
            case "October" : System.out.println("31 day");
            break;
            case "November" : System.out.println("30 day");
            break;
            case "December" : System.out.println("31 day");
            break;

            case "February" : if((year % 400 == 0 )||(year %4==0)&&(year % 100!= 0))System.out.println("29 day");
            else System.out.println("28 day");

            break;

        default: System.out.println("error");
            break;
    }


}
}
