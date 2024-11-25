/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vivi.test;

import vivi.AparatCuratatPardoseli;
import comun.Aparat;

/**
 *
 * @author Viv
 */
public class AparatCuratatPardoseliTest {

    public static void main(String[] args) {
        // Testare constructori
        AparatCuratatPardoseli pardoseliDefault = new AparatCuratatPardoseli();
        System.out.println("Default:\n" + pardoseliDefault);

        AparatCuratatPardoseli pardoseliParametri = new AparatCuratatPardoseli(
            "Philips", "PowerClean", 1200.99f, "Alb", 8.5f,
            "Philips", "PC2023", 5000, 1.5f, (byte) 200
        );
        System.out.println("Cu parametri:\n" + pardoseliParametri);

        AparatCuratatPardoseli pardoseliCopie = new AparatCuratatPardoseli(pardoseliParametri);
        System.out.println("Copie:\n" + pardoseliCopie);

        // Vector de 10 obiecte AparatCuratatPardoseli
        AparatCuratatPardoseli[] v = new AparatCuratatPardoseli[10];

        v[0] = new AparatCuratatPardoseli("Dyson", "FloorExpert", 2500.99f, "Negru", 10.2f, "Dyson", "FE2025", 6000, 2.0f, (byte) 250);
        v[1] = new AparatCuratatPardoseli("Samsung", "CleanMaster", 1800, "Gri", 9.1f, "Samsung", "CM2022", 4500, 1.8f, (byte) 180);
        v[2] = new AparatCuratatPardoseli("LG", "FloorBot", 2000, "Argintiu", 7.8f, "LG", "FB2030", 5200, 2.5f, (byte) 220);
        v[3] = new AparatCuratatPardoseli("iRobot", "Roomba", 3000, "Alb", 6.5f, "iRobot", "RB2031", 7000, 3.0f, (byte) 300);
        v[4] = new AparatCuratatPardoseli("Bissell", "CrossWave", 1500, "Albastru", 8.0f, "Bissell", "CW2028", 4800, 1.7f, (byte) 170);
        v[5] = new AparatCuratatPardoseli("Hoover", "ScrubMaster", 2200, "Verde", 9.0f, "Hoover", "SM2040", 5500, 2.2f, (byte) 240);
        v[6] = new AparatCuratatPardoseli("Electrolux", "AquaWave", 1800, "Portocaliu", 8.3f, "Electrolux", "AW2024", 4900, 2.0f, (byte) 210);
        v[7] = new AparatCuratatPardoseli("Shark", "SteamPower", 2700, "Rosu", 7.9f, "Shark", "SP2035", 6100, 2.8f, (byte) 260);
        v[8] = new AparatCuratatPardoseli("Rowenta", "DeepClean", 1900, "Mov", 8.1f, "Rowenta", "DC2041", 4600, 1.9f, (byte) 190);
        v[9] = new AparatCuratatPardoseli("Miele", "UltraVac", 3000, "Galben", 9.5f, "Miele", "UV2047", 7500, 3.5f, (byte) 280);

        System.out.println("\nVector de obiecte AparatCuratatPardoseli:");
        for (int i = 0; i < v.length; i++) {
            System.out.println("Aparat " + (i + 1) + ":\n" + v[i]);
        }
    }
}
