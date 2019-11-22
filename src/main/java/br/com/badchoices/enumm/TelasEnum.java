/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.badchoices.enumm;

import br.com.badchoices.controller.GameOver1Controller;
import br.com.badchoices.controller.Historia1Controller;
import br.com.badchoices.controller.LoginController;
import br.com.badchoices.controller.LoginDefinirSenhaController;
import br.com.badchoices.controller.Prologo1Controller;
import br.com.badchoices.controller.Prologo2Controller;
import br.com.badchoices.controller.Prologo3Controller;
import br.com.badchoices.controller.Prologo4Controller;
import br.com.badchoices.controller.Prologo5Controller;
import br.com.badchoices.controller.Prologo6Controller;
import br.com.badchoices.controller.Prologo7Controller;
import br.com.badchoices.controller.Tela1Controller;
import br.com.badchoices.controller.Tela2Controller;
import br.com.badchoices.controller.Tela3Controller;
import br.com.badchoices.controller.Tela4Controller;

/**
 *
 * @author Rafael Bloise
 */
public enum TelasEnum {
    DEFINIR_SENHA(LoginDefinirSenhaController.class.getSimpleName()),
    LOGIN(LoginController.class.getSimpleName()),
    PROLOGO1(Prologo1Controller.class.getSimpleName()),
    PROLOGO2(Prologo2Controller.class.getSimpleName()),
    PROLOGO3(Prologo3Controller.class.getSimpleName()),
    PROLOGO4(Prologo4Controller.class.getSimpleName()),
    PROLOGO5(Prologo5Controller.class.getSimpleName()),
    PROLOGO6(Prologo6Controller.class.getSimpleName()),
    PROLOGO7(Prologo7Controller.class.getSimpleName()),
    TELA1(Tela1Controller.class.getSimpleName()),
    TELA2(Tela2Controller.class.getSimpleName()),
    TELA3(Tela3Controller.class.getSimpleName()),
    TELA4(Tela4Controller.class.getSimpleName()),
    HISTORIA1(Historia1Controller.class.getSimpleName()),
    GAMEOVER1(GameOver1Controller.class.getSimpleName());
            
    private final String name;

    private TelasEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
}
