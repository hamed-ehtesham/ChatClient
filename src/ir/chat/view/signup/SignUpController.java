package ir.chat.view.signup;

import ir.chat.Main;
import ir.chat.RegisterRequest;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Mohammad Amin on 10/09/2015.
 */
public class SignUpController {
    @FXML
    private Button closeButton;
    @FXML
    private Pane movePane;
    @FXML
    private TextField emailAddress;
    @FXML
    private TextField firstname;
    @FXML
    private TextField nickname;
    @FXML
    private TextField lastname;
    @FXML
    private TextField password;
    @FXML
    private TextField confirmPassword;


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

    @FXML
    private void RegisterButton_Clicked() {
        vali
        RegisterRequest request = new RegisterRequest("aminbajand@gmail.com", "i,d[", "amin", "bajand", "aminbag");
        request.request();
    }

    private void setControlStyle(Node node, Color color) {
        String hex = String.format("#%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue());
        node.setStyle("-fx-background-color: "+hex);
    }
}


