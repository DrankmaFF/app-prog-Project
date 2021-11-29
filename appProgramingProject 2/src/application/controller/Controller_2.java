package application.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;

import application.model.*;

public class Controller_2 { //Controller for "timeline.fxml" and "editor.fxml"
	@FXML
	TextArea userName;
	@FXML
	TextArea textInput;
	@FXML
	Button fullSend;
	@FXML
	Button newTweet;
	@FXML
	TextArea timeline;
	@FXML
	Button refresh;
	@FXML
	Button viewTimeline;
	@FXML
	Button backToProfile;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	PostEditor object;
	
	@FXML
	public void toProfile(ActionEvent event) throws IOException { //switches scene to "userProfile.fxml"
		root = FXMLLoader.load(getClass().getResource("/application/view/userProfile.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	//switches scenes to post editor view
	public void switchtoEditor(ActionEvent event) throws IOException { //switches scene to "editor.fxml"
		
		root = FXMLLoader.load(getClass().getResource("/application/view/editor.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	
	//switches scenes to timeline view
	public void switchtoTimeline(ActionEvent event) throws IOException { //switches scene to "timeline.fxml"

		root = FXMLLoader.load(getClass().getResource("/application/view/timeline.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	//gets text from username and post fields, writes info to database using PostEditor object
	public int postTweet(ActionEvent event) throws IOException {
		
		object = new PostEditor();
		
		//get text from user input fields
		String username = userName.getText();
		String post = textInput.getText();
		
		//resets text to blank fields
		userName.setText("");
		textInput.setText("");
		
		object.sendTweet(post, username);
		
		return 0;
	}
	
	//uses PostEditor object to display posts on timeline view
	public void displayTweets(ActionEvent event) throws FileNotFoundException {
		
		object = new PostEditor();
		
		timeline.setText(object.readTweet());
	}
	
	

}
