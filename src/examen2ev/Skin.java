package examen2ev;

public class Skin {
    private String nombre;
    private String rareza;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRareza() {
        return rareza;
    }

    public void setRareza(String rareza) {
        this.rareza = rareza;
    }

    public Skin(String nombre, String rareza) {
        this.nombre = nombre;
        this.rareza = rareza;
    }

    @Override
    public String toString() {
        return "Skin [" + "Nombre: " + nombre + ", Rareza: " + rareza + ']';
    }
}
