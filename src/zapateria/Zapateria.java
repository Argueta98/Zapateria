/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zapateria;


import Examen.View.Principal;
import Examen.View.inicio;
import java.awt.Dimension;
import java.awt.Toolkit;


public class Zapateria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                   Principal prin = new Principal();
                    Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();  
                    //obtenemos el tamaño de la ventana  
                    Dimension ventana = prin.getSize();  
                    //para centrar la ventana lo hacemos con el siguiente calculo  
                    prin.setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);  
                    prin.setVisible(true);
                    
            }
        });
    }
        
    
}
