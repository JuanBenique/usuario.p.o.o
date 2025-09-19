package pe.edu.upeu.usuario.control;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MenuController {

    @FXML private Button btnUsuario;
    @FXML private Button btnRegistrar;

    @FXML
    private void irALogin() {
        System.out.println("Botón Iniciar Sesión presionado");
        // Aquí luego cargas login.fxml
    }

    @FXML
    private void irARegistro() {
        System.out.println("Botón Registrar presionado");
        // Aquí luego cargas registro.fxml
    }
}
