package Ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public abstract class DecorateurBufferedReader extends BufferedReader {
    protected BufferedReader buff;
    public DecorateurBufferedReader(BufferedReader in) {
        super(in);
        this.buff = in;
    }
    public String readLine() {
        String s = null;
        try {

            s = buff.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return traite(s);
    }
    public abstract String traite(String s);

}
