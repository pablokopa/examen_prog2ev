package examen2ev;

public interface FortniteManager {
    public void agregarArma(Arma arma);
    public void agregarSkin(Skin skin);
    public void buscarArmaPorTipo(String tipo);
    public void mostrarSkinPorRareza(String rareza);
    public void eliminarArma(String tipo);
    public void eliminarSkin(String nombre);
}
