package testpredtestem;

public class Main {

    public static void main(String[] args) {
        Auto a1 = new Auto(3);
        
        System.out.print("dejPrumernouVzdalenostJizdy: ");
        System.out.println( a1.dejPrumernouVzdalenostJizdy() );
        
        System.out.print("dejCelkovouUjetouVzdalenost: ");
        System.out.println( a1.dejCelkovouUjetouVzdalenost() );
        
        System.out.print("dejPrumernouSpotrebuPaliva: ");
        System.out.println( a1.dejPrumernouSpotrebuPaliva() );
        
        System.out.print("dejCelkovouSpotrebuPaliva: ");
        System.out.println( a1.dejCelkovouSpotrebuPaliva() );
    }
    
}
