/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.badchoices.controller;

import br.com.badchoices.StartApplication;
import br.com.badchoices.bean.Usuario;
import br.com.badchoices.bo.UsuarioBo;
import br.com.badchoices.enumm.SistemaErroEnum;
import br.com.badchoices.enumm.TelasEnum;
import br.com.badchoices.exception.AvoidDuplicationEmailException;
import br.com.badchoices.exception.SistemaErroException;
import br.com.badchoices.util.Util;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * FXML Controller class
 *
 * @author Rafael Bloise
 */
@Component
public class LoginDefinirSenhaController implements Initializable, Observer {

    @Autowired
    private UsuarioBo usuarioBo;

    @FXML
    private TextField txtEmail;

    @FXML
    private PasswordField txtSenhaConfirmacao;

    @FXML
    private PasswordField txtSenha;

    private Usuario usuario;

    private static LoginDefinirSenhaController instancia;

    public static void setInstancia(LoginDefinirSenhaController instancia) {
        LoginDefinirSenhaController.instancia = instancia;
    }

    public static LoginDefinirSenhaController getInstancia() {
        return instancia;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    private boolean validarSenhas(String senha1, String senha2) throws SistemaErroException {

        if (!senha1.equals(senha2)) {
            throw new SistemaErroException(SistemaErroEnum.SENHAS_NAO_CONFEREM);
        }
           System.out.println("Aqui...");
                   
        return true;
    }

    @FXML
    void voltar() {
        StartApplication.mudarTela(TelasEnum.LOGIN);
    }

    @FXML
    void registrar() throws NoSuchAlgorithmException, AvoidDuplicationEmailException {

        try {
            validarSenhas(txtSenha.getText(), txtSenhaConfirmacao.getText());
            
            usuario = new Usuario();
            
            if(txtEmail.getText().isBlank() || txtEmail.getText().isEmpty()){
            Util.AlertDialog("ERRO!", "Preencha o campo de email! ", Alert.AlertType.INFORMATION).show();
                
            }else if(txtSenha.getText().isBlank() || txtSenha.getText().isEmpty()){
                
            Util.AlertDialog("ERRO!", "Informe a senha de acesso! ", Alert.AlertType.INFORMATION).show();
            }else if(txtSenhaConfirmacao.getText().isBlank() || txtSenhaConfirmacao.getText().isEmpty()){
                
            Util.AlertDialog("ERRO!", "Confirme sua senha! ", Alert.AlertType.INFORMATION).show();
            }else{
            usuario.setEmail(txtEmail.getText());
            usuario.setSenhaMD5(Util.md5(txtSenha.getText()));
            usuario.setUltimoAcesso(new Date());
            usuarioBo.save(usuario);
            clearLabels();
                
            Util.AlertDialog("SUCESSO!", "Você foi cadastrado com sucesso! ", Alert.AlertType.INFORMATION).show();
            voltar();
            }

            
            //StartApplication.abrirTelasIniciais();

        } catch (SistemaErroException e) {
            Util.AlertDialog("Senhas não conferem", e.getMessage(), Alert.AlertType.ERROR).show();
        }

    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof LoginController && arg instanceof Usuario) {
            usuario = (Usuario) arg;
        }

    }
    
    void clearLabels(){
        txtEmail.clear();
        txtSenha.clear();
        txtSenhaConfirmacao.clear();
    }

}
