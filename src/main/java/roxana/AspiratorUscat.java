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
public class AspiratorUscat extends Aparat implements InterfataAparat{
    private double capacitateSac;
    private String tipFiltru;
    private int putereAspirare;
    private int durataBateriei; //minute
    private String material;
    
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
 public AspiratorUscat(String producator, String model, float pret, String culoare, float greutate,
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
