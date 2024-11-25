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
    private float capacitateSac;
    private String tipFiltru;
    private int putereAspirare;
    private int durataBateriei; //minute
    private String material;
    
    @Override
    public void  afisareAtributeFaraFormatare(){
        System.out.println(this.getProducator());
        System.out.println(this.getModel());
        System.out.println(this.getPret());
        System.out.println(this.getCuloare());
        System.out.println(this.getGreutate());
        System.out.println(capacitateSac);
        System.out.println(tipFiltru);
        System.out.println(putereAspirare);
        System.out.println(durataBateriei);
        System.out.println(material);
        
        
        
    }
    
    @Override
    public float raportPretAtribute(){
        return this.getPret()/(this.putereAspirare * this.durataBateriei); 
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
            float capacitateSac, String tipFiltru , int putereAspirare, int durataBateriei, String material){
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
 
 public float getcapacitateSac(){
     return capacitateSac;
 }
 public void setcapacitateSac(float capacitateSac){
         this.capacitateSac = capacitateSac;
 }
 
 public String gettipFiltru(){
     return tipFiltru;
 }
 public void settipFiltru(String tipFiltru){
     this.tipFiltru = tipFiltru;
 }
 
 public int getputereAspirare(){
     return putereAspirare;
 }
 public void setputereAspirare(int putereAspirare){
     this.putereAspirare = putereAspirare;
 }
 
 public int getdurataBateriei(){
     return durataBateriei;
 }
 public void setdurataBateriei( int durataBateriei){
     this.durataBateriei = durataBateriei;
 }
 public String getmaterial(){
     return material;
 }
 public void setmaterial(String material){
     this.material = material;
 }
}

