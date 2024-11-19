/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package marius.test;
import marius.Drujba;
import comun.Aparat;

/**
 *
 * @author rentamarius
 */
public class DrujbaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Drujba d = new Drujba();
        System.out.print(d);
        Drujba drujba1 = new Drujba("Blade Alpin","Wolfson STX-620", 500.00f, "rosu", 1.5f, 3.0, 50.0, 4, 20, 15);
        System.out.println(drujba1);
        Drujba drujba2 = new Drujba(drujba1);
        System.out.println(drujba2);
    }
    
}
