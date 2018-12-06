package application;
	

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;


public class MainScheduleWorker extends Application   {
	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox mainPane = (VBox) FXMLLoader.load(MainScheduleWorker.class.getResource("MainScheduleWorker.fxml"));
      primaryStage.setScene(new Scene(mainPane));	
      Image icon = new Image("img/eurofins_logo.png");
      primaryStage.getIcons().add(icon);
      primaryStage.setTitle("Eurofins Work Schedule");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
   }
   




  
