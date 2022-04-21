package View;

import com.example.wolfpackairlines.Customer;
import com.example.wolfpackairlines.File_Writer;

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

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;




public class Display {
    private final AnchorPane displayPane;
    private final Scene displayScene;
    private final AnchorPane mainDiv = new AnchorPane();
    private TextField name;
    private TextField email;
    private TextField phone;
    private TextField age;
    private ChoiceBox<String> gender;
    private DatePicker date;
    private ChoiceBox<String> destinations;
    private ChoiceBox<String> depart;

    public Display(){
        displayPane = new AnchorPane();
        displayScene = new Scene(displayPane, SceneController.WIDTH,SceneController.HEIGHT);
        displayScene.getRoot().setStyle("-fx-font-family: 'serif'");
        setTitle();
        addTextFields();
        setDivPos();
        addButton();
        addLogo();
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

    private void addTextFields(){
        nameInput();
        emailInput();
        phoneNumber();
        genderInput();
        ageInput();
        dateInput();
        flights();
        departureTime();
    }


    public Customer newCustomer(){
        return new Customer(name.getText(), email.getText(), phone.getText(), gender.getValue(), age.getText(), String.valueOf(date.getValue()), destinations.getValue(), depart.getValue());
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
        mainDiv.setPrefHeight(500);
        mainDiv.setStyle("-fx-background-color: #1b2b50;-fx-background-radius: 20;-fx-border-width: 3px;-fx-border-color: black;-fx-border-radius: 20;");
        displayPane.getChildren().add(mainDiv);
    }

    public Scene getDisplayScene() {
        return displayScene;
    }

    private void nameInput(){
        Label label = new Label("Name: ");
        label.setTextFill(Color.WHITE);
        name = new TextField();
        VBox vBox = new VBox();
        vBox.setLayoutX(75);
        vBox.getChildren().addAll(label, name);
        mainDiv.getChildren().add(vBox);
    }

    private void emailInput(){
        Label label = new Label("E-mail: ");
        label.setTextFill(Color.WHITE);
        email = new TextField();
        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, email);
        vBox.setLayoutX(75);
        vBox.setLayoutY(50);
        mainDiv.getChildren().add(vBox);
    }

    private void phoneNumber(){
        Label label = new Label("Phone Number: ");
        label.setTextFill(Color.WHITE);
        phone = new TextField();
        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, phone);
        vBox.setLayoutX(75);
        vBox.setLayoutY(100);
        mainDiv.getChildren().add(vBox);
    }

    private void genderInput(){
        Label label = new Label("Gender: ");
        label.setTextFill(Color.WHITE);

        gender = new ChoiceBox<>();
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
        age = new TextField();
        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, age);
        vBox.setLayoutX(75);
        vBox.setLayoutY(200);
        mainDiv.getChildren().add(vBox);
    }

    private void dateInput(){
        Label label = new Label("Date: ");
        label.setTextFill(Color.WHITE);
        date = new DatePicker(LocalDate.now());
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
        destinations = new ChoiceBox<>();
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


        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, destinations);
        vBox.setLayoutX(75);
        vBox.setLayoutY(300);
        mainDiv.getChildren().add(vBox);
    }

    private void departureTime(){
        Label label = new Label("Departure: ");
        label.setTextFill(Color.WHITE);
        depart = new ChoiceBox<>();
        depart.getItems().add("0600");
        depart.getItems().add("0900");
        depart.getItems().add("1200");
        depart.getItems().add("1500");

        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, depart);
        vBox.setLayoutX(75);
        vBox.setLayoutY(350);
        mainDiv.getChildren().add(vBox);
    }

    public String eta(int flightTime, String departureTime) {
        int departureHour = Integer.parseInt(departureTime.substring(0, 2));
        int departureMinutes = Integer.parseInt(departureTime.substring(2));
        int addHours = flightTime / 60;
        int addMinutes = flightTime % 60;
        int arriveHour = departureHour + addHours;
        int arriveMinutes = departureMinutes + addMinutes;

        return String.valueOf(arriveHour + arriveMinutes);
    }

    private void addButton(){
        Button submit = new Button("Submit");
        submit.setStyle("-fx-background-color: green; -fx-text-fill: white;");
        submit.setOnMouseEntered(mouseEvent -> submit.setEffect(new DropShadow()));
        submit.setOnMouseExited(mouseEvent -> submit.setEffect(null));
        submit.setOnMouseClicked(mouseEvent -> {
            try {
                if(validateFormData()){
                File_Writer.addCustomerData(newCustomer());
                } else {
                    Alert a = new Alert(Alert.AlertType.ERROR);
                    a.setTitle("Error");
                    a.setHeaderText("Error Info Invalid");
                    a.setContentText("Please make sure all fields are filled out\nMake sure data is valid before submitting");
                    a.show();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        mainDiv.getChildren().add(submit);
        submit.setLayoutX(75);
        submit.setLayoutY(400);
    }

    private boolean nameValidation() {
        //A name must be first name and last name separated by space (Ray Alva). Can include Upper and Lower case.
        return name.getText().matches("([A-Za-z]*) ([A-Za-z]*)");
    }

    private boolean emailValidation() {
        //regex to match correct email format
        return email.getText().matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$");
    }

    private boolean phoneValidation() {
        //regex to check that phone number is ten numbers.
        return phone.getText().matches("\\d{10}");
    }

    private boolean genderValidation() {
        //Checks if gender is either Male or Female.
        return gender.getValue().equals("Male") || gender.getValue().equals("Female");
    }

    private boolean ageValidation() {
        //Checks if age is from 1 - 100.
        return age.getText().matches("^[1-9]?[0-9]{1}$|^100$");
    }

    private boolean dateValidation() {
        try{
            //If attempt to parse local date is successful date is valid
            DateTimeFormatter f = DateTimeFormatter.ofPattern( "uuuu-MM-dd" ) ;
            LocalDate ld = LocalDate.parse(String.valueOf(date.getValue()) ,f );
            return true;
        } catch ( Exception e ) {
            return false;
        }
    }

    private boolean destinationValidation() {
        //checks to see if the destinations contains the user input.
        return destinations.getItems().contains(destinations.getValue());
    }

    private boolean departureValidation() {
        //regex to make sure the departure time is formatted correctly (ex. 12:30pm)
        return depart.getValue().matches("\\d{4}");
    }

    private boolean validateFormData() {
        return nameValidation() && emailValidation() && phoneValidation() && genderValidation() && ageValidation() && dateValidation() && destinationValidation() && departureValidation();
    }
}
