import java.io.*;
/**
 *
 * @author Oana
 */
public class Afisare{
    
public static void main(String[] args) throws IOException {
       
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println ("Introduceti un numar natural: ");
      String s = br.readLine();
      int n = Integer.parseInt(s);
      
          
      System.out.println(n);
    }    
}
