package lab9;

import java.io.*;
import java.util.*;
public class cin {
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
static String linie(){
    try{
        return br.readLine();
    }
    catch(IOException e){
        return ("Eroare citire");
    }
}
static String Token(){
    StringTokenizer v = new StringTokenizer(linie());
    if (v.hasMoreTokens())
        return v.nextToken();
    else
        return " ";
}
static String [] Tokens(){
    int i = 0;
    String [] esir;
    StringTokenizer v = new StringTokenizer(linie());
    if (v.countTokens()!= 0)
    {
      esir = new String[v.countTokens()];
      while (v.hasMoreTokens())
        {
        esir [i] = v.nextToken();
        i++;
        }
      return esir;
    }
    else
        return null;
}
static int [] citesteLinieNumere() throws EroareNumarException{
    String [] sir = cin.Tokens();
    if (sir !=null){
    int [] linie = new int[sir.length];
    try {
      for (int i=0;i<sir.length;i++)
        linie [i] = Integer.parseInt(sir[i]);
      return linie;}
    catch(Exception er) {
      throw new EroareNumarException("Valoarea trebuie sa fie de tip intreg!!!");
      }
    }
    else
    return null;
}
}
