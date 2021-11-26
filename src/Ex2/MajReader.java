package Ex2;

import java.io.BufferedReader;
import java.io.Reader;
import java.util.Locale;

public class MajReader extends DecorateurBufferedReader{
    public MajReader(Reader in, int sz) {
        super(in, sz);
    }

    public MajReader(Reader in) {
        super((BufferedReader) in);
    }

    @Override
    public String traite(String s) {
        return s.toUpperCase();
    }
}
