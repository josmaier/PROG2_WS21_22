import javafx.geometry.Pos;
import javafx.scene.control.Slider;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
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


public class SliderExample extends Application {
    
    public void start(Stage stage){

        stage.setTitle("Sliders");

        Slider slider1 = new Slider(0.0, 1.0, 0.5);

        Slider slider2 = new Slider(-50, +50, 17);
        slider2.setShowTickLabels(true);
        slider2.setShowTickMarks(true);
        slider2.setMajorTickUnit(25);
        slider2.setMinorTickCount(5);
        slider2.setBlockIncrement(10);

        FlowPane pane = new FlowPane(slider1, slider2);
        pane.setVgap(10.0);
        pane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(pane, 200, 100);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
