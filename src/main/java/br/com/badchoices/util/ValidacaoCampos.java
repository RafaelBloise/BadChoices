package br.com.badchoices.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;

/**
 *
 * @author Rafael Bloise
 */
public class ValidacaoCampos {

    private static final String STILE_BORDER_VALIDATION = "-fx-border-color: #FF0000";
    private static final Tooltip TOOLTIP = new Tooltip("Preencha este campo!");
    private static final String BEHAVIOR = "BEHAVIOR";

    public static boolean checkEmptyFields(Node... itemToCheck) {
        //usado para determinar quantos campos falharam na validação
        List<Node> failedFields = new ArrayList<>();
        TOOLTIP.setStyle("-fx-background-color: linear-gradient(#FF6B6B , #FFA6A6 );"
                + " -fx-font-weight: bold;");
        hackTooltipStartTiming(TOOLTIP);
        for (Node n : arrayToList(itemToCheck)) {
            // Validar TextFields
            if (n instanceof TextField) {
                TextField textField = (TextField) n;
                textField.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
                    removeToolTipAndBorderColor(textField, TOOLTIP);
                });
                if (textField.getText() == null || textField.getText().trim().equals("")) {
                    failedFields.add(n);
                    addToolTipAndBorderColor(textField, TOOLTIP);
                } else {
                    removeToolTipAndBorderColor(textField, TOOLTIP);
                }
            } // Validar Combo Box
            else if (n instanceof ComboBox) {
                ComboBox comboBox = (ComboBox) n;
                comboBox.valueProperty().addListener((ObservableValue observable, Object oldValue, Object newValue) -> {
                    removeToolTipAndBorderColor(comboBox, TOOLTIP);
                });
                if (comboBox.getValue() == null) {
                    failedFields.add(n);
                    addToolTipAndBorderColor(comboBox, TOOLTIP);
                } else {
                    removeToolTipAndBorderColor(comboBox, TOOLTIP);
                }
            } // Validar TextArea
            else if (n instanceof TextArea) {
                TextArea textArea = (TextArea) n;
                textArea.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
                    removeToolTipAndBorderColor(textArea, TOOLTIP);
                });
                if (textArea.getText() == null || textArea.getText().trim().equals("")) {
                    failedFields.add(n);
                    addToolTipAndBorderColor(textArea, TOOLTIP);
                } else {
                    removeToolTipAndBorderColor(textArea, TOOLTIP);
                }
            }
            
        }

        return failedFields.isEmpty();
    }

    /**
     * *******ADD E REMOVER STYLES********
     */
    private static void addToolTipAndBorderColor(Node n, Tooltip t) {
        Tooltip.install(n, t);
        n.setStyle(STILE_BORDER_VALIDATION);
    }

    private static void removeToolTipAndBorderColor(Node n, Tooltip t) {
        Tooltip.uninstall(n, t);
        n.setStyle(null);
    }

    /**
     * ***********ARRAY TO LIST UTILITY************
     */
    private static List<Node> arrayToList(Node[] n) {
        List<Node> listItems = new ArrayList<>();
        for (Node n1 : n) {
            listItems.add(n1);
        }
        return listItems;
    }

    /**
     * ***********FORÇAR TOOLTIP A SER EXIBIDO MAIS RÁPIDO************
     */
    private static void hackTooltipStartTiming(Tooltip tooltip) {
        try {
            Field fieldBehavior = tooltip.getClass().getDeclaredField("BEHAVIOR");
            fieldBehavior.setAccessible(true);
            Object objBehavior = fieldBehavior.get(tooltip);

            Field fieldTimer = objBehavior.getClass().getDeclaredField("activationTimer");
            fieldTimer.setAccessible(true);
            Timeline objTimer = (Timeline) fieldTimer.get(objBehavior);

            objTimer.getKeyFrames().clear();
            objTimer.getKeyFrames().add(new KeyFrame(new javafx.util.Duration(5)));
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
