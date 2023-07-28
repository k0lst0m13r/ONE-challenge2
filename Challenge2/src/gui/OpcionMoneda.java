package gui;

import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

public class OpcionMoneda {
    
    public static void convertir(double cantidad) {
        
        double total;
        String moneda;
    
    String[] possibleValues = { "De Pesos a Dólares", "De Pesos a Euros", "De Pesos a Libras", "De Pesos a Yenes", "De Pesos a Won Coreano", 
        "De Dólares a Pesos", "De Euros a Pesos", "De Libras a Pesos", "De Yenes a Pesos", "De Won Coreano a Pesos"};

        String selectedValue = (String) JOptionPane.showInputDialog(null,
             "Elija la moneda a convertir", "Selección de Monedas",
             JOptionPane.DEFAULT_OPTION, null,
             possibleValues, possibleValues[0]);
        
        if (selectedValue == null){
            
            Salida.finalizar();
        } else {
                
            switch(selectedValue){
            
                case "De Pesos a Dólares":
                    total = cantidad * 0.0037;
                    moneda = "Dolares";
                    ValorConversion.conversion(total, moneda);
                    break;
                
                case "De Pesos a Euros":
                    total = cantidad * 0.0033;
                    moneda = "Euros";
                    ValorConversion.conversion(total, moneda);
                    break;

                case "De Pesos a Libras":
                    total = cantidad * 0.0028;
                    moneda = "Libras";
                    ValorConversion.conversion(total, moneda);
                    break;

                case "De Pesos a Yenes":
                    total = cantidad * 0.0517;
                    moneda = "Yenes";
                    ValorConversion.conversion(total, moneda);
                    break;

                case "De Pesos a Won Coreano":
                    total = cantidad * 4.6866;
                    moneda = "Won Coreano";
                    ValorConversion.conversion(total, moneda);
                    break;

                case "De Dólares a Pesos":
                    total = cantidad / 0.0037;
                    moneda = "Pesos";
                    ValorConversion.conversion(total, moneda);
                    break;

                case "De Euros a Pesos":
                    total = cantidad / 0.0033;
                    moneda = "Pesos";
                    ValorConversion.conversion(total, moneda);
                    break;

                case "De Libras a Pesos":
                    total = cantidad / 0.0028;
                    moneda = "Pesos";
                    ValorConversion.conversion(total, moneda);
                    break;

                case "De Yenes a Pesos":
                    total = cantidad / 0.0517;
                    moneda = "Pesos";
                    ValorConversion.conversion(total, moneda);
                    break;

                case "De Won Coreano a Pesos":
                    total = cantidad / 4.6866;
                    moneda = "Pesos";
                    ValorConversion.conversion(total, moneda);
                    break;
            }
        }
    }
    
}
