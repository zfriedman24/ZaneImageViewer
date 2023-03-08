import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.util.ArrayList;

public class HelloApplication extends Application  {


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("ImageView Experiment 1");
        ArrayList<Image> images = new ArrayList();

        Image image1 = new Image(new FileInputStream("Lion_waiting_in_Namibia.jpg"));
        images.add(image1);

        Image image2 = new Image(new FileInputStream("pitbullimageviewer.jpg"));
        images.add(image2);

        Image image3 = new Image(new FileInputStream("___"));
        images.add(image3);

        FileInputStream input = new FileInputStream("Lion_waiting_in_Namibia.jpg");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);

        HBox hbox = new HBox(imageView);

        Scene scene = new Scene(hbox, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
