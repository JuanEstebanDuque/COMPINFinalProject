package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class ControllerAdvisorPanicWindow implements Initializable{

    @FXML
    private Text aptoNumEmergencyTF;

    @FXML
    private Button continueBTN;

    @FXML
    void continueScreen(ActionEvent event) {

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//Debe tener el n�mero de apartamento que activa la funci�n de p�nico
		
		aptoNumEmergencyTF.setText("202");
	}

}
