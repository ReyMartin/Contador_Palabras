

package visual;

import controlador.ControladorWindowsContador;
import controlador.ControladorCalcular;
import java.awt.GridLayout;
import javax.swing.*;


public class Contador extends JFrame {
    
    private JLabel lblPalabra1 = new JLabel("Palabra: 1");
    private JLabel lblPalabra2 = new JLabel("Palabra: 2");
    private JLabel lblSumaCaracteres = new JLabel("Suma de los caracteres de las 2 palabras");
    private JTextField txtPalabra1 = new JTextField("");
    private JTextField txtPalabra2 = new JTextField("");
    private JTextField txtSumaCaracteres = new JTextField("");
    private GridLayout contenedor =  new GridLayout(2,2);
    private JButton calcular = new JButton ("Calcular");
    private ControladorWindowsContador controladorWindowsContador = new ControladorWindowsContador(); 
    private ControladorCalcular controladorCalcular = new ControladorCalcular(txtPalabra1, txtPalabra2, txtSumaCaracteres);
    
    


public Contador(){
        this.setLayout(contenedor);
        this.agregarComponentes();
        this.setTitle("Contador de caracteres");
        this.setLocation(500, 300);
        this.setSize(400, 200);
        this.setVisible(true);
        this.calcular.addMouseListener(controladorCalcular);
        this.addWindowListener(controladorWindowsContador);
}

public void agregarComponentes(){
this.add(lblPalabra1);
this.add(txtPalabra1);
this.add(lblPalabra2);
this.add(txtPalabra2);
this.add(lblSumaCaracteres);
this.add(txtSumaCaracteres);
this.add(calcular);
}
}