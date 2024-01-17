import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
public class Vector
{
	public static void main(String[] args)  throws IOException {
		System.out.println("Introduceti dimensiunea vectorului: ");
		int a = citesteNr();
		 System.out.println("Dimensiunea vectorului este:" + a);
		 int v[]= new int [a];
		 for (int i = 0; i < v.length; i++) {
            System.out.println("Introduceti numarul pentru pozitia " + i + ": ");
            v[i] = citesteNr();
        }
        System.out.println("Vectorul nesortat este: ");
       for (int i = 0; i < v.length; i++) {
          System.out.println("v(" + i + ")=" + v[i]);
       }
        //sortare vector
        sortareCuInterschimbare(v);
        
        //suma elementelor
        int s = suma(v);
        System.out.println("Suma elementelor este: " + s);

        //media aritmetica
        double ma = mediaAritmetica(s, v.length);
        System.out.println("Media elementelor este: " + ma);
		 
	}
	
	public static int citesteNr() throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return Integer.parseInt(s);
    }
    
    public static void sortareCuInterschimbare(int[] v) {
        int aux;
        for (int i = 0; i < v.length; i++) {
            for (int j = i; j > 0; j--) {
                if (v[j] < v[j - 1]) {
                    aux = v[j];
                    v[j] = v[j - 1];
                    v[j - 1] = aux;
                }
            }
        }
        System.out.println("Vectorul sortat cu interschimbare este: ");
        System.out.println(Arrays.toString(v));
    }
     public static int suma(int[] v) {
        int suma = 0;
        for (int i = 0; i < v.length; i++) {
            suma += v[i];
        }
        return suma;
    }

    public static double mediaAritmetica(int suma, int lungime) {
        double medie = suma / lungime;
        return medie;
    }
}
