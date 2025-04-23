package testExam;

public class mainClass {
    public static void main(String[] args) {
        livers liver = new livers(3);
        liver.stocker(2, 220);
        System.out.println("stocke = "+liver.get_stock()+"\nprix ="+liver.prixU);
    }
}
