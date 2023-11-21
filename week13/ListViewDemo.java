package com.example.week13listviewandfileio;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PokedexUIController {
    @FXML
    private Text headerText;

    @FXML
    private ListView<Character> pokedexListView;

    public void initialize() {
        Character p1 = new Character();
        p1.setName("Enemy");
        Pokemon pokemon1 = new Pokemon();
        pokemon1.setName("Pikachu");
        pokemon1.setHp(150);

        ArrayList<Character> pokedexContents = new ArrayList<>();
        pokedexContents.add(p1);
        pokedexContents.add(pokemon1);

        for (int i = 0; i < pokedexContents.size(); i++) {
            System.out.println(pokedexContents.get(i).getName());
            pokedexListView.getItems().add(pokedexContents.get(i));
        }


        // arithmetic exception - unchecked exception
        //System.out.println(1/0);

        String trainerName;
        try {
            // relative path
            File trainerNameFile = new File("src\\main\\resources\\trainerName.txt");
            // absolute path
            // File trainerNameFile = new File("Z:\\FA23\\CSC164-401-FA23\\week13-listviewAndFileIO\\src\\main\\resources\\trainerName.txt");
            Scanner fileInput = new Scanner(trainerNameFile);

            trainerName = fileInput.nextLine();

            // System.out.println(trainerName);
        } catch (FileNotFoundException e) {
//            System.out.println("PROBLEM!!!!");
//            System.out.println("Coudl not open the file!!!");
//            System.exit(401);

            trainerName = "DEFAULT TRAINER NAME";
        }

        // Scanner fileInput = new Scanner(new File("trainerName.txt"));

        String title = trainerName + "'s " + headerText.getText();
        headerText.setText(title);
    }

    @FXML
    void doSomething(ActionEvent event) {

    }
}
