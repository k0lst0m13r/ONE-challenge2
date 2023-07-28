package gui;

import challenge2.Conversor;
import javax.swing.JOptionPane;

/**
 *
 * @author tete
 */
public class Continuar {
    
    public static void continuar(){
        
        int opcion = JOptionPane.showConfirmDialog(null,
             "¿Desea continuar?", "Seleccione una opcion", JOptionPane.YES_NO_OPTION);
              
        
        if (opcion == 0) {
            Conversor.conversor();       
        } else {
            Salida.finalizar();
        }
        
    }
    
}
