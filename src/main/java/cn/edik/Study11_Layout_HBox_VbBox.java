package cn.edik;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Study11_Layout_HBox_VbBox extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setStyle("-fx-background-color: #A569BD");

        Scene scene = new Scene(anchorPane);
        stage.setTitle("JavaFX HBox&VBox");
        stage.setWidth(800);
        stage.setHeight(800);
        stage.setScene(scene);

        stage.show();


        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");
        Button button4 = new Button("button4");
        Button button5 = new Button("button5");
        Button button6 = new Button("button6");
        Button button7 = new Button("button7");

        HBox hBox = new HBox();
        hBox.setStyle("-fx-background-color: #3498DB");
        hBox.setPrefWidth(anchorPane.getWidth()/2);
        hBox.setPrefHeight(400);
        hBox.setPadding(new Insets(10));
        hBox.setSpacing(10);

        // 单独设置某个元素的内边距
        HBox.setMargin(button1,new Insets(10));

        // 设置子元素的对齐方式
        hBox.setAlignment(Pos.BOTTOM_CENTER);

        hBox.getChildren().addAll(button1,button2,button3);

        anchorPane.getChildren().add(hBox);

        VBox vBox = new VBox();
        vBox.setStyle("-fx-background-color: #F39C12");
        vBox.setPrefWidth(anchorPane.getWidth()/2);
        vBox.setPrefHeight(400);
        vBox.setPadding(new Insets(10));
        vBox.setSpacing(10);

        vBox.getChildren().addAll(button4,button5,button6);

        anchorPane.getChildren().add(vBox);
        AnchorPane.setRightAnchor(vBox,0.0);

    }
}
