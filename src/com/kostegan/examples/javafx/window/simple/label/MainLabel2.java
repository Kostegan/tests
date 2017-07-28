package com.kostegan.examples.javafx.window.simple.label;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MainLabel2 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label = new Label("asdasdasdasd");
        Button btn = new Button("Delete label");
        FlowPane flowPane = new FlowPane();
        flowPane.getChildren().add(label);
        flowPane.getChildren().add(btn);
        Scene scene = new Scene(flowPane,600,300);


        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                flowPane.getChildren().remove(label);
            }
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
