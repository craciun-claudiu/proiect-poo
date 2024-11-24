/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claudiu;

import comun.Aparat;
import comun.InterfataAparat;

/**
 *
 * @author cc642
 */
public class Motosapa extends Aparat implements InterfataAparat{
    private String tipAlimentare;
    private String tipPornire;
    private String tipTaiere;
    private String tipManer;
    private int vitezaMaxima;//viteza maxima in RPM
    private float lungime;//lungimea in cm
    
    @Override
    public void  afisareAtributeFaraFormatare(){
        System.out.println(this.getProducator());
        System.out.println(this.getModel());
        System.out.println(this.getPret());
        System.out.println(this.getCuloare());
        System.out.println(this.getGreutate());
        System.out.println(tipAlimentare);
        System.out.println(tipPornire);
        System.out.println(tipTaiere);
        System.out.println(tipManer);
        System.out.println(vitezaMaxima);
        System.out.println(lungime);
    }
    
    @Override
    public float raportPretAtribute(){
        return this.getPret()/this.vitezaMaxima;
    }
    
    //Rescrierea metodei toString
    @Override
    public String toString(){
        return super.toString() + "Tip alimentare: " + tipAlimentare + '\n' +
                "Tip pornire: " + tipPornire + '\n' +
                "Tip taiere: " + tipTaiere + '\n' +
                "Tip maner: " + tipManer + '\n' +
                "Viteza maxima: " + vitezaMaxima + " rpm"+'\n' +
                "Lungime: " + lungime + " cm" + '\n';
        
    }
    //Constructor fara parametri
    public Motosapa(){
        super();//Apeleaza constructorul fara parametri din clasa Aparat
        this.tipAlimentare = "Necunoscut";
        this.tipPornire = "Necunoscut";
        this.tipTaiere = "Necunoscut";
        this.tipManer = "Necunoscut";
        this.vitezaMaxima = 0;
        this.lungime = 0;
    }
    //Constructor cu toti parametrii
    public Motosapa(String producator, String model, float pret, String culoare, float greutate,
            String tipAlimentare, String tipPornire, String tipTaiere, String tipManer, int vitezaMaxima,
            float lungime){
        super(producator, model, pret, culoare, greutate);//Apeleaza constructorul cu toti parametri din clasa Aparat
        this.tipAlimentare = tipAlimentare;
        this.tipPornire = tipPornire;
        this.tipTaiere = tipTaiere;
        this.tipManer = tipManer;
        this.vitezaMaxima = vitezaMaxima;
        this.lungime = lungime;
    }
    //Constructor de copiere
    public Motosapa(Motosapa m){
        super(m);//Apeleaza constructorul de copiere din clasa Aparat
        this.tipAlimentare = m.tipAlimentare;
        this.tipPornire = m.tipPornire;
        this.tipTaiere = m.tipTaiere;
        this.tipManer = m.tipManer;
        this.vitezaMaxima = m.vitezaMaxima;
        this.lungime = m.lungime;
    }   
    
    public String getTipAlimentare() {
        return tipAlimentare;
    }
    public void setTipAlimentare(String tipAlimentare) {
        this.tipAlimentare = tipAlimentare;
    }

    public String getTipPornire() {
        return tipPornire;
    }
    public void setTipPornire(String tipPornire) {
        this.tipPornire = tipPornire;
    }

    public String getTipTaiere() {
        return tipTaiere;
    }
    public void setTipTaiere(String tipTaiere) {
        this.tipTaiere = tipTaiere;
    }

    public String getTipManer() {
        return tipManer;
    }
    public void setTipManer(String tipManer) {
        this.tipManer = tipManer;
    }

    public int getVitezaMaxima() {
        return vitezaMaxima;
    }
    public void setVitezaMaxima(int vitezaMaxima) {
        this.vitezaMaxima = vitezaMaxima;
    }

    public float getLungime() {
        return lungime;
    }
    public void setLungime(float lungime) {
        this.lungime = lungime;
}   

}
