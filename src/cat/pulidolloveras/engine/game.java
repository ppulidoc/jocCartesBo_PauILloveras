package cat.pulidolloveras.engine;

import cat.pulidolloveras.objects.Cartes;
import cat.pulidolloveras.ui.UI;
import cat.pulidolloveras.ui.pintarMapa;

import java.util.Scanner;

public class game {
    public static void jugar(String nom, int vida_usuari, int atac_usuari, int escut_usuari, int vida_cpu, int atac_cpu, int escut_cpu){
        pintarMapa.pintarMapaSencer(nom, vida_usuari, atac_usuari, escut_usuari, vida_cpu, atac_cpu, escut_cpu);
        while (vida_usuari > 0 && vida_cpu > 0){
            Scanner teclat = new Scanner(System.in);
            System.out.println();
            System.out.print("Que vols fer: [1].Atacar [2].Fugir: ");
            int eleccio = teclat.nextInt();
            while (eleccio != 1 && eleccio != 2){
                System.out.println("Ha de ser [1].Atacar o [2].Fugir:");
                eleccio = teclat.nextInt();
            }
            if (eleccio == 1){
                int randomSort = (int)(Math.random()*10+1);
                if (randomSort == 3){
                    pintarMapa.pintarMapaSencer(nom, vida_usuari, atac_usuari, escut_usuari, vida_cpu, atac_cpu, escut_cpu);
                    System.out.println();
                    System.out.println("Mala sort, has fallat.");
                } else if (randomSort == 1) {
                    vida_cpu -= (atac_usuari * 2);
                    if (vida_cpu <= 0) {
                        vida_cpu = 0;
                        pintarMapa.pintarMapaSencer(nom, vida_usuari, atac_usuari, escut_usuari, vida_cpu, atac_cpu, escut_cpu);
                        System.out.println();
                        System.out.printf("\nHas guanyat %s", nom);
                        break;
                    } else {
                        pintarMapa.pintarMapaSencer(nom, vida_usuari, atac_usuari, escut_usuari, vida_cpu, atac_cpu, escut_cpu);
                    }
                    System.out.println();
                    System.out.println("Ha sigut un cop crític.");
                } else {
                    vida_cpu -= atac_usuari;
                    if (vida_cpu <= 0) {
                        vida_cpu = 0;
                        pintarMapa.pintarMapaSencer(nom, vida_usuari, atac_usuari, escut_usuari, vida_cpu, atac_cpu, escut_cpu);
                        System.out.println();
                        System.out.printf("\nHas guanyat %s", nom);
                        break;
                    }
                    else {
                        pintarMapa.pintarMapaSencer(nom, vida_usuari, atac_usuari, escut_usuari, vida_cpu, atac_cpu, escut_cpu);
                    }
                    System.out.println();
                    System.out.println("Has golpejat.");
                }

                System.out.println("Tecleji algo per a continuar: ");
                String continuar = teclat.next();

                if (randomSort == 10){
                    pintarMapa.pintarMapaSencer(nom, vida_usuari, atac_usuari, escut_usuari, vida_cpu, atac_cpu, escut_cpu);
                    System.out.println();
                    System.out.println("Has tingut sort, l'enemic ha fallat.");
                } else if (randomSort == 5){
                    vida_usuari -= (atac_cpu * 2);
                    if (vida_usuari <= 0) {
                        vida_usuari = 0;
                        pintarMapa.pintarMapaSencer(nom, vida_usuari, atac_usuari, escut_usuari, vida_cpu, atac_cpu, escut_cpu);
                        System.out.println();
                        System.out.printf("\nHas perdut %s", nom);
                        break;
                    }
                    else {
                        pintarMapa.pintarMapaSencer(nom, vida_usuari, atac_usuari, escut_usuari, vida_cpu, atac_cpu, escut_cpu);
                    }
                    System.out.println();
                    System.out.println("L'enemic t'ha fet un cop crític.");
                } else {
                    vida_usuari -= atac_cpu;
                    if (vida_usuari <= 0) {
                        vida_usuari = 0;
                        pintarMapa.pintarMapaSencer(nom, vida_usuari, atac_usuari, escut_usuari, vida_cpu, atac_cpu, escut_cpu);
                        System.out.println();
                        System.out.printf("\nHas perdut %s", nom);
                        break;
                    }
                    else {
                        pintarMapa.pintarMapaSencer(nom, vida_usuari, atac_usuari, escut_usuari, vida_cpu, atac_cpu, escut_cpu);
                    }
                    System.out.println();
                    System.out.println("T'han golpejat.");
                }
            } else {
                System.out.println("Has fugit, la CPU ha guanyat.");
                break;
            }
        }
    }
}
