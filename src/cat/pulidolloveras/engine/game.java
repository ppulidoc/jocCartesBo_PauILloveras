package cat.pulidolloveras.engine;

import cat.pulidolloveras.ui.UI;

import java.util.Scanner;

public class game {
    public static void jugar(int vida_usuari, int atac_usuari, int vida_cpu, int atac_cpu){
        while (vida_usuari > 0 && vida_cpu > 0){
            Scanner teclat = new Scanner(System.in);
            System.out.print("Que vols fer: [1].Atacar [2].Fugir: ");
            int eleccio = teclat.nextInt();
            while (eleccio < 1 || eleccio > 2){
                System.out.println("Ha de ser [1].Atacar o [2].Fugir:");
                eleccio = teclat.nextInt();
            }
            if (eleccio == 1){
                int randomSort = (int)(Math.random()*10+1);
                if (randomSort == 3){
                    System.out.println("Mala sort, has fallat.");
                } else if (randomSort == 1){
                    System.out.println("Ha sigut un cop crític.");
                    vida_cpu -= (atac_usuari*2);
                    if (vida_cpu < 0){
                        System.out.println("Has guanyat.");
                        break;
                    }
                    else System.out.println("La vida del oponent és: " + vida_cpu);
                } else {
                    System.out.println("Has golpejat.");
                    vida_cpu -= atac_usuari;
                    if (vida_cpu < 0) {
                        System.out.println("Has guanyat.");
                        break;
                    }
                    else System.out.println("La vida del oponent és: " + vida_cpu);
                }

                if (randomSort == 10){
                    System.out.println("Has tingut sort, l'enemic ha fallat.");
                } else if (randomSort == 5){
                    System.out.println("L'enemic t'ha fet un cop crític.");
                    vida_usuari -= (atac_cpu * 2);
                    if (vida_usuari < 0) {
                        System.out.println("Has perdut.");
                        break;
                    }
                    else System.out.println("La teva vida és: " + vida_usuari);
                } else {
                    System.out.println("T'han golpejat.");
                    vida_usuari -= atac_cpu;
                    if (vida_usuari < 0) {
                        System.out.println("Has perdut.");
                        break;
                    }
                    else System.out.println("La teva vida és: " + vida_usuari);
                }
            } else if (eleccio == 2){
                System.out.println("Has fugit, la CPU ha guanyat.");
                break;
            }
        }
    }
}
