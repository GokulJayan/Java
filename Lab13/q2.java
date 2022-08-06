import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.stage.Stage;
import javafx.scene.control.Button;  
import javafx.scene.control.Label;  
import javafx.scene.control.TextField;  
import javafx.scene.layout.GridPane;  
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 

public class q2 extends Application {  
       
public static void main(String[] args) {  
    launch(args);     
}  
  
@Override  
public void start(Stage primaryStage) throws Exception {  
    Label name=new Label("Name"); 
    name.setStyle("-fx-font:bold 20px TimesRoman;");
    Label myName=new Label("Gokul Jayan"); 
    myName.setStyle("-fx-font:bold 20px TimesRoman;"  + "-fx-font-weight:bold;" + "-fx-border-color: yellow;" + "-fx-background-color : white;" + "-fx-padding : 5;" + "-fx-text-fill :black;" );

    Label id = new Label("ID");
    id.setStyle("-fx-font:bold 20px TimesRoman;");
    Label myId = new Label("20BCE1249");
    myId.setStyle("-fx-font:bold 20px TimesRoman;"  + "-fx-font-weight:bold;" + "-fx-border-color: yellow;" + "-fx-background-color : white;" + "-fx-padding : 5;" + "-fx-text-fill :blue;" );


    Label address = new Label("Address");
    address.setStyle("-fx-font:bold 20px TimesRoman;");
    Label myAddress = new Label("Chaithanya, Kattachira, Pallickal(P.O)");
    myAddress.setStyle("-fx-font:bold 20px TimesRoman;"  + "-fx-font-weight:bold;" + "-fx-border-color: yellow;" + "-fx-background-color : white;" + "-fx-padding : 5;" + "-fx-text-fill :cyan;" );

    Label phone = new Label("Phone");    
    phone.setStyle("-fx-font:bold 20px TimesRoman;");
    Label myPhone = new Label("8156932713");
    myPhone.setStyle("-fx-font:bold 20px TimesRoman;"  + "-fx-font-weight:bold;" + "-fx-border-color: yellow;" + "-fx-background-color : white;" + "-fx-padding : 5;" + "-fx-text-fill :green;" );
    
    
    GridPane root = new GridPane();  

    root.setPadding(new Insets(10, 10, 10, 10)); 

    root.setVgap(5); 
    root.setHgap(10); 

    root.addRow(0, name, myName);  
    root.addRow(1, id, myId);  
    root.addRow(2, address,myAddress);
    root.addRow(3, phone,myPhone);
    
    Scene scene=new Scene(root,800,200);  
    primaryStage.setScene(scene);  
    primaryStage.setTitle("Personal Details");  
    primaryStage.show();  
}  
}  