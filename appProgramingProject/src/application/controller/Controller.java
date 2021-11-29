package application.controller;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import application.Main;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.TextField;
import javafx.event.*;
import application.model.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class Controller extends ProfileInfo{ //Controller for "sample.fxml"
	public Controller() {
		
	}
	@FXML
	private String usernameInput;
	@FXML
	private String passwordInput;
	@FXML
	private Button loginButton;
	@FXML
	private Label incorrectLogin;
	@FXML
	private TextField username;
	@FXML
	private TextField password;
	@FXML
	private Button registerButton;
	
	
	
	//Map<String, String> gaming = new HashMap <String, String>();
	
	
	@FXML
	private void checkLogin() throws IOException { //on 'loginButton' press, will check the HashMap for a username and password match. Will switch scene to profile on success. Will ask to register/try again otherwise
		//Map<String, String> person = x.getValue();
		incorrectLogin.setText("Username or password is Incorrect. Try again, or register.");
		this.usernameInput = username.getText();
		this.passwordInput = password.getText();
		if(userData.containsKey(usernameInput) && userData.containsValue(passwordInput)) {
				setUserName(usernameInput);
				FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/view/userProfile.fxml"));
		        Parent root = loader.load();
		        UserProfileController profileControl = loader.getController();
		        profileControl.setName("@" + getUsername());
		        loginButton.getScene().setRoot(root);
			}
		}
	
	
	

	@FXML
	public void register() throws IOException { //switches to register screen on 'register' button press
		Main m = new Main();
		m.changeScene("/application/view/register.fxml");
	}
	
	public boolean doesPasswordMatch(String password) { //checks if the password matches the username (value matches key)
		 return this.password.equals(password);
	 }

}
	