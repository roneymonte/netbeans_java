/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj03_javafxapplication1_olamundo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author roney
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblMensagem;
    private Label btnClick;
    private Label btnLimpar;
    
    @FXML
    private void clicouBotao(ActionEvent event) {
        System.out.println("MSG: o botao foi clicado.");
        lblMensagem.setText("Botao pressionado!");
    }
    
    @FXML
    private void limparTexto(ActionEvent event){
        lblMensagem.setText("");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
