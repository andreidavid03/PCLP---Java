import java.io.*;
import java.util.Arrays;
public class Aplicatie {
    public static void main(String args[]) throws IOException {
        System.out.println("===============================================\n");
        Matrice T2 = new Matrice ("T2",2,2);
        T2.completeazaMatrice();
        System.out.println("===============================================\n");
        T2.afisare();
       
      
        
        System.out.println("===============================================\n");
        System.out.println("Determinant matrice = " + T2.getDeterminant());
        
        System.out.println("===============================================\n");
        double [][] test = T2.getMatrice();
        System.out.println(Arrays.deepToString(test));
        
        //double det = E.calculDeterminant(test);
        //nu va merge
        
    }
}
