public class Test {
    public static void main(String[] args) {
        Seau s1 = new GoutCaramel(new GoutGuimauve(new GoutGuimauve(new SeauCitrouille())));
        System.out.println(s1);
    }
}
