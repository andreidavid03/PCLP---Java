/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mostenire;

/**
 *
 * @author doris.pogacean
 */
public class Persoana {

    public String nume;
    public String prenume;
    public int varsta;
    public int venit;
    private boolean bogat;
    private String felMancare;

    public String nationalitate;

    public void mananca() {
        System.out.println(nume + " " + prenume + " mananca " + felMancare);
    }

    public void merge() {
        System.out.println("Merge");
    }

    public void doarme() {
        System.out.println("Doarme");
    }

    public void vorbeste() {
        System.out.println("Vorbeste");
    }

    public boolean tanar() {
        return varsta < 40;
    }

    public boolean getBogat() {
        return bogat;
    }

    public void setBogat(boolean bogat) {
        this.bogat = bogat;
    }

    public String getFelMancare() {
        return felMancare;
    }

    public void setFelMancare(String felMancare) {
        this.felMancare = felMancare;
    }

    public void castigaLaLoto() {
        System.out.println(this.nume + " " + this.prenume + " a castigat la Loto. ");
        this.bogat = true;
    }

    public void esteBogat() {
        String esteBogat;

        if (this.bogat) {
            esteBogat = "bogat.";
            System.out.println(this.nume + " " + this.prenume + " este " + esteBogat);
        } else {
            esteBogat = "sarac.";
            System.out.println(this.nume + " " + this.prenume + " este " + esteBogat);
        }
    }
}
