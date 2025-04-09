package Fich_TP_4.exo1;
import java.util.Scanner;

public class class1 {
    Scanner input = new Scanner(System.in);

    String car_name; 
    int car_modele ;
    int max_speed;

public void setCar_name(String car_name) {
    this.car_name = car_name;
}
String get_name(){
    return car_name;
}

public void setCar_modele() {
    System.out.println("give car ");
   car_modele = input.nextInt();
}
public int getCar_modele() {
    return car_modele;
}
}
