/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diana;
import comun.Aparat;

/**
 *
 * @author da224
 */
public class Suflanta extends Aparat{
    private String tipAlimentare;
    private String tipMotor;
    private int numarTrepte;
    private int putere; //masurata in W
    private int vitezaMaxima; //masurata in m/s
    private int capacitateAcumulator; //masurata in mAh
    //private int nivelZgomot; //masurata in dB
    
    @Override
    public String toString(){
        return super.toString() + "Tip alimentare: " + tipAlimentare + '\n'+
                "Tip motor: "+ tipMotor + '\n'+
                "Numar trepte: "+ numarTrepte + " trepte de viteza" +'\n'+
                "Putere: "+ putere + " W" + '\n'+
                "Viteza maxima: "+ vitezaMaxima + " m/s" +'\n'+
                "Capacitate acumulator: "+ capacitateAcumulator + " mAh" +'\n';
    }
    
    //constructor fara parametri
    public Suflanta(){
        super();
        this.tipAlimentare="Necunoscut";
        this.tipMotor="Necunoscut";
        this.numarTrepte=0;
        this.putere=0;
        this.vitezaMaxima=0;
        this.capacitateAcumulator=0;
    }
    
    //constructor complet 
    public Suflanta(String producator, String model, double pret, String culoare, double greutate,
            String tipAlimentare, String tipMotor,int numarTrepte, int putere, int vitezaMaxima, int capacitateAcumulator){
        super(producator, model, pret, culoare, greutate);
        this.tipAlimentare=tipAlimentare;
        this.tipMotor=tipMotor;
        this.numarTrepte=numarTrepte;
        this.putere=putere;
        this.vitezaMaxima=vitezaMaxima;
        this.capacitateAcumulator=capacitateAcumulator;
    }
    
    //constructor copiere
    public Suflanta(Suflanta a){
        super(a);
        this.tipAlimentare=a.tipAlimentare;
        this.tipMotor=a.tipMotor;
        this.numarTrepte=a.numarTrepte;
        this.putere=a.putere;
        this.vitezaMaxima=a.vitezaMaxima;
        this.capacitateAcumulator=a.capacitateAcumulator;
    }
    
}
