package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WindowLoginViewController
{
   @FXML
   private PasswordField passwordField;

   @FXML
   private TextField usernameField;

   @FXML
   private Label lblStatus;

   @FXML
   void loginButtonPressed(ActionEvent event) throws Exception {
      if (passwordField.getText().equals("") && usernameField.getText().equals("")) {
         lblStatus.setText("Login Succes");
   ((Node)event.getSource()).getScene().getWindow().hide();
   Stage primaryStage = new Stage();
   VBox MainSCheduleAdmin = (VBox) FXMLLoader.load(MainScheduleWorker.class.getResource("MainScheduleAdmin.fxml"));
   primaryStage.setScene(new Scene(MainSCheduleAdmin));  
   primaryStage.setTitle("Eurofins Work Schedule");
   Image icon = new Image("img/eurofins_logo.png");
   primaryStage.getIcons().add(icon);
   primaryStage.show();
   } else {
      lblStatus.setText("Login Failed");
      usernameField.clear();
      passwordField.clear();
          }
   }
}
