package Ex2;

import java.io.BufferedReader;
import java.util.Locale;

public class MajReader extends DecorateurBufferedReader{
    public MajReader(BufferedReader in) {
        super(in);
    }

    @Override
    public String traite(String s) {/*
        StringBuilder string = new StringBuilder(s);
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            c = Character.toUpperCase(c);
            string.setCharAt(i, c);
        }
        return string.toString();*/
        return s.toUpperCase();
    }
}
