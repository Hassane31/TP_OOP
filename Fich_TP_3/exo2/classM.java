package Fich_TP_3.exo2;
import java.util.Scanner;

 public class classM {
   static Scanner input = new Scanner(System.in);
  
   static String month;
  static int year;

    public static  void setMonth() {
         month = input.next();
    }

    

public static  void Nbr_days (){
    switch (month) {
        case "January" : System.out.println("31 days");
            break;
            case "March" : System.out.println("31 days");
            break;
            case "April" : System.out.println("30 days");
            break;
            case "May" : System.out.println("31 days");
            break;
            case "June" : System.out.println("30 days");
            break;
            case "Julay" : System.out.println("31 days");
            break;
            case "August" : System.out.println("31 days");
            break;
            case "September" : System.out.println("30 days");
            break;
            case "October" : System.out.println("31 days");
            break;
            case "November" : System.out.println("30 days");
            break;
            case "December" : System.out.println("31 days");
            break;

            case "February" :
            System.out.println("give the year :");
                year = input.nextInt();
             if((year % 400 == 0 )||(year %4==0)&&(year % 100!= 0))System.out.println("29 days");
            else System.out.println("28 days");

            break;

        default: System.out.println("error");
            break;
    }


}
}
