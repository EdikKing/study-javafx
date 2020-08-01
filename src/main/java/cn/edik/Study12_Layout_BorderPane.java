package cn.edik;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Study12_Layout_BorderPane extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {

        Button button = new Button("按钮1");

        AnchorPane pane1 = new AnchorPane();
        pane1.setPrefHeight(50);
        pane1.setPrefWidth(100);
        pane1.setStyle("-fx-background-color: #E74C3C");
        pane1.getChildren().add(button);


        AnchorPane pane2 = new AnchorPane();
        pane2.setPrefWidth(200);
        pane2.setStyle("-fx-background-color: #A569BD");

        AnchorPane pane3 = new AnchorPane();
        pane3.setPrefHeight(100);
        pane3.setStyle("-fx-background-color: #2980B9");

        AnchorPane pane4 = new AnchorPane();
        pane4.setPrefWidth(300);
        pane4.setStyle("-fx-background-color: #27AE60");

        AnchorPane pane5 = new AnchorPane();
        pane5.setStyle("-fx-background-color: #F39C12");


        BorderPane borderPane = new BorderPane();
        borderPane.setStyle("-fx-background-color: #2C3E50");

        borderPane.setTop(pane1);
//        borderPane.setTop(button);
//        BorderPane.setAlignment(button,Pos.CENTER);

        borderPane.setRight(pane2);
        borderPane.setBottom(pane3);
        borderPane.setLeft(pane4);
        borderPane.setCenter(pane5);

        borderPane.setPadding(new Insets(10));
        BorderPane.setMargin(pane1,new Insets(10));


        Scene scene = new Scene(borderPane);
        stage.setTitle("JavaFX BorderPane");
        stage.setWidth(1200);
        stage.setHeight(800);
        stage.setScene(scene);

        stage.show();




    }
}
