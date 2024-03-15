package examen2ev;
import javax.swing.JOptionPane;

public class Examen2EV {
    public static void main(String[] args) {
        FortniteManagerImpl FortniteMNG = new FortniteManagerImpl();
        
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                  Escoge una opción:
                                                                  
                                                                  1. Agregar arma al inventario 
                                                                  2. Agregar skin al inventario
                                                                  3. Buscar arma y mostrar información
                                                                  4. Mostrar todas las skins con una rareza específica
                                                                  5. Eliminar arma del inventario por tipo
                                                                  6. Eliminar skin del inventario por nombre
                                                                  
                                                                  0. Salir
                                                                  
                                                                  Ingrese una opcion:
                                                                  """));
            switch(opcion){
                case 1: // Agregar arma
                    FortniteMNG.agregarArma(new Arma (JOptionPane.showInputDialog("Ingrese el tipo de arma: "), Integer.parseInt(JOptionPane.showInputDialog("Ingrese el daño del arma"))));
                    break;
                case 2: // Agregar skin
                    FortniteMNG.agregarSkin(new Skin (JOptionPane.showInputDialog("Ingrese el nombre de la skin: "), JOptionPane.showInputDialog("Ingrese la rareza de la skin")));
                    break;
                case 3: // Mostrar información por tipo
                    FortniteMNG.buscarArmaPorTipo(JOptionPane.showInputDialog("Ingrese el tipo de arma:\n\n- Fusil\n- Escopeta\n- Pistola"));
                    break;
                case 4: // Mostrar skin por rareza
                    FortniteMNG.mostrarSkinPorRareza(JOptionPane.showInputDialog("Ingrese la rareza de la skin:\n\n- Comun\n- Epica\n- Legendaria"));
                    break;
                case 5: // Eliminar arma
                    FortniteMNG.eliminarArma(JOptionPane.showInputDialog("Ingrese el tipo de arma que desea eliminar: "));
                    break;
                case 6: // Eliminar skin
                    FortniteMNG.eliminarSkin(JOptionPane.showInputDialog("Ingrese el nombre de la skin que desea eliminar: "));
                    break;
                case 0: // Cortar ejecución
                    opcion = JOptionPane.showConfirmDialog(null, "¿Desea terminar la ejecución?");
                    break;
                default: // Default (por si se escoge una opción no válida)
                    JOptionPane.showMessageDialog(null, "Opción no válida. Pruebe otra vez");
                    break;
            }
        } while (opcion != 0);
    }
}
