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
public class Japonez extends Persoana {

    public Japonez() {
        this.nationalitate = "japonez";
        this.setFelMancare("sushi");
    }

    @Override
    public void merge() {
        System.out.println("Merge cu trenul.");
    }

    @Override
    public void doarme() {
        System.out.println("Doarme 6 ore.");
    }

    @Override
    public void vorbeste() {
        System.out.println("Vorbeste japoneza.");
    }
}
