package View;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class Display {
    private final AnchorPane displayPane;
    private final Scene displayScene;

    public Display(){
        displayPane = new AnchorPane();
        displayScene = new Scene(displayPane, SceneController.WIDTH,SceneController.HEIGHT);
        textFields();
    }

    public Scene getDisplayScene() {
        return displayScene;
    }

    private void textFields(){
        nameInput();
        ageInput();
        emailInput();
        phoneNumber();
        genderInput();
        dateInput();
        destination();
        departureTime();
    }

    private void nameInput(){
        Label label = new Label("Name: ");
        TextField textField = new TextField();
        Button nameBtn = new Button("Submit");
        HBox hb = new HBox();
        hb.getChildren().addAll(label, textField, nameBtn);
        hb.setSpacing(10);
        displayPane.getChildren().add(hb);
    }

    private void ageInput(){
        Label label = new Label("Age: ");
        TextField textField = new TextField();
        Button ageBtn = new Button("Submit");
        HBox hb = new HBox();
        hb.getChildren().addAll(label, textField, ageBtn);
        hb.setSpacing(10);
        hb.setLayoutY(30);
        displayPane.getChildren().add(hb);
    }

    private void emailInput(){
        Label label = new Label("E-mail: ");
        TextField textField = new TextField();
        Button emailBtn = new Button("Submit");
        HBox hb = new HBox();
        hb.getChildren().addAll(label, textField, emailBtn);
        hb.setSpacing(10);
        hb.setLayoutY(60);
        displayPane.getChildren().add(hb);
    }

    private void phoneNumber(){
        Label label = new Label("Phone Number: ");
        TextField textField = new TextField();
        Button phoneBtn = new Button("Submit");
        HBox hb = new HBox();
        hb.getChildren().addAll(label, textField, phoneBtn);
        hb.setSpacing(10);
        hb.setLayoutY(90);
        displayPane.getChildren().add(hb);
    }

    private void genderInput(){
        Label label = new Label("Gender: ");
        TextField textField = new TextField();
        Button genderBtn = new Button("Submit");
        HBox hb = new HBox();
        hb.getChildren().addAll(label, textField, genderBtn);
        hb.setSpacing(10);
        hb.setLayoutY(120);
        displayPane.getChildren().add(hb);
    }

    private void dateInput(){
        Label label = new Label("Date: ");
        TextField textField = new TextField();
        Button dateBtn = new Button("Submit");
        HBox hb = new HBox();
        hb.getChildren().addAll(label, textField, dateBtn);
        hb.setSpacing(10);
        hb.setLayoutY(150);
        displayPane.getChildren().add(hb);
    }

    private void destination(){
        Label label = new Label("Destination: ");
        ChoiceBox<String> destinations = new ChoiceBox<>();
        destinations.getItems().add("LA");
        destinations.getItems().add("Candy Land");
        destinations.getItems().add("Skyrim");
        destinations.getItems().add("Wolf Den");

        destinations.setValue("LA");

        Button desBtn = new Button("Submit");
        HBox hb = new HBox();
        hb.getChildren().addAll(label, destinations, desBtn);
        hb.setSpacing(10);
        hb.setLayoutY(180);
        displayPane.getChildren().add(hb);
    }

    private void departureTime(){
        Label label = new Label("Departure: ");
        TextField textField = new TextField();
        Button depBtn = new Button("Submit");
        HBox hb = new HBox();
        hb.getChildren().addAll(label, textField, depBtn);
        hb.setSpacing(10);
        hb.setLayoutY(210);
        displayPane.getChildren().add(hb);
    }
}
