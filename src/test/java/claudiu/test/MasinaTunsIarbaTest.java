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
        Aparat aparat = new Aparat("prod","model1",176,"albastru",155.3);
        System.out.println(aparat);
        MasinaTunsIarba m = new MasinaTunsIarba();
        System.out.println(m);
        MasinaTunsIarba masina = new MasinaTunsIarba("Steinhaus","PRO-GLM502",999.99,"rosu",31,"Benzina","Otel",3.5,50,7,60);
        System.out.println(masina);
        MasinaTunsIarba masina2 = new MasinaTunsIarba(masina);
        System.out.println(masina2);
    }
    
}
