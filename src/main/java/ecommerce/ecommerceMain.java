package ecommerce;

import common.LoginScreen;
import common.StageHolder;
import javafx.application.Application;
import javafx.stage.Stage;

public class ecommerceMain extends Application{
	public static void main(String[] args) {
		launch(args);		
	}
	@Override
	public void start(Stage stageCreatedByJavaFx) throws Exception {
		
		StageHolder.stage = stageCreatedByJavaFx;
		((Stage) StageHolder.stage).setTitle("Ecommerce Application");
		new LoginScreen().show();
		
		

		
	}
	
}

	
	
	
	