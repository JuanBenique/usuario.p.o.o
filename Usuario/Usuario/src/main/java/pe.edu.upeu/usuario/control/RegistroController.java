package pe.edu.upeu.usuario.control;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.ArrayList;
import java.util.List;

public class RegistroController {

    @FXML private TextField txtGmail;
    @FXML private PasswordField txtPassword;
    @FXML private Label lblMensaje;


    private final List<Usuario> usuarios = new ArrayList<>();

    @FXML
    public void registrarGmail() {
        String gmail = txtGmail.getText().trim();
        String password = txtPassword.getText().trim();

        if(gmail.isEmpty() || password.isEmpty()) {
            lblMensaje.setText("Debe completar todos los datos.");
            return;
        }

        if(!gmail.contains("@gmail.com")) {
            lblMensaje.setText("Ingrese un Gmail válido.");
            return;
        }

        usuarios.add(new Usuario(gmail, password));
        lblMensaje.setStyle("-fx-text-fill:green");
        lblMensaje.setText("Usuario registrado correctamente!");

        txtGmail.clear();
        txtPassword.clear();
    }

    public static class Usuario {//guardar el gmail creados
        private String gmail;
        private String password;

        public Usuario(String gmail, String password) {
            this.gmail = gmail;
            this.password = password;
        }

        public String getGmail() { return gmail; }
        public String getPassword() { return password; }
    }
}
