import java.awt.Color;

import javafx.application.Application;
import javafx.collections.*; 
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.text.*; 

public class q20 extends Application  {
    public void start(Stage stage) throws Exception {
        stage.setTitle("Sample");
        GridPane root = new GridPane();
        Text t1= new Text("Hello World");
        t1.setFont(new Font(45)); 
        t1.setX(50); 
        t1.setY(150);   
        root.addRow(0,t1);  
        Scene scene = new Scene(root,500, 200);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}