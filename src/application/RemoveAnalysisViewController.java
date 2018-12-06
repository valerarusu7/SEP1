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

public class RemoveAnalysisViewController
{
   @FXML
   private ResourceBundle resources;

   @FXML
   private URL location;

   @FXML
   void initialize() {

   }
   public void ReturnbuttonPressed(ActionEvent event) throws IOException {
      ((Node)event.getSource()).getScene().getWindow().hide();
      Stage primaryStage = new Stage();
      Pane returnB = (Pane) FXMLLoader.load(MainScheduleWorker.class.getResource("Manage-Analysis.fxml"));
      primaryStage.setScene(new Scene(returnB));  
      Image icon = new Image("img/eurofins_logo.png");
      primaryStage.getIcons().add(icon);
      primaryStage.show();
   }

}
