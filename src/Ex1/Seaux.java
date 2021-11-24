package Ex1;

public abstract class Seaux {
    private double prix;
    private String libelle;

    public double getPrix() {
        return prix;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
