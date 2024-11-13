/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package claudiu.test;

import claudiu.Motosapa;
import comun.Aparat;

/**
 *
 * @author cc642
 */
public class MotosapaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Motosapa moto1 = new Motosapa();
        System.out.println(moto1);
        Motosapa moto2 = new Motosapa("Kamrad", "K5200", 246.12, "albastru", 2,"benzina", "manuala", "fir", "ghidon cauciuc", 3200,120);
        System.out.println(moto2);
        Motosapa moto3 = new Motosapa(moto2);
        System.out.println(moto3);
    }
    
}
