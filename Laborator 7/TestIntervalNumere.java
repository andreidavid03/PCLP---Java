/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oana
 */
import intrareiesire.*;
import exceptii.*;

class TestIntervalNumere {

    public static void main(String[] args) {
        CitesteDate valIntreg = new CitesteDate();
        System.out.println("Introduceti numarul de elemente ale sirului:");
        int n = valIntreg.citesteNrInt();
        int[] numere = new int[n];
        System.out.println("Introduceti elementele sirului: ");
        for (int i = 0; i < numere.length; i++)
		try {
            numere[i] = valIntreg.citNrIntInterval();
        } catch (IntervalException ie) {
            System.out.println("Eroare:" + ie.getMessage());
            i--;
        } catch (NumberFormatException nf) {
            System.out.println("Eroare:" + nf.getMessage());
            i--;
        }

        System.out.println("Sirul de numere introdus este: ");
        for (int i = 0; i < numere.length; i++) {
            System.out.print(numere[i] + " ");
        }
    }
}
