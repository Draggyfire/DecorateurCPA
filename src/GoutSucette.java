public class GoutSucette extends DecorateurSeaux{
    public GoutSucette(Seaux s) {
        this.seaux = s;
    }

    public String getLibelle() {
        return this.seaux.getLibelle()+" SUCETTTTTTTTTTTTTTTTTTTTTTTTE";
    }
    public double getPrix() {
        return this.seaux.getPrix()+3;
    }

}
