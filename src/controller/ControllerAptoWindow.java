package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import main.Main;

public class ControllerAptoWindow {

    @FXML
    private Button chatBTN;

    @FXML
    private Button panicBTN;

    @FXML
    void chat(ActionEvent event) throws IOException {
    	Stage stage = (Stage) this.chatBTN.getScene().getWindow();
        stage.close();
    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/ChatWindow.fxml"));
    	loader.setController(new ControllerAptoWindow());
		Parent parent = (Parent) loader.load();
		Stage stage2 = new Stage();
		Scene scene = new Scene(parent);
		stage2.setScene(scene);
		stage2.show();
    }

    @FXML
    void panic(ActionEvent event) {

    }

}
