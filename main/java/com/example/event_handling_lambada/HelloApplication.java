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

        // Hold
    }
}