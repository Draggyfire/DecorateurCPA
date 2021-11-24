package Ex2;

import java.io.BufferedReader;

public class CryptoReader extends DecorateurBufferedReader{


    public CryptoReader(BufferedReader in) {
        super(in);
    }

    @Override
    public String traite(String s) {
        StringBuilder string = new StringBuilder(s);
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            Character car = (Character) c;
            switch (Character.getType(car)) {
                case 1:
                    System.out.println(car + " UNE LETTRE");
                    string.setCharAt(i, (char) rot13(car));
                    break;

                case 2:
                    System.out.println(car + " une lettre");
                    //string.append(rot13(car));
                    string.setCharAt(i, (char) rot13(car));
                    break;

                default:
                    System.out.println(car.getType(car) + " Un autre truc");
                    break;
            }
        }
        return string.toString();
    }

    public int rot13(int c) {
            if (c >= 'a' && c <= 'm')
                c += 13;
            else if (c >= 'A' && c <= 'M')
                c += 13;
            else if  (c >= 'n' && c <= 'z')
                c -= 13;
            else if  (c >= 'N' && c <= 'Z')
                c -= 13;
        return c;
    }



}
