/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faidomok;

/**
 *
 * @author BiankaBotka
 */
abstract class Idom {

    private static double fajsuly = 0.8;

    abstract double terfogat();

    double suly() {
        return fajsuly * terfogat();
    }

    @Override
    public String toString() {
        return "fajsuly= " + fajsuly + " terfogat= " + terfogat() + " súly= " + suly() + "}";
    }

}
