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
        AspiratorUscat asp2 = new AspiratorUcat(2.5, "carbon activ", 200, 60, 5.4);
        System.out.print(asp2);
        AspiratorUscat asp3 = new AspiratorUscat(4.5,"HEPA", 220, 45, 6.3);
    }
    
}
