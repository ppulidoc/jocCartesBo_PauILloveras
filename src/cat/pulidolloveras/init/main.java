package cat.pulidolloveras.init;

import cat.pulidolloveras.engine.dausAleeatoris;
import java.util.Scanner;
public class main {
    public static Scanner t = new Scanner(System.in);

    public static void main(String[] args) {
        char qDaus = ' ' ;
        int multiDaus;

//        pintarMapa.pintarMapaCapcelera();
//        pintarMapa.pintarMapaIntemig();
//        pintarMapa.pintarMapaFooter();
//        System.out.println("-----------");

        do {
            System.out.println("Amb quants daus vols jugar?? --> \n--------------\n [1] o [2] \n--------------\nIntrodueix la sel·lecció --> ");
            qDaus = t.next().charAt(0);
        }while (qDaus != '1' && qDaus != '2');

        if (qDaus == '1') {
            multiDaus = dausAleeatoris.shoot1Dau();
        } else {
            multiDaus = dausAleeatoris.shoot2Daus();
        }



    }
}
