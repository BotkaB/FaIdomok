/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faidomok;

import java.util.HashSet;

/**
 *
 * @author BiankaBotka
 */
public class Gömb extends Idom {
    
    double sugar;
    private static HashSet<Double> különbözőSugár=new HashSet<>();

    public Gömb(double sugar) {
        this.sugar = sugar;
        különbözőSugár.add(sugar);
    }

    public double getSugar() {
        return sugar;
    }
    
    public static int getKulonbozoSugaruDb(){
        return különbözőSugár.size();
        
    }
    
    
    
    @Override
     public double terfogat(){
    return (4.0 / 3.0) * Math.PI * Math.pow(sugar, 3);
    }
    
       @Override
      public String toString(){
         // return "Gömb{"+ " fajsuly=" +getFajsuly()+ " terfogat"+terfogat()+" súly="+suly()+" sugár="+sugar+"}";
         return "Gömb {"+ super.toString()+" sugár="+sugar+"}";
}  
}
