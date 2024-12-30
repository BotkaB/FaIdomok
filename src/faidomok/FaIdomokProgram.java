/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faidomok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author BiankaBotka
 */
public class FaIdomokProgram {
private final List <Idom> idomok;

    public FaIdomokProgram() {
        idomok=new ArrayList<>();
        idomok.add(new Gömb(2));
        idomok.add(new Gömb(2));
        idomok.add(new Gömb(3));
        idomok.add(new Hasáb(2,3,4));
        idomok.add(new Hasáb(4,1.5,4));
        idomok.add(new Hasáb(2.2,3.2,4));
        
    }
    
//     private List<Idom> lista() {
//        return Collections.unmodifiableList(idomok);
//    }
     private List<Idom> rendezettLista() {
    
     List<Idom> rendezettLista=new ArrayList<>(idomok);
     Collections.sort(rendezettLista, Comparator.comparingDouble(Idom::terfogat));
    return Collections.unmodifiableList(rendezettLista);
    }
    
    private double idomokOsszesSulya(){
        double suly=0;
        for(Idom idom:rendezettLista()){
        suly+=idom.suly();
        }
        return suly;
    }
    
       private double gömbökSulya() {
        double suly = 0;
        for (Idom gömb : rendezettLista()) {
            if (gömb instanceof Gömb) {
                suly += gömb.suly();
            }
        }
        return suly;
    }
       
       private void legKisebbEsLegnagyobbTerfogatu(){
       List <Idom> legkisebb=new ArrayList<>();
       List <Idom> legnagyobb=new ArrayList<>();
       double minimum=rendezettLista().get(0).terfogat();
       double maximum=rendezettLista().get(rendezettLista().size()-1).terfogat();
       for (Idom idom : rendezettLista()) {
           if (idom.terfogat() == minimum) {
               legkisebb.add(idom); 
           } else {
               break; 
           } 
       }
       for (int i = rendezettLista().size() - 1; i >= 0; i--) {
           Idom idom = rendezettLista().get(i); 
           if (idom.terfogat() == maximum) { 
               legnagyobb.add(idom);
           } else { 
               break;
           }
       }
       
       System.out.println("Legkisebb térfogatú idom(ok):"); 
       for (Idom idom : legkisebb) {
           System.out.println(idom); 
       }
       System.out.println("Legnagyobb térfogatú idom(ok):"); 
       for (Idom idom : legnagyobb) { 
           System.out.println(idom); 
       }
       }
       
       
      private void azonosAlapteruletuHasabokSzama() {
    Map<Double, Integer> statisztika = new HashMap<>();

  
    for (Idom idom : rendezettLista()) {
        if (idom instanceof Hasáb) {
            double kulcs = ((Hasáb) idom).getAlapterulet(); 
            statisztika.put(kulcs, statisztika.getOrDefault(kulcs, 0) + 1);
        }
    }

    for (Map.Entry<Double, Integer> entry : statisztika.entrySet()) {
        double key = entry.getKey();
        int value = entry.getValue();
        System.out.printf("terület:'%s' = %d db.\n", key, value);
    }
}


    
    public void run(){
        //System.out.println(rendezettLista());
        System.out.println("Az idomok összes súlya:"+idomokOsszesSulya());
        System.out.println("A gömbök összes súlya:"+gömbökSulya());
        System.out.println("A legkisebb és a legnagyobb térfogatú idom típusa és adatai:");
        legKisebbEsLegnagyobbTerfogatu();
        System.out.println("Hányféle sugarú gömb van?"+Gömb.getKulonbozoSugaruDb());
        System.out.println("Azonos alapterületű hasábokból mennyi van?");
        azonosAlapteruletuHasabokSzama();
      
      
    
    
    }


    
}
