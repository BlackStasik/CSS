package sample;

import com.sun.javafx.effect.EffectDirtyBits;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.effect.Effect;
import javafx.scene.input.KeyEvent;

public class Controller {

    @FXML
    private Button button;
    @FXML
    private TextField textField;
    @FXML
    private PasswordField passwordField;

    String string;

    @FXML
    ComboBox combo;

    public void getCombo(){
        combo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                string = combo.getValue().toString();
                Main.scene.getStylesheets().clear();
                Main.scene.getStylesheets().add(Main.class.getResource(string).toExternalForm());
            }
        });
    }

    private String name = "Ann";
    private String pass = "0000";
    int count = 0;
    public void setTextField(KeyEvent keyEvent){
        if(textField.getText().equals(name)){
            count++;
        }
    }
    @FXML
    public void setPasswordField(KeyEvent keyEvent){
        String string;
        string = passwordField.getText();
        if(string.equals(pass)){
            count++;
        }
    }

    @FXML
    public void onClick() {
        if (count == 2){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle(textField.getText());
            alert.setHeaderText("Чудовий день");
            alert.setContentText("Привіт " + name + "!");

            alert.showAndWait();
        }
        else{
        }
    }
}
