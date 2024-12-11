package vivi.test;

import vivi.AparatCuratatPardoseli;
import vivi.AparatCuratatGeamuri;

public class Aparate {

    public static void main(String[] args) {
        // Teste pentru AparatCuratatPardoseli
        System.out.println("Teste pentru AparatCuratatPardoseli:");
        AparatCuratatPardoseli[] pardoseli = new AparatCuratatPardoseli[10];
        pardoseli[0] = new AparatCuratatPardoseli("Dyson", "FloorExpert", 2500.99f, "Negru", 10.2f, "Dyson", "FE2025", 6000, 2.0f, (byte) 250);
        pardoseli[1] = new AparatCuratatPardoseli("Samsung", "CleanMaster", 1800.0f, "Gri", 9.1f, "Samsung", "CM2022", 4500, 1.8f, (byte) 180);
        pardoseli[2] = new AparatCuratatPardoseli("LG", "FloorBot", 2000.0f, "Argintiu", 7.8f, "LG", "FB2030", 5200, 2.5f, (byte) 220);
        pardoseli[3] = new AparatCuratatPardoseli("iRobot", "Roomba", 3000.0f, "Alb", 6.5f, "iRobot", "RB2031", 7000, 3.0f, (byte) 300);
        pardoseli[4] = new AparatCuratatPardoseli("Bissell", "CrossWave", 1500.0f, "Albastru", 8.0f, "Bissell", "CW2028", 4800, 1.7f, (byte) 170);
        pardoseli[5] = new AparatCuratatPardoseli("Philips", "AquaClean", 2300.0f, "Negru", 8.5f, "Philips", "AC2032", 5500, 2.3f, (byte) 200);
        pardoseli[6] = new AparatCuratatPardoseli("Hoover", "SmartWash", 2100.0f, "Roșu", 8.2f, "Hoover", "SW2027", 5100, 2.2f, (byte) 190);
        pardoseli[7] = new AparatCuratatPardoseli("Shark", "SteamMop", 1900.0f, "Alb", 7.0f, "Shark", "SM2026", 4700, 1.9f, (byte) 180);
        pardoseli[8] = new AparatCuratatPardoseli("Vax", "PlatinumSmart", 2200.0f, "Gri", 7.5f, "Vax", "PS2030", 5300, 2.1f, (byte) 210);
        pardoseli[9] = new AparatCuratatPardoseli("Rowenta", "CleanPro", 2400.0f, "Albastru", 7.9f, "Rowenta", "CP2035", 5600, 2.4f, (byte) 230);

        // Afișare detalii aparate
        for (int i = 0; i < pardoseli.length; i++) {
            System.out.println("Aparat curățat pardoseli [" + i + "]:");
            System.out.println(pardoseli[i]);
        }

        // Exemplu de modificare a unei proprietăți și afișare
        AparatCuratatPardoseli aparatTest = pardoseli[3];
        aparatTest.setCapacitateRezervorApa(2.5f);
        System.out.println("\nNoua capacitate a rezervorului pentru " + aparatTest.getModel() + ": " + aparatTest.getCapacitateRezervorApa() + " litri");

        // Filtrare: Aparate cu motor peste 5000 și de culoare alb
        System.out.println("\nAparate curățat pardoseli cu motor peste 5000 și de culoare alb:");
        for (AparatCuratatPardoseli aparat : pardoseli) {
            if (aparat.getCapacitateBaterie() > 5000 && aparat.getCuloare().equalsIgnoreCase("Alb")) {
                System.out.println(aparat);
            }
        }

        // Teste pentru AparatCuratatGeamuri
        System.out.println("\nTeste pentru AparatCuratatGeamuri:");
        AparatCuratatGeamuri[] geamuri = new AparatCuratatGeamuri[10];
        geamuri[0] = new AparatCuratatGeamuri("Kärcher", "WindowVac", 899.99f, "Galben", 0.9f, "Microfibră", 3, 60.0f, (byte) 3, "Manual");
        geamuri[1] = new AparatCuratatGeamuri("Bosch", "GlassCleaner", 799.99f, "Verde", 1.1f, "Microfibră", 2, 50.0f, (byte) 2, "Manual");
        geamuri[2] = new AparatCuratatGeamuri("Philips", "GlassExpert", 999.99f, "Albastru", 1.2f, "Silicon", 4, 55.0f, (byte) 4, "Automat");
        geamuri[3] = new AparatCuratatGeamuri("Samsung", "GlassMate", 1199.99f, "Negru", 1.3f, "Textil", 5, 70.0f, (byte) 5, "Automat");
        geamuri[4] = new AparatCuratatGeamuri("Rowenta", "ClearView", 1099.99f, "Gri", 1.5f, "Microfibră", 3, 65.0f, (byte) 3, "Manual");
        geamuri[5] = new AparatCuratatGeamuri("LG", "GlassCare", 799.99f, "Argintiu", 1.4f, "Textil", 4, 60.0f, (byte) 4, "Automat");
        geamuri[6] = new AparatCuratatGeamuri("Black+Decker", "WindowMate", 699.99f, "Negru", 1.0f, "Silicon", 3, 50.0f, (byte) 3, "Manual");
        geamuri[7] = new AparatCuratatGeamuri("Dyson", "GlassWizard", 1599.99f, "Violet", 1.6f, "Microfibră", 6, 75.0f, (byte) 6, "Automat");
        geamuri[8] = new AparatCuratatGeamuri("Bissell", "GlassPro", 899.99f, "Albastru", 1.2f, "Textil", 3, 55.0f, (byte) 3, "Manual");
        geamuri[9] = new AparatCuratatGeamuri("iRobot", "GlassBot", 1299.99f, "Alb", 1.5f, "Silicon", 5, 70.0f, (byte) 5, "Automat");

        for (int i = 0; i < geamuri.length; i++) {
            System.out.println("Aparat curățat geamuri [" + i + "]:");
            System.out.println(geamuri[i]);
        }

        // Filtrare: Aparate cu autonomie peste 1.0
        System.out.println("\nAparate curățat geamuri cu autonomie mai mare de 1.0 kg:");
        for (AparatCuratatGeamuri aparat : geamuri) {
            if (aparat.getGreutate() > 1.0f) {
                System.out.println(aparat);
            }
        }
    }
}
