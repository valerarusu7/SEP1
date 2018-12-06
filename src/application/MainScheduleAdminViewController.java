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

public class MainScheduleAdminViewController
{
   @FXML
   private ResourceBundle resources;

   @FXML
   private URL location;

   @FXML
   void signOut(ActionEvent event) {

   }

   @FXML
   void initialize() {
   }
   
   public void signOutbuttonPressed(ActionEvent event) throws IOException {
      ((Node)event.getSource()).getScene().getWindow().hide();
      Stage primaryStage = new Stage();
      VBox mainV = (VBox) FXMLLoader.load(MainScheduleWorker.class.getResource("MainScheduleWorker.fxml"));
      primaryStage.setScene(new Scene(mainV));  
      primaryStage.setTitle("Eurofins Work Schedule");
      Image icon = new Image("img/eurofins_logo.png");
      primaryStage.getIcons().add(icon);
      primaryStage.show();
   }
   
   public void manageAnalysisbuttonPressed(ActionEvent event) throws IOException {
      Stage primaryStage = new Stage();
      Pane manageA = (Pane) FXMLLoader.load(MainScheduleWorker.class.getResource("Manage-Analysis.fxml"));
      primaryStage.setScene(new Scene(manageA)); 
      primaryStage.setTitle("Manage Analysis");
      Image icon = new Image("img/eurofins_logo.png");
      primaryStage.getIcons().add(icon);
      primaryStage.show();
   }
   
   public void manageWorkersbuttonPressed(ActionEvent event) throws IOException {
      Stage primaryStage = new Stage();
      Pane manageW = (Pane) FXMLLoader.load(MainScheduleWorker.class.getResource("Manage-Workers.fxml"));
      primaryStage.setScene(new Scene(manageW));  
      primaryStage.setTitle("Manage Workers");
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
