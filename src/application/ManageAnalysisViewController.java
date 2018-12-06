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


public class ManageAnalysisViewController
{
   @FXML
   private ResourceBundle resources;

   @FXML
   private URL location;

   @FXML
   void initialize() {
      
   }
   
   public void AddAnalysisbuttonPressed(ActionEvent event) throws IOException {
      ((Node)event.getSource()).getScene().getWindow().hide();
      Stage primaryStage = new Stage();
      Pane AddAnalysis = (Pane) FXMLLoader.load(MainScheduleWorker.class.getResource("Add_Analysis.fxml"));
      primaryStage.setScene(new Scene(AddAnalysis));  
      Image icon = new Image("img/eurofins_logo.png");
      primaryStage.getIcons().add(icon);
      primaryStage.show();
   }

   public void RemoveAnalysisbuttonPressed(ActionEvent event) throws IOException {
      ((Node)event.getSource()).getScene().getWindow().hide();
      Stage primaryStage = new Stage();
      Pane RemoveAnalysis = (Pane) FXMLLoader.load(MainScheduleWorker.class.getResource("Remove_Analysis.fxml"));
      primaryStage.setScene(new Scene(RemoveAnalysis));  
      Image icon = new Image("img/eurofins_logo.png");
      primaryStage.getIcons().add(icon);
      primaryStage.show();
   }
}
