package pe.edu.upeu.usuario.control;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MenuController {

    @FXML private Button btnUsuario;
    @FXML private Button btnRegistrar;

    @FXML
    private void irALogin() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/login.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) btnUsuario.getScene().getWindow(); // ventana actual
            stage.setScene(new Scene(root));
            stage.setTitle("Login - Venta de Laptops");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void irARegistro() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/registro.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) btnRegistrar.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Registro - Venta de Laptops");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
