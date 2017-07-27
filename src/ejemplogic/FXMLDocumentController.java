/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogic;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import modelo.Persona;

/**
 *
 * @author admin-lcg
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private TextField txtf1;
    @FXML
    private TextField txtf2;
  
    LinkedList<Persona> listaE;
    @FXML
    private Button bt1;
    @FXML
    private Button bt2;


    @FXML
    private void bt1 (ActionEvent event) {
        String nombre = txtf1.getText();
        String apellido = txtf2.getText();

        Persona objE = new Persona(nombre, apellido);
        boolean guardar = listaE.add(objE);

        if (guardar) {
            txtf1.setText("");
            txtf2.setText("");
        }
    }

@FXML
        private void bt2 (ActionEvent event) {
        
        String mostrar="";
        for (int i = 0; i < listaE.size(); i++) {
            mostrar += listaE.get(i)+"\n";
            
        }
        JOptionPane.showMessageDialog(null, mostrar);
    }               
    


    @Override
        public void initialize(URL url, ResourceBundle rb) {
            
                     listaE=new LinkedList<>();

    }    
    
}
