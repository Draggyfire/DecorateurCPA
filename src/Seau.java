public abstract class Seau {
    private double prix;
    private String libelle;
    public double getPrix(){
        return prix;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setPrix(double prix){
        this.prix=prix;
    }

    @Override
    public String toString() {
        return "Seau{" +
                "prix=" + prix +
                ", libelle='" + libelle + '\'' +
                '}';
    }

}
