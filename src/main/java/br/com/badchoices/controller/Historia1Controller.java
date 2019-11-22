/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.badchoices.controller;

import br.com.badchoices.StartApplication;
import br.com.badchoices.enumm.TelasEnum;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import org.springframework.stereotype.Component;

/**
 * FXML Controller class
 *
 * @author rafael
 */
@Component
public class Historia1Controller implements Initializable {

    
      @FXML
    private Button avancar;

    @FXML
    void avancar(MouseEvent event) {
        StartApplication.mudarTela(TelasEnum.TELA1);
    }
    
    
    
    
    
    
    
     private static Historia1Controller instancia;
    

    public static void setInstancia(Historia1Controller instancia) {
        Historia1Controller.instancia = instancia;
    }

    public static Historia1Controller getInstancia() {
        return instancia;
    }  
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
