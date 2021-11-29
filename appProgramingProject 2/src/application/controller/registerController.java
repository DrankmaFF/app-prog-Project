package application.controller;
import application.model.ProfileInfo;
import application.Main;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import application.model.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class registerController extends ProfileInfo { //controller for "register.fxml"
	
	public registerController() {
		
	}
	
	@FXML
	private TextField usernameRegister;
	@FXML
	private PasswordField passwordRegister;
	@FXML
	private PasswordField confirmPassword;
	@FXML
	private TextField abc123;
	@FXML
	private Button registerButton;
	@FXML
	private Label failedRegister; 
	
	//@FXML
	//public Map<String, String> userInfoMap = new HashMap<String, String>();
	
	@FXML
	public void saveInfo() throws IOException { //makes sure you input correct info on student registry screen. Adds username and password to hashmap for future use on login screen
		Main m = new Main();
		
		if (!passwordRegister.getText().equals(confirmPassword.getText())) {
			failedRegister.setText("Your passwords do not match.");
		}
		else if (usernameRegister.getText().equals(passwordRegister.getText())) {
			failedRegister.setText("Your username and password should not match.");
		}
		else if (usernameRegister.getText().equals("")) {
			failedRegister.setText("Please enter a Username");
		}
		else if (abc123.getText().equals("") || (abc123.getText().length() < 6)) {
			failedRegister.setText("Please enter an ABC123");
		}
		else if (passwordRegister.getText().equals(confirmPassword.getText())){
			userData.put(usernameRegister.getText(), passwordRegister.getText());
			System.out.println(userData);
			//setValue(userData);
			m.changeScene("/application/view/sample.fxml");
			
		}
	}
}
