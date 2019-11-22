/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.badchoices.controller;

import br.com.badchoices.StartApplication;
import br.com.badchoices.bean.Usuario;
import br.com.badchoices.bo.UsuarioBo;
import br.com.badchoices.enumm.TelasEnum;
import br.com.badchoices.exception.SistemaErroException;
import br.com.badchoices.util.Util;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.util.Observable;
import java.util.Observer;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author rafael
 */
@Component
public class LoginController extends Observable implements Initializable, Observer {

    @FXML
    private TextField txtEmail;

    @FXML
    private PasswordField txtSenha;

    @FXML
    private Button entrar;
    @FXML
    private Button registrar;

    @Autowired
    private UsuarioBo usuarioBo;

    private static Usuario usuario;

    private static LoginController instancia;

    public static void setInstancia(LoginController instancia) {
        LoginController.instancia = instancia;
    }

    public static LoginController getInstancia() {
        return instancia;
    }

    public static void setUsuarioLogado(Usuario usuario) {
        LoginController.usuario = usuario;
    }

    public static Usuario getUsuarioLogado() {
        return usuario;
    }

      @FXML
    void registrar() {
        
         addObserver(LoginDefinirSenhaController.getInstancia());
                setChanged();
                // notifyObservers(usuario);
                StartApplication.mudarTela(TelasEnum.DEFINIR_SENHA);
        
    }

    @FXML
    void registrarLogin(KeyEvent event) {
        if (event.getCode().equals(KeyCode.ENTER)) {
            registrar();
        }
        
    }
    
    
    @FXML
    void enterLogin(KeyEvent evento) throws NoSuchAlgorithmException {
        if (evento.getCode().equals(KeyCode.ENTER)) {
            login();
        }

    }

    @FXML
    void login() throws NoSuchAlgorithmException {

        try {
            usuario = usuarioBo.login(txtEmail.getText(), txtSenha.getText());
            System.out.println(usuario.getEmail());
            System.out.println(usuario.getSenha());

            if (usuarioBo.isNewUsuario(usuario)) {
               
            } else {
                setUsuarioLogado(usuario);
                StartApplication.abrirTelasIniciais();
                addObserver(FormularioController.getInstancia());
                setChanged();
                notifyObservers();
            }

        } catch (SistemaErroException ex) {
            Util.AlertDialog("Falha ao logar",
                    ex.getMessage(),
                    Alert.AlertType.ERROR)
                    .showAndWait();
        }

    }

     @FXML
    public void sair() {
        StartApplication.sairDoSistema();
    }

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @Override
    public void update(Observable arg0, Object arg1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
