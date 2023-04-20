package cat.pulidolloveras.init;
import cat.pulidolloveras.IO.leerFicher;
import cat.pulidolloveras.engine.dausAleeatoris;
import cat.pulidolloveras.engine.game;
import cat.pulidolloveras.objects.Cartes;

import java.io.IOException;
import java.util.Scanner;
public class main {
    public static Scanner t = new Scanner(System.in);
//HEM DE FER LO DEL JAVADOC
    public static void main(String[] args) throws IOException {

        Cartes carta1 = new Cartes("Carta1", 150, 20, (int)(Math.random()*5+1));
        Cartes carta2 = new Cartes("Carta2", 120, 25, (int)(Math.random()*5+1));
        Cartes carta3 = new Cartes("Carta3", 170, 15, (int)(Math.random()*5+1));
        Cartes carta4 = new Cartes("Carta4", 100, 30, (int)(Math.random()*5+1));
        Cartes carta5 = new Cartes("Carta5", 200, 10, (int)(Math.random()*5+1));
        Cartes carta6 = new Cartes("Carta6", 190, 23, (int)(Math.random()*5+1));
        Cartes carta7 = new Cartes("Carta7", 154, 19, (int)(Math.random()*5+1));
        Cartes carta8 = new Cartes("Carta8", 132, 27, (int)(Math.random()*5+1));
        Cartes carta9 = new Cartes("Carta9", 121, 29, (int)(Math.random()*5+1));
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
        leerFicher.muestraTitulo("C:\\Users\\arnau_sq0x0sm\\Desktop\\DAM\\M03 - Programació\\UF4\\jocCartesBo_PauILloveras\\src\\cat\\pulidolloveras\\file\\titol");
        do {
            System.out.println("\nSeleccione su opcion --> \n[1]. Leer Instrucciones" +
                    "\n[2]. Empezar a jugar" +
                    "\n[3]. Exit \n");

            seleIni =t.next().charAt(0);
        } while (seleIni != '1' && seleIni != '2' & seleIni != '3');
        if (seleIni == '1'){
            leerFicher.muestraInstrucciones("C:\\Users\\arnau_sq0x0sm\\Desktop\\DAM\\M03 - Programació\\UF4\\jocCartesBo_PauILloveras\\src\\cat\\pulidolloveras\\file\\Instrucciones");
        } else if (seleIni == '2'){
            System.out.print("Tria una carta del 1 al 10: ");
            int carta_usuari = t.nextInt();
            while (carta_usuari < 1 || carta_usuari > 9){
                System.out.println("Has de triar un número entre el 1 i el 9: ");
                carta_usuari = t.nextInt();
            }
            int carta_cpu = (int)(Math.random()*9+1);
            while (carta_cpu == carta_usuari || carta_cpu < 1 || carta_cpu > 9){
                carta_cpu = (int)(Math.random()*9+1);
            }
            int[] assignacio = new int[6];
            Cartes.assignarCartes(carta_usuari, carta_cpu, assignacio);
            int vida_usuari = assignacio[0];
            int atac_usuari = assignacio[1];
            int escut_usuari = assignacio[2];

            int vida_cpu = assignacio[3];
            int atac_cpu = assignacio[4];
            int escut_cpu = assignacio[5];

            game.jugar(vida_usuari, atac_usuari, escut_usuari, vida_cpu, atac_cpu, escut_cpu);
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
