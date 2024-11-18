/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roxana;
import comun.Aparat;

/**
 *
 * @author rd173
 */
public class AspiratorUscat extends Aparat{
    private double capacitateSac;
    private String tipFiltru;
    private int putereAspirare;
    private int durataBateriei; //minute
    private String material;
    
    public String toString(){
        return super.toString() + "Capacitate sac: " + capacitateSac + '\n' +
                "Tip filtru: " + tipFiltru + '\n' +
                "Putere aspirare: " + putereAspirare + '\n' +
                "Durata baterie: " + durataBateriei+ '\n' +
                "Material: " + material + '\n';
        
    }
    //Constructor fara parametri
    public AspiratorUscat(){
        super();
        capacitateSac = 0;
        tipFiltru = "necunoscut";
        putereAspirare = 0;
        durataBateriei = 0;
        material = "necunoscut";
    }
    //Constructor cu toti parametri
 public AspiratorUscat(String producator, String model, double pret, String culoare, double greutate,
            double capacitateSac, String tipFiltru , int putereAspirare, int durataBateriei, String material){
        super(producator, model, pret, culoare, greutate);//Apeleaza constructorul de parametri din clasa Aparat
        this.capacitateSac = capacitateSac;
        this.tipFiltru = tipFiltru;
        this.putereAspirare = putereAspirare;
        this.durataBateriei = durataBateriei;
        this.material = material;
 }
 //Constructor de copiere
 public AspiratorUscat(AspiratorUscat a){
        super(a);
        this.capacitateSac = a.capacitateSac;
        this.tipFiltru = a.tipFiltru;
        this.putereAspirare = a.putereAspirare;
        this.durataBateriei = a.durataBateriei;
        this.material = a.material;
    }    
}
