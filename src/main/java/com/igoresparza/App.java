package com.igoresparza;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    @Override
    public void start(Stage stage) throws IOException {
        logger.info("Lanzando la app");
        logger.debug("Depuración mostrada");

        scene = new Scene(loadFXML("fxml/primary"), 640, 480);
        scene.getStylesheets().add(App.class.getResource("css/styles.css").toExternalForm());
        stage.setScene(scene);
        stage.setMinWidth(540);
        stage.setMinHeight(400);
        stage.setTitle("Mi Aplicación JavaFX");  // Opcional: título de la ventana
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
}
