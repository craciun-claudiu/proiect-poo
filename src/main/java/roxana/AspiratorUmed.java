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
    private double capacitateRezervorApa; //litri
    private int nivelZgomot; //in decibeli
    private double lungimeCablu; //metri
    private double lungimeFurtun;
    private boolean utilizareDetergent;
    
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
            double capacitateRezervorApa, int nivelZgomot, double lungimeCablu, double lungimeFurtun, boolean utilizareDetergent){
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
}