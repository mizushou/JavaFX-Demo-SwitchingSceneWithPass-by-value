package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        // Make loader1
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("layout1.fxml"));
        Parent root = loader1.load();

        // Make loader2
        FXMLLoader loader2 = new FXMLLoader(getClass().getResource("layout2.fxml"));
        Parent root2 = loader2.load();

        // Set scene1
        scene1 = new Scene(root, 200, 200);
        window.setTitle("Demo : Pass-by-value");
        window.setScene(scene1);

        // Make scene2
        scene2 = new Scene(root2, 600, 300);

        // Obtain controller1,2
        Controller1 ctrl1 = (Controller1) loader1.getController();
        Controller2 ctrl2 = (Controller2) loader2.getController();

        ctrl1.setThisWindow(window);
        ctrl1.setNextScnen(scene2);

        ctrl2.setThisWindow(window);
        ctrl2.setPrevScnen(scene1);

        window.show();
    }

}
