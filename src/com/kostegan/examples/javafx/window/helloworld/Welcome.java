package com.kostegan.examples.javafx.window.helloworld;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Welcome extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Welcome");
        Button button = new Button();
        button.setText("Say 'HelloWorld'");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("HelloWorld");
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(button);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}
