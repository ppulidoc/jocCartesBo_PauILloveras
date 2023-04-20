package cat.pulidolloveras.init;
import cat.pulidolloveras.IO.leerFicher;
import cat.pulidolloveras.engine.dausAleeatoris;

import java.io.IOException;
import java.util.Scanner;
public class main {
    public static Scanner t = new Scanner(System.in);
//HEM DE FER LO DEL JAVADOC
    public static void main(String[] args) throws IOException {
        char seleIni = ' ';
        char qDaus = ' ' ;
        int multiDaus;

 //-------------------------------------------------------------------------------------------------------
        leerFicher.muestraTitulo("D:\\proj_src\\src\\cat\\pulidolloveras\\file\\titol");
        do {
            System.out.println("\nSeleccione su opcion --> \n[1]. Leer Instrucciones" +
                    "\n[2]. Empezar a jugar" +
                    "\n[3]. Exit \n");

            seleIni =t.next().charAt(0);
        } while (seleIni != '1' && seleIni != '2' & seleIni != '3');
        if (seleIni == '1'){
            leerFicher.muestraInstrucciones("D:\\proj_src\\src\\cat\\pulidolloveras\\file\\Instrucciones");
        }















        do {
            System.out.println("Amb quants daus vols jugar?? --> \n--------------\n [1] o [2] \n--------------\nIntrodueix la sel·lecció --> ");
            qDaus = t.next().charAt(0);
        }while (qDaus != '1' && qDaus != '2');

        if (qDaus == '1') {
            multiDaus = dausAleeatoris.shoot1Dau();
        } else {
            multiDaus = dausAleeatoris.shoot2Daus();
        }
//-------------------------------------------------------------------------------------------------------
        // pintarMapa.pintarMapaCapcelera();
//        pintarMapa.pintarMapaIntemig();
//        pintarMapa.pintarMapaFooter();
//        System.out.println("-----------");


    }
}
