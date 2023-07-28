package gui;

import javax.swing.JOptionPane;

public class Menu {
    
    public static void TipoConversion() {
    
    Object[] possibleValues = { "Conversor de Moneda" , "Conversor de Medida" };

        Object selectedValue = JOptionPane.showInputDialog(null,
             "Seleccione una opción de conversión", "Menu",
             JOptionPane.DEFAULT_OPTION, null,
             possibleValues, possibleValues[0]);
        
        if (selectedValue != null) {
            
            if (selectedValue.equals("Conversor de Moneda")) {
                
                IngresoValor.valor("moneda");
                
            } else {
                
                IngresoValor.valor("medida");

            }    
            
        } else {
        
            Salida.finalizar();
            
            
        }
    }
}
