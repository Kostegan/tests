package com.kostegan.examples.javafx.window.radiobutton;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFxRadioButtonDemo extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("RadioButton demo");

        Label response = new Label();
        RadioButton rbTrain = new RadioButton("On train");
        RadioButton rbCar = new RadioButton("On car");
        RadioButton rbPlane = new RadioButton("On Plane");

        ToggleGroup tg = new ToggleGroup();

        rbTrain.setToggleGroup(tg);
        rbCar.setToggleGroup(tg);
        rbPlane.setToggleGroup(tg);
        tg.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
                RadioButton rb = (RadioButton) newValue;
                response.setText("Transport selected is : " + rb.getText());
            }
        });

//        rbTrain.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                response.setText(rbTrain.getText());
//            }
//        });
//
//        rbCar.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                response.setText(rbCar.getText());
//            }
//        });
//
//        rbPlane.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                response.setText(rbPlane.getText());
//            }
//        });
//
//        rbTrain.fire();

        response.setText(rbTrain.getText());
        rbTrain.setSelected(true);

        FlowPane rootNode = new FlowPane();
        rootNode.setAlignment(Pos.CENTER);
        rootNode.setVgap(10);
        rootNode.setHgap(10);
        rootNode.getChildren().addAll(rbTrain, rbCar, rbPlane, response);

        Scene scene = new Scene(rootNode, 300, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
