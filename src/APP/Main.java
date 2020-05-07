package APP;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        try {

            Parent root = FXMLLoader.load(getClass().getResource("view/MageSheetMaker_view.fxml"));
            Scene scene = new Scene(root,500,500);
            primaryStage.setScene(scene);
            primaryStage.show();

            final Stage dialog = new Stage();
            dialog.initModality(Modality.APPLICATION_MODAL);
            dialog.initOwner(primaryStage);
            Parent boot = FXMLLoader.load(getClass().getResource("view/MageSheetMaker_Exp_In_view.fxml"));
            Scene dialogScene = new Scene(boot, 600, 163);
            dialog.setScene(dialogScene);
            dialog.show();


        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
