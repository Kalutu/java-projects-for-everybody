package com.example.deblocksemesterproject;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class TicTacToeSignUpController {
    @FXML
    private TextField input1;
    @FXML
    private TextField input2;


    @FXML
    private void startGame(javafx.event.ActionEvent event) throws IOException {

        String player1Name = input1.getText();
        String player2Name = input2.getText();
        System.out.println(player1Name);
        System.out.println(player2Name);


        FXMLLoader loader = new FXMLLoader(getClass().getResource("TicTacToe.fxml"));
        Parent root = loader.load();

        TicTacToeController gameController = loader.getController();
        gameController.displayNames(player1Name,player2Name);

        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


}
