package ir.chat.view.signup;

import ir.chat.Main;
import ir.chat.RegisterRequest;
import ir.chat.util.ValidationUtil;
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
    public Label errorLabel;


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
        StringBuilder errorMessage = new StringBuilder();
        boolean validateEmail = ValidationUtil.validateEmail(emailAddress.getText());
        if (!validateEmail)
            errorMessage.append(emailAddress.getText() + " is not a valid email address\r\n");
        boolean validatePasswordStrengh = ValidationUtil.validatePasswordStrengh(password.getText());
        if (!validatePasswordStrengh)
            errorMessage.append("your password must be at least 8 characters in length" +
                    " and it must contain at least One Upper-case letter," +
                    " Tow Numbers and Three Lower-case letters\r\n");
        boolean Passwordconfirmed = ValidationUtil.validateConfirmPassword(password.getText(), this.confirmPassword.getText());
        if (!Passwordconfirmed)
            errorMessage.append("your confirm password does not match the original one");
        if (validateEmail & validatePasswordStrengh & Passwordconfirmed) {
            RegisterRequest request = new RegisterRequest("aminbajand@gmail.com", "i,d[", "amin", "bajand", "aminbag");
            request.request();
        } else {
            errorLabel.setText(errorMessage.toString());
            if (!validateEmail)
                setControlStyle(emailAddress, Color.ORANGERED);
            if (!validatePasswordStrengh)
                setControlStyle(password, Color.WHITE);
            if (!Passwordconfirmed)
                setControlStyle(confirmPassword, Color.SPRINGGREEN);
        }
    }

    private void setControlStyle(Node node, Color color) {
        String hex = String.format("#%02x%02x%02x", (int) (color.getRed() * 255), (int) (color.getGreen() * 255), (int) (color.getBlue() * 255));
        System.out.println(hex);
        node.setStyle("-fx-background-color: " + hex);
    }
}


