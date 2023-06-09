package lk.ijse.chatApplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        URL resource = getClass().getResource("/lk/ijse/chatApplication/view/LoginForm.fxml");
        Parent load = FXMLLoader.load(resource);
        primaryStage.setScene(new Scene(load));
        primaryStage.setTitle("Login Form");
        primaryStage.show();
    }
}
