/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marius;
import comun.Aparat;
import comun.InterfataAparat;

/**
 *
 * @author rentamarius
 */
public class Drujba extends Aparat implements InterfataAparat{
    private float putereMotor;
    private float capacitateCilindrica;
    private int vitezaMaximaRPM;
    private int capacitateRezervor;
    private int capacitateRezervorUlei; 
    
    @Override
    public void  afisareAtributeFaraFormatare(){
        //Ceva comenzi de afisare
        System.out.println(this.getProducator());
        System.out.println(this.getModel());
        System.out.println(this.getPret());
        System.out.println(this.getCuloare());
        System.out.println(this.getGreutate());
        System.out.println(putereMotor);
        System.out.println(capacitateCilindrica);
        System.out.println(vitezaMaximaRPM);
        System.out.println(capacitateRezervor);
        System.out.println(capacitateRezervorUlei);
    }
    
    @Override
    public float raportPretAtribute(){
        return (this.getPret() / (this.putereMotor * this.capacitateCilindrica)); //Raport dintre pret si un atribut
    }
    
    @Override
    public String toString(){
        return super.toString() + "Putere motor: " + putereMotor + '\n' +
                "Capacitate Cilindrica: " + capacitateCilindrica + '\n' +
                "Viteza Maxima : " + vitezaMaximaRPM + " RPM" + '\n' +
                "Capacitate Rezervor: " + capacitateRezervor + '\n' +
                "Capacitate Rezervor Ulei: " + capacitateRezervorUlei + '\n';        
    }
    
    public Drujba(){
        super(); //Apeleaza constructorul fara parametri din clasa Aparat
        putereMotor = 0;
        capacitateCilindrica = 0;
        vitezaMaximaRPM = 0;
        capacitateRezervor = 0;
        capacitateRezervorUlei = 0;
    }
    //Constructor cu toti parametrii
    public Drujba(String producator, String model, float pret, String culoare, float greutate,
            float putereMotor, float capacitateCilindrica, int vitezaMaximaRPM, int capacitateRezervor,
            int capacitateRezervorUlei) {
        super(producator, model, pret, culoare, greutate); //Apeleaza constructorul de parametri din clasa Aparat
        this.putereMotor = putereMotor;
        this.capacitateCilindrica = capacitateCilindrica;
        this.vitezaMaximaRPM = vitezaMaximaRPM;
        this.capacitateRezervor = capacitateRezervor;
        this.capacitateRezervorUlei = capacitateRezervorUlei;
    }
    //Constructor de copiere
    public Drujba(Drujba m){
        super(m);
        this.putereMotor = m.putereMotor;
        this.capacitateCilindrica = m.capacitateCilindrica;
        this.vitezaMaximaRPM = m.vitezaMaximaRPM;
        this.capacitateRezervor = m.capacitateRezervor;
        this.capacitateRezervorUlei = m.capacitateRezervorUlei;
    }

     public float getPutereMotor() {
        return putereMotor;
    }
    public void setPutereMotor(float putereMotor) {
        this.putereMotor = putereMotor;
    }
    
    
    public float getCapacitateCilindrica() {
        return capacitateCilindrica;
    }
    public void setCapacitateCilindrica(float capacitateCilindrica) {
        this.capacitateCilindrica = capacitateCilindrica;
    }

    public int getVitezaMaximaRPM() {
        return vitezaMaximaRPM;
    }
    public void setVitezaMaximaRPM(int vitezaMaximaRPM) {
        this.vitezaMaximaRPM = vitezaMaximaRPM;
    }

    public int getCapacitateRezervor() {
        return capacitateRezervor;
    }
    public void setLatimeTaiere(int capacitateRezervor) {
       this.capacitateRezervor = capacitateRezervor;
    }

   public int getCapacitateRezervorUlei() {
        return capacitateRezervorUlei;
    }
    public void setCapacitateRezervorUlei(int capacitateRezervorUlei) {
        this.capacitateRezervorUlei = capacitateRezervorUlei;
    }  
}

