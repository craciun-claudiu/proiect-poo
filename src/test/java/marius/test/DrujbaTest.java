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
        Aparat aparat = new Aparat("prod", "model", 102, "verde", 11.8f);
        System.out.println(aparat);
        Drujba d = new Drujba();
        System.out.print(d);
        Drujba drujba1 = new Drujba("Blade Alpin","Wolfson STX-620", 500.00f, "rosu", 1.5f, 3.0f, 50.0f, 4, 20, 15);
        System.out.println(drujba1);
        Drujba drujba2 = new Drujba(drujba1);
        System.out.println(drujba2);
        
        Drujba[] v = new Drujba[10];
        
        v[0] = new Drujba("Stihl", "MS 271 Farm Boss", 2400, "Roșu", 42, 2.6f, 50, 5, 53, 7);
        v[1] = new Drujba("Huasqvarna", "550 XP Mark II", 400, "Albastru", 5.3f, 2.0f, 60.2f, 1200, 32, 3);
        v[2] = new Drujba("Makita", "EA6100P45E", 2000, "Verde", 25, 1.8f, 50.9f, 2, 40, 6);
        v[3] = new Drujba("Echo", "CS-590 Timber Wolf", 1600, "Negru", 12, 3, 60.5f, 36, 38, 5);
        v[4] = new Drujba("Dolmar", "PS-6100", 3000, "Alb", 11, 4.2f, 49.2f, 36, 41, 6);
        v[5] = new Drujba("Jonserd", "CS 2255", 1000, "Portocaliu", 17, 1.9f, 30.8f, 40, 41, 5);
        v[6] = new Drujba("Oleo-Mac", "GS 650", 1500, "Negru", 22, 2.5f, 50.9f, 2, 46, 7);
        v[7] = new Drujba("McCulloch", "CS 50S", 5000, "Gri", 35, 2.8f, 62.8f, 36, 47, 6);
        v[8] = new Drujba("Ryobi", "RCS2340", 800, "Mov", 7.1f, 2.5f, 68.2f, 1400, 25, 4);
        v[9] = new Drujba("Partner", "MS 180", 3200, "Galben", 40, 4.2f, 51.8f, 3, 46, 6);
    
        for(int i = 0 ; i < 10 ; i++){
            System.out.println(v[i]);
        }   
    }
}
