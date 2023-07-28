package gui;

import javax.swing.JOptionPane;

public class IngresoValor {
    
    public static void valor(String tipo) {
        
        String input = JOptionPane.showInputDialog(null,"Ingrese un valor a convertir", "",JOptionPane.DEFAULT_OPTION);       
        
        if (input == null) {
            Salida.finalizar();
        } else {
            
            try {
                
                double valor = Double.parseDouble(input);
                
                if (tipo == "moneda") {
                    
                    OpcionMoneda.convertir(valor);
                    
                } else {
                    
                    OpcionMedida.convertir(valor);
                    
                }                
      
            } catch (NumberFormatException e) {
            
            ManejoError.mensajeError();        
            valor(tipo);       
           
            }
        }
    }  
}
