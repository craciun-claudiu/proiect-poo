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
        Aparat aparat = new Aparat("prod", "model", 108, "albastru", 11.8f);
        System.out.println(aparat);
        Trimmer t = new Trimmer();
        System.out.print(t);
        
        Aparat[] aparate = new Aparat[10];
        aparate[0] = new Aparat("Stihl", "MS 271 Farm Boss", 2500, "Rosu", 42);
        aparate[1] = new Aparat("Huasqvarna", "550 XP Mark II", 400, "Albastru", 5.3f);
        aparate[2] = new Aparat("Makita", "EA6100P45E", 3900, "Verde", 5.9f);
        aparate[3] = new Aparat("Echo", "CS-590 Timber Wolf", 2400, "Negru", 25);
        aparate[4] = new Aparat("Dolmar", "PS-6100", 1300, "Alb", 12);
        aparate[5] = new Aparat("Jonserd", "CS 2255", 1500, "Portocaliu", 11);
        aparate[6] = new Aparat("Bosch", "Classic 4.66", 2700, "Rosu", 3.8f);
        aparate[7] = new Aparat("AL-KO", "CS 50S", 1000, "Gri", 6.8f);
        aparate[8] = new Aparat("Ryobi", "RCS2340", 1600, "Mov", 7.1f);
        aparate[9] = new Aparat("Black+Decker", "MS 180", 2000, "Galben", 40);
        
        //Afisare aparate cu pretul mai mic de 2500 si culoarea verde
        System.out.println("Aparatele cu pretul mai mic de 1000 si culoarea mov:");
        for(int i = 0 ; i < 10 ; i++){
            if((aparate[i].getPret() < 1000f) && (aparate[i].getCuloare().compareTo("Mov") == 0)){
                System.out.println(aparate[i]);
            }
        }
        
        Trimmer t2 = new Trimmer("Bosch" , "Modelul bun", 18.2f, "albastru", 30, "Phillips", 10.5f, 2, 8f, 4);
        System.out.println(t2);
        Trimmer t3 = new Trimmer(t2);
        System.out.println(t3);
        
        Trimmer[] v = new Trimmer[10];
        
        v[0] = new Trimmer("Stihl FSA 45", "MS 271 Farm Boss", 400, "Roșu", 42, "Phillips", 5, 5, 4, 7);
        v[1] = new Trimmer("Huasqvarna 110iL", "550 XP Mark II", 600, "Albastru", 5.3f, "Samsung", 6.2f, 12, 5, 3);
        v[2] = new Trimmer("Makita DUR181Z", "EA6100P45E", 1000, "Verde", 25, "Samsung", 5.9f, 2, 6, 6);
        v[3] = new Trimmer("Karcher LTR 18-25 Battery Set", "CS-590 Timber Wolf", 600, "Negru", 12, "Braun", 6.5f, 3, 6, 5);
        v[4] = new Trimmer("Karcher LTR 18-30 Battery Set", "PS-6100", 300, "Alb", 11, "Panasonic", 4.2f, 6, 8, 6);
        v[5] = new Trimmer("Jonserd", "CS 2255", 100, "Portocaliu", 17, "Remington", 3.8f, 4, 2, 5);
        v[6] = new Trimmer("Bosch EastGrassCut", "GS 650", 500, "Negru", 22, "Grundig", 5.9f, 5, 3, 7);
        v[7] = new Trimmer("AL-KO GT 200 Comfort", "CS 50S", 400, "Gri", 35, "Gilette", 6.8f, 36, 4, 6);
        v[8] = new Trimmer("Ryobi RLT1825M13", "RCS2340", 600, "Mov", 7.1f, "Samsung", 6.2f, 16, 5, 4);
        v[9] = new Trimmer("Black+Decker STC1820EOC", "MS 180", 200, "Galben", 40, "Gillete", 5.8f, 9, 7, 6);
        
        for(int i = 0 ; i < 10 ; i++){
            System.out.println(v[i]);
        }
    }  
}