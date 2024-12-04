package com.example.deblocksemesterproject;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TicTacToeController extends CheckForWinner {
    @FXML
    private Label BottemText;
    @FXML
    private Button Button1;
    @FXML
    private Button Button2;
    @FXML
    private Button Button3;
    @FXML
    private Button Button4;
    @FXML
    private Button Button5;
    @FXML
    private Button Button6;
    @FXML
    private Button Button7;
    @FXML
    private Button Button8;
    @FXML
    private Button Button9;
    @FXML
    private Label Player1Name;
    @FXML
    private Label Player2Name;
    @FXML
    private Button PlayAgain;


    boolean clicked1 = false;
    boolean clicked2 = false;
    boolean clicked3 = false;
    boolean clicked4 = false;
    boolean clicked5 = false;
    boolean clicked6 = false;
    boolean clicked7 = false;
    boolean clicked8 = false;
    boolean clicked9 = false;

    String[] answers = new String[9];


    private boolean turn = true;

    @FXML
    protected void ButtonClick1() {
        if (turn && clicked1 == false) {
            Button1.setText("X");
            answers[0] = "X";
            turn = false;
        } else if (clicked1 == false) {
            Button1.setText("O");
            answers[0] = "O";
            turn = true;
        }
        clicked1 = true;
        System.out.println(checkWinner(answers));
        BottemText.setText(checkWinner(answers));
        if (BottemText != null) {
            PlayAgain.setVisible(true);
        }
    }

    @FXML
    protected void ButtonClick2() {
        if (turn && clicked2 == false) {
            Button2.setText("X");
            answers[1] = "X";
            turn = false;
        } else if (clicked2 == false) {
            Button2.setText("O");
            answers[1] = "O";
            turn = true;
        }
        clicked2 = true;
        System.out.println(checkWinner(answers));
        BottemText.setText(checkWinner(answers));
        if (BottemText != null) {
            PlayAgain.setVisible(true);
        }
    }

    @FXML
    protected void ButtonClick3() {
        if (turn && clicked3 == false) {
            Button3.setText("X");
            answers[2] = "X";
            turn = false;
        } else if (clicked3 == false) {
            Button3.setText("O");
            answers[2] = "O";
            turn = true;
        }
        clicked3 = true;
        System.out.println(checkWinner(answers));
        BottemText.setText(checkWinner(answers));
        if (BottemText != null) {
            PlayAgain.setVisible(true);
        }
    }

    @FXML
    protected void ButtonClick4() {
        if (turn && clicked4 == false) {
            Button4.setText("X");
            answers[3] = "X";
            turn = false;
        } else if (clicked4 == false) {
            Button4.setText("O");
            answers[3] = "O";
            turn = true;
        }
        clicked4 = true;
        System.out.println(checkWinner(answers));
        BottemText.setText(checkWinner(answers));
        if (BottemText != null) {
            PlayAgain.setVisible(true);
        }
    }

    @FXML
    protected void ButtonClick5() {
        if (turn && clicked5 == false) {
            Button5.setText("X");
            answers[4] = "X";
            turn = false;
        } else if (clicked5 == false) {
            Button5.setText("O");
            answers[4] = "O";
            turn = true;
        }
        clicked5 = true;
        System.out.println(checkWinner(answers));
        BottemText.setText(checkWinner(answers));
        if (BottemText != null) {
            PlayAgain.setVisible(true);
        }
    }

    @FXML
    protected void ButtonClick6() {
        if (turn && clicked6 == false) {
            Button6.setText("X");
            answers[5] = "X";
            turn = false;
        } else if (clicked6 == false) {
            Button6.setText("O");
            answers[5] = "O";
            turn = true;
        }
        clicked6 = true;
        System.out.println(checkWinner(answers));
        BottemText.setText(checkWinner(answers));
        if (BottemText != null) {
            PlayAgain.setVisible(true);
        }
    }

    @FXML
    protected void ButtonClick7() {
        if (turn && clicked7 == false) {
            Button7.setText("X");
            answers[6] = "X";
            turn = false;
        } else if (clicked7 == false) {
            Button7.setText("O");
            answers[6] = "O";
            turn = true;
        }
        clicked7 = true;
        System.out.println(checkWinner(answers));
        BottemText.setText(checkWinner(answers));
        if (BottemText != null) {
            PlayAgain.setVisible(true);
        }
    }

    @FXML
    protected void ButtonClick8() {
        if (turn && clicked8 == false) {
            Button8.setText("X");
            answers[7] = "X";
            turn = false;
        } else if (clicked8 == false) {
            Button8.setText("O");
            answers[7] = "O";
            turn = true;
        }
        clicked8 = true;
        System.out.println(checkWinner(answers));
        BottemText.setText(checkWinner(answers));
        if (BottemText != null) {
            PlayAgain.setVisible(true);
        }
    }

    @FXML
    protected void ButtonClick9() {
        if (turn && clicked9 == false) {
            Button9.setText("X");
            answers[8] = "X";
            turn = false;
        } else if (clicked9 == false) {
            Button9.setText("O");
            answers[8] = "O";
            turn = true;
        }
        clicked9 = true;
        System.out.println(checkWinner(answers));
        BottemText.setText(checkWinner(answers));
        if (BottemText != null) {
            PlayAgain.setVisible(true);
        }

    }

    @FXML
    protected void Reset() {
        for (int i = 0; i < 9; i++) {
            answers[i] = null;
        }
        Button1.setText("X | O");
        Button2.setText("X | O");
        Button3.setText("X | O");
        Button4.setText("X | O");
        Button5.setText("X | O");
        Button6.setText("X | O");
        Button7.setText("X | O");
        Button8.setText("X | O");
        Button9.setText("X | O");

        clicked1 = false;
        clicked2 = false;
        clicked3 = false;
        clicked4 = false;
        clicked5 = false;
        clicked6 = false;
        clicked7 = false;
        clicked8 = false;
        clicked9 = false;

        turn = true;
        BottemText.setText(null);
        PlayAgain.setVisible(false);

    }

    public void displayNames(String p1, String p2){
        Player1Name.setText(p1 + " is X");
        Player2Name.setText(p2 + " is Y");
    }




}
