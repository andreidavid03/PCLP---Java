/**
 *
 * @author Daniel
 */

package matrice;

import java.io.*;
import java.util.StringTokenizer;

public class Matrice {
/*
Atributele: - se multiplica odata cu instantierea clasei
            - sunt vizibile in interiorul clasei dar nu obligatoriu 
              si in exterior (functie de modificatorul de acces)
              (public / private / protected / default)
            - denumire camelCase
            - fiecare obiect are atributele sale
    <modificator_de_acces> tip_de_date nume_atribut < =valoare>;
*/
    private double [][] matrice;
    private String nume;
    private double determinant;

    
/*
Metodele:   - domeniul de vizibilitate ales de programator
            - metodele clasei sunt vizibile in clasa indiferent 
              de modificatorul de acces
            - apelarea se face pe obiectul dorit
              obiect.metoda(<arg>);
            - codul este comun tuturor obiectelor instantiate

    <modificator_de_acces> <calificatori> tip_date_produs nume(
        <tip_date nume_arg, tip_date nume_arg>)

            - semnatura: numele si succesiunea tipurilor de date ale 
              argumentelor (pentru overloading)

*/    
    public Matrice (String nume, int linii, int coloane){
    //Constructorul
        this.nume = nume;
        matrice = new double [linii][coloane];
        System.out.println("A fost creata matricea: " +
                this.nume + " de dimensiunea: " + linii + " x " + coloane);
    //are nume impus si posibila lista de argumente (nume = nume clasa)
    //nu are tip de date de intoarcere (nici macar void)
    //daca nu il punem - se creaza unul automat (cel default, corp vid + fara argumente)
    //daca l-am pus - cel default nu se mai creaza
    }
    
    public Matrice (String nume, int linii){
        // overloading (supraincarcarea) - constructor
        // apelare constructor din alt constructor - cu this 
        // prima instructiune din constructorul apelat
        this (nume, linii, linii);
        System.out.println("Matricea este patratica.");
    }
    
    public Matrice (String nume, int linii, int coloane, boolean completat) throws IOException{
        this (nume, linii, coloane);
        if (completat == true) completeazaMatrice();
    }

    public Matrice (String nume, int linii, boolean completat) throws IOException{
        this (nume, linii, linii);
        System.out.println("Matricea este patratica.");
        if (completat == true) completeazaMatrice();
    }
    
    public void afisare(){
        //metoda prin care afisam matricea
        System.out.println("Matricea " + nume + ": ");
        for (int i=0; i<matrice.length; i++){
            for (int j=0; j<matrice[i].length; j++){
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void setNume (String nume){
        //setter-ul
        //nume format din setAtribut
        //nu are date de intoarcere
        //primeste ca argument noua valoare ce se doreste introdusa in obiect
        //metoda pentru schimbarea numelui matricii
        //cand avem variabile shadowing -> folosim this.numeAtribut
        this.nume = nume;
    }
    
    public void setNume (){
        setNume("fara nume");
    }
    
    public void completeazaMatrice() throws IOException{
        
        int linii = matrice.length;
        int coloane = matrice[0].length;
        
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        String s;
        
        for (int i=0; i<linii; i++){
            System.out.println("Introduceti elementele de pe linia "+i+":");
            s=br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            if (st.countTokens() == coloane){
                for(int j=0;j<matrice[i].length;j++){
                    matrice[i][j] = Double.parseDouble(st.nextToken());
                }
            } else {
                System.out.println("Ati introdus un nr de elemente mai mare sau" +
                        " mai mic pe linia curenta. Se umple cu <0.00>.");
                for(int j=0;j<matrice[i].length;j++){
                    matrice[i][j] = 0.0;
        }
            }
        }
    }
    
    public void schimbaValoare(int i, int j, double val){
        matrice[i][j] = val;
    }

    public double [][] getMatrice(){
        //numele difera functie de campul pentru care este scris
        //getAtribut / isAtribut(boolean)
        //nu are argumente
        //return de acelasi tip ca atributul
        return matrice;
    }
    
    public double getDeterminant(){
        determinant = calcDeterminant(matrice);
        return determinant;
    }
    
    private double calcDeterminant(double [][] mat){
        if (mat.length != mat[0].length){
            System.out.println("Matricea nu este patratica. \n" +
                    "Nu se poate calcula determinantul.");
            return determinant;                
        }
        
        if (mat.length == 1){
            determinant = mat[0][0];
            return determinant;
        }
        
        if (mat.length == 2){
            determinant = mat[0][0]*mat[1][1]-mat[0][1]*mat[1][0];
            return determinant;
        }
        
        for (int col = 0; col<mat[0].length; col++){
            double [][]temp = new double[mat.length-1][mat[0].length-1];
            for (int i=1; i<mat.length; i++)
                for(int j=0; j<mat[0].length;j++){
                    if (j<col)
                        temp[i-1][j]=mat[i][j];
                    else if(j>col)
                        temp[i-1][j-1]=mat[i][j];
                }
        determinant = determinant + 
                Math.pow(-1,(double)col)*mat[0][col]*calcDeterminant(temp);
        }
        return determinant;
    }
 
}
