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
 *
 * @author rafael
 */
@Component
public class Prologo7Controller extends Observable implements Initializable, Observer {

      @FXML
    private Button proximo;

    @FXML
    void proximo(MouseEvent event) {

       StartApplication.mudarTela(TelasEnum.HISTORIA1);
        
    }

    private static Prologo7Controller instancia;
    

    public static void setInstancia(Prologo7Controller instancia) {
        Prologo7Controller.instancia = instancia;
    }

    public static Prologo7Controller getInstancia() {
        return instancia;
    }    
    
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    }

    @Override
    public void update(Observable arg0, Object arg1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
