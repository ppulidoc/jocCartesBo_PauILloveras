package cat.pulidolloveras.objects;

public abstract class CartaEscudo extends Cartes {
    public CartaEscudo(String nom, int atac, int vida, int escudo) {

        super(nom, atac, vida, escudo);
    }

    @Override
    public int getVida() {
        return super.getVida() * this.getEscudo();
    }
}
