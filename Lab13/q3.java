import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class q3 extends Application {

    @Override
    public void start(Stage primaryStage) {

        GridPane pane = new GridPane();

        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                int random = (int)(Math.random() * 3);
                if (random == 0 || random ==1) 
                {
                    String image = (random == 0) ? "x.png" : "o.png";
                    ImageView imageView = new ImageView(image);
                    imageView.setFitHeight(100);
                    imageView.setFitWidth(100);
                    pane.add(imageView, j, i);
                }
            }
        }
        Scene scene = new Scene(pane, 150, 150);
        primaryStage.setTitle("XOX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {

        Application.launch(args);

    }

}