/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diana.test;

import comun.Aparat;
import diana.AparatSpalareCuPresiune;

/**
 *
 * @author da224
 */
public class AparatSpalareCuPresiuneTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aparat aparat1 = new Aparat("Bosch","Universal Aquatak 130", 776.99, "verde,negru", 7.8);
        System.out.println(aparat1);
        
        AparatSpalareCuPresiune faraParametri = new AparatSpalareCuPresiune();
        System.out.println(faraParametri);
        
        AparatSpalareCuPresiune spalarePresiune1 = new AparatSpalareCuPresiune("Bosch","Universal Aquatak 130", 776.99, "verde,negru", 7.8, "la retea", 130, 380, 6, 0.450);
        System.out.println(spalarePresiune1);
        
        faraParametri = spalarePresiune1;
        System.out.println(faraParametri);
    }
    
}
