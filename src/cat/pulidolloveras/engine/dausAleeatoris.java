package cat.pulidolloveras.engine;
import java.util.Random;

public class dausAleeatoris {

    static Random rand = new Random();

    /**
     * @return
     * Aquest mètode ens retorna un numero aleatori entre 1 i 6 que seria el que ens retorna un dau.
     */
    public static int shoot1Dau(){
        int resultat;
        resultat = rand.nextInt(5) + 1;
        return resultat;
    }

    /**
     * @return
     * Aquest mètode ens retorna un numero aleatori entre 1 i 12 que seria el que ens retornarien dos daus.
     */
    public  static  int shoot2Daus(){
        int resultat;
        resultat = rand.nextInt(11) + 1;
        return resultat;
    }


}
