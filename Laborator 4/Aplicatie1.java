
package matrice;

import java.io.*;
import java.util.Arrays;

public class Aplicatie {

    public static void main(String args[]) throws IOException {
        //Matrice T1 = new Matrice();
        System.out.println("===============================================\n");
        Matrice T2 = new Matrice ("T2",3,2);
        T2.completeazaMatrice();
        System.out.println("===============================================\n");
        T2.afisare();
        
        System.out.println("===============================================\n");
        Matrice T3 = new Matrice ("T3",2);
        T3.completeazaMatrice();
        System.out.println("===============================================\n");
        T3.afisare();
        
        System.out.println("===============================================\n");
        Matrice E = new Matrice("E",3,3,true);
        E.afisare();
        
        System.out.println("===============================================\n");
        //E.nume = "nu va merge";
        E.setNume("E_modificat");
        E.afisare();
        
        System.out.println("===============================================\n");
        E.setNume();
        E.afisare();
        
        System.out.println("===============================================\n");
        E.schimbaValoare(0, 0, -100);
        E.afisare();
        
        System.out.println("===============================================\n");
        System.out.println("Determinant matrice = " + E.getDeterminant());
        
        System.out.println("===============================================\n");
        double [][] test = E.getMatrice();
        System.out.println(Arrays.deepToString(test));
        
        //double det = E.calculDeterminant(test);
        //nu va merge
        
    }
}
