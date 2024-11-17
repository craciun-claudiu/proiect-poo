/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vivi.test;
import vivi.AparatCuratatGeamuri;
import vivi.AparatCuratatPardoseli;

/**
 *
 * @author Viv
 */

    /**
     * @param args the command line arguments
     */
 public class AparateTest {
    public static void main(String[] args) {
        // Testarea clasei AparatCuratatPardoseli
        AparatCuratatPardoseli pardoseliDefault = new AparatCuratatPardoseli();
        AparatCuratatPardoseli pardoseliParametri = new AparatCuratatPardoseli(
            "Philips", "PowerClean", 1200.99, "Alb", 8.5,
            "Philips", "PC2023", 5000, 1.5, 200.0
        );
        AparatCuratatPardoseli pardoseliCopie = new AparatCuratatPardoseli(pardoseliParametri);

        // Afișare informații AparatCuratatPardoseli
        System.out.println("Testare AparatCuratatPardoseli");
        System.out.println("Default:\n" + pardoseliDefault);
        System.out.println("Cu parametri:\n" + pardoseliParametri);
        System.out.println("Copie:\n" + pardoseliCopie);

        // Testarea clasei AparatCuratatGeamuri
        AparatCuratatGeamuri geamuriDefault = new AparatCuratatGeamuri();
        AparatCuratatGeamuri geamuriParametri = new AparatCuratatGeamuri(
            "Samsung", "WindowBot", 899.99, "Negru", 3.2,
            "Microfibră", 4, 50, 3, "Automat"
        );
        AparatCuratatGeamuri geamuriCopie = new AparatCuratatGeamuri(geamuriParametri);

        // Afișare informații AparatCuratatGeamuri
        System.out.println("\nTestare AparatCuratatGeamuri");
        System.out.println("Default:\n" + geamuriDefault);
        System.out.println("Cu parametri:\n" + geamuriParametri);
        System.out.println("Copie:\n" + geamuriCopie);
    }
}
