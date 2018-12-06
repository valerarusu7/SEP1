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
import javafx.stage.Stage;

public class ManageWorkersViewController
{
   @FXML
   private ResourceBundle resources;

   @FXML
   private URL location;

   @FXML
   void initialize() {

   }
   
   public void AddWorkerssbuttonPressed(ActionEvent event) throws IOException {
      ((Node)event.getSource()).getScene().getWindow().hide();
      Stage primaryStage = new Stage();
      Pane AddWorkers = (Pane) FXMLLoader.load(MainScheduleWorker.class.getResource("AddWorker.fxml"));
      primaryStage.setScene(new Scene(AddWorkers));  
      Image icon = new Image("img/eurofins_logo.png");
      primaryStage.getIcons().add(icon);
      primaryStage.show();
   }
   
   public void RemoveWorkersbuttonPressed(ActionEvent event) throws IOException {
      ((Node)event.getSource()).getScene().getWindow().hide();
      Stage primaryStage = new Stage();
      Pane RemoveWorkers = (Pane) FXMLLoader.load(MainScheduleWorker.class.getResource("Remove_Worker.fxml"));
      primaryStage.setScene(new Scene(RemoveWorkers));  
      Image icon = new Image("img/eurofins_logo.png");
      primaryStage.getIcons().add(icon);
      primaryStage.show();
   }

}
