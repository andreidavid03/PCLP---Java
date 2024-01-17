/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Oana
 */
package intrareiesire;

import exceptii.*;
import java.io.*;
import java.util.StringTokenizer;

/* citeste un sir de caractere il separa in elemente lexicale, folosind delimitatorul spatiu  
* si creaza un tablou  de numere de tipul int */
public class CitesteDate {

    public static String citesteString() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            return br.readLine();
        } catch (IOException ioe) {
            return null;
        }
    }

    public static int citesteNrInt() {
        try {
            return Integer.parseInt(citesteString());
        } catch (NumberFormatException nfe) {
            System.out.println("Nu este numar intreg. "
                    + "Se stocheaza valoarea 0.");
            return 0;
        }
    }

    public static int citNrIntInterval() throws IntervalException, NumberFormatException {

        try {
            int n = Integer.parseInt(citesteString());
            if (n >= 2 && n <= 10) {
                return n;
            } else {
                throw new IntervalException("Numar in afara intervalului.");
            }

        } catch (NumberFormatException nfe) {
            throw new NumberFormatException("Nu este numar intreg.");
        }
    }

    public static int[] citesteSeparaSir() {
        String sir = citesteString();
        StringTokenizer st = new StringTokenizer(sir);
        int[] tablou = new int[st.countTokens()];
        for (int i = 0; i < tablou.length; ++i) {
            try {
                tablou[i] = Integer.parseInt(st.nextToken());
            } catch (NumberFormatException nfe) {
                System.out.println("Nu este numar intreg. Se stocheaza valoarea 0.");
                tablou[i] = 0;
            }
        }
        return tablou;
    }
}
