package controller;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.Main;

public class ControllerChatWindow {

    @FXML
    private Button backBTM;

    @FXML
    private Button sendBTN;

    @FXML
    private TextField writeTextTF;

    @FXML
    void backAct(ActionEvent event) throws IOException {
    	Stage stage = (Stage) this.backBTM.getScene().getWindow();
        stage.close();
    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/AptoWindow.fxml"));
    	loader.setController(new ControllerAptoWindow());
		Parent parent = (Parent) loader.load();
		Stage stage2 = new Stage();
		Scene scene = new Scene(parent);
		stage2.setScene(scene);
		stage2.show();
    }

    @FXML
    void send(ActionEvent event) {

    }

    @FXML
    void write(ActionEvent event) {

    }
		
}
