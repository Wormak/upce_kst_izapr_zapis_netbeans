package testpredtestem;

public class Auto {
    // Deklarace polí pro záznam jízd
    // O neurčité velikosti, ale pro celou třídu
    private int[] vzdalenost;
    private double[] spotreba;
    
    public Auto(int pocetJizd) {
        // Deklarace polí s danou velikostí
        int[] vzdalenost_ = new int[pocetJizd];
        double[] spotreba_ = new double[pocetJizd];
        // Přepis do polí platných v celé třídě
        this.vzdalenost = vzdalenost_;
        this.spotreba = spotreba_;
        
        // Cyklus Vytvářející jednotlivé jízdy
        for (int i=0; i<pocetJizd; i++) {
            pridejJizdu(i);
        }
    }
    
    private void pridejJizdu(int i) {
        // Plnění konkrétních prvků náhodnými hodnotami
        this.vzdalenost[i] = (int)dejNahodneCislo(5, 250);
        this.spotreba[i] = dejNahodneCislo(4.5, 9.0);
    }
    
    private double dejNahodneCislo(double min, double max) {
        // Díky Jakubovi Štěpánkovi za tenhle vzoreček
        return (Math.random() * (max-min)) + min;
    }

    private double zaokrouhli(double cislo) {
        // Díky Jakubovi Štěpánkovi za tenhle vzoreček
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
