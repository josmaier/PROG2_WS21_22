
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class TODOController {
    
    @FXML
    VBox TODOVBox;

    @FXML
    TextField TODOTextInput;

    String[] list = new String[1];

    @FXML
    private void handleAddNewButton(ActionEvent event){
        String textInput = TODOTextInput.getText();

        Label l = new Label(textInput);

        
        CheckBox checkBox = new CheckBox();
        TODOVBox.getChildren().add(l);
        TODOVBox.getChildren().add(checkBox);
        
    }

    @FXML
    private void importList(ActionEvent event){

    }

    @FXML
    private void exportList(ActionEvent event){

    }
}
