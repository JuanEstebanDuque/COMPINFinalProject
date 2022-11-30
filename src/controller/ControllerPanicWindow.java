package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import main.Main;

public class ControllerPanicWindow implements Initializable {
	
    @FXML
    private Button activeAlarmBTN1;
	
    @FXML
    private Button backBTM;
    
    @FXML
    private Text emalEmergencyContactTF;

    @FXML
    private Button stopAlarmBTN;

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
    void stopAlarm(ActionEvent event) throws IOException {
    	//se detiene la alarma en código
    	
    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/AptoWindow.fxml"));
    	loader.setController(new ControllerAptoWindow());
		Parent parent = (Parent) loader.load();
		Stage stage2 = new Stage();
		Scene scene = new Scene(parent);
		stage2.setScene(scene);
		stage2.show();
    }
    
    @FXML
    void activeAlarm(ActionEvent event) {
    	//se activa la alarma en código
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//Se debe mostrar el correo que esté guardado como "contacto de emergencia"
		
		emalEmergencyContactTF.setText("hola123@gmail.com");
	}
    
   
    
}
