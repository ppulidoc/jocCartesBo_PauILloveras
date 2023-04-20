package cat.pulidolloveras.init;
import cat.pulidolloveras.IO.leerFicher;
import cat.pulidolloveras.engine.dausAleeatoris;
import cat.pulidolloveras.objects.Cartes;

import java.io.IOException;
import java.util.Scanner;
public class main {
    public static Scanner t = new Scanner(System.in);
//HEM DE FER LO DEL JAVADOC
    public static void main(String[] args) throws IOException {

        Cartes carta1 = new Cartes("Carta1", 150, 20, (int)(Math.random()*10+1));
        Cartes carta2 = new Cartes("Carta2", 120, 25, (int)(Math.random()*10+1));
        Cartes carta3 = new Cartes("Carta3", 170, 15, (int)(Math.random()*10+1));
        Cartes carta4 = new Cartes("Carta4", 100, 30, (int)(Math.random()*10+1));
        Cartes carta5 = new Cartes("Carta5", 200, 10, (int)(Math.random()*10+1));
        Cartes carta6 = new Cartes("Carta6", 190, 23, (int)(Math.random()*10+1));
        Cartes carta7 = new Cartes("Carta7", 154, 19, (int)(Math.random()*10+1));
        Cartes carta8 = new Cartes("Carta8", 132, 27, (int)(Math.random()*10+1));
        Cartes carta9 = new Cartes("Carta9", 121, 29, (int)(Math.random()*10+1));
        Cartes.arrayCartes.add(carta1);
        Cartes.arrayCartes.add(carta2);
        Cartes.arrayCartes.add(carta3);
        Cartes.arrayCartes.add(carta4);
        Cartes.arrayCartes.add(carta5);
        Cartes.arrayCartes.add(carta6);
        Cartes.arrayCartes.add(carta7);
        Cartes.arrayCartes.add(carta8);
        Cartes.arrayCartes.add(carta9);

        char seleIni = ' ';
        char qDaus = ' ' ;
        int multiDaus;

 //-------------------------------------------------------------------------------------------------------
        leerFicher.muestraTitulo("C:\\Users\\arnau\\IdeaProjects\\jocCartesBo_PauILloveras\\src\\cat\\pulidolloveras\\file\\titol");
        do {
            System.out.println("\nSeleccione su opcion --> \n[1]. Leer Instrucciones" +
                    "\n[2]. Empezar a jugar" +
                    "\n[3]. Exit \n");

            seleIni =t.next().charAt(0);
        } while (seleIni != '1' && seleIni != '2' & seleIni != '3');
        if (seleIni == '1'){
            leerFicher.muestraInstrucciones("C:\\Users\\arnau\\IdeaProjects\\jocCartesBo_PauILloveras\\src\\cat\\pulidolloveras\\file\\Instrucciones");
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
