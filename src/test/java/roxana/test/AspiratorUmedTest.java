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
        
        AspiratorUmed[] v = new AspiratorUmed[10];
        
        v[0] = new AspiratorUmed("Karcher", "fara sac", 360f, "Galben", 6, 6.7f, 80, 5.5f, 4f, false);
        v[1] = new AspiratorUmed("Ryer", "cu sac", 400f, "Gri", 5, 8.3f, 90, 5f, 5.5f, false);
        v[2] = new AspiratorUmed("Heinner", "cu sac", 500f, "Albastru", 6, 8.5f, 50, 6f, 5f, true);
        v[3] = new AspiratorUmed("Yanx", "fara sac ", 450f, "Rosu", 7, 9.2f,55, 7f,5.3f, true);
        v[4] = new AspiratorUmed("amXea", "cu sac", 500f, "Negru", 4, 6.7f, 60, 7.2f, 6.2f, false);
        v[5] = new AspiratorUmed("Ryer", "fara sac", 550f, "Roz", 5, 7.3f, 70, 6.9f, 6.1f, true);
        v[6] = new AspiratorUmed("Yanx", "cu sac", 600f, "Alb", 8, 6.4f, 90, 7f, 6.2f, true );
        v[7] = new AspiratorUmed("Karcher", "cu sac", 570f, "Portocaliu", 5, 6.5f, 75, 4.5f, 3f, true);
        v[8] = new AspiratorUmed("amXea", "cu sac", 600f, "Mov", 7, 7.2f, 95, 5.5f, 5f, false);
        v[9] = new AspiratorUmed("Ryer", "fara sac", 650f, "Rosu", 5, 7.7f, 85, 6.2f, 6f, true);
        
        for(int i=0; i<10; i++){
            System.out.println(v[10]);
        }
        
        
                }
}
