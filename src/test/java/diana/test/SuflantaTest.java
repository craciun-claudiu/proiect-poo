/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diana.test;
import comun.Aparat;
import diana.Suflanta;
/**
 *
 * @author da224
 */
public class SuflantaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aparat aparat1 = new Aparat("LittleDomi","Suflanta aer fara fir",144.85,"negru",0.500);
        System.out.println(aparat1);
        
        Suflanta faraParametri = new Suflanta();
        System.out.println(faraParametri);
        
        Suflanta suflanta1 = new Suflanta("LittleDomi","Suflanta aer fara fir",144.85,"negru",0.500,"acumulator","electric",3,68,74,7500);
        System.out.println(suflanta1);
        
    }
    
}
