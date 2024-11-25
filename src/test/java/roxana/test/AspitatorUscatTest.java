/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roxana.test;
import roxana.AspiratorUscat;
import comun.Aparat;


/**
 *
 * @author rd173
 */
public class AspitatorUscatTest {
    public static void main(String[] args){
        Aparat aparat = new Aparat("prod","model",150,"verde",130.5f);
        System.out.println(aparat);
        AspiratorUscat asp = new AspiratorUscat();
        System.out.print(asp);
        AspiratorUscat asp2 = new AspiratorUscat("Samsung", "vertical", 500, "alb", 5.5f, 4.4f, "HEPA", 190, 60, "plastic");
        System.out.print(asp2);
        AspiratorUscat asp3 = new AspiratorUscat("Beko", "vertical",600, "negru",6.7f, 3.5f, "HERA", 220, 45, "metal");
        System.out.print(asp3);
        
        AspiratorUscat[] v = new AspiratorUscat[10];
        
        v[0] = new AspiratorUscat("Rowenta", "compact", 700, "rosu", 6.2f, 4.2f, "HERA", 210, 50, "plastic");
        v[1] = new AspiratorUscat("Philips", "vertical", 600, "albastru", 6.5f, 4.5f, "carbon activ", 220, 60, "metal");
        v[2] = new AspiratorUscat("Beko","compact", 650,"negru", 6.3f, 4.7f, "ciclonic", 200, 65, " plastic");
        v[3] = new AspiratorUscat("Bosh","compact", 700, "verde", 6.5f, 5f, "HEPA", 190, 70, "plastic");
        v[4] = new AspiratorUscat("Samsung", "vertical", 550, " roz", 6.8f, 4.7f, "ciclonic", 180, 100, "metal");
        v[5] = new AspiratorUscat("Philips","compact",620, "mov", 7.3f, 5.4f, "carbon activ", 230, 120,"plastic");
        v[6] = new AspiratorUscat("Beko","vertical", 650, "alb", 6.3f, 5.6f, "ciclonic", 180, 45, "metal");
        v[7] = new AspiratorUscat("Bosh","compact", 750, "portocaliu", 7.1f,5.7f, "HEPA", 200, 60, "metal");
        v[8] = new AspiratorUscat("Rowenta","vertcal", 560, "albastru", 6.7f, 4.8f, "HEPA", 210, 70, "plastic");
        v[9] = new AspiratorUscat("Samsung","compact", 575, "negru", 6.3f, 5.2f, "ciclonic", 220, 80,"metal");
        
        for (int i = 0; i<0; i++){
            System.out.println(v[i]);
        }
    }
    
}
