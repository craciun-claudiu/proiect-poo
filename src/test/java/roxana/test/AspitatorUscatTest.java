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
        AspiratorUscat asp = new AspiratorUscat();
        System.out.print(asp);
        AspiratorUscat asp2 = new AspiratorUscat("Samsung", "vertical", 550, "albastru", 6, 4.2, "carbon", 190, 60, "plastic");
        System.out.print(asp2);
        AspiratorUscat asp3 = new AspiratorUscat("Bosh", "vertical", 640, "negru", 5, 3.5, "HERA", 220, 45, "metal");
        System.out.print(asp3);
    }
    
}
