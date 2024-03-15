package examen2ev;

public class Arma {
    String tipo;
    private int daño;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public Arma(String tipo, int daño) {
        this.tipo = tipo;
        this.daño = daño;
    }

    @Override
    public String toString() {
        return "Arma [" + "Tipo: " + tipo + ", Da\u00f1o: " + daño + ']';
    }
}
