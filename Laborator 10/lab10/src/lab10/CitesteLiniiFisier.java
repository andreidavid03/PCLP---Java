package lab10;
import java.io.*;
public class CitesteLiniiFisier {
 public static void main (String [] args) {
		try {
		BufferedReader fisier = new BufferedReader(
			new FileReader("print.txt"));
		boolean eof = false;
		while(!eof)     {
		        String linie = fisier.readLine();
		        if (linie == null)
         eof = true;
		        else
			System.out.println(linie); }
		  fisier.close(); }
		  catch(IOException e) {
System.out.println("Eroare: " + e.getMessage());  }}}

