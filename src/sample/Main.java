package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    static Scene scene;

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        String fxmlFile = "sample.fxml";
        String styleFile = "Style1.css";
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResourceAsStream(fxmlFile));
        stage.setTitle("Trying CSS");
        scene = new Scene(root);
        scene.getStylesheets().clear();
        scene.getStylesheets().add(Main.class.getResource(styleFile).toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

}