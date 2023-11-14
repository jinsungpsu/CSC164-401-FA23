package com.example.week12javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


/*
PUMPKIN IMAGE: https://www.flickr.com/photos/wwarby/5145450010, William Warby

 */
public class HelloController {

    @FXML
    private VBox myvbox;

    @FXML
    private Label welcomeText;

    @FXML
    private Button button2;

    // controller runs FIRST
    public HelloController() {
        System.out.println("You created something...");

    }

    // initialize runs LAST
    public void initialize() {
        myvbox.getChildren().add(new Button("Another button"));
        Text someText = new Text("Hello my name is Mr. Awesome!");
        myvbox.getChildren().add(someText);
        someText.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
    }

    @FXML
    void onHelloButtonClick(ActionEvent event) {

    }

}
