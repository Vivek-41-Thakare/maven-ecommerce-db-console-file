package javafx_login_screen;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx_Home_Screen.HomeScreenViewer;
public class LoginScreenController {
	
	@FXML
	TextField loginName;
	
	@FXML
	TextField password;
	
	@FXML
	Label errorMessage;
	
public void loginButtonClick() {
	
	String userFromDB = "Admin";
	String passwordFromDB = "Admin";
	   
if(loginName.getText().equals(userFromDB)&&password.getText().equals(passwordFromDB)) {
	errorMessage.setText("Login Sucess");
	errorMessage.setTextFill(Color.GREEN);

	HomeScreenViewer homeScreenViewer = new HomeScreenViewer();
	homeScreenViewer.show();
}else {
	errorMessage.setText("Login Failed");
	errorMessage.setTextFill(Color.RED);
	
	


}
}}

