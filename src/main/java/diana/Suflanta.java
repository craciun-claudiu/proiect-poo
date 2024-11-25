/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diana;
import comun.Aparat;
import comun.InterfataAparat;

/**
 *
 * @author da224
 */
public class Suflanta extends Aparat implements InterfataAparat{
    private String tipAlimentare;
    private String tipMotor;
    private byte numarTrepte;
    private byte putere; //masurata in W
    private short vitezaMaxima; //masurata in m/s
    private int capacitateAcumulator; //masurata in mAh
    //private int nivelZgomot; //masurata in dB
    
    @Override
    public void  afisareAtributeFaraFormatare(){
        //Ceva comenzi de afisare
    }
    
    @Override
    public float raportPretAtribute(){
        return 0; //Raport dintre pret si un atribut
    }
    
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
    public Suflanta(String producator, String model, float pret, String culoare, float greutate, 
            String tipAlimentare, String tipMotor, byte numarTrepte, byte putere, short vitezaMaxima, int capacitateAcumulator){
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
    
    //getteri si setteri
    public String getTipAlimentare(){
        return tipAlimentare;
    }
    
    public void setTipAlimentare(String tipAlimentare){
        this.tipAlimentare = tipAlimentare;
    }
    
    public String getTipMotor(){
        return tipMotor;
    }
    
    public void setTipMotor(String tipMotor){
        this.tipMotor = tipMotor;
    }
    
    public byte getNumarTrepte(){
        return numarTrepte;
    }
    
    public void setNumarTrepte(byte numarTrepte){
        this.numarTrepte = numarTrepte;
    }
    
    public byte getPutere(){
        return putere;
    }
    
    public void setPutere(byte putere){
        this.putere = putere;
    }
    
    public short getVitezaMaxima(){
        return vitezaMaxima;
    }
    
    public void setVitezaMaxima(short vitezaMaxima){
        this.vitezaMaxima = vitezaMaxima;
    }
    
    public int getCapacitateAcumulator(){
        return capacitateAcumulator;
    }
    
    public void setCapacitateAcumulator(int capacitateAcumulator){
        this.capacitateAcumulator = capacitateAcumulator;
    }
    
}
