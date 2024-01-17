
import java.io.*;
public class SumaCifre {
  public static void main(String[] args) throws IOException {
    
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    System.out.println("Introduceti un numar natural nenul:");
    String s = br.readLine();
    int n = Integer.parseInt(s);
    
    System.out.println("Suma cifrelor numarului este: " + SumaCifreNumar(n));
    System.out.println("Numarul obtinut prin inversarea cifrelor sale este: " + InvCifreNumar(n));
    System.out.println("Descompunerea mumarului in factori primi este:" + FactoriPrimi(n));
  }
    public static int SumaCifreNumar (int nn){
      int suma = 0; 
      while (nn !=0) {
        suma += nn%10;
        nn /= 10;
      }    
      return suma;
    }
    public static int InvCifreNumar(int nn){
        int invnn=0;
        while (nn != 0){
            invnn = invnn*10 + nn%10;
            nn /= 10;}
        return invnn;
    }
    public static String FactoriPrimi(int nn){
       int i=2; String s = " ";
       do {
           int mult=0;
           while (nn%i==0){
               mult++;
               nn /=i;
           }
           if (mult !=0) 
               s= s + i + "^" + mult + "* "; 
           i++;
       }
           while (nn!=1);
       return s;
    }
}
