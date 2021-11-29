package application.controller;

import application.Main;
import java.io.IOException;
import javafx.fxml.*;
import javafx.scene.control.*;

public class LogoutController {

		@FXML
		private Button logout;
		
		public void userLogOut() throws IOException {
			Main m = new Main();
			m.changeScene("/application/view/sample.fxml");
		}
}
