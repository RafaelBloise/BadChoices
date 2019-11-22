/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.badchoices;

import br.com.badchoices.controller.FormularioController;
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
import br.com.badchoices.enumm.TelasEnum;
import static br.com.badchoices.enumm.TelasEnum.LOGIN;
import br.com.badchoices.util.Util;
import java.util.Optional;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * @author rafael
 */
@SpringBootApplication
public class StartApplication extends Application {

    private static ConfigurableApplicationContext springContext;

    private static Stage loginStage;
    private static Scene sceneLogin;
    private static Parent login;

    private static Scene sceneDefinirSenha;
    private static Parent definirSenha;

    private static Parent formulario;
    private static Stage formularioStage;

    private static Parent prologo1;
    private static Stage prologo1Stage;
    
    private static Parent prologo2;
    private static Stage prologo2Stage;
    
    private static Parent prologo3;
    private static Stage prologo3Stage;
    
    private static Parent prologo4;
    private static Stage prologo4Stage;
    
    private static Parent prologo5;
    private static Stage prologo5Stage;
    
    private static Parent prologo6;
    private static Stage prologo6Stage;
    
    private static Parent prologo7;
    private static Stage prologo7Stage;
    
    private static Parent tela1;
    private static Stage tela1Stage;
    
    private static Parent tela2;
    private static Stage tela2Stage;
    
    private static Parent tela3;
    private static Stage tela3Stage;
    
    private static Parent tela4;
    private static Stage tela4Stage;
    
    private static Parent hist1;
    private static Stage hist1Stage;
    
    private static Parent gameover1;
    private static Stage gameover1Stage;
    
    public static void main(String[] args) {
        launch(StartApplication.class, args);
        System.out.println("LAUNCH");
    }

    @Override
    public void start(Stage stageInicial) throws Exception {
        System.out.println("START");

        loginStage = stageInicial;

        FXMLLoader fxmlLoaderLogin = new FXMLLoader(getClass().getResource("/fxml/Login.fxml"));
        fxmlLoaderLogin.setControllerFactory(springContext::getBean);

        FXMLLoader fxmlLoaderDefinirSenha = new FXMLLoader(getClass().getResource("/fxml/LoginDefinirSenha.fxml"));
        fxmlLoaderDefinirSenha.setControllerFactory(springContext::getBean);

        FXMLLoader fxmlLoaderForm = new FXMLLoader(getClass().getResource("/fxml/Formulario.fxml"));
        fxmlLoaderForm.setControllerFactory(springContext::getBean);
        
        FXMLLoader fxmlLoaderPrologo1 = new FXMLLoader(getClass().getResource("/fxml/1.fxml"));
        fxmlLoaderPrologo1.setControllerFactory(springContext::getBean);
        prologo1 = fxmlLoaderPrologo1.load();
        Prologo1Controller.setInstancia(fxmlLoaderPrologo1.getController());
        
        FXMLLoader fxmlLoaderPrologo2 = new FXMLLoader(getClass().getResource("/fxml/2.fxml"));
        fxmlLoaderPrologo2.setControllerFactory(springContext::getBean);
        prologo2 = fxmlLoaderPrologo2.load();
        Prologo2Controller.setInstancia(fxmlLoaderPrologo2.getController());
        
        FXMLLoader fxmlLoaderPrologo3 = new FXMLLoader(getClass().getResource("/fxml/3.fxml"));
        fxmlLoaderPrologo3.setControllerFactory(springContext::getBean);
        prologo3 = fxmlLoaderPrologo3.load();
        Prologo3Controller.setInstancia(fxmlLoaderPrologo3.getController());
        
        FXMLLoader fxmlLoaderPrologo4 = new FXMLLoader(getClass().getResource("/fxml/4.fxml"));
        fxmlLoaderPrologo4.setControllerFactory(springContext::getBean);
        prologo4 = fxmlLoaderPrologo4.load();
        Prologo4Controller.setInstancia(fxmlLoaderPrologo4.getController());
        
        FXMLLoader fxmlLoaderPrologo5 = new FXMLLoader(getClass().getResource("/fxml/5.fxml"));
        fxmlLoaderPrologo5.setControllerFactory(springContext::getBean);
        prologo5 = fxmlLoaderPrologo5.load();
        Prologo5Controller.setInstancia(fxmlLoaderPrologo5.getController());
        
        FXMLLoader fxmlLoaderPrologo6 = new FXMLLoader(getClass().getResource("/fxml/6.fxml"));
        fxmlLoaderPrologo6.setControllerFactory(springContext::getBean);
        prologo6 = fxmlLoaderPrologo6.load();
        Prologo6Controller.setInstancia(fxmlLoaderPrologo6.getController());
        
        FXMLLoader fxmlLoaderPrologo7 = new FXMLLoader(getClass().getResource("/fxml/7.fxml"));
        fxmlLoaderPrologo7.setControllerFactory(springContext::getBean);
        prologo7 = fxmlLoaderPrologo7.load();
        Prologo7Controller.setInstancia(fxmlLoaderPrologo7.getController());

        FXMLLoader fxmlLoaderTela1 = new FXMLLoader(getClass().getResource("/fxml/TelaOpcoes1.fxml"));
        fxmlLoaderTela1.setControllerFactory(springContext::getBean);
        tela1 = fxmlLoaderTela1.load();
        Tela1Controller.setInstancia(fxmlLoaderTela1.getController());

        FXMLLoader fxmlLoaderTela2 = new FXMLLoader(getClass().getResource("/fxml/TelaOpcoes2.fxml"));
        fxmlLoaderTela2.setControllerFactory(springContext::getBean);
        tela2 = fxmlLoaderTela2.load();
        Tela2Controller.setInstancia(fxmlLoaderTela2.getController());

        FXMLLoader fxmlLoaderTela3 = new FXMLLoader(getClass().getResource("/fxml/TelaOpcoes3.fxml"));
        fxmlLoaderTela3.setControllerFactory(springContext::getBean);
        tela3 = fxmlLoaderTela3.load();
        Tela3Controller.setInstancia(fxmlLoaderTela3.getController());

        FXMLLoader fxmlLoaderTela4 = new FXMLLoader(getClass().getResource("/fxml/TelaOpcoes4.fxml"));
        fxmlLoaderTela4.setControllerFactory(springContext::getBean);
        tela4 = fxmlLoaderTela4.load();
        Tela4Controller.setInstancia(fxmlLoaderTela4.getController());

        FXMLLoader fxmlLoaderHist1 = new FXMLLoader(getClass().getResource("/fxml/historia1.fxml"));
        fxmlLoaderHist1.setControllerFactory(springContext::getBean);
        hist1 = fxmlLoaderHist1.load();
        Historia1Controller.setInstancia(fxmlLoaderHist1.getController());

        FXMLLoader fxmlLoaderGameOver1 = new FXMLLoader(getClass().getResource("/fxml/telagameoverfluxosecund1.fxml"));
        fxmlLoaderGameOver1.setControllerFactory(springContext::getBean);
        gameover1 = fxmlLoaderGameOver1.load();
        GameOver1Controller.setInstancia(fxmlLoaderGameOver1.getController());

       

        definirSenha = fxmlLoaderDefinirSenha.load();
        login = fxmlLoaderLogin.load();
        formulario = fxmlLoaderForm.load();

        sceneDefinirSenha = new Scene(definirSenha);
        sceneLogin = new Scene(login);

        LoginDefinirSenhaController.setInstancia(fxmlLoaderDefinirSenha.getController());
        LoginController.setInstancia(fxmlLoaderLogin.getController());
        FormularioController.setInstancia(fxmlLoaderForm.getController());

        loginStage.resizableProperty().setValue(Boolean.FALSE);

        loginStage.setTitle("BADCHOICES - SUAS DECISÕES AQUI TEM MAIS PESO...");
        loginStage.setScene(sceneLogin);
        loginStage.centerOnScreen();
        loginStage.show();
    }

    @Override
    public void init() throws Exception {

        springContext = SpringApplication.run(StartApplication.class);
        System.out.println("RUN");
    }

    public static void abrirTelasIniciais() {

        loginStage.close();
        abrirFormulario();
        System.out.println("Usuário logado........");

    }

    private static void abrirFormulario() {

        Optional.ofNullable(formularioStage)
                .ifPresentOrElse(janela -> {
                    janela.hide();
                    janela.show();
                }, () -> {
                    Scene sceneOcorrencia = new Scene(formulario);
                    formularioStage = new Stage();

                    formularioStage.setScene(sceneOcorrencia);
                    formularioStage.setOnCloseRequest(e -> {
                        e.consume();
                        Alert alerta = Util.AlertDialog("Atenção!", "Deseja realmente sair ?",
                                Alert.AlertType.WARNING, ButtonType.YES, ButtonType.NO);
                        alerta.showAndWait();
                        if (alerta.getResult() == ButtonType.YES) {
                            LoginController.getInstancia().sair();
                        }
                    }
                    );
                    formularioStage.setTitle("BADCHOICES");

                    formularioStage.show();
                });

    }
    
     private static void abrirPrologo1() {

        Optional.ofNullable(prologo1Stage)
                .ifPresentOrElse(janela -> {
                    janela.hide();
                    janela.show();
                }, () -> {
                    Scene scenePrologo1 = new Scene(prologo1);
                    prologo1Stage = new Stage();

                    prologo1Stage.setScene(scenePrologo1);
                    prologo1Stage.setOnCloseRequest(e -> {
                        e.consume();
                        Alert alerta = Util.AlertDialog("Atenção!", "Deseja realmente sair ?",
                                Alert.AlertType.WARNING, ButtonType.YES, ButtonType.NO);
                        alerta.showAndWait();
                        if (alerta.getResult() == ButtonType.YES) {
                            LoginController.getInstancia().sair();
                        }
                    }
                    );
                    prologo1Stage.setTitle("BADCHOICES");
                    formularioStage.close();
                    prologo1Stage.show();
                });

    }
    

     private static void abrirPrologo2(){
         Optional.ofNullable(prologo2Stage)
                .ifPresentOrElse(janela -> {
                    janela.hide();
                    janela.show();
                }, () -> {
                    Scene scenePrologo2 = new Scene(prologo2);
                    prologo2Stage = new Stage();

                    prologo2Stage.setScene(scenePrologo2);
                    prologo2Stage.setOnCloseRequest(e -> {
                        e.consume();
                        Alert alerta = Util.AlertDialog("Atenção!", "Deseja realmente sair ?",
                                Alert.AlertType.WARNING, ButtonType.YES, ButtonType.NO);
                        alerta.showAndWait();
                        if (alerta.getResult() == ButtonType.YES) {
                            LoginController.getInstancia().sair();
                        }
                    }
                    );
                    prologo2Stage.setTitle("BADCHOICES");
                    prologo1Stage.close();
                    prologo2Stage.show();
                });
     }

     private static void abrirPrologo3(){
          Optional.ofNullable(prologo3Stage)
                .ifPresentOrElse(janela -> {
                    janela.hide();
                    janela.show();
                }, () -> {
                    Scene scenePrologo3 = new Scene(prologo3);
                    prologo3Stage = new Stage();

                    prologo3Stage.setScene(scenePrologo3);
                    prologo3Stage.setOnCloseRequest(e -> {
                        e.consume();
                        Alert alerta = Util.AlertDialog("Atenção!", "Deseja realmente sair ?",
                                Alert.AlertType.WARNING, ButtonType.YES, ButtonType.NO);
                        alerta.showAndWait();
                        if (alerta.getResult() == ButtonType.YES) {
                            LoginController.getInstancia().sair();
                        }
                    }
                    );
                    prologo3Stage.setTitle("BADCHOICES");
                    prologo2Stage.close();
                    prologo3Stage.show();
                });
     }

     private static void abrirPrologo4(){
            Optional.ofNullable(prologo4Stage)
                .ifPresentOrElse(janela -> {
                    janela.hide();
                    janela.show();
                }, () -> {
                    Scene scenePrologo4 = new Scene(prologo4);
                    prologo4Stage = new Stage();

                    prologo4Stage.setScene(scenePrologo4);
                    prologo4Stage.setOnCloseRequest(e -> {
                        e.consume();
                        Alert alerta = Util.AlertDialog("Atenção!", "Deseja realmente sair ?",
                                Alert.AlertType.WARNING, ButtonType.YES, ButtonType.NO);
                        alerta.showAndWait();
                        if (alerta.getResult() == ButtonType.YES) {
                            LoginController.getInstancia().sair();
                        }
                    }
                    );
                    prologo4Stage.setTitle("BADCHOICES");
                    prologo3Stage.close();
                    prologo4Stage.show();
                });
     }

     private static void abrirPrologo5(){
          Optional.ofNullable(prologo5Stage)
                .ifPresentOrElse(janela -> {
                    janela.hide();
                    janela.show();
                }, () -> {
                    Scene scenePrologo5 = new Scene(prologo5);
                    prologo5Stage = new Stage();

                    prologo5Stage.setScene(scenePrologo5);
                    prologo5Stage.setOnCloseRequest(e -> {
                        e.consume();
                        Alert alerta = Util.AlertDialog("Atenção!", "Deseja realmente sair ?",
                                Alert.AlertType.WARNING, ButtonType.YES, ButtonType.NO);
                        alerta.showAndWait();
                        if (alerta.getResult() == ButtonType.YES) {
                            LoginController.getInstancia().sair();
                        }
                    }
                    );
                    prologo5Stage.setTitle("BADCHOICES");
                    prologo4Stage.close();
                    prologo5Stage.show();
                });
     }

     private static void abrirPrologo6(){
          Optional.ofNullable(prologo6Stage)
                .ifPresentOrElse(janela -> {
                    janela.hide();
                    janela.show();
                }, () -> {
                    Scene scenePrologo6 = new Scene(prologo6);
                    prologo6Stage = new Stage();

                    prologo6Stage.setScene(scenePrologo6);
                    prologo6Stage.setOnCloseRequest(e -> {
                        e.consume();
                        Alert alerta = Util.AlertDialog("Atenção!", "Deseja realmente sair ?",
                                Alert.AlertType.WARNING, ButtonType.YES, ButtonType.NO);
                        alerta.showAndWait();
                        if (alerta.getResult() == ButtonType.YES) {
                            LoginController.getInstancia().sair();
                        }
                    }
                    );
                    prologo6Stage.setTitle("BADCHOICES");
                    prologo5Stage.close();
                    prologo6Stage.show();
                });
     }

     private static void abrirPrologo7(){
          Optional.ofNullable(prologo7Stage)
                .ifPresentOrElse(janela -> {
                    janela.hide();
                    janela.show();
                }, () -> {
                    Scene scenePrologo7 = new Scene(prologo7);
                    prologo7Stage = new Stage();

                    prologo7Stage.setScene(scenePrologo7);
                    prologo7Stage.setOnCloseRequest(e -> {
                        e.consume();
                        Alert alerta = Util.AlertDialog("Atenção!", "Deseja realmente sair ?",
                                Alert.AlertType.WARNING, ButtonType.YES, ButtonType.NO);
                        alerta.showAndWait();
                        if (alerta.getResult() == ButtonType.YES) {
                            LoginController.getInstancia().sair();
                        }
                    }
                    );
                    prologo7Stage.setTitle("BADCHOICES");
                    prologo6Stage.close();
                    prologo7Stage.show();
                });
     }
     
     private static void abrirTela1(){
         Optional.ofNullable(tela1Stage)
                .ifPresentOrElse(janela -> {
                    janela.hide();
                    janela.show();
                }, () -> {
                    Scene scenePrologo7 = new Scene(tela1);
                    tela1Stage = new Stage();

                    tela1Stage.setScene(scenePrologo7);
                    tela1Stage.setOnCloseRequest(e -> {
                        e.consume();
                        Alert alerta = Util.AlertDialog("Atenção!", "Deseja realmente sair ?",
                                Alert.AlertType.WARNING, ButtonType.YES, ButtonType.NO);
                        alerta.showAndWait();
                        if (alerta.getResult() == ButtonType.YES) {
                            LoginController.getInstancia().sair();
                        }
                    }
                    );
                    tela1Stage.setTitle("BADCHOICES");
                   hist1Stage.close();
                    tela1Stage.show();
                });
     }
     private static void abrirTela2(){
         Optional.ofNullable(tela2Stage)
                .ifPresentOrElse(janela -> {
                    janela.hide();
                    janela.show();
                }, () -> {
                    Scene scenePrologo7 = new Scene(tela2);
                    tela2Stage = new Stage();

                    tela2Stage.setScene(scenePrologo7);
                    tela2Stage.setOnCloseRequest(e -> {
                        e.consume();
                        Alert alerta = Util.AlertDialog("Atenção!", "Deseja realmente sair ?",
                                Alert.AlertType.WARNING, ButtonType.YES, ButtonType.NO);
                        alerta.showAndWait();
                        if (alerta.getResult() == ButtonType.YES) {
                            LoginController.getInstancia().sair();
                        }
                    }
                    );
                    tela2Stage.setTitle("BADCHOICES");
                    tela2Stage.show();
                });
     }
     private static void abrirTela3(){
         Optional.ofNullable(tela3Stage)
                .ifPresentOrElse(janela -> {
                    janela.hide();
                    janela.show();
                }, () -> {
                    Scene scenePrologo7 = new Scene(tela3);
                    tela3Stage = new Stage();

                    tela3Stage.setScene(scenePrologo7);
                    tela3Stage.setOnCloseRequest(e -> {
                        e.consume();
                        Alert alerta = Util.AlertDialog("Atenção!", "Deseja realmente sair ?",
                                Alert.AlertType.WARNING, ButtonType.YES, ButtonType.NO);
                        alerta.showAndWait();
                        if (alerta.getResult() == ButtonType.YES) {
                            LoginController.getInstancia().sair();
                        }
                    }
                    );
                    tela3Stage.setTitle("BADCHOICES");
                    tela3Stage.show();
                });
     }
     
     private static void abrirTela4(){
         Optional.ofNullable(tela4Stage)
                .ifPresentOrElse(janela -> {
                    janela.hide();
                    janela.show();
                }, () -> {
                    Scene scenePrologo7 = new Scene(tela4);
                    tela4Stage = new Stage();

                    tela4Stage.setScene(scenePrologo7);
                    tela4Stage.setOnCloseRequest(e -> {
                        e.consume();
                        Alert alerta = Util.AlertDialog("Atenção!", "Deseja realmente sair ?",
                                Alert.AlertType.WARNING, ButtonType.YES, ButtonType.NO);
                        alerta.showAndWait();
                        if (alerta.getResult() == ButtonType.YES) {
                            LoginController.getInstancia().sair();
                        }
                    }
                    );
                    tela4Stage.setTitle("BADCHOICES");
                    tela4Stage.show();
                });
     }
     
     private static void abrirHistoria1(){
          Optional.ofNullable(hist1Stage)
                .ifPresentOrElse(janela -> {
                    janela.hide();
                    janela.show();
                }, () -> {
                    Scene scenePrologo7 = new Scene(hist1);
                    hist1Stage = new Stage();

                    hist1Stage.setScene(scenePrologo7);
                    hist1Stage.setOnCloseRequest(e -> {
                        e.consume();
                        Alert alerta = Util.AlertDialog("Atenção!", "Deseja realmente sair ?",
                                Alert.AlertType.WARNING, ButtonType.YES, ButtonType.NO);
                        alerta.showAndWait();
                        if (alerta.getResult() == ButtonType.YES) {
                            LoginController.getInstancia().sair();
                        }
                    }
                    );
                    hist1Stage.setTitle("BADCHOICES");
                    prologo7Stage.close();
                    hist1Stage.show();
                });
     }
     private static void abrirGameOver1(){
          Optional.ofNullable(gameover1Stage)
                .ifPresentOrElse(janela -> {
                    janela.hide();
                    janela.show();
                }, () -> {
                    Scene scenePrologo7 = new Scene(gameover1);
                    gameover1Stage = new Stage();

                    gameover1Stage.setScene(scenePrologo7);
                    gameover1Stage.setOnCloseRequest(e -> {
                        e.consume();
                        Alert alerta = Util.AlertDialog("Atenção!", "Deseja realmente sair ?",
                                Alert.AlertType.WARNING, ButtonType.YES, ButtonType.NO);
                        alerta.showAndWait();
                        if (alerta.getResult() == ButtonType.YES) {
                            LoginController.getInstancia().sair();
                        }
                    }
                    );
                    gameover1Stage.setTitle("BADCHOICES");
                    tela1Stage.close();
                    gameover1Stage.show();
                });
     }
     
    public static void mudarTela(TelasEnum telasEnum) {
        switch (telasEnum) {

            case DEFINIR_SENHA:
                loginStage.setScene(sceneDefinirSenha);
                Util.AlertDialog("Registro",
                        "Informe o email e senha que fará login na plataforma.",
                        Alert.AlertType.INFORMATION)
                        .show();
                break;
            case LOGIN:
                loginStage.setScene(sceneLogin);
                break;
            case PROLOGO1:
                abrirPrologo1();
                break;
            case PROLOGO2:
                abrirPrologo2();
                break;
            case PROLOGO3:
                abrirPrologo3();
                break;
            case PROLOGO4:
                abrirPrologo4();
                break;
            case PROLOGO5:
                abrirPrologo5();
                break;
            case PROLOGO6:
                abrirPrologo6();
                break;
            case PROLOGO7:
                abrirPrologo7();
                break;
            case TELA1:
                abrirTela1();
                break;
            case TELA2:
                abrirTela2();
                break;
            case TELA3:
                abrirTela3();
                break;
            case TELA4:
                abrirTela4();
                break;
            case HISTORIA1:
                abrirHistoria1();
                break;
            case GAMEOVER1:
                abrirGameOver1();
                break;

        }
    }

    public static void sairDoSistema() {
        springContext.stop();
        Platform.exit();
        System.exit(0);
    }
}
