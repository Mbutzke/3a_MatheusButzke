/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifro.edu.br;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author 02119149240
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField txtNumero1;
    @FXML
    private TextField txtNumero2;

    @FXML
    private TextField txtResultado;
    @FXML
    private Label label;
    @FXML
    private JFXButton btnSoma;
    @FXML
    private JFXButton btnSubtratir;
    @FXML
    private JFXButton btnMultiplicar;
    @FXML
    private JFXButton btnDividir;
    @FXML
    private JFXButton btnLimpar;

    @FXML
    private void soma(ActionEvent event) {
        Double num1 = Double.parseDouble(txtNumero1.getText());
        Double num2 = Double.parseDouble(txtNumero2.getText());
        Double resultado = num1 + num2;

        txtResultado.setText(resultado.toString());
    }

    @FXML
    private void subtracao(ActionEvent event) {
        Double num1 = Double.parseDouble(txtNumero1.getText());
        Double num2 = Double.parseDouble(txtNumero2.getText());
        Double resultado = num1 - num2;

        txtResultado.setText(resultado.toString());
    }

    @FXML
    private void divisao(ActionEvent event) {
        Double num1 = Double.parseDouble(txtNumero1.getText());
        Double num2 = Double.parseDouble(txtNumero2.getText());
        Double resultado = num1 / num2;

        txtResultado.setText(resultado.toString());
    }

    @FXML
    private void multiplicacao(ActionEvent event) {
        Double num1 = Double.parseDouble(txtNumero1.getText());
        Double num2 = Double.parseDouble(txtNumero2.getText());
        Double resultado = num1 * num2;

        txtResultado.setText(resultado.toString());
    }

    @FXML
    private void limpar(ActionEvent event) {

        txtResultado.setText("");
        txtNumero1.setText("");
        txtNumero2.setText("");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void abrirCadastroAluno(ActionEvent event) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Aluno.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 900, 682);
            Stage stage = new Stage();
            stage.setTitle("Cadastrar aluno");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {

        }
    }

    @FXML
    private void fecharProjeto(ActionEvent event) {
    }

}
