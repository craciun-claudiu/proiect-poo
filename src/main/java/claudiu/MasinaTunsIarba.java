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
public class MasinaTunsIarba extends Aparat{
    private String tipAlimentare;
    private String materialLama;
    private double putere; //puterea masinii de tuns in cp
    private double latimeTaiere; //latimea pe care o tunde in cm
    private int trepteTaiere; //in cate trepte poate taia
    double volumCosColector; //volumul cosului de colectare in litri
    
    //Rescrierea metodei toString
    @Override
    public String toString(){
        return super.toString() + "Tip alimentare: " + tipAlimentare + '\n' +
                "Material lama: " + materialLama + '\n' +
                "Putere: " + putere + " cp" + '\n' +
                "Latime taiere: " + latimeTaiere + " cm" + '\n' +
                "Trepte taiere: " + trepteTaiere + '\n' +
                "Volum cos colector: " + volumCosColector + " l" + '\n';
        
    }
    //Constructor fara parametri
    public MasinaTunsIarba(){
        super();//Apeleaza constructorul fara parametri din clasa Aparat
        this.tipAlimentare = "Necunoscut";
        this.materialLama = "Necunoscut";
        this.putere = 0;
        this.latimeTaiere = 0;
        this.trepteTaiere = 0;
        this.volumCosColector = 0;
    }
    //Constructor cu toti parametrii
    public MasinaTunsIarba(String producator, String model, double pret, String culoare, double greutate,
            String tipAlimentare, String materialLama, double putere, double latimeTaiere, int trepteTaiere,
            double volumCosColector){
        super(producator, model, pret, culoare, greutate);//Apeleaza constructorul de parametri din clasa Aparat
        this.tipAlimentare = tipAlimentare;
        this.materialLama = materialLama;
        this.putere = putere;
        this.latimeTaiere = latimeTaiere;
        this.trepteTaiere = trepteTaiere;
        this.volumCosColector = volumCosColector;
    }
    //Constructor de copiere
    public MasinaTunsIarba(MasinaTunsIarba m){
        super(m);
        this.tipAlimentare = m.tipAlimentare;
        this.materialLama = m.materialLama;
        this.putere = m.putere;
        this.latimeTaiere = m.latimeTaiere;
        this.trepteTaiere = m.trepteTaiere;
        this.volumCosColector = m.volumCosColector;
    }    
}
