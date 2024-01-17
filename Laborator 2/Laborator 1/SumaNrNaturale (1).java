/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author Oana
 */
public class SumaNrNaturale {
    
public static void main(String[] args) throws IOException {
       
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println ("Introduceti un numar natural: ");
      String s = br.readLine();
      int n = Integer.parseInt(s);
      int suma=0;
          for(int i=0;i<=n;i++)
              suma+=i;
          
      System.out.println("Suma numerelor naturale este:"+suma);
    }    
}
