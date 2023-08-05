package com.example.magic_8_ball;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class HelloController {

    public TextField QuestionField;
    Random rand = new Random();
    @FXML
    private Label welcomeText;

    @FXML
    protected void onEnterButtonClick() {
        QuestionField.clear();
        String n = "No";
        String y = "Yes";
        String m = "Maybe";
        String a = "It's likely";
        String d = "I wouldn't tell anyone else you asked";
        String result = "I'm distracted, ask again";
        int x = 0;
        int upperbound = 6;

        int z = x;
        x = rand.nextInt(upperbound);

        while (x == z){
            x = rand.nextInt(upperbound);
        }



        switch (x){

            case 1: x = 1;
            result = n;
            break;

            case 2: x = 2;
                result = y;
                break;

                case 3: x = 3;
                result = m;
                break;

                case 4: x = 4;
                result = a;
                break;

            case 5: x = 5;
                result = d;
                break;
        }

        welcomeText.setText(result);

    }
}