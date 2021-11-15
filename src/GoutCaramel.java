public class GoutCaramel extends DecorateurSceau{
    public GoutCaramel(Seau s){
        seau = s;
    }
    @Override
    public String getLibelle() {
        return seau.getLibelle()+" "+"avec recharge caramel";
    }

    @Override
    public double getPrix() {
        return seau.getPrix()+1.75;
    }
}
