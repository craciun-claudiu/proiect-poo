/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diana.test;

import comun.Aparat;
import diana.AparatSpalareCuPresiune;

/**
 *
 * @author da224
 */
public class AparatSpalareCuPresiuneTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aparat aparat1 = new Aparat("Bosch","Universal Aquatak 130", 776.99f, "verde,negru", 7.8f);
        System.out.println(aparat1);
        
        AparatSpalareCuPresiune[] a = new AparatSpalareCuPresiune[10];
        a[0] = new AparatSpalareCuPresiune("Bosch", "Universal Aquatak 130", 799.99f, "verde, negru", 7.8f, "la retea", (short) 130, (short) 360, (byte) 6, 0.45f);
        a[1] = new AparatSpalareCuPresiune("Kärcher", "K5 Power Control", 1199.99f, "galben, negru", 13.1f, "la retea", (short) 145, (short) 500, (byte) 10, 1.0f);
        a[2] = new AparatSpalareCuPresiune("Makita", "HW102", 499.99f, "albastru", 5.8f, "la retea", (short) 100, (short) 360, (byte) 5, 0.35f);
        a[3] = new AparatSpalareCuPresiune("Einhell", "TC-HP 1334", 399.99f, "rosu, negru", 4.2f, "la retea", (short) 110, (short) 340, (byte) 3, 0.30f);
        a[4] = new AparatSpalareCuPresiune("Nilfisk", "Core 125", 899.99f, "albastru, negru", 6.6f, "la retea", (short) 125, (short) 460, (byte) 8, 0.75f);
        a[5] = new AparatSpalareCuPresiune("Black+Decker", "BXPW1600E", 699.99f, "negru, portocaliu", 7.0f, "la retea", (short) 125, (short) 390, (byte) 6, 0.50f);
        a[6] = new AparatSpalareCuPresiune("Ryobi", "RPW170XRB", 999.99f, "verde, negru", 11.2f, "la retea", (short) 150, (short) 420, (byte) 9, 0.85f);
        a[7] = new AparatSpalareCuPresiune("Stanley", "SXPW25PE", 849.99f, "galben, negru", 9.5f, "la retea", (short) 150, (short) 450, (byte) 8, 1.20f);
        a[8] = new AparatSpalareCuPresiune("Parkside", "PHD 150 F4", 599.99f, "verde, negru", 11.0f, "la retea", (short) 150, (short) 400, (byte) 10, 0.70f);
        a[9] = new AparatSpalareCuPresiune("Lavor", "Skyviper 160", 749.99f, "gri, galben", 10.5f, "la retea", (short) 160, (short) 520, (byte) 12, 1.00f);

        for(int i=0; i<10; i++)
            System.out.println(a[i]);
        
        AparatSpalareCuPresiune test = new AparatSpalareCuPresiune();
        System.out.println(test);
        test=a[2];
        System.out.println(test);
        test.setLungimeFurtun((byte) 8);
        System.out.println(test.getLungimeFurtun());
        
        System.out.println("\nAparatele de spalare cu presiune ce au un debit maxim de peste 360 l/h si culorile verde si negru sunt: ");
        for(int i=0; i<10; i++)
            if(a[i].getDebitMaxim()>360 && a[i].getCuloare().equals("verde, negru"))
                System.out.println(a[i]);
    }
    
}
