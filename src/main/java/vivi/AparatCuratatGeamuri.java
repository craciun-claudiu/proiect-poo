/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vivi;
import comun.Aparat;
import comun.InterfataAparat;

/**
 *
 * @author vh135
 */
public class AparatCuratatGeamuri extends Aparat implements InterfataAparat {
    private String materialLaveta;
    private int numarSenzoriDetectareMargini;
    private float numarZgomot; // nivelul de zgomot în decibeli
    private byte numarModuriCuratare;
    private String tipManevrare; // manual sau automat

    @Override
    public void afisareAtributeFaraFormatare() {
        System.out.println(this.getProducator());
        System.out.println(this.getModel());
        System.out.println(this.getPret());
        System.out.println(this.getCuloare());
        System.out.println(this.getGreutate());
        System.out.println(materialLaveta);
        System.out.println(numarSenzoriDetectareMargini);
        System.out.println(numarZgomot);
        System.out.println(numarModuriCuratare);
        System.out.println(tipManevrare);
    }

    @Override
    public float raportPretAtribute() {
        return this.getPret() / (this.numarSenzoriDetectareMargini * this.numarModuriCuratare);
    }

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
    public AparatCuratatGeamuri(String producator, String model, float pret, String culoare, float greutate,
                                String materialLaveta, int numarSenzoriDetectareMargini, float numarZgomot,
                                byte numarModuriCuratare, String tipManevrare) {
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

    // Getteri și setteri
    public String getMaterialLaveta() {
        return materialLaveta;
    }

    public void setMaterialLaveta(String materialLaveta) {
        this.materialLaveta = materialLaveta;
    }

    public int getNumarSenzoriDetectareMargini() {
        return numarSenzoriDetectareMargini;
    }

    public void setNumarSenzoriDetectareMargini(int numarSenzoriDetectareMargini) {
        this.numarSenzoriDetectareMargini = numarSenzoriDetectareMargini;
    }

    public float getNumarZgomot() {
        return numarZgomot;
    }

    public void setNumarZgomot(float numarZgomot) {
        this.numarZgomot = numarZgomot;
    }

    public byte getNumarModuriCuratare() {
        return numarModuriCuratare;
    }

    public void setNumarModuriCuratare(byte numarModuriCuratare) {
        this.numarModuriCuratare = numarModuriCuratare;
    }

    public String getTipManevrare() {
        return tipManevrare;
    }

    public void setTipManevrare(String tipManevrare) {
        this.tipManevrare = tipManevrare;
    }
}
