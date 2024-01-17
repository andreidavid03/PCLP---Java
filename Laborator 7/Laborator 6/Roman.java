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
public class Roman extends Persoana {

    public Roman() {
       this.nationalitate="roman";
       this.setFelMancare("sarmale");
    }
        
    @Override
    public void merge() {
        System.out.println("Merge pe jos.");
    }
   
    @Override
    public void doarme() {
        System.out.println("Doarme 8 ore.");
    }
    
    @Override
    public void vorbeste() {
        System.out.println("Vorbeste romana.");
    }  
}
