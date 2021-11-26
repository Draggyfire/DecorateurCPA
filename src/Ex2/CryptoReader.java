package Ex2;

import java.io.BufferedReader;
import java.io.Reader;

public class CryptoReader extends DecorateurBufferedReader{

    public CryptoReader(Reader in, int sz) {
        super(in, sz);
    }

    public CryptoReader(Reader in) {
        super((BufferedReader) in);
    }

    @Override
    public String traite(String s) {
        return s.toUpperCase();
    }
}
