
public class etud extends perssone {
    public String dep;
    public double moy1, moy2;

    public double moyAnuelle() {
        return (moy1 + moy2) / 2.0;
    }

    public String obeservation() {
        if (this.moyAnuelle() >= 10) {
            return "admis";
        } else
            return "ajourne";
    }

    etud(String nom, String prenom, int date, String adresse, String tel, String dep, double moy1, double moy2) {
        super(nom, prenom, date, adresse, tel);
        this.moy1 = moy1;
        this.moy2 = moy2;
    }

}
