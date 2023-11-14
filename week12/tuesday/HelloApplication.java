package com.example.week12javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
//        VBox myvbox = new VBox();
//        Scene myscene = new Scene(myvbox, 400, 300);
//
//
//        for (int i = 0; i < 5; i++) {
//            Button mybutton = new Button(String.valueOf(i+1));
//            myvbox.getChildren().add(mybutton);
//        }
//
//        stage.setScene(myscene);
//        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
