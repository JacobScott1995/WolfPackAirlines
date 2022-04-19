package com.example.wolfpackairlines;

import View.SceneController;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        SceneController main = new SceneController();
        stage = main.getMainStage();
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}