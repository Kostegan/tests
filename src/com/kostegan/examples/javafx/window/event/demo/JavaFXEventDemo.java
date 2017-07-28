package com.kostegan.examples.javafx.window.event.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXEventDemo extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX demo");

        FlowPane rootNode = new FlowPane();
        rootNode.setHgap(10);
        rootNode.setVgap(10);
        rootNode.setAlignment(Pos.CENTER);

        Button btn1 = new Button("Button1");
        Button btn2 = new Button("Button2");
        Label response = new Label("Press button");

        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("Button1 pressed");
            }
        });

        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("Button2 pressed");
            }
        });


        rootNode.getChildren().addAll(btn1, btn2, response);
        Scene rootScene = new Scene(rootNode, 300, 100);
        primaryStage.setScene(rootScene);
        primaryStage.show();
    }
}
