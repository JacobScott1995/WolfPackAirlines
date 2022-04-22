package View;

import com.example.wolfpackairlines.Customer;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Formatter;


public class BoardingPass {
    private final AnchorPane passPane;
    private final Scene passScene;
    private final AnchorPane mainDiv = new AnchorPane();
    private Customer customer;

    public BoardingPass(Customer customer) throws DocumentException, IOException {
        this.customer = customer;
        passPane = new AnchorPane();
        passScene = new Scene(passPane, SceneController.WIDTH, SceneController.HEIGHT);
        passScene.getRoot().setStyle("-fx-font-family: 'serif'");
        setTitle();
        addLogo();
        setDivPos();
        addTextInfo();
        CreatePDF();


    }

    public Scene getPassScene() {
        return passScene;
    }

    private void setTitle(){
        Text title = new Text();
        title.setText("Thank you for choosing Wolf Pack Airlines!");
        title.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 30));

        Text subTitle = new Text();
        subTitle.setText("Here is your boarding information");
        subTitle.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));

        title.setLayoutX(200);
        title.setLayoutY(100);

        subTitle.setLayoutX(325);
        subTitle.setLayoutY(150);

        passPane.getChildren().add(title);
        passPane.getChildren().add(subTitle);
    }

    private void addLogo(){
        ImageView wolfLogo = new ImageView("wolf_logo.jpg");
        wolfLogo.setFitHeight(64);
        wolfLogo.setFitWidth(64);
        passPane.getChildren().add(wolfLogo);
    }

    private void setDivPos(){
        mainDiv.setLayoutX(350);
        mainDiv.setLayoutY(200);
        mainDiv.setPrefWidth(300);
        mainDiv.setPrefHeight(500);
        mainDiv.setStyle("-fx-background-color: #1b2b50;-fx-background-radius: 20;-fx-border-width: 3px;-fx-border-color: black;-fx-border-radius: 20;");
        passPane.getChildren().add(mainDiv);
    }

    private void addTextInfo(){
        name();
        age();
        gender();
        passNumber();
        flight();
        departTime();
        eta();
        price();
        phoneNumber();
        email();
    }

    private void name(){
        Label label = new Label("Name: ");
        label.setTextFill(Color.WHITE);
        Text name = new Text();
        name.setText(customer.getName());
        name.setFill(Color.WHITE);
        name.setFont(Font.font("verdana", 15));

        VBox vBox = new VBox();
        vBox.setLayoutX(75);
        vBox.getChildren().addAll(label, name);
        mainDiv.getChildren().add(vBox);
    }

    private void age(){
        Label label = new Label("Age: ");
        label.setTextFill(Color.WHITE);
        Text age = new Text();
        age.setText(String.valueOf(customer.getAge()));
        age.setFill(Color.WHITE);
        age.setFont(Font.font("verdana", 15));

        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, age);
        vBox.setLayoutX(75);
        vBox.setLayoutY(50);
        mainDiv.getChildren().add(vBox);
    }

    private void gender(){
        Label label = new Label("Gender: ");
        label.setTextFill(Color.WHITE);
        Text gender = new Text();
        gender.setText(customer.getGender());
        gender.setFill(Color.WHITE);
        gender.setFont(Font.font("verdana", 15));

        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, gender);
        vBox.setLayoutX(75);
        vBox.setLayoutY(100);
        mainDiv.getChildren().add(vBox);
    }

    private void passNumber(){
        Label label = new Label("Boarding Pass Number: ");
        label.setTextFill(Color.WHITE);
        Text passNumber = new Text();
        passNumber.setText(String.valueOf(customer.getBoardingPassNumber()));
        passNumber.setFill(Color.WHITE);
        passNumber.setFont(Font.font("verdana", 15));

        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, passNumber);
        vBox.setLayoutX(75);
        vBox.setLayoutY(150);
        mainDiv.getChildren().add(vBox);
    }

    private void flight(){
        Label label = new Label("Flights: ");
        label.setTextFill(Color.WHITE);
        Text flight = new Text();
        flight.setText(customer.getFlight());
        flight.setFill(Color.WHITE);
        flight.setFont(Font.font("verdana", 15));

        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, flight);
        vBox.setLayoutX(75);
        vBox.setLayoutY(200);
        mainDiv.getChildren().add(vBox);
    }

    private void departTime(){
        Label label = new Label("Departure Time: ");
        label.setTextFill(Color.WHITE);
        Text depart = new Text();
        depart.setText(customer.getDepartTime());
        depart.setFill(Color.WHITE);
        depart.setFont(Font.font("verdana", 15));

        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, depart);
        vBox.setLayoutX(75);
        vBox.setLayoutY(250);
        mainDiv.getChildren().add(vBox);
    }

    private void eta(){
        Label label = new Label("Estimated Time Of Arrival: ");
        label.setTextFill(Color.WHITE);
        Text eta = new Text();
        eta.setText(customer.getETA() + " ");
        eta.setFill(Color.WHITE);
        eta.setFont(Font.font("verdana", 15));

        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, eta);
        vBox.setLayoutX(75);
        vBox.setLayoutY(300);
        mainDiv.getChildren().add(vBox);
    }

    private void price(){
        Formatter formatter = new Formatter();


        Label label = new Label("Total Price: ");
        label.setTextFill(Color.WHITE);
        Text price = new Text();
        price.setText("$" + formatter.format("%.2f", customer.getTotalPrice()));
        price.setFill(Color.WHITE);
        price.setFont(Font.font("verdana", 15));

        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, price);
        vBox.setLayoutX(75);
        vBox.setLayoutY(350);
        mainDiv.getChildren().add(vBox);
    }

    private void phoneNumber(){
        Label label = new Label("Phone Number: ");
        label.setTextFill(Color.WHITE);
        Text number = new Text();
        number.setText(String.valueOf(customer.getPhoneNumber()));
        number.setFill(Color.WHITE);
        number.setFont(Font.font("verdana", 15));

        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, number);
        vBox.setLayoutX(75);
        vBox.setLayoutY(400);
        mainDiv.getChildren().add(vBox);
    }

    private void email(){
        Label label = new Label("E-mail: ");
        label.setTextFill(Color.WHITE);
        Text email = new Text();
        email.setText(customer.getEmail());
        email.setFill(Color.WHITE);
        email.setFont(Font.font("verdana", 15));

        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, email);
        vBox.setLayoutX(75);
        vBox.setLayoutY(450);
        mainDiv.getChildren().add(vBox);
    }
    private void CreatePDF() throws IOException, DocumentException {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(customer.getName() + " Ticket.pdf"));
        document.open();
        Paragraph a = new Paragraph("Name: " + customer.getName());
        document.add(a);
        Chunk c = new Chunk("Age: " + customer.getAge());
        document.add(c);
        Paragraph b = new Paragraph("Gender: " + customer.getGender());
        document.add(b);
        Chunk d = new Chunk("Email: " + customer.getEmail());
        document.add(d);
        Paragraph e = new Paragraph("Phone Number: " + customer.getPhoneNumber());
        document.add(e);
        Chunk f = new Chunk("Date: " + customer.getDate());
        document.add(f);
        Paragraph o = new Paragraph("Departure: " + customer.getDepartTime());
        document.add(o);
        Paragraph g = new Paragraph("Flight: " + customer.getFlight());
        document.add(g);
        Chunk h = new Chunk("Estimated Arrival Time: " + customer.getETA());
        document.add(h);
        Paragraph i = new Paragraph("Boarding Pass Number: " + customer.getBoardingPassNumber());
        document.add(i);
        Formatter formatter = new Formatter();
        formatter.format("%.2f", customer.getTotalPrice());
        Chunk j = new Chunk("Total Price: $" + formatter);
        document.add(j);
        document.close();
    }
}
