/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marius;
import comun.Aparat;
import comun.InterfataAparat;

/**
 *
 * @author rentamarius
 */
public class Trimmer extends Aparat implements InterfataAparat{
    public String brand;
    public float latimeLama;
    private int durataBaterie;
    private float durataIncarcare;
    private int numarTrepte;
    
    @Override
    public void  afisareAtributeFaraFormatare(){
        //Ceva comenzi de afisare
        System.out.println(this.getProducator());
        System.out.println(this.getModel());
        System.out.println(this.getPret());
        System.out.println(this.getCuloare());
        System.out.println(this.getGreutate());
        System.out.println(brand);
        System.out.println(latimeLama);
        System.out.println(durataBaterie);
        System.out.println(durataIncarcare);
        System.out.println(numarTrepte);
    }
    
    @Override
    public float raportPretAtribute(){
        return (this.getPret() / (this.latimeLama * this.durataIncarcare)); //Raport dintre pret si un atribut
    }
    
    //Rescrierea metodei toString
    @Override
    public String toString(){
        return super.toString() + "Brand: " + brand + '\n' +
                "Latime lama: " + latimeLama + '\n' +
                "Durata Baterie: " + durataBaterie + " h" + '\n' +
                "Durata incarcare: " + durataIncarcare + " g" + '\n' +
                "Numar trepte: " + numarTrepte + '\n';
        
    }
    //Constructor fara parametri
    public Trimmer(){
        super();//Apeleaza constructorul fara parametri din clasa Aparat
        this.brand = "Necunoscut";
        this.latimeLama = 0;
        this.durataBaterie = 0;
        this.durataIncarcare = 0;
        this.numarTrepte = 0;
    }
    //Constructor cu toti parametrii
    public Trimmer(String producator, String model, float pret, String culoare, float greutate,
            String brand, float latimeLama, int durataBaterie, float durataIncarcare, int numarTrepte) {
        super(producator, model, pret, culoare, greutate);//Apeleaza constructorul cu toti parametri din clasa Aparat
        this.brand = brand;
        this.latimeLama = latimeLama;
        this.durataBaterie = durataBaterie;
        this.durataIncarcare = durataIncarcare;
        this.numarTrepte = numarTrepte;
    }
    //Constructor de copiere
    public Trimmer(Trimmer m){
        super(m);//Apeleaza constructorul de copiere din clasa Aparat
        this.brand = m.brand;
        this.latimeLama = m.latimeLama;
        this.durataBaterie = m.durataBaterie;
        this.durataIncarcare = m.durataIncarcare;
        this.numarTrepte = m.numarTrepte;
    }

    public String getbrand() {
        return brand;
    }
    public void setbrand(String brand) {
        this.brand = brand;
    }
    
    
    public float getlatimeLama() {
        return latimeLama;
    }
    public void setlatimeLama(float latimeLama) {
        this.latimeLama = latimeLama;
    }

    public int getdurataBaterie() {
        return durataBaterie;
    }
    public void setdurataBaterie(int durataBaterie) {
        this.durataBaterie = durataBaterie;
    }

    public float getdurataIncarcare() {
        return durataIncarcare;
    }
    public void setdurataIncarcare(float durataIncarcare) {
       this.durataIncarcare = durataIncarcare;
    }

   public int getnumarTrepte() {
        return numarTrepte;
    }
    public void setnumarTrepte(int numarTrepte) {
        this.numarTrepte = numarTrepte;
    }  
}
