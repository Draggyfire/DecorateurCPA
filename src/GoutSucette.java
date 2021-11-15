public class GoutSucette extends DecorateurSceau{
    public GoutSucette(Seau s){
        seau = s;
    }
    @Override
    public String getLibelle() {
        return seau.getLibelle()+" "+"avec recharge sucette";
    }

    @Override
    public double getPrix() {
        return seau.getPrix()+2;
    }
}
