package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;

        // Make loder
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root = loader.load();
        scene1 = new Scene(root, 200, 200);
        window.setTitle("Demo : Pass-by-value");
        window.setScene(scene1);

        //Button 2
        Button button2 = new Button("This scene sucks, go back to scene 1");
        button2.setOnAction(e -> window.setScene(scene1));

        //Layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 600, 300);

        Controller ctrl = (Controller) loader.getController();
        ctrl.setThisWindow(window);
        ctrl.setNextScnen(scene2);

        window.show();
    }

}
