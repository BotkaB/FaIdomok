/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faidomok;

/**
 *
 * @author BiankaBotka
 */
public class Hasáb extends Idom {
    double a,b,m;

    public Hasáb(double a, double b, double m) {
        this.a = a;
        this.b = b;
        this.m = m;
    }
    
    
    @Override
    public double terfogat(){
    return a*b*m;
    }
    
    double getAlapterulet(){
        return a*b;
    }
    
     @Override
      public String toString(){
          return "Hasáb {"+ super.toString()+" a="+a+" b="+b+" m="+m+"}";
}
    
}
