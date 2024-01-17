package lab9;

import java.io.*;

public class ExempluFisier {
public static void main (String [] args) {
    int col = 0; int lin = 0;
    int [] linieNr;
    int semnal = 0;
    try {
        DataOutputStream fout =new DataOutputStream(new BufferedOutputStream(new FileOutputStream("matrice.dat")));
        while(semnal == 0)
        try {
            System.out.println("Introduceti nr de linii si nr de coloane separate prin spatiu");
            linieNr = cin.citesteLinieNumere();
            if (linieNr != null && linieNr.length == 2)
                {semnal = 1;
                lin = linieNr[0];
                col = linieNr[1];
                System.out.println(lin + " "+col);}
            else
               {System.out.println("Sir null sau lipsa nr linii sau coloane, reintroduceti");}
            }
        catch (EroareNumarException er) {
            System.out.println("Eroare: " + er.getMessage());}
        fout.writeInt(lin);
        fout.writeInt(col);
        for (int i=0; i<lin;i++){
            semnal = 0;
            while(semnal == 0)
              try {
                 System.out.println("Introduceti elementele de pe linia "+i+":");
                 linieNr = cin.citesteLinieNumere();
                 if (linieNr != null)
                     if (linieNr.length>=col)
                       {semnal = 1;
                        for(int j=0;j<col;j++)
                        fout.writeInt(linieNr[j]);}
                     else
                        System.out.println("Ati introdus un nr de elemente mai mic pe linia curenta, reintroduceti");
                  else
                     System.out.println("Sir null, reintroduceti");
                 }
               catch (EroareNumarException er) {
                  System.out.println("Eroare: " + er.getMessage());}
          }
        fout.close();
        }
    catch(IOException ef){
          if (ef instanceof FileNotFoundException)
             System.out.println("Fisierul nu poate fi deschis");
          else
             System.out.print("Eroare: " + ef.getMessage());}
    try {
        DataInputStream fin =new DataInputStream(new BufferedInputStream(new FileInputStream("matrice.dat")));
        int element = 0;
        try {
	      lin = fin.readInt();
              System.out.println(lin);
              col = fin.readInt();
              System.out.println(col);
              for(int i=0;i<=lin;i++){
                  for(int j=0;j<col;j++){
                     element = fin.readInt();
	             System.out.print(element + " ");}
                  System.out.println();
              }
	    }
	catch(EOFException eof) {
            System.out.println(eof.getMessage());
	    fin.close();}
    }
    catch(IOException ef) {
        if (ef instanceof FileNotFoundException)
             System.out.println("Fisierul nu poate fi deschis");
        else
             System.out.print("Eroare: " + ef.getMessage());}
    }
    }
