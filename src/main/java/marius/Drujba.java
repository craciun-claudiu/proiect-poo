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
        super();
        putereMotor = 0;
        capacitateCilindrica = 0;
        vitezaMaximaRPM = 0;
        capacitateRezervor = 0;
        capacitateRezervorUlei = 0;
    }
}

