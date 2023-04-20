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
}

