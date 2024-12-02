/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package claudiu.test;

import claudiu.MasinaTunsIarba;
import comun.Aparat;

/**
 *
 * @author cc642
 */
public class MasinaTunsIarbaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Aparat aparat = new Aparat("prod","model1",176,"albastru",155.3f);
        //System.out.println(aparat);
        //Aparat aparat2 = new Aparat();
        //System.out.println(aparat2);
        //Aparat aparat3 = new Aparat(aparat);
        //System.out.println(aparat3);
        
        Aparat[] aparate = new Aparat[10];
        aparate[0] = new Aparat("Honda", "HRX2VKA", 2500, "Verde", 42);
        aparate[1] = new Aparat("Bosch", "Rotak 4", 400, "Verde", 6.8f);
        aparate[2] = new Aparat("Husqvarna", "LC 33", 3900, "Portocaliu", 26);
        aparate[3] = new Aparat("Makita", "DLM", 2400, "Albastru", 15);
        aparate[4] = new Aparat("Stihl", "RMA 4", 1300, "Alb cu portocaliu", 21);
        aparate[5] = new Aparat("Greenworks", "GGX1", 1500, "Verde", 18);
        aparate[6] = new Aparat("AL-KO", "Classic 4.66", 2700, "Roșu cu negru", 27);
        aparate[7] = new Aparat("Einhell", "GE-CM 36/47", 1000, "Roșu cu negru", 25);
        aparate[8] = new Aparat("Flymo", "Hover", 1600, "Portocaliu cu gri", 5.5f);
        aparate[9] = new Aparat("Wolf-Garten", "A 120", 2000, "Roșu cu galben", 35);
        
        //Afisare aparate cu pretul mai mic de 2500 si culoarea verde
        System.out.println("Aparatele cu pretul mai mic de 2500 si culoarea verde:");
        for(int i = 0 ; i < 10 ; i++){
            if((aparate[i].getPret() < 2500f) && (aparate[i].getCuloare().compareTo("Verde") == 0)){
                System.out.println(aparate[i]);
            }
        }
        
        //MasinaTunsIarba m = new MasinaTunsIarba();
        //System.out.println(m);
        //MasinaTunsIarba masina = new MasinaTunsIarba("Steinhaus","PRO-GLM502",999.99f,"rosu",31,"Benzina","Otel",3.5f,50f,7,60);
        //System.out.println(masina);
        //MasinaTunsIarba masina2 = new MasinaTunsIarba(masina);
        //System.out.println(masina2);
        
        MasinaTunsIarba[] v = new MasinaTunsIarba[10];
        
        v[0] = new MasinaTunsIarba("Honda", "HRX217VKA", 3500, "Roșu", 42, "Benzină", "Oțel inoxidabil", 5.5f, 53, 7, 70  );
        v[1] = new MasinaTunsIarba("Bosch", "Rotak 32", 800, "Verde", 6.8f, "Electrică", "Oțel călit", 1200, 32, 3, 31);
        v[2] = new MasinaTunsIarba("Husqvarna", "LC 140S", 1900, "Portocaliu", 26, "Benzină", "Oțel carbon", 2.5f, 40, 6, 50 );
        v[3] = new MasinaTunsIarba("Makita", "DLM380Z", 1300, "Albastru", 15, "Baterie", "Oțel inoxidabil", 36, 38, 5, 40);
        v[4] = new MasinaTunsIarba("Stihl", "RMA 443 C", 2500, "Alb cu portocaliu", 21, "Baterie", "Oțel călit", 36, 41, 6, 55 );
        v[5] = new MasinaTunsIarba("Greenworks", "G40LM41", 1400, "Verde", 18, "Baterie", "Aluminiu", 40, 41, 5, 50);
        v[6] = new MasinaTunsIarba("AL-KO", "Classic 4.66 P-A", 1200, "Roșu cu negru", 27, "Benzină", "Oțel", 2.7f, 46, 7, 65);
        v[7] = new MasinaTunsIarba("Einhell", "GE-CM 36/47 S HW Li", 2000, "Roșu cu negru", 25, "Baterie", "Oțel inoxidabil", 36, 47, 6, 75);
        v[8] = new MasinaTunsIarba("Flymo", "Hover Vac 250", 600, "Portocaliu cu gri", 5.5f, "Electrică", "Plastic durabil", 1400, 25, 4, 15 );
        v[9] = new MasinaTunsIarba("Wolf-Garten", "A 460 A SP HW", 2200, "Roșu cu galben", 35, "Benzină", "Oțel inoxidabil", 3.2f, 46, 6, 60 );
    
        //Afisare masini de tuns iarba care merg pe benzina si au latimea de taiere mai mica decat 40cm
        System.out.println("Afisare masini de tuns iarba care merg pe benzina si volumul cosului colector mai mic sau egal cu 60 de litrii");
        for(int i = 0 ; i < 10 ; i++){
            if(v[i].getTipAlimentare().compareTo("Benzină") == 0 && v[i].getVolumCosColector() <= 60f)
                System.out.println(v[i]);
        }
    
    }
    
}
