/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roxana;
import comun.Aparat;
import comun.InterfataAparat;

/**
 *
 * @author rd173
 */
public class AspiratorUmed extends Aparat implements InterfataAparat{
    private float capacitateRezervorApa; //litri
    private int nivelZgomot; //in decibeli
    private float lungimeCablu; //metri
    private float lungimeFurtun;
    private boolean utilizareDetergent;
    
    @Override
    public void  afisareAtributeFaraFormatare(){
        System.out.println(this.getProducator());
        System.out.println(this.getModel());
        System.out.println(this.getCuloare());
        System.out.println(this.getPret());
        System.out.println(this.getGreutate());
        System.out.println(capacitateRezervorApa);
        System.out.println(nivelZgomot);
        System.out.println(lungimeCablu);
        System.out.println(lungimeFurtun);
        System.out.println(utilizareDetergent);
        
    }
    
    @Override
    public float raportPretAtribute(){
        return this.getPret()/(this.lungimeCablu * this.lungimeFurtun);
    }
    
   @Override
   public String toString(){
        return super.toString() + "Capacitate rezervor apa: " + capacitateRezervorApa + '\n' +
                "Nivel zgomot: " + nivelZgomot + '\n' +
                "Lungime cablu: " + lungimeCablu + '\n' +
                "Lungime furtun: " + lungimeFurtun + '\n' +
                "Utilizare detergent: " + utilizareDetergent + '\n';
   }  
   //Constructor fara parametri
public AspiratorUmed(){
        super();
        capacitateRezervorApa = 0;
        nivelZgomot = 0;
        lungimeCablu = 0;
        lungimeFurtun = 0;
        utilizareDetergent = false;
}
    //Constructor cu toti parametrii
    public AspiratorUmed(String producator, String model, float pret, String culoare, float greutate,
            float capacitateRezervorApa, int nivelZgomot, float lungimeCablu, float lungimeFurtun, boolean utilizareDetergent){
        super(producator, model, pret, culoare, greutate);//Apeleaza constructorul de parametri din clasa Aparat
        this.capacitateRezervorApa = capacitateRezervorApa;
        this.nivelZgomot = nivelZgomot;
        this.lungimeCablu = lungimeCablu;
        this.lungimeFurtun = lungimeFurtun;
        this.utilizareDetergent = utilizareDetergent;
    }
 //Constructor de copiere
    public AspiratorUmed(AspiratorUmed a){
        super(a);
        this.capacitateRezervorApa = a.capacitateRezervorApa;
        this.nivelZgomot = a.nivelZgomot;
        this.lungimeCablu = a.lungimeCablu;
        this.lungimeFurtun = a.lungimeFurtun;
        this.utilizareDetergent = a.utilizareDetergent;
    }  
    
    
    public float getcapacitateRezervorApa(){
        return capacitateRezervorApa;
    }
    
    public void setcapacitatRezervorApa(float capacitateRezervoraApa){
        this.capacitateRezervorApa = capacitateRezervorApa;
    }
    
    public int getnivelZgomot(){
        return nivelZgomot;
    }
    
    public void setnivelZgomot (int nivelZgomot){
        this.nivelZgomot = nivelZgomot;
    }
    
    public float getlungimeCablu(){
        return lungimeCablu;
    }
    
    public void setlungimeCablu(float lungimeCablu){
        this.lungimeCablu = lungimeCablu;
    }
    
    public float getlungimeFurtun(){
        return lungimeFurtun;
    }
    
    public void setlungimeFurtun( float lungimeFurtun){
        this.lungimeFurtun = lungimeFurtun;
    }
    
    public boolean getutilizareDetergent(){
        return utilizareDetergent;
    }
    
    public void setutilizareDetergent (boolean utilizareDetergent){
        this.utilizareDetergent = utilizareDetergent;
    }
}




