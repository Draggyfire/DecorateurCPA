package Ex1;

public class GoutPraline extends DecorateurSceau{
    public GoutPraline(Seau s){
        seau = s;
    }
    @Override
    public String getLibelle() {
        return seau.getLibelle()+" "+"avec recharge pralines";
    }

    @Override
    public double getPrix() {
        return seau.getPrix()+1.25;
    }
}
