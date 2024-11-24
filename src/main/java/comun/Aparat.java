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
    private float pret; //pretul in lei
    private String culoare; //culoarea aparatului
    private float greutate; //greutatea in kg
    
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
    public Aparat(String producator, String model, float pret, String culoare, float greutate){
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
    
    public String getProducator(){
        return producator;
    }
    public void setProducator(String producator){
        this.producator = producator;
    }
    
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    
    public float getPret(){
        return pret;
    }
    public void setPret(float pret){
        this.pret = pret;
    }
    
    public String getCuloare(){
        return culoare;
    }
    public void setCuloare(String culoare){
        this.culoare = culoare;
    }
    
    public float getGreutate(){
        return greutate;
    }
    public void setGreutate(float greutate){
        this.greutate = greutate;
    }
}
