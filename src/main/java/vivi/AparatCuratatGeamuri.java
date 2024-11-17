/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vivi;
import comun.Aparat;

/**
 *
 * @author vh135
 */
public class AparatCuratatGeamuri extends Aparat {
    private String materialLaveta;
    private int numarSenzoriDetectareMargini;
    private int numarZgomot; // nivelul de zgomot în decibeli
    private int numarModuriCuratare;
    private String tipManevrare; // manual sau automat

    // Rescrierea metodei toString
    @Override
    public String toString() {
        return super.toString() + 
               "Material lavetă: " + materialLaveta + '\n' +
               "Număr senzori detectare margini: " + numarSenzoriDetectareMargini + '\n' +
               "Nivel zgomot: " + numarZgomot + " dB" + '\n' +
               "Număr moduri curățare: " + numarModuriCuratare + '\n' +
               "Tip manevrare: " + tipManevrare + '\n';
    }

    // Constructor fără parametri
    public AparatCuratatGeamuri() {
        super(); // Apelează constructorul fără parametri din clasa Aparat
        this.materialLaveta = "Necunoscut";
        this.numarSenzoriDetectareMargini = 0;
        this.numarZgomot = 0;
        this.numarModuriCuratare = 0;
        this.tipManevrare = "Necunoscut";
    }

    // Constructor cu toți parametrii
    public AparatCuratatGeamuri(String producator, String model, double pret, String culoare, double greutate,
                                String materialLaveta, int numarSenzoriDetectareMargini, int numarZgomot,
                                int numarModuriCuratare, String tipManevrare) {
        super(producator, model, pret, culoare, greutate); // Apelează constructorul cu parametri din clasa Aparat
        this.materialLaveta = materialLaveta;
        this.numarSenzoriDetectareMargini = numarSenzoriDetectareMargini;
        this.numarZgomot = numarZgomot;
        this.numarModuriCuratare = numarModuriCuratare;
        this.tipManevrare = tipManevrare;
    }

    // Constructor de copiere
    public AparatCuratatGeamuri(AparatCuratatGeamuri a) {
        super(a); // Apelează constructorul de copiere din clasa Aparat
        this.materialLaveta = a.materialLaveta;
        this.numarSenzoriDetectareMargini = a.numarSenzoriDetectareMargini;
        this.numarZgomot = a.numarZgomot;
        this.numarModuriCuratare = a.numarModuriCuratare;
        this.tipManevrare = a.tipManevrare;
    }
}