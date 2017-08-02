package net.kurobako.gesturefx.sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) { launch(args); }

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent parent = FXMLLoader.load(getClass().getResource("/Sampler.fxml"));
		primaryStage.setTitle("GesturePane samples");
		primaryStage.setScene(new Scene(parent));
		primaryStage.show();
	}

}