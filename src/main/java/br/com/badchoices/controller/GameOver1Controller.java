/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.badchoices.controller;

import java.net.URL;
import java.util.Observable;
import java.util.Observer;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import org.springframework.stereotype.Component;

/**
 *
 * @author rafael
 */
@Component
public class GameOver1Controller extends Observable implements Initializable, Observer {

    
    
    
      
     private static GameOver1Controller instancia;
    

    public static void setInstancia(GameOver1Controller instancia) {
        GameOver1Controller.instancia = instancia;
    }

    public static GameOver1Controller getInstancia() {
        return instancia;
    }  
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    }

    @Override
    public void update(Observable arg0, Object arg1) {
    }
    
}
