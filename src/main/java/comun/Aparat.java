/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comun;

/**
 *
 * @author cc642
 */
public class Aparat {
    private String producator; //producatorul aparatului
    private String model; //modelul aparatului
    private double pret; //pretul in lei
    private String culoare; //culoarea aparatului
    private double greutate; //greutatea in kg
    
    //Rescrierea metodei toString
    @Override
    public String toString(){
        return "Producator: " + producator + '\n'
                +"Model: " + model + '\n'
                +"Pret: " + pret + " lei" +'\n'
                +"Culoare: " + culoare + '\n'
                +"Greutate: " + greutate + " kg"+'\n';
    }
    //Constructor fara argumente
    public Aparat(){
        this.producator = "Necunoscut";
        this.model = "Necunoscut";
        this.pret = 0;
        this.culoare = "Necunoscut";
        this.greutate = 0;
    } 
    //Constructor cu toate argumentele
    public Aparat(String producator, String model, double pret, String culoare, double greutate){
        this.producator = producator;
        this.model = model;
        this.pret = pret;
        this.culoare = culoare;
        this.greutate = greutate;
    }
    //Constructor de copiere
    public Aparat(Aparat ap){
        this.producator = ap.producator;
        this.model = ap.model;
        this.pret = ap.pret;
        this.culoare = ap.culoare;
        this.greutate = ap.greutate;
    }
}
