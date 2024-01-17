package lab10;
import java.io.*;
public class ScrieFisierText {
	public static void main (String [] args) {    
		String linie;
		try {
		       BufferedWriter fisier = new BufferedWriter(
			new FileWriter("scrie_linii.dat"));
		       BufferedReader in =  new BufferedReader(
			new InputStreamReader(System.in));
		   System.out.println("Introduceti o linie de text iar la sfarsit tastati <Enter> ");
		       do {
		       linie = in.readLine();
		       fisier.write(linie, 0, linie.length());
		       fisier.newLine();
		       } while (linie.length() != 0);
		       fisier.close();
		       }
		catch(IOException e) {
		        System.out.println("Eroare: " + e.getMessage());
		        }
	}
}

		       
		       
