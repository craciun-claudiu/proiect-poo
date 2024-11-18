/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marius;
import comun.Aparat;

/**
 *
 * @author rentamarius
 */
public class Drujba extends Aparat {
    private double putereMotor;
    private double capacitateCilindrica;
    private int vitezaMaximaRPM;
    private int capacitateRezervor;
    private int capacitateRezervorUlei; 
    
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
    public Drujba(String producator, String model, double pret, String culoare, double greutate,
            double putereMotor, double capacitateCilindrica, int vitezaMaximaRPM, int capacitateRezervor,
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
}

