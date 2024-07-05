package common;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;

import ecommerce.StageHolder;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class screencommon {
	public void show() {
		String myClassName = getClass().getSimpleName();
		String ClassFilePath = getClass().getResource(myClassName + ".class.").toString();
		String fxmlFilePath = ClassFilePath.replace(".class", ".fxml");

		URL fxmlUrl;
		try {
			fxmlUrl = Paths.get(fxmlFilePath).toUri().toURL();
			Parent actorGroup = FXMLLoader.load(fxmlUrl);

			Scene scene = new Scene(actorGroup, 600, 400);
			StageHolder.stage.setScene(scene);
			StageHolder.stage.show();

		} catch (IOException e) {
			e.printStackTrace();

		}

	}

}
