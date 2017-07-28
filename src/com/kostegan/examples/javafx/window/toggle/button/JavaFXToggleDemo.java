package com.kostegan.examples.javafx.window.toggle.button;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXToggleDemo extends Application {
    private ToggleButton tgbtn;
    Label onOff;
    Label textLabel;
    Button printText;
    Button clearTextLabel;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("ToggleShowing");

        FlowPane rootNode = new FlowPane();
        rootNode.setAlignment(Pos.CENTER);
        rootNode.setHgap(10);
        rootNode.setVgap(10);

        textLabel = new Label();

        printText = new Button("Add test text");
        clearTextLabel = new Button("Clear all text");

        printText.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tgbtn.isSelected()){
                    textLabel.setText(textLabel.getText()+" test");
                }
            }
        });

        clearTextLabel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (tgbtn.isSelected()) {
                    textLabel.setText("");
                }
            }
        });

        Scene scene = new Scene(rootNode, 400, 300);
        onOff = new Label("off");
        tgbtn = new ToggleButton("Press on/off");
        tgbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tgbtn.isSelected()){
                    onOff.setText("on");
                } else{
                    onOff.setText("off");
                }
            }
        });
        rootNode.getChildren().addAll(tgbtn, onOff,printText ,clearTextLabel,textLabel);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
