import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class Test extends Application {

    int count = 0;

    public static void main(String[] args){
        launch(args);
    }

    public void start(Stage stage){

        stage.setTitle("Hallo Welt");

        Button button = new Button("PUSH!");

        
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            count++;
            button.setText(count + " mal!");
            }
            });

        Scene scene = new Scene(button, 200, 150);

        stage.setScene(scene);

        stage.show();
    }

    
}
