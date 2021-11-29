package application.controller;

import java.io.IOException;
import application.Main;
import application.model.ProfileInfo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class UserProfileController extends ProfileInfo { //Controller for "userProfile.fxml"
	public UserProfileController() {
		
	}
	@FXML
	private Label usernameLabel;

    @FXML
    private Button addToDescription;

    @FXML
    private TextArea descriptionText;

    @FXML
    private Button timeline;

    @FXML
    private Button logOut;
    
    @FXML
    private Label desc;
    
    String username = getUsername();
    
    
    public void setName(String name) { //setName function to set username on initial login
    	usernameLabel.setText(username);
    }
    @FXML
    void toTimeline(ActionEvent event) throws IOException { //changes scene to "timeline.fxml"
    	Main m = new Main();
    	m.changeScene("/application/view/timeline.fxml");
    }

    @FXML
    void logOut(ActionEvent event) throws IOException { //changes scene to "afterLogin.fxml"
    	Main m = new Main();
    	m.changeScene("/application/view/afterLogin.fxml");
    }

    @FXML
    public void addToDescription() throws IOException { //setText for description label on button press
    	String userText = descriptionText.getText();
    	desc.setText(userText);
    }

}
