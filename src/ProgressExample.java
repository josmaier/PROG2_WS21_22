import javafx.scene.control.ProgressBar;
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

public class ProgressExample extends Application {
    
    public void start(Stage stage){
        stage.setTitle("Progress");

        Label label = new Label("Click 10 times");

        ProgressBar progressBar = new ProgressBar(0.0);

        Button countUp = new Button("More!");

        FlowPane pane = new FlowPane(label, progressBar, countUp);
        pane.setVgap(10);

        pane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(pane, 150, 100);

        countUp.setOnAction((event) -> {
            progressBar.setProgress(progressBar.getProgress() + 0.1);
        });

        stage.setScene(scene);

        stage.show();



    }

    public static void main(String[] args) {
        launch(args);
    }
}
