package com.example.event_handling_lambada;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override // Override the start method in tje Application class
    public void start(Stage primaryStage) {
        Text text = new Text(40, 40, "Programming is fun");
        Pane pane = new Pane(text);

        // Hold four buttons in an HBox
        Button btUp = new Button("Up");
        Button btDown = new Button("Down");
        Button btLeft = new Button("Left");
        Button btRight = new Button("Right");
        HBox hBox = new HBox(btUp, btDown, btLeft, btRight);
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);

        BorderPane borderPane = new BorderPane();
        borderPane.setBottom(hBox);

        //Create and register the handler
        // Note that different notations are used, they're all equivalent
        btUp.setOnAction((ActionEvent e) -> {
            text.setY(text.getY() > 10 ? text.getY() - 5 : 10);
        });

        btDown.setOnAction((e) -> {
            text.setY(text.getY() < pane.getHeight() ?
                    text.getY() + 5 : pane.getHeight() + 5);
        });

        btLeft.setOnAction(e -> {
            text.setX(text.getX() > 0 ? text.getX() - 5 : 0);
        });

        btRight.setOnAction(e ->
                text.setX(text.getX() < pane.getWidth() - 100 ?
                        text.getX() + 5 : pane.getWidth() - 100)
        );

        // Create a scene and place it in the stage
        Scene scene = new Scene(borderPane, 400, 350);
        primaryStage.setTitle("AnonymoysHandlerDemo"); // Set title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show();

    }
}