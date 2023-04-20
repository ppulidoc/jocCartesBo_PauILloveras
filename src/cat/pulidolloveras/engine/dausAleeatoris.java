package cat.pulidolloveras.engine;
import java.util.Random;

public class dausAleeatoris {

    static Random rand = new Random();

    public static int shoot1Dau(){
        int resultat;
        resultat = rand.nextInt(5) + 1;
        return resultat;
    }
    public  static  int shoot2Daus(){
        int resultat;
        resultat = rand.nextInt(11) + 1;
        return resultat;
    }


}
