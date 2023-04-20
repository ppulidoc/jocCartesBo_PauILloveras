package cat.pulidolloveras.objects;

import java.util.ArrayList;

public class Cartes {

    private String nom;

    private int vida;

    private int atac;

    private int escudo;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtac() {
        return atac;
    }

    public void setAtac(int atac) {
        this.atac = atac;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public static ArrayList<Cartes> arrayCartes = new ArrayList<>();

    public Cartes(String nom, int vida, int atac, int escudo) {
        this.nom = nom;
        this.vida = vida;
        this.atac = atac;
        this.escudo = escudo;
    }

    public static void assignarCartes(int numCartaUsuari, int numCartaCpu, int[] array){
        int vida_usuari = Cartes.arrayCartes.get(numCartaUsuari - 1).getVida() * Cartes.arrayCartes.get(numCartaUsuari - 1).getEscudo();
        int atac_usuari = Cartes.arrayCartes.get(numCartaUsuari - 1).getAtac();

        int vida_cpu = Cartes.arrayCartes.get(numCartaCpu - 1).getVida() * Cartes.arrayCartes.get(numCartaCpu - 1).getEscudo();
        int atac_cpu= Cartes.arrayCartes.get(numCartaCpu - 1).getAtac();

        System.out.println("La carta del usuari és: " + numCartaUsuari);
        System.out.println("La carta de la cpu és: " + numCartaCpu);

        array[0] = vida_usuari;
        array[1] = atac_usuari;
        array[2] = vida_cpu;
        array[3] = atac_cpu;

        int contador = 0;
        for (int i = 0; i < array.length; i++){
            if (contador == 0) {
                System.out.println("USUARI: ");
                System.out.println("La vida de l'usuari és: " + array[i]);
                contador++;
            } else if (contador == 1){
                System.out.println("L'atac de l'usuari és : " + array[i]);
                System.out.println();
                System.out.println("CPU: ");
                contador++;
            } else if (contador == 2){
                System.out.println("La vida de la CPU és: " + array[i]);
                contador++;
            } else {
                System.out.println("L'atac de la CPU és: " + array[i]);
            }
        }
    }
}

