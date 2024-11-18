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
public class AparatSpalareCuPresiune extends Aparat{
    private String tipAlimentare;
    private int presiuneMaxima;//masurata in bar
    private int debitMaxim;//masurata in l/h
    private int lungimeFurtun;//masurat in m
    private double capacitateRecipientDetergent;//masurat in l
    
     @Override
    public String toString(){
        return super.toString() + "Tip alimentare: "+ tipAlimentare +'\n' +
                "Presiune maxima: "+ presiuneMaxima +" bar" +'\n'+
                "Debit maxim: "+ debitMaxim +" l/h" +'\n'+
                "Lungime furtun: "+ lungimeFurtun +" m" +'\n'+
                "Capacitate recipient pentru detergent: "+ capacitateRecipientDetergent +" l" +'\n';
    }
    
    //constructor fara parametri
    public AparatSpalareCuPresiune(){
        super();
        this.tipAlimentare ="Necunoscut";
        this.presiuneMaxima =0;
        this.debitMaxim =0;
        this.lungimeFurtun =0;
        this.capacitateRecipientDetergent =0;
    }
    
    //constructor complet
    public AparatSpalareCuPresiune(String producator, String model, double pret, String culoare, double greutate,
            String tipAlimentare, int presiuneMaxima, int debitMaxim, int lungimeCablu, double capacitateRecipientDetergent){
        super(producator, model, pret, culoare, greutate);
        this.tipAlimentare =tipAlimentare;
        this.presiuneMaxima =presiuneMaxima;
        this.debitMaxim =debitMaxim;
        this.lungimeFurtun =lungimeFurtun;
        this.capacitateRecipientDetergent =capacitateRecipientDetergent;
    }
    
    //constructor copiere
    public AparatSpalareCuPresiune(AparatSpalareCuPresiune a){
        super(a);
        this.tipAlimentare =a.tipAlimentare;
        this.presiuneMaxima =a.presiuneMaxima;
        this.debitMaxim =a.debitMaxim;
        this.lungimeFurtun =a.lungimeFurtun;
        this.capacitateRecipientDetergent =a.capacitateRecipientDetergent;
    }
}
