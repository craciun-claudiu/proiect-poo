/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claudiu;

import comun.Aparat;

/**
 *
 * @author cc642
 */
public class Motosapa extends Aparat{
    String tipAlimentare;
    String tipPornire;
    String tipTaiere;
    String tipManer;
    int vitezaMaxima;//viteza maxima in RPM
    double lungime;//lungimea in cm
    
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
    public Motosapa(String producator, String model, double pret, String culoare, double greutate,
            String tipAlimentare, String tipPornire, String tipTaiere, String tipManer, int vitezaMaxima,
            double lungime){
        super(producator, model, pret, culoare, greutate);//Apeleaza constructorul de parametri din clasa Aparat
        this.tipAlimentare = tipAlimentare;
        this.tipPornire = tipPornire;
        this.tipTaiere = tipTaiere;
        this.tipManer = tipManer;
        this.vitezaMaxima = vitezaMaxima;
        this.lungime = lungime;
    }
    //Constructor de copiere
    public Motosapa(Motosapa m){
        super(m);
        this.tipAlimentare = m.tipAlimentare;
        this.tipPornire = m.tipPornire;
        this.tipTaiere = m.tipTaiere;
        this.tipManer = m.tipManer;
        this.vitezaMaxima = m.vitezaMaxima;
        this.lungime = m.lungime;
    }    
}
