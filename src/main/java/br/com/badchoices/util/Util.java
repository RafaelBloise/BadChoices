/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.badchoices.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DialogPane;
import javafx.scene.control.TextField;
import javafx.stage.StageStyle;

/**
 *
 * @author Matheus Monteiro
 */
public class Util {

    /**
     * Método estático (static) que converte uma string qualquer em um arquivo
     * hash de criptografia MD5, gerando 32 algarismos.<br /> Impossível reaver
     * o arquivo após sua criptografia.
     *
     * @param senha String de qualquer tamanho;
     * @return String Retorna um arquivo criptografado no formato MD5.
     * @exception NoSuchAlgorithmException Esta exceção é lançada quando um
     * determinado algoritmo criptográfico é solicitadas, mas não está
     * disponível no ambiente.
     */
    public static String md5(String senha) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        BigInteger hash = new BigInteger(1, md.digest(senha.getBytes()));
        String hash2 = hash.toString(16);
        if (hash2.length() < 32) {
            int max = 32 - hash2.length();
            for (int i = 0; i < max; i++) {
                hash2 = "0" + hash2;
            }
        }
        return hash2;
    }

    /**
     * Função retorna a diferença em dias enre o intervalo de data1 e data2.
     *
     * @param date1 Date
     * @param date2 Date esse parâmetro deve ser maior que o primeiro caso
     * contrário uma exceção será executada
     * @return int intervalo de dias
     * @throws java.lang.Exception
     */
    public static int diferenceDates(Date date1, Date date2) throws Exception {

        if (date1.after(date2)) {
            throw new Exception("O segundo parâmetro deve ser maior que o primeiro.");
        }

        long differenceMilliSeconds = date2.getTime() - date1.getTime();
        float r = (differenceMilliSeconds / 1000 / 60 / 60 / 24);
        return Math.round(r);

    }

    public static Alert AlertDialog(String head, String content, Alert.AlertType type) {

        Alert dialogoInfo = new Alert(type);
        DialogPane dialogPane = dialogoInfo.getDialogPane();
//        dialogPane.getStylesheets().add(
//                getClass().getResource("/styles/Styles.css").toExternalForm());
        dialogoInfo.initStyle(StageStyle.DECORATED);
        dialogoInfo.setHeaderText(head);
        dialogoInfo.setContentText(content);

        return dialogoInfo;
    }

    public static Alert AlertDialog(String head, String content, Alert.AlertType type, ButtonType yes, ButtonType no) {

        Alert dialogoInfo = new Alert(type);
        DialogPane dialogPane = dialogoInfo.getDialogPane();

//        dialogPane.getStylesheets().add(
//                getClass().getResource("/styles/Styles.css").toExternalForm());
        dialogoInfo.initStyle(StageStyle.DECORATED);
        dialogoInfo.getButtonTypes().clear();
        dialogoInfo.getButtonTypes().addAll(yes, no);
        dialogoInfo.setHeaderText(head);
        dialogoInfo.setContentText(content);

        return dialogoInfo;
    }

    public static void addTextLimiter(final TextField tf, final int maxLength) {
        tf.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(final ObservableValue<? extends String> ov, final String oldValue, final String newValue) {
                if (tf.getText().length() > maxLength) {
                    String s = tf.getText().substring(0, maxLength);
                    tf.setText(s);
                }
            }
        });
    }
    
     public static void esconderCheckboxes(List<CheckBox> checkboxes, boolean bol){
         for (int i = 0; i < checkboxes.size(); i++) {           
            checkboxes.get(i).setVisible(!bol);
        }
    }
    
     
       public static void desmarcarCheckboxes(List<CheckBox> checkboxes, boolean bol){
         for (int i = 0; i < checkboxes.size(); i++) {           
            checkboxes.get(i).setSelected(!bol);
        }
    }
     
}
