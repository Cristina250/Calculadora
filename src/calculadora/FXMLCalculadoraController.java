/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Aluno
 */
public class FXMLCalculadoraController implements Initializable {

    private ArrayList<Integer> vetNum = new ArrayList<Integer>();
    private ArrayList<String> vetOp = new ArrayList<String>();

    @FXML
    private Label label;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("0");
        label.setText(label.getText() + "0");
    }

    @FXML
    private void numUm(ActionEvent event) {
        System.out.println("1");
        label.setText(label.getText() + "1");
    }

    @FXML
    private void numDois(ActionEvent event) {
        System.out.println("2");
        label.setText(label.getText() + "2");
    }

    @FXML
    private void numTres(ActionEvent event) {
        System.out.println("3");
        label.setText(label.getText() + "3");
    }

    @FXML
    private void numQuatro(ActionEvent event) {
        System.out.println("4");
        label.setText(label.getText() + "4");
    }

    @FXML
    private void numCinco(ActionEvent event) {
        System.out.println("5");
        label.setText(label.getText() + "5");
    }

    @FXML
    private void numSeis(ActionEvent event) {
        System.out.println("6");
        label.setText(label.getText() + "6");
    }

    @FXML
    private void numSete(ActionEvent event) {
        System.out.println("7");
        label.setText(label.getText() + "7");
    }

    @FXML
    private void numOito(ActionEvent event) {
        System.out.println("8");
        label.setText(label.getText() + "8");
    }

    @FXML
    private void numNove(ActionEvent event) {
        System.out.println("9");
        label.setText(label.getText() + "9");
    }

    @FXML
    private void soma(ActionEvent event) {
        System.out.println("+");
        Integer valor = Integer.parseInt(label.getText());
        vetNum.add(valor);
        label.setText("");
        vetOp.add("+");
    }
    @FXML
    private void subtracao(ActionEvent event) {
        System.out.println("-");
        Integer valor = Integer.parseInt(label.getText());
        vetNum.add(valor);
        label.setText("");
        vetOp.add("-");
    }
    @FXML
    private void divisao(ActionEvent event) {
        System.out.println("/");
        Integer valor = Integer.parseInt(label.getText());
        vetNum.add(valor);
        label.setText("");
        vetOp.add("/");
    }
    @FXML
    private void multiplicacao(ActionEvent event) {
        System.out.println("*");
        Integer valor = Integer.parseInt(label.getText());
        vetNum.add(valor);
        label.setText("");
        vetOp.add("*");
    }

    @FXML
    private void calcular() {
        Integer valor = Integer.parseInt(label.getText());
        vetNum.add(valor);
        label.setText("");
        int operacao = vetNum.get(0);
        int x=0;
        for (int i = 1; i < vetNum.size(); i++) {
            
            if(vetOp.get(x).equals("+")){
                operacao = operacao + vetNum.get(i);
            }
            if(vetOp.get(x).equals("-")){
                operacao = operacao - vetNum.get(i);
            }
            if(vetOp.get(x).equals("/")){
                operacao = operacao / vetNum.get(i);
            }
            if(vetOp.get(x).equals("*")){
                operacao = operacao * vetNum.get(i);
            }
            vetOp.remove(x);
            x++;
        }
        vetNum = new ArrayList();
        System.out.println(operacao);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

}
