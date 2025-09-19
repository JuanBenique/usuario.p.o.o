package pe.edu.upeu.usuario.control;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField txtCorreo;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Label lblMensaje;

    @FXML
    private void irALogin() {
        String correo = txtCorreo.getText();
        String contrasena = txtPassword.getText();


        if(correo.isEmpty() || contrasena.isEmpty()) {
            lblMensaje.setText("Por favor completar todos los campos.");
            return;
        }

        if(correo.equals("juan@gmail.com") && contrasena.equals("1234")) {
            lblMensaje.setStyle("-fx-text-fill: green;");
            lblMensaje.setText("ingreso exitoso ");

        } else {
            lblMensaje.setStyle("-fx-text-fill: red;");
            lblMensaje.setText("Correo o contraseña incorrectos.");
        }
    }
}