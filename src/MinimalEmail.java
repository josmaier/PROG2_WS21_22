import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class MinimalEmail extends Application {
    public void start(Stage stage) {
        stage.setTitle("Create Email");

        Label aLabel = new Label("An: ");
        TextField anInput = new TextField();
        TextArea mailText = new TextArea("Dear Miss/Mister XYZ. \n\n");
        PasswordField passwordField = new PasswordField();
        Button send = new Button("Send");

        send.setOnAction((event) -> {
            if (passwordField.getText().equals("123456")) {
                System.out.println("To: " + anInput.getText() + "\n" + mailText.getText());
            } else {
                System.out.println("Wrong Password");
            }
        });

        FlowPane pane = new FlowPane(aLabel, anInput, mailText, passwordField, send);

        Scene scene = new Scene(pane, 540, 250);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
