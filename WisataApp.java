import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class WisataApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML file
        Parent root = FXMLLoader.load(getClass().getResource("Wisata.fxml"));

        // Set the JavaFX system properties explicitly
        System.setProperty("javafx.graphics.perflog", "true");

        // Set up the primary stage
        primaryStage.setTitle("Aplikasi Penghitung Kendaraan");
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
