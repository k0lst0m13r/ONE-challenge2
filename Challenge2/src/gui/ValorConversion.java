package gui;

import javax.swing.JOptionPane;

public class ValorConversion {
    
    public static void conversion(double total, String valor) {
        
        JOptionPane.showMessageDialog(null, "El valor equivale a " + String.format("%.2f", total) + " " +  valor , "Valor convertido", JOptionPane.DEFAULT_OPTION);
        
       
            Continuar.continuar();
        
    }

}
