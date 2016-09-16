/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author anunez12
 */
public class Helper { 
   public static  void mensaje(Component Ventana,String Mensaje,int tipo){ 
    switch(tipo){ 
        case 1: 
            JOptionPane.showMessageDialog(Ventana,Mensaje,"Informacion",JOptionPane.INFORMATION_MESSAGE);
        break; 
        case 2: 
            JOptionPane.showMessageDialog(Ventana, Mensaje,"Advertencia",JOptionPane.WARNING_MESSAGE); 
        break; 
        case 3: 
            JOptionPane.showMessageDialog(Ventana, Mensaje,"Error",JOptionPane.ERROR_MESSAGE); 
        break;
    }
    
   }
    
}
