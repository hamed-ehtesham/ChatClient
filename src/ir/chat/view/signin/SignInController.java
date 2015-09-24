package ir.chat.view.signin;

import ir.chat.Main;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Mohammad Amin on 10/09/2015.
 */
public class SignInController {
    @FXML
    private Button closeButton;
    @FXML
    private Pane movePane;
    @FXML
    private TextField emailAddress;
    @FXML
    private TextField password;


    @FXML
    private void initialize() {
    }

    public Pane getMovePane() {
        return movePane;
    }

    @FXML
    private void CloseButton_Clicked() {
        Platform.exit();
    }



}


