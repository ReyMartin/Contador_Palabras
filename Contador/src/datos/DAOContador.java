
package datos;

import javax.swing.JTextField;


public class DAOContador {
  private JTextField palabra1;
  private JTextField palabra2;
  
  

    

    public DAOContador(JTextField palabra1, JTextField palabra2) {
        this.palabra1 = palabra1;
        this.palabra2 = palabra2;
    }

    public Integer CalcularPalabratotal(){
     Integer palabratotal = palabra1.getText().length() + palabra2.getText().length();
        return palabratotal;
    }
}



