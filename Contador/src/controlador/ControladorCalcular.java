
package controlador;

import datos.DAOContador;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class ControladorCalcular implements MouseListener {
    
    private DAOContador daocontador;
    private JTextField palabra1;
    private JTextField palabra2;
    private JTextField SumaCaracteres;
    
    
    public ControladorCalcular(JTextField txtPalabra1, JTextField txtPalabra2, JTextField txtSumaCaracteres) {
       this.palabra1 = txtPalabra1;
       this.palabra2 = txtPalabra2;
       this.SumaCaracteres = txtSumaCaracteres;
       
        this.daocontador = new DAOContador(this.palabra1,this.palabra2);
              
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        SumaCaracteres.setText(daocontador.CalcularPalabratotal().toString());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
