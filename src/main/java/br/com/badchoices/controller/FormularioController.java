/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.badchoices.controller;

import br.com.badchoices.StartApplication;
import br.com.badchoices.enumm.TelasEnum;
import java.net.URL;
import java.util.Observable;
import java.util.Observer;
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
public class FormularioController extends Observable implements Initializable, Observer{

   
   
    @FXML
    private Button iniciar;

    @FXML
    void iniciar(MouseEvent event) {
        StartApplication.mudarTela(TelasEnum.PROLOGO1);
    }

    private static FormularioController instancia;
    

    public static void setInstancia(FormularioController instancia) {
        FormularioController.instancia = instancia;
    }

    public static FormularioController getInstancia() {
        return instancia;
    }    
    
    
    
    
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @Override
    public void update(Observable arg0, Object arg1) {
    }
    
}
