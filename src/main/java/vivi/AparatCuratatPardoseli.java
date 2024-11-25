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
public class AparatCuratatPardoseli extends Aparat implements InterfataAparat {
    private String marca;
    private String model;
    private float capacitateBaterie; // capacitate baterie în mAh
    private float capacitateRezervorApa; // capacitatea rezervorului în litri
    private byte putere; // puterea aparatului în W

    @Override
    public void afisareAtributeFaraFormatare() {
        System.out.println(this.getProducator());
        System.out.println(this.getModel());
        System.out.println(this.getPret());
        System.out.println(this.getCuloare());
        System.out.println(this.getGreutate());
        System.out.println(marca);
        System.out.println(model);
        System.out.println(capacitateBaterie);
        System.out.println(capacitateRezervorApa);
        System.out.println(putere);
    }

    @Override
    public float raportPretAtribute() {
        return this.getPret() / (this.capacitateBaterie * this.capacitateRezervorApa);
    }

    // Rescrierea metodei toString
    @Override
    public String toString() {
        return super.toString() +
               "Marcă: " + marca + '\n' +
               "Model: " + model + '\n' +
               "Capacitate baterie: " + capacitateBaterie + " mAh" + '\n' +
               "Capacitate rezervor apă: " + capacitateRezervorApa + " l" + '\n' +
               "Putere: " + putere + " W" + '\n';
    }

    // Constructor fără parametri
    public AparatCuratatPardoseli() {
        super(); // Apelează constructorul fără parametri din clasa Aparat
        this.marca = "Necunoscut";
        this.model = "Necunoscut";
        this.capacitateBaterie = 0;
        this.capacitateRezervorApa = 0.0f;
        this.putere = 0;
    }

    // Constructor cu toți parametrii
    public AparatCuratatPardoseli(String producator, String model, float pret, String culoare, float greutate,
                                  String marca, String modelSpecific, float capacitateBaterie, 
                                  float capacitateRezervorApa, byte putere) {
        super(producator, model, pret, culoare, greutate); // Apelează constructorul cu parametri din clasa Aparat
        this.marca = marca;
        this.model = modelSpecific;
        this.capacitateBaterie = capacitateBaterie;
        this.capacitateRezervorApa = capacitateRezervorApa;
        this.putere = putere;
    }

    // Constructor de copiere
    public AparatCuratatPardoseli(AparatCuratatPardoseli a) {
        super(a); // Apelează constructorul de copiere din clasa Aparat
        this.marca = a.marca;
        this.model = a.model;
        this.capacitateBaterie = a.capacitateBaterie;
        this.capacitateRezervorApa = a.capacitateRezervorApa;
        this.putere = a.putere;
    }

    // Getteri și setteri
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelSpecific() {
        return model;
    }

    public void setModelSpecific(String model) {
        this.model = model;
    }

    public float getCapacitateBaterie() {
        return capacitateBaterie;
    }

    public void setCapacitateBaterie(float capacitateBaterie) {
        this.capacitateBaterie = capacitateBaterie;
    }

    public float getCapacitateRezervorApa() {
        return capacitateRezervorApa;
    }

    public void setCapacitateRezervorApa(float capacitateRezervorApa) {
        this.capacitateRezervorApa = capacitateRezervorApa;
    }

    public byte getPutere() {
        return putere;
    }

    public void setPutere(byte putere) {
        this.putere = putere;
    }
}
