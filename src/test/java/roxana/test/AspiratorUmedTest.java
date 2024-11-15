/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roxana.test;
import roxana.AspiratorUmed;
import comun.Aparat;

/**
 *
 * @author rd173
 */
public class AspiratorUmedTest {
    public static void main(String[] args) {
        AspiratorUmed aspirator = new AspiratorUmed();
        System.out.print(aspirator);
        AspiratorUmed aspirator2 = new AspiratorUmed(5.5, 75, 6.4, 4.5, true);
        System.out.print(aspirator2);
        AspiratorUmed aspirator3 = new AspiratorUmed(aspirator2);
        System.out.print(aspirator3);
        
        
    }
}
