package javafx_Add_user_screen;
import java.sql.SQLException;

import common.Dbutils;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx_Home_Screen.HomeScreenViewer;
public class AddUserScreenController {

	@FXML
	TextField name;
	
	@FXML
	TextField age;

	@FXML
	TextField email;

	@FXML
	TextField password;

	@FXML
	TextField confirmPassword;

	@FXML
	Button loginButtonClick;

	public void loginButtonClick() throws SQLException {
	String Name = name.getText(); 				
	String Age = age.getText();
	String Email = email.getText();
	String Password = password.getText();
	String ConfirmPassword = confirmPassword.getText();
	if (Password.equals(ConfirmPassword)) {
	String query =
			"insert into user(name, gender, age, Email, Password, Confirm_Password)(" + Name +  "," + Age + "','" + Email +"','" + password + "','" + confirmPassword + "')";

	Dbutils.executeQuery(query);

	System.out.println("User Added Successfully!!");

	} else {

	System.out.println("User Additon Failed");

	}

	HomeScreenViewer homeScreenViewer = new HomeScreenViewer();
	homeScreenViewer.show();

	}

	}


