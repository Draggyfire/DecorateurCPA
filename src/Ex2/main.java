package Ex2;

import java.io.*;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream inin = new FileInputStream("C:\\Users\\zacka\\Desktop\\CPA SEMESTRE3\\VraiTD6\\src\\Ex2\\fic.txt");
        InputStreamReader in = new InputStreamReader(inin);
        BufferedReader buff = new BufferedReader(in);
        CryptoReader c = new CryptoReader(buff);
        MajReader m = new MajReader(buff);

        System.out.println(c.readLine());
        //System.out.println(c.readLine());

        System.out.println("  --------------------- \n" +
                "\n" +
                "\n");

        System.out.println(m.readLine());
    }
}
