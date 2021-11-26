package Ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public abstract class DecorateurBufferedReader extends BufferedReader {
    private BufferedReader reader;

    public DecorateurBufferedReader(BufferedReader in) {
        super(in);
        reader= in;
    }

    public DecorateurBufferedReader(Reader in, int sz) {
        super(in, sz);
    }

    @Override
    public String readLine() {
        String s = null;
        try {
            s = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }

    public abstract String traite(String s);
}
