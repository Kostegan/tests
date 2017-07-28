package com.kostegan.examples.javafx.window.simple.label;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MainLabel extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        FlowPane pane = new FlowPane();
        pane.getChildren().add(new Label("Test label text"));
        Scene scene = new Scene(pane,300,200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
