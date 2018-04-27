package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Controller1 {

    private Stage thisWindow;

    private Scene thisScnen;
    private Scene nextScnen;

    public void setThisWindow(Stage thisWindow) {
        this.thisWindow = thisWindow;
    }

    public void setThisScnen(Scene thisScnen) {
        this.thisScnen = thisScnen;
    }

    public void setNextScnen(Scene nextScnen) {
        this.nextScnen = nextScnen;
    }

    @FXML
    private void setScene(ActionEvent event) {
        thisWindow.setScene(nextScnen);
    }

}
