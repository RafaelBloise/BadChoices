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
public class Tela4Controller extends Observable implements Initializable, Observer {

       @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    void btn1(MouseEvent event) {
        
    }

    @FXML
    void btn2(MouseEvent event) {

    }
    
     private static Tela4Controller instancia;
    

    public static void setInstancia(Tela4Controller instancia) {
        Tela4Controller.instancia = instancia;
    }

    public static Tela4Controller getInstancia() {
        return instancia;
    }  
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    }

    @Override
    public void update(Observable arg0, Object arg1) {
    }
    
}
