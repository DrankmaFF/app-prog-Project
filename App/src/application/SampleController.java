package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class SampleController {

    @FXML
    private Button addToDescription;

    @FXML
    private TextArea descriptionText;

    @FXML
    private Button toScene;

    @FXML
    private Button logOut;
    
    @FXML
    private Label desc1;

    @FXML
    private Label desc2;

    @FXML
    private Label desc3;
    
    int count = 0;
    String temp;
    @FXML
    void goingToScene(ActionEvent event) {

    }

    @FXML
    void loggingOut(ActionEvent event) {

    }

    @FXML
    void addToDescription(ActionEvent event) {
    	
    	String description = descriptionText.getText();
    	//System.out.print("print ");
    	
    	switch(count) {
    	case 0:
    		desc1.setText(description);
    		count++;
    		break;
    	case 1:
    		desc2.setText(description);
    		count++;
    		break;
    	case 2:
    		count++;
    		desc3.setText(description);
    		break;
    	case 3:
    		count++;
    		desc1.setText(description);
    		break;
    	case 4:
    		count++;
    		desc2.setText(description);
    		break;
    	case 5:
    		count++;
    		desc3.setText(description);
    		break;
    	case 6:
    		count++;
    		desc1.setText(description);
    		break;
    	}

    }

}
