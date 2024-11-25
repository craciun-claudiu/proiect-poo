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
    }
    
}
