
import java.io.*;
public class Af1 {
  public static void main(String[] args) throws IOException {
    
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    System.out.println("Introduceti un numar natural nenul:");
    String s = br.readLine();
    int n = Integer.parseInt(s);
    
    System.out.println("Suma cifrelor numarului este: " + SumaCifreNumar(n));
      }
    
  
  
  
  
  public static int SumaCifreNumar (int nn){
      int suma = 0; 
      while (nn !=0) {
        suma += nn%10;
        nn /= 10;
      }    
      return suma;
    }
   
}
