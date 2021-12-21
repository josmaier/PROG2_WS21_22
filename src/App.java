import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
public class App extends Application {

    public static void main(String[] args){
        launch(args);
    }

    public void start(Stage stage){

        stage.setTitle("Hallo Welt");

        Button button = new Button("PUSH!");

        Scene scene = new Scene(button, 200, 150);

        stage.setScene(scene);

        stage.show();
    }

    
}
