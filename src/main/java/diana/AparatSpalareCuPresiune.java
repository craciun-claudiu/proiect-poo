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
public class AparatSpalareCuPresiune extends Aparat implements InterfataAparat{
    private String tipAlimentare;
    private short presiuneMaxima;//masurata in bar
    private short debitMaxim;//masurata in l/h
    private byte lungimeFurtun;//masurat in m
    private float capacitateRecipientDetergent;//masurat in l
    
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
    public AparatSpalareCuPresiune(String producator, String model, float pret, String culoare, float greutate,
            String tipAlimentare, short presiuneMaxima, short debitMaxim, byte lungimeCablu, float capacitateRecipientDetergent){
        super(producator, model, pret, culoare, greutate);
        this.tipAlimentare =tipAlimentare;
        this.presiuneMaxima =presiuneMaxima;
        this.debitMaxim =debitMaxim;
        this.lungimeFurtun =lungimeCablu;
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
    
    //setteri si getteri
    public String getTipAlimentare(){
        return tipAlimentare;
    }
    
    public void setTipAlimentare(String tipAlimentare){
        this.tipAlimentare = tipAlimentare;
    }
    
    public short getPresiuneMaxima(){
        return presiuneMaxima;
    }
    
    public void setPresiuneMaxima(short presiuneMaxima){
        this.presiuneMaxima = presiuneMaxima;
    }
    
    public short getDebitMaxim(){
        return debitMaxim;
    }
    
    public void setDebitMaxim(short debitMaxim){
        this.debitMaxim = debitMaxim;
    }
    
    public byte getLungimeFurtun(){
        return lungimeFurtun;
    }
    
    public void setLungimeFurtun(byte lungimeFurtun){
        this.lungimeFurtun = lungimeFurtun;
    }
    
    public float getCapacitateRecipientDetergent(){
        return capacitateRecipientDetergent;
    }
    
    public void setCapacitateRecipientDetergent(float capacitateRecipientDetergent){
        this.capacitateRecipientDetergent = capacitateRecipientDetergent;
    }
    
}
