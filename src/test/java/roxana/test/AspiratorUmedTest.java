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
        Aparat aparat = new Aparat("prod", "model", 120, "gri", 15.3f);
        System.out.println(aparat);
        AspiratorUmed aspirator = new AspiratorUmed();
        System.out.print(aspirator);
        AspiratorUmed aspirator2 = new AspiratorUmed("Beko", "cu sac", 125f, "Rosu", 10, 5.5f, 75, 6.5f, 4.5f, true);
        System.out.print(aspirator2);
        AspiratorUmed aspirator3 = new AspiratorUmed(aspirator2);
        System.out.print(aspirator3);
        
        
    }
}
