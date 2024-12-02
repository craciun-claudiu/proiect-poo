/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diana.test;
import comun.Aparat;
import diana.Suflanta;
/**
 *
 * @author da224
 */
public class SuflantaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aparat aparat1 = new Aparat("LittleDomi","Suflanta aer fara fir",144.85f,"negru",0.500f);
        System.out.println(aparat1);
        Aparat[] v = new Aparat[10];
        v[0] = new Aparat("LittleDomi", "Suflanta aer fara fir", 144.85f, "negru", 0.500f);
        v[1] = new Aparat("Steinhaus", "PRO-BL3000", 179.99f, "negru, rosu", 0.650f);
        v[2] = new Aparat("Goxawee", "M7057", 189.98f, "negru, portocaliu", 0.716f);
        v[3] = new Aparat("Heinner", "VSAF002", 209.99f, "negru, verde", 0.690f);
        v[4] = new Aparat("Bosch", "GSA18V", 259.99f, "albastru, negru", 0.800f);
        v[5] = new Aparat("Makita", "UB1103", 239.95f, "albastru", 0.600f);
        v[6] = new Aparat("Black+Decker", "BV6600", 289.99f, "negru, rosu", 0.900f);
        v[7] = new Aparat("DeWalt", "DCE100B", 219.99f, "galben, negru", 0.650f);
        v[8] = new Aparat("Ryobi", "RY40440", 279.99f, "verde, negru", 0.750f);
        v[9] = new Aparat("Einhell", "TE-CB18/180", 149.99f, "rosu, negru", 0.550f);
        
        for(int i=0; i<10; i++)
            if(v[i].getPret()>155 && v[i].getGreutate()<750)
                System.out.println(v[i]);

        
        Suflanta[] s = new Suflanta[10];
        s[0] = new Suflanta("LittleDomi", "Suflanta aer fara fir", 144.85f, "negru", 0.500f, "acumulator", "electric", (byte) 3, (byte) 68, (short) 74, 7500);
        s[1] = new Suflanta("Steinhaus", "PRO-BL3000", 179.99f, "negru, rosu", 0.650f, "la retea", "electric", (byte) 6, (byte) 120, (short) 92, 9000);
        s[2] = new Suflanta("Goxawee", "M7057", 189.98f, "negru, portocaliu", 0.716f, "acumulator", "electric", (byte) 3, (byte) 120, (short) 150, 8500);
        s[3] = new Suflanta("Heinner", "VSAF002", 209.99f, "negru, verde", 0.690f, "la retea", "electric", (byte) 4, (byte) 90, (short) 84, 8000);
        s[4] = new Suflanta("Bosch", "GSA18V", 259.99f, "albastru, negru", 0.800f, "acumulator", "electric", (byte) 2, (byte) 150, (short) 100, 10000);
        s[5] = new Suflanta("Makita", "UB1103", 239.95f, "albastru", 0.600f, "la retea", "electric", (byte) 3, (byte) 600, (short) 75, 9500);
        s[6] = new Suflanta("Black+Decker", "BV6600", 289.99f, "negru, rosu", 0.900f, "acumulator", "electric", (byte) 4, (byte) 400, (short) 95, 12000);
        s[7] = new Suflanta("DeWalt", "DCE100B", 219.99f, "galben, negru", 0.650f, "acumulator", "electric", (byte) 3, (byte) 180, (short) 82, 8500);
        s[8] = new Suflanta("Ryobi", "RY40440", 279.99f, "verde, negru", 0.750f, "acumulator", "electric", (byte) 5, (byte) 320, (short) 88, 11000);
        s[9] = new Suflanta("Einhell", "TE-CB18/180", 149.99f, "rosu, negru", 0.550f, "acumulator", "electric", (byte) 2, (byte) 180, (short) 60, 7800);

        for(int i=0; i<10; i++)
            System.out.println(s[i]);
        
        Suflanta test = new Suflanta();
        System.out.println(test);
        test=s[4];
        System.out.println(test);
        test.setVitezaMaxima((short) 11111);
        System.out.println(test.getVitezaMaxima());
        
        System.out.println("\nSuflantele cu pretul mai mare de 220 de lei si cu alimentare la retea sunt:");
        for(int i=0; i<10; i++)
            if(s[i].getPret()>220f && s[i].getTipAlimentare().equals("la retea"))
                System.out.println(s[i]);
    }
    
}

