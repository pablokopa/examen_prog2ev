package examen2ev;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FortniteManagerImpl implements FortniteManager{
    
    // ArrayList armas y skins
    private ArrayList<Arma> armas;
    private ArrayList<Skin> skins;

    // Constructor general (armas y skins)
    public FortniteManagerImpl() {
        this.armas = new ArrayList<>();
        this.skins = new ArrayList<>();
        iniciarListaArmas();
        iniciarListaSkins();
    }
    
    
    
/* APARTADO ARMAS */ 
    // Iniciar lista predefinida de armas
    public void iniciarListaArmas() {
        armas.add(new Arma("Pistola", 20));
        armas.add(new Arma("Fusil", 45));
        armas.add(new Arma("Escopeta", 150));
    }
    
    // Método para añadir armas al arraylist
    @Override
    public void agregarArma(Arma arma){
        armas.add(arma);
    }

    // Método para eliminar armas del arraylist
    @Override
    public void eliminarArma(String tipo) {
        for (Arma arma : armas) {
            if (arma.getTipo().equalsIgnoreCase(tipo)) {
                armas.remove(tipo);
                JOptionPane.showMessageDialog(null, "Armas de tipo "+tipo+" eliminadas");
                return;
            }
    } JOptionPane.showMessageDialog(null, "Armas de tipo "+tipo+" no encontradas");}
       
    // Método para buscar armas dependiendo de su tipo
    @Override
    public void buscarArmaPorTipo(String tipo) {
        for (Arma arma : armas) {
            if (arma.getTipo().equalsIgnoreCase(tipo)) {
                JOptionPane.showMessageDialog(null, arma.toString());
                return;
            }
    } JOptionPane.showMessageDialog(null, "Armas no encontradas");}

    
    
/* APARTADO SKINS */    
    // Iniciar lista predefinida de skins
    public void iniciarListaSkins() {
        skins.add(new Skin("Lineas", "Comun"));
        skins.add(new Skin("Estrellada", "Epica"));
        skins.add(new Skin("Comic", "Legendaria"));
    }
    
    // Método para añadir skins al arraylist
    @Override
    public void agregarSkin(Skin skin){
        skins.add(skin);
    }
    
    // Método para eliminar skins del arraylist
    @Override
    public void eliminarSkin(String nombre){
        for (Skin skin : skins) {
            if (skin.getNombre().equalsIgnoreCase(nombre)) {
                skins.remove(nombre);
                JOptionPane.showMessageDialog(null, "Skin con nombre "+nombre+" eliminada");
                return;
            }
    } JOptionPane.showMessageDialog(null, "Skin con nombre "+nombre+" no encontrada");}
    
    // Método para buscar skins dependiendo de su rareza
    @Override
    public void mostrarSkinPorRareza(String rareza) {
        for (Skin skin : skins) {
            if (skin.getRareza().equalsIgnoreCase(rareza)) {
                JOptionPane.showMessageDialog(null, skin.toString());
                return;
            }
    } JOptionPane.showMessageDialog(null, "Skins no encontradas");}
}
