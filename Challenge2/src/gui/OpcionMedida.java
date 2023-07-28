package gui;

import javax.swing.JOptionPane;

public class OpcionMedida {
    
    public static void convertir(double cantidad) {
        
        double total;
        String medida;
    
    String[] possibleValues = { "De Centímetros a Pulgadas", "De Metros a Yardas", "De Kilómetros a Millas",
        "De Pulgadas a Centímetros", "De Yardas a Metros", "De Millas a Kilómetros"};

        String selectedValue = (String) JOptionPane.showInputDialog(null,
             "Elija la medida a convertir", "Selección de Medidas",
             JOptionPane.DEFAULT_OPTION, null,
             possibleValues, possibleValues[0]);
        
        if (selectedValue == null){
            
            Salida.finalizar();
            
        } else {
                
            switch(selectedValue){
            
                case "De Centímetros a Pulgadas":
                    total = cantidad * 0.3937;
                    medida = "Pulgadas";
                    ValorConversion.conversion(total, medida);
                    break;
                
                case "De Metros a Yardas":
                    total = cantidad * 1.093;
                    medida = "Yardas";
                    ValorConversion.conversion(total, medida);
                    break;

                case "De Kilómetros a Millas":
                    total = cantidad * 0.6214;
                    medida = "Millas";
                    ValorConversion.conversion(total, medida);
                    break;

                case "De Pulgadas a Centímetros":
                    total = cantidad * 2.54;
                    medida = "Centímetros";
                    ValorConversion.conversion(total, medida);
                    break;

                case "De Yardas a Metros":
                    total = cantidad * 0.9144;
                    medida = "Metros";
                    ValorConversion.conversion(total, medida);
                    break;

                case "De Millas a Kilometros":
                    total = cantidad * 1.609;
                    medida = "Pesos";
                    ValorConversion.conversion(total, medida);
                    break;

            }
        }
    }
    
}
