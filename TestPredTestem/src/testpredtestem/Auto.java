/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpredtestem;

/**
 *
 * @author pavel
 */
public class Auto {
    private int[] vzdalenost;
    private double[] spotreba;
    
    public Auto(int pocetJizd) {
        int[] vzdalenost_ = new int[pocetJizd];
        double[] spotreba_ = new double[pocetJizd];
        this.vzdalenost = vzdalenost_;
        this.spotreba = spotreba_;
        
        
        for (int i=0; i<pocetJizd; i++) {
            pridejJizdu(i);
        }
    }
    
    private void pridejJizdu(int i) {
        this.vzdalenost[i] = (int)dejNahodneCislo(5, 250);
        this.spotreba[i] = dejNahodneCislo(4.5, 9.0);
    }
    
    private double dejNahodneCislo(double min, double max) {
        double rand = (Math.random() * (max-min)) + min;
        return zaokrouhli(rand);
    }

    private double zaokrouhli(double cislo) {
        cislo = cislo*100;
        cislo = Math.round(cislo);
        cislo = cislo / 100;
        return cislo;
    }
    
    public int dejPrumernouVzdalenostJizdy() {
        int soucet = 0;
        int pocet = 0;
        
        for (int i = 0; i < vzdalenost.length; i++) {
            soucet += vzdalenost[i];
            pocet++;
        }
        
        return soucet / pocet;
    }
    
    public int dejCelkovouUjetouVzdalenost() {
        int soucet = 0;
        
        for (int i = 0; i < vzdalenost.length; i++) {
            soucet += vzdalenost[i];
        }
        
        return soucet;
    }
    
    public double dejPrumernouSpotrebuPaliva() {
        double soucet = 0;
        int pocet = 0;
        
        for (int i = 0; i < vzdalenost.length; i++) {
            soucet += vzdalenost[i];
            pocet++;
        }
        
        return zaokrouhli(soucet / pocet);
    }
    
    public double dejCelkovouSpotrebuPaliva() {
        double soucet = 0;
        for (int i = 0; i < spotreba.length; i++) {
            soucet += spotreba[i];
        }
        
        return zaokrouhli(soucet);
    }
}
