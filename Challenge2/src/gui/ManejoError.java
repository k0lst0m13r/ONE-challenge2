package gui;

import javax.swing.JOptionPane;

public class ManejoError {
    
    public static void mensajeError() {
        
        Object[] options = { "OK" };
            JOptionPane.showOptionDialog(null, "Ingrese un valor numérico", "Error",
             JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
             null, options, options[0]);
        
    }
    
}
