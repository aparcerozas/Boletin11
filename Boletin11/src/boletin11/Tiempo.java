/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author aparcerozas
 */
public class Tiempo {
    public void fraseTiempo(){
        String tecla = JOptionPane.showInputDialog("PRESIONE * PARA INICIAR:");
        if("*".equals(tecla)){
            Date inicio = new Date();
            String frase = JOptionPane.showInputDialog("ESCRIBA A SEGUINTE FRASE:\n"
                + "A documentación é todo aquel conxunto de manuais"
                + " impresos ou en formato dixital que explique unha "
                + "aplicación informática");
            if(frase.equals("A documentación é todo aquel conxunto de manuais"
                + " impresos ou en formato dixital que explique unha"
                + " aplicación informática")){
            Date fin = new Date();
            long tiempo = ((fin.getTime() - inicio.getTime())/1000);
            JOptionPane.showMessageDialog(null, "TARDACHES " + tiempo + " SEGUNDOS EN ESCRIBIR A FRASE");
        }
        else{
            JOptionPane.showMessageDialog(null, "A FRASE NON É CORRECTA");
            this.fraseTiempo();
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "INTÉNTEO DE NOVO");
            this.fraseTiempo();
        }
        
    }
    
}
