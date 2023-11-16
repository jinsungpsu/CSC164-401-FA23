package com.example.week12javafxfun;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private Circle ball;

    @FXML
    private Text menuText;

    @FXML
    void godown(ActionEvent event) {
        ball.setCenterY(ball.getCenterY()+5);
    }

    @FXML
    void goleft(ActionEvent event) {
        ball.setCenterX(ball.getCenterX()-5);
    }

    @FXML
    void goright(ActionEvent event) {
        ball.setCenterX(ball.getCenterX()+5);
    }

    @FXML
    void goup(ActionEvent event) {
        ball.setCenterY(ball.getCenterY()-5);
    }

    public void initialize() {
        Drink[] menu = {new Drink("Frap", 200),
                new Drink("Coffee", 20),
                new Drink("Decaf", 5)};

        for (int i = 0; i < menu.length; i++) {
            menuText.setText(menuText.getText() +  "\n" + menu[i].toString());
        }
    }

}
