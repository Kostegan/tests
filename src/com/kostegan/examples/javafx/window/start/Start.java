package com.kostegan.examples.javafx.window.start;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Start extends Application {
    private TestOptim optim;
    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Start");
        primaryStage.show();
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text sceneTitle = new Text("Welcome");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(sceneTitle, 0, 0, 2, 1);

        Label label = new Label("Enter address:");
        grid.add(label,0,1);

        TextField address = new TextField();
        grid.add(address, 1, 1);

        Button btnEnter = new Button("Enter");
        grid.add(btnEnter,3,1);
        btnEnter.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Go to :" + address.getText());
                String text = address.getText();
                optim = new TestOptim();
                Label label1 = new Label(optim.getSiteHtml(text));

                StackPane secondPane = new StackPane();
                secondPane.getChildren().add(label1);

                Scene secondScene = new Scene(secondPane, 300, 300);
                Stage secondStage = new Stage();
                secondStage.setTitle("New stage");
                secondStage.setScene(secondScene);
                secondStage.show();
            }
        });

        Scene scene = new Scene(grid, 500, 300);
        primaryStage.setScene(scene);
    }
}

//        Label label = new Label("User Name:");
//        grid.add(label, 0, 1);
//
//        TextField userTestField = new TextField();
//        grid.add(userTestField, 1, 1);
//
//        Label pw = new Label("Password");
//        grid.add(pw, 0, 2);
//
//        PasswordField pwBox = new PasswordField();
//        grid.add(pwBox, 1, 2);
//
//        Button btn = new Button("Sign in");
//        HBox hbBtn = new HBox(10);
//        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
//        hbBtn.getChildren().add(btn);
//        grid.add(hbBtn, 1, 4);
//
//        final Text actionTarget = new Text();
//        grid.add(actionTarget,1,6);
//
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                actionTarget.setFill(Color.FIREBRICK);
//                actionTarget.setText("Sign in button pressed");
//            }
//        });
//
//
//        Scene scene = new Scene(grid, 300, 275);
//        primaryStage.setScene(scene);
//    }
