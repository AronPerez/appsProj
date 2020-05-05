package APP;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.application.Application;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        try {
<<<<<<< HEAD
            Parent root = FXMLLoader.load(getClass().getResource("view/MageSheetMaker_view.fxml"));
            Scene scene = new Scene(root,400,400);
=======
            Parent root = FXMLLoader.load(getClass().getResource("View/MageSheetMaker_view.fxml"));
            Scene scene = new Scene(root,800,800);
>>>>>>> 9a15d62a797195ddc3a8087bc79b07247b1b6523
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
