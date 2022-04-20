package View;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


import java.time.LocalDate;
import java.util.ArrayList;


public class Display {
    private final AnchorPane displayPane;
    private final Scene displayScene;
    private final ArrayList<String> customer = new ArrayList<>();
    private final AnchorPane mainDiv = new AnchorPane();

    public Display(){
        displayPane = new AnchorPane();
        displayScene = new Scene(displayPane, SceneController.WIDTH,SceneController.HEIGHT);
        setTitle();
        setDivPos();
        addLogo();
        textFields();
    }

    private void setTitle(){
        Text title = new Text();
        title.setText("Thank you for choosing Wolf Pack Airlines!");
        title.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 30));

        Text subTitle = new Text();
        subTitle.setText("Please enter your information and select your flight,\nthe date and the time");
        subTitle.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));

        title.setLayoutX(200);
        title.setLayoutY(100);

        subTitle.setLayoutX(300);
        subTitle.setLayoutY(150);

        displayPane.getChildren().add(title);
        displayPane.getChildren().add(subTitle);
    }

    private void addLogo(){
        ImageView wolfLogo = new ImageView("wolf_logo.jpg");
        wolfLogo.setFitHeight(64);
        wolfLogo.setFitWidth(64);
        displayPane.getChildren().add(wolfLogo);
    }

    private void setDivPos(){
        mainDiv.setLayoutX(400);
        mainDiv.setLayoutY(200);
        mainDiv.setPrefWidth(300);
        mainDiv.setPrefHeight(400);
        mainDiv.setStyle("-fx-background-color: #1b2b50;-fx-background-radius: 20;-fx-border-width: 3px;-fx-border-color: black;-fx-border-radius: 20;");
        displayPane.getChildren().add(mainDiv);
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
        flights();
        departureTime();
    }

    public ArrayList<String> getInput(){
        return customer;
    }

    private void nameInput(){
        Label label = new Label("Name: ");
        label.setTextFill(Color.WHITE);
        TextField textField = new TextField();
        customer.add(textField.getText());
        VBox vBox = new VBox();
        vBox.setLayoutX(75);
        vBox.getChildren().addAll(label, textField);
        mainDiv.getChildren().add(vBox);

    }

    private void emailInput(){
        Label label = new Label("E-mail: ");
        label.setTextFill(Color.WHITE);
        TextField textField = new TextField();
        customer.add(textField.getText());
        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, textField);
        vBox.setLayoutX(75);
        vBox.setLayoutY(50);
        mainDiv.getChildren().add(vBox);
    }

    private void phoneNumber(){
        Label label = new Label("Phone Number: ");
        label.setTextFill(Color.WHITE);
        TextField textField = new TextField();
        customer.add(textField.getText());
        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, textField);
        vBox.setLayoutX(75);
        vBox.setLayoutY(100);
        mainDiv.getChildren().add(vBox);
    }

    private void genderInput(){
        Label label = new Label("Gender: ");
        label.setTextFill(Color.WHITE);

        ChoiceBox<String> gender = new ChoiceBox<>();
        gender.getItems().add("Male");
        gender.getItems().add("Female");

        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, gender);
        vBox.setLayoutX(75);
        vBox.setLayoutY(150);
        mainDiv.getChildren().add(vBox);
    }

    private void ageInput(){
        Label label = new Label("Age: ");
        label.setTextFill(Color.WHITE);
        TextField textField = new TextField();
        customer.add(textField.getText());
        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, textField);
        vBox.setLayoutX(75);
        vBox.setLayoutY(200);
        mainDiv.getChildren().add(vBox);
    }

    private void dateInput(){
        Label label = new Label("Date: ");
        label.setTextFill(Color.WHITE);
        DatePicker date = new DatePicker(LocalDate.now());
        date.setDayCellFactory(picker -> new DateCell(){
            public void updateItem(LocalDate date, boolean empty){
                super.updateItem(date, empty);
                LocalDate today = LocalDate.now();

                setDisable(empty || date.compareTo(today) < 0);
            }
        });

        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, date);
        vBox.setLayoutX(75);
        vBox.setLayoutY(250);
        mainDiv.getChildren().add(vBox);
    }

    private void flights(){
        Label label = new Label("Flights: ");
        label.setTextFill(Color.WHITE);
        ChoiceBox<String> destinations = new ChoiceBox<>();
        destinations.getItems().add("Atlanta (ATL) to Ft. Lauderdale (FLL)");
        destinations.getItems().add("Atlanta (ATL) to New York (LGA)");
        destinations.getItems().add("Denver (DEN) to Los Angeles (LAX)");
        destinations.getItems().add("Los Angeles (LAX) to Seattle (SEA)");
        destinations.getItems().add("Las Vegas (LAS) to Los Angeles (LAX)");
        destinations.getItems().add("Atlanta (ALT) to Orlando (MCO)");
        destinations.getItems().add("Los Angeles (LAX) to Chicago (ORD)");
        destinations.getItems().add("New York (LGA) to Chicago (ORD)");
        destinations.getItems().add("Los Angeles (LAX) to San Francisco (SFO)");
        destinations.getItems().add("New York (JFK) to Los Angeles (LAX)");

        customer.add(destinations.getValue());
        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, destinations);
        vBox.setLayoutX(75);
        vBox.setLayoutY(300);
        mainDiv.getChildren().add(vBox);
    }

    private void departureTime(){
        Label label = new Label("Departure: ");
        label.setTextFill(Color.WHITE);
        TextField textField = new TextField();
        customer.add(textField.getText());
        Button depBtn = new Button("Submit");
        depBtn.setStyle("-fx-background-color: green; -fx-text-fill: white;");
        depBtn.setOnMouseEntered(mouseEvent -> depBtn.setEffect(new DropShadow()));
        depBtn.setOnMouseExited(mouseEvent -> depBtn.setEffect(null));

        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, textField, depBtn);
        vBox.setLayoutX(75);
        vBox.setLayoutY(350);
        mainDiv.getChildren().add(vBox);
    }
}
