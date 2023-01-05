import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.text.Text;

public class Main extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("views/main.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("JavaFX Application");
        stage.setWidth(600);
        stage.setHeight(400);
        stage.setMinWidth(600);
        stage.setMinHeight(400);
        stage.show();
    }
}