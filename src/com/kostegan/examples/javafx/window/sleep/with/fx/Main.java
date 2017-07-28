package com.kostegan.examples.javafx.window.sleep.with.fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.util.Date;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane pane = new FlowPane(10,10);
        pane.setAlignment(Pos.CENTER);

        Label label1 = new Label(".....");
        Label label2 = new Label(".....");
        Button btn = new Button("Stop thread on " + 5000);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                label1.setText("Current time" + printCurrentTime());
                sleep(5000);
                label2.setText("Current time:" + printCurrentTime());
            }
        });

        pane.getChildren().addAll(btn, label1, label2);
        Scene scene = new Scene(pane,300,200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private String printCurrentTime(){
        return "Current date ann time: " + new Date();
    }

    private void sleep(long milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
