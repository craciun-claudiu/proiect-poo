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
public class MasinaTunsIarba extends Aparat implements InterfataAparat{
    private String tipAlimentare;
    private String materialLama;
    private float putere; //puterea masinii de tuns in cp
    private float latimeTaiere; //latimea pe care o tunde in cm
    private int trepteTaiere; //in cate trepte poate taia
    private float volumCosColector; //volumul cosului de colectare in litri
    
    @Override
    public void  afisareAtributeFaraFormatare(){
        System.out.println(this.getProducator());
        System.out.println(this.getModel());
        System.out.println(this.getPret());
        System.out.println(this.getCuloare());
        System.out.println(this.getGreutate());
        System.out.println(tipAlimentare);
        System.out.println(materialLama);
        System.out.println(putere);
        System.out.println(latimeTaiere);
        System.out.println(trepteTaiere);
        System.out.println(volumCosColector);
    }
    
    @Override
    public float raportPretAtribute(){
        return this.getPret()/(this.putere * this.volumCosColector);
    }
    
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
    public MasinaTunsIarba(String producator, String model, float pret, String culoare, float greutate,
            String tipAlimentare, String materialLama, float putere, float latimeTaiere, int trepteTaiere,
            float volumCosColector){
        super(producator, model, pret, culoare, greutate);//Apeleaza constructorul cu toti parametri din clasa Aparat
        this.tipAlimentare = tipAlimentare;
        this.materialLama = materialLama;
        this.putere = putere;
        this.latimeTaiere = latimeTaiere;
        this.trepteTaiere = trepteTaiere;
        this.volumCosColector = volumCosColector;
    }
    //Constructor de copiere
    public MasinaTunsIarba(MasinaTunsIarba m){
        super(m);//Apeleaza constructorul de copiere din clasa Aparat
        this.tipAlimentare = m.tipAlimentare;
        this.materialLama = m.materialLama;
        this.putere = m.putere;
        this.latimeTaiere = m.latimeTaiere;
        this.trepteTaiere = m.trepteTaiere;
        this.volumCosColector = m.volumCosColector;
    }    
}
