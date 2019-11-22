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
public class Tela1Controller extends Observable implements Initializable, Observer {

       @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    void btn1(MouseEvent event) {
        StartApplication.mudarTela(TelasEnum.GAMEOVER1);
    }

    @FXML
    void btn2(MouseEvent event) {
        StartApplication.mudarTela(TelasEnum.TELA2);
    }
    
     private static Tela1Controller instancia;
    

    public static void setInstancia(Tela1Controller instancia) {
        Tela1Controller.instancia = instancia;
    }

    public static Tela1Controller getInstancia() {
        return instancia;
    }    
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    }

    @Override
    public void update(Observable arg0, Object arg1) {
    }
    
}
