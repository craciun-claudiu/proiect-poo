/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vivi.test;

import vivi.AparatCuratatGeamuri;
import comun.Aparat;

/**
 *
 * @author Viv
 */
public class AparatCuratatGeamuriTest {

    public static void main(String[] args) {
        // Testare constructori
        AparatCuratatGeamuri geamuriDefault = new AparatCuratatGeamuri();
        System.out.println("Default:\n" + geamuriDefault);

        AparatCuratatGeamuri geamuriParametri = new AparatCuratatGeamuri(
            "Samsung", "WindowBot", 899.99f, "Negru", 3.2f,
            "Microfibră", 4, 50f, (byte) 3, "Automat"
        );
        System.out.println("Cu parametri:\n" + geamuriParametri);

        AparatCuratatGeamuri geamuriCopie = new AparatCuratatGeamuri(geamuriParametri);
        System.out.println("Copie:\n" + geamuriCopie);

        // Vector de 10 obiecte AparatCuratatGeamuri
        AparatCuratatGeamuri[] v = new AparatCuratatGeamuri[10];

        v[0] = new AparatCuratatGeamuri("LG", "GlassBot", 1500, "Alb", 2.5f, "Microfibră", 3, 45f, (byte) 2, "Manual");
        v[1] = new AparatCuratatGeamuri("Philips", "WindowCleaner", 1100, "Gri", 3.0f, "Bumbac", 5, 40f, (byte) 4, "Automat");
        v[2] = new AparatCuratatGeamuri("iRobot", "GlassPro", 1300, "Negru", 3.5f, "Sinteză", 6, 60f, (byte) 5, "Semiautomat");
        v[3] = new AparatCuratatGeamuri("Dyson", "GlassMaster", 2000, "Albastru", 4.0f, "Piele", 7, 70f, (byte) 6, "Automat");
        v[4] = new AparatCuratatGeamuri("Xiaomi", "SmartWindow", 999, "Roșu", 3.8f, "Bumbac premium", 8, 55f, (byte) 4, "Automat");
        v[5] = new AparatCuratatGeamuri("Bosch", "ClearView", 1750, "Verde", 3.6f, "Lână", 6, 50f, (byte) 5, "Manual");
        v[6] = new AparatCuratatGeamuri("Rowenta", "GlassEase", 1400, "Portocaliu", 3.4f, "Spumă", 5, 45f, (byte) 3, "Automat");
        v[7] = new AparatCuratatGeamuri("Shark", "ViewMaster", 1900, "Galben", 4.1f, "Poliester", 7, 60f, (byte) 6, "Automat");
        v[8] = new AparatCuratatGeamuri("Hoover", "GlassGo", 1600, "Albastru", 3.9f, "Microfibră fină", 5, 50f, (byte) 4, "Manual");
        v[9] = new AparatCuratatGeamuri("Bissell", "GlassPlus", 1350, "Mov", 3.7f, "Bumbac", 4, 48f, (byte) 3, "Automat");

        System.out.println("\nVector de obiecte AparatCuratatGeamuri:");
        for (int i = 0; i < v.length; i++) {
            System.out.println("Aparat " + (i + 1) + ":\n" + v[i]);
        }
    }
}
