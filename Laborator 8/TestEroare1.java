package lab8;
public class TestEroare1 {
    public int citesc() throws 
    EroareIntervalException, EroareNumarException{
        int n=0;
        try{
            n = Integer.parseInt(cin.Token());}
        catch(Exception er) {
 throw new EroareNumarException
 ("valoarea trebuie sa fie un numar intreg");}
        if (n>=1 && n<=5)
            return n;
        else 
 throw new EroareIntervalException
 ("numarul trebuie sa fie : 1<=n<=5");}
    public static void main(String[] args){
        int semnal = 0 ; int n = 1;
        TestEroare1 te1 = new TestEroare1();
        while(semnal == 0)
            try{
                System.out.println("n = ");
                n = Integer.parseInt(cin.Token());
                semnal = 1;}
            catch(Exception er){
                System.out.println
                ("eroare .la introducerea numarului");}
        int[] vect = new int[n];
        System.out.println("Introduceti numerele:");
        for(int i=0;i<n;i++)
            try{
                vect[i]=te1.citesc();}
            catch (EroareIntervalException er){
                System.out.println
                ("eroare : " + er.getMessage());
                i--;}
        catch (EroareNumarException er) {
            System.out.println ("eroare : " + 
        er.getMessage());
            i--;}
        System.out.println("am citit numerele");
        for(int i=0;i<n;i++)
            System.out.print(vect[i] + " ");}}



        
    


