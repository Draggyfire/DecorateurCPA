package Ex1;

public class GoutGuimauve extends DecorateurSceau{
    public GoutGuimauve(Seau s){
        seau = s;
    }
    @Override
    public String getLibelle() {
        return seau.getLibelle()+" "+"avec recharge guimauves";
    }

    @Override
    public double getPrix() {
        return seau.getPrix()+1.5;
    }
}
