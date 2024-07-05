package javafx_Home_Screen;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
public class HomeScreenController {
	
	@FXML
	Button AddUserButton;
	
	@FXML
	Button AddProductButton;
	
	@FXML
	Button LogoutButton;
	
public void AddUserButtonClick() {
	
	System.out.println("Add User button Clicked");
	
}
public void AddProductButtonClick() {
	
	System.out.println("Add Product Button Clicked");
}
public void LogoutButtonClick() {
	
	System.out.println("Logout Button Clicked");
}
}




