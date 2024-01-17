package mostenire;
public class Mostenire {
    public static void main(String[] args) {
        Persoana persoana = new Roman();
        persoana.nume = "Petru";
        persoana.prenume = "Marius-Guta";
        persoana.varsta = 21;
        persoana.venit = 100;

        persoana.setBogat(persoana.venit > 500);

        persoana.mananca();
        persoana.merge();
        persoana.doarme();
        persoana.vorbeste();
        persoana.esteBogat();
        persoana.castigaLaLoto();
        persoana.esteBogat();

        System.out.println();

        persoana = new Japonez();
        persoana.nume = "Kim";
        persoana.prenume = "Nadako";
        persoana.varsta = 45;
        persoana.venit = 10000;

        persoana.setBogat(persoana.venit > 500);

        persoana.mananca();
        persoana.merge();
        persoana.doarme();
        persoana.vorbeste();
        persoana.esteBogat();
        persoana.castigaLaLoto();
        persoana.esteBogat();

    }
}
