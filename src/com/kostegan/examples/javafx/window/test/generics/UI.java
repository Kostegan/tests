package com.kostegan.examples.javafx.window.test.generics;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UI extends Application {
    private final String RB1_TITLE = "1. String tuple";
    private final String RB2_TITLE = "2. Generic tuple";
    private final String RB3_TITLE = "3. With two generic tuple";
    private BorderPane rootPane;
    private Scene scene;
    private Label label;
    private RadioButton rbStringTuple, rbTuple, rbTwoTuple;
    private ToggleGroup tg;
    private VBox leftVBox, centralVBox;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("App shows work with generics!");
        rootPane = new BorderPane();

        leftVBox = new VBox(10);
        leftVBox.setPadding(new Insets(10, 10, 10, 10));
        leftVBox.setStyle("-fx-background-color: #e2e2e2;");
        leftVBox.setPrefSize(200, 400);

        centralVBox = new VBox(10);
        centralVBox.setPrefSize(200, 400);
        centralVBox.setStyle("-fx-background-color: #f0f0f0;");

        fillRadioButtonInfo();

        leftVBox.getChildren().addAll(label, rbStringTuple, rbTuple, rbTwoTuple);

        rootPane.setLeft(leftVBox);
        rootPane.setCenter(centralVBox);
        scene = new Scene(rootPane, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void fillRadioButtonInfo() {
        label = new Label("Select option:");
        rbStringTuple = new RadioButton(RB1_TITLE);
        rbTuple = new RadioButton(RB2_TITLE);
        rbTwoTuple = new RadioButton(RB3_TITLE);
        tg = new ToggleGroup();
        rbStringTuple.setToggleGroup(tg);
        rbTuple.setToggleGroup(tg);
        rbTwoTuple.setToggleGroup(tg);

        tg.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
                RadioButton rb = (RadioButton) newValue;
                Label l = new Label();
                if (RB1_TITLE.equals(rb.getText())) {
                    l.setText("1");
                }
                if (RB2_TITLE.equals(rb.getText())) {
                    l.setText("2");
                }
                if (RB3_TITLE.equals(rb.getText())) {
                    l.setText("3");
                }
                centralVBox.getChildren().add(l);
            }
        });
    }
}


