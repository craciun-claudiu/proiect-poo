/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package marius.test;
import marius.Trimmer;
import comun.Aparat;

/**
 *
 * @author rentamarius
 */
public class TrimmerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Trimmer t = new Trimmer();
        System.out.print(t);
        Trimmer t2 = new Trimmer("Bosch" , "Modelul bun", 18.2f, "albastru", 30, "Phillips", 10.5, 2, 8, 4);
        System.out.println(t2);
        Trimmer t3 = new Trimmer(t2);
        System.out.println(t3);
    }
    
}