package main;

public class JatekIndito {
    
    public static void main(String[] args) {
        /* nincs referencia az objektumra: */
        //new Jatek().start();
        
        /* adunk referenciát az objektumra: */
        //Jatek referencia = new Jatek();
        /* a referencián keresztül elérjük az objektum tagfüggvényeit: */
        //referencia.start();
        
        /* nincs referencia, csak az objektum konstruktorát hívjuk: */
        //new KitalalosJatek();
        
        /* 3 játékos 1-1 tippel */
//        new Jatekos().tippel();
//        new Jatekos().tippel();
//        new Jatekos().tippel();
        
        /* 1 játékos tippel háromszor */
//        Jatekos jatekos1 = new Jatekos();
//        jatekos1.tippel();
//        jatekos1.tippel();
//        jatekos1.tippel();
        

        /* Öröklődés, polimorfizmus */
        //KitalalosJatek jatek = new KitalalosJatek();
        //CsigaversenyJatek jatek = new CsigaversenyJatek();
        //jatek.indito();
        /* A jatek polimorf, hivatkozhat az utódjaira */
        Jatek kitalalos = new KitalalosJatek();
        Jatek verseny = new CsigaversenyJatek();
        
        Jatek[] jatekok = {kitalalos, verseny, new Jatek()};
        for (Jatek jatek : jatekok){
            /* Hibás tervezés: nincs közös metódus az ősben */
//            if(jatek instanceof KitalalosJatek){
//                ((KitalalosJatek)jatek).start(); 
//            }else if(jatek instanceof CsigaversenyJatek){
//                ((CsigaversenyJatek)jatek).indito();
//            }
            
            /* Helyes tervezés: van közös metódus az ősben */
            /* Mindenki megörökli az őstöl */
            //jatek.kezdes();
            jatek.start();
        }
    }
}
