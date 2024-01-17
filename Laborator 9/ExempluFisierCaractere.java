package lab9;


import java.io.*;

public class ExempluFisierCaractere {
public static void main (String [] args) {
    String linie;
    try {
	     BufferedWriter fout=new BufferedWriter(new FileWriter("exemplu.dat"));
             System.out.println("Introduceti o linie de text "
                              + "iar la sfarsit tastati <Enter> ");
             do {
		 linie = cin.linie();
		 fout.write(linie, 0, linie.length());
		 fout.newLine();
		 } while (linie.length() != 0);
             fout.close();
    }
    catch(IOException ef){
          if (ef instanceof FileNotFoundException)
             System.out.println("Fisierul nu poate fi deschis");
          else
             System.out.print("Eroare: " + ef.getMessage());}
    try {
     BufferedReader fin = new BufferedReader(new FileReader("exemplu.dat"));
     boolean eof = false;
     while(!eof){
          linie = fin.readLine();
	  if (linie == null)
	     eof = true;
          else
	     System.out.println(linie);}
     fin.close();
    }
    catch(IOException ef){
          if (ef instanceof FileNotFoundException)
             System.out.println("Fisierul nu poate fi deschis");
          else
             System.out.print("Eroare: " + ef.getMessage());}
}
}
