package application;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MainScheduleWorkerViewController  {

  
   
   @FXML
   private ResourceBundle resources;

   @FXML
   private URL location;

   @FXML
   void initialize() {
   
   }
   
   @FXML
   private void LogInButtonPressed(ActionEvent event) throws IOException {
      VBox loginWindow = (VBox) FXMLLoader.load(MainScheduleWorker.class.getResource("WindowLogin.fxml"));
      ((Node)event.getSource()).getScene().getWindow().hide();
      Stage primaryStage = new Stage();
      primaryStage.setScene(new Scene(loginWindow));  
      primaryStage.setTitle("Login");
      Image icon = new Image("img/eurofins_logo.png");
      primaryStage.getIcons().add(icon);
      primaryStage.show();
   }
   
   public void SearchbuttonPressed(ActionEvent event) throws IOException {
      Stage primaryStage = new Stage();
      Pane search = (Pane) FXMLLoader.load(MainScheduleWorker.class.getResource("Search.fxml"));
      primaryStage.setScene(new Scene(search));  
      primaryStage.setTitle("Search");
      Image icon = new Image("img/eurofins_logo.png");
      primaryStage.getIcons().add(icon);
      primaryStage.show();
   }


   }
   
   

