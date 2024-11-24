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
        Motosapa moto2 = new Motosapa("Kamrad", "K5200", 246.12f, "albastru", 2,"benzina", "manuala", "fir", "ghidon cauciuc", 3200,120);
        System.out.println(moto2);
        Motosapa moto3 = new Motosapa(moto2);
        System.out.println(moto3);
        
         Motosapa[] v = new Motosapa[10];
        
        v[0] = new Motosapa("Honda", "FG110", 2200, "Roșu", 14, "Benzină", "Manuală", "Freze rotative", "Ergonomic", 3, 100);
        v[1] = new Motosapa("Stihl", "MH 445", 3200, "Portocaliu", 40, "Benzină", "Demaror", "Freze rotative", "Reglabil", 4, 120);
        v[2] = new Motosapa("Makita", "ELM3311", 1900, "Albastru", 12, "Electrică", "Buton electric", "Freze cu lame", "Fix", 3, 105);
        v[3] = new Motosapa("Einhell", "GC-MT 1636/1", 1500, "Roșu", 29, "Benzină", "Manuală", "Freze cu disc", "Pliabil", 3, 115);
        v[4] = new Motosapa("Husqvarna", "TF 230", 4000, "Portocaliu", 66, "Benzină", "Demaror", "Freze grele", "Ergonomic", 5, 140);
        v[5] = new Motosapa("Greenworks", "G-MT40", 2800, "Verde", 17, "Electrică", "Buton electric", "Freze rotative", "Fix", 4, 110);
        v[6] = new Motosapa("Alpina", "A405", 1700, "Alb cu negru", 30, "Benzină", "Manuală", "Freze cu lame", "Reglabil", 3, 125);
        v[7] = new Motosapa("Viking", "HB 560", 4500, "Verde", 48, "Benzină", "Demaror", "Freze grele", "Ergonomic", 4, 135);
        v[8] = new Motosapa("Texas", "Fusion 10TG", 3300, "Negru", 85, "Benzină", "Manuală", "Freze industriale", "Reglabil", 5, 150);
        v[9] = new Motosapa("AgroPro", "MTX 80", 2500, "Albastru", 50, "Diesel", "Demaror", "Freze cu lame", "Pliabil", 4, 130);
    
        for(int i = 0 ; i < 10 ; i++){
            System.out.println(v[i]);
        }
    }
    
}
