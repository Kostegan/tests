package com.kostegan.examples.javafx.window.image.viewimage;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXImageDemo extends Application {
    public static void main(String[] args) {
        launch(args);

    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Image fx example");
        FlowPane rootNode = new FlowPane();
        rootNode.setAlignment(Pos.CENTER);


        Scene scene = new Scene(rootNode,900,900);
        ImageView imgView = new ImageView("file:C:\\java_work\\test\\src\\com\\kostegan\\examples\\javafx\\window\\image\\viewimage\\www.png");
        imgView.setFitHeight(40);
        imgView.setFitWidth(40);
        Button btn = new Button("ButtonWithPicture",imgView);
        btn.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
        primaryStage.setScene(scene);
        Image image = new Image("file:C:\\java_work\\test\\src\\com\\kostegan\\examples\\javafx\\window\\image\\viewimage\\reminder.png");

        ImageView view = new ImageView(image);
        Label label = new Label("Test",view);
        label.setContentDisplay(ContentDisplay.BOTTOM);
//        rootNode.getChildren().add(view);
        rootNode.getChildren().add(btn);
        rootNode.getChildren().add(label);


        primaryStage.show();
    }
}
