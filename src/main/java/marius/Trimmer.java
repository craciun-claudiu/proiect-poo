/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marius;
import comun.Aparat;

/**
 *
 * @author rentamarius
 */
public class Trimmer extends Aparat {
    public String brand;
    public double latimeLama;
    private int durataBaterie;
    private double durataIncarcare;
    private int numarTrepte;
    
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
    public Trimmer(String producator, String model, double pret, String culoare, double greutate,
            String brand, double latimeLama, int durataBaterie, double durataIncarcare, int numarTrepte) {
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
}
