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

public class ControllerAdvisorVisitor {

    @FXML
    private Button continueBTN;

    @FXML
    void continueScreen(ActionEvent event) throws IOException {
    	//cuando llegue un visitante a la recepción y se anuncie, aparecerá esta ventana antes del admitir o denegar el visitante
    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/AdmitDenyVisitorWindow.fxml"));
    	loader.setController(new ControllerAdmitDenyVisitorWindow());
		Parent parent = (Parent) loader.load();
		Stage stage2 = new Stage();
		Scene scene = new Scene(parent);
		stage2.setScene(scene);
		stage2.show();
    }
    
}
