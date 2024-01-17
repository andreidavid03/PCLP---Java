package lab8;
import java.io.*;
import java.util.*;
public class cin {
   static BufferedReader br= new BufferedReader 
		   (new InputStreamReader(System.in));
static String linie(){
   try{    return br.readLine();  }
   catch(IOException e){
   return ("eroare citira");    }}
static String Token(){
StringTokenizer v = new StringTokenizer(linie());
   if (v.hasMoreTokens())
       return v.nextToken();
   else
       return " ";}}


