package lab8;
public class TestEroare3 {
    String citSir() throws EroareNealfabeticException {
        String sir = new String(cin.linie());
        boolean gasit=false;
        for (int i=0;i<sir.length();i++)
            if((sir.charAt(i)<'A' || sir.charAt(i)>'Z')&&
            (sir.charAt(i)<'a' || sir.charAt(i)>'z')&&
            sir.charAt(i)!= ' ') gasit=true;
   if (gasit) throw new EroareNealfabeticException 
   ("sir nealfabetic");
   else
       return sir; }
    public static void main(String[] args){
        TestEroare3 te3 = new TestEroare3();
        System.out.println("tastati sirul");
        String s = " ";
        try{
            s = te3.citSir();
            System.out.println(s);}
        catch (EroareNealfabeticException e){
       System.out.println("eroare: "+e.getMessage());}}}