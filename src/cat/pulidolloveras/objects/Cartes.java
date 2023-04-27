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

    /**
     * @param numCartaUsuari
     * La carta de l'usuari és la carta que introdueix el jugador per teclat, per assignar-li la vida, atac i escut.
     * @param numCartaCpu
     * La carta de la cpu ve de un número generat automàticament, també per assignar-li vida, atac i escut.
     * @param array
     * S'assigna la vida, atac i escut a cada posició d'array per així mostrar-ho correctament i de manera fàcil al main.
     */
    public static void assignarCartes(int numCartaUsuari, int numCartaCpu, int[] array){
        int vida_usuari = Cartes.arrayCartes.get(numCartaUsuari - 1).getVida() * Cartes.arrayCartes.get(numCartaUsuari - 1).getEscudo();
        int atac_usuari = Cartes.arrayCartes.get(numCartaUsuari - 1).getAtac();
        int escut_usuari = Cartes.arrayCartes.get(numCartaUsuari - 1).getEscudo();

        int vida_cpu = Cartes.arrayCartes.get(numCartaCpu - 1).getVida() * Cartes.arrayCartes.get(numCartaCpu - 1).getEscudo();
        int atac_cpu= Cartes.arrayCartes.get(numCartaCpu - 1).getAtac();
        int escut_cpu = Cartes.arrayCartes.get(numCartaCpu - 1).getEscudo();

        System.out.println("La carta del usuari és: " + numCartaUsuari);
        System.out.println("La carta de la cpu és: " + numCartaCpu);

        array[0] = vida_usuari;
        array[1] = atac_usuari;
        array[2] = escut_usuari;
        array[3] = vida_cpu;
        array[4] = atac_cpu;
        array[5] = escut_cpu;
        }
    }


