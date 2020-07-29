package cn.edik;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Study7_Button extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Button button = new Button();
        button.setText("按钮");

        button.setLayoutX(100);
        button.setLayoutY(100);

        button.setPrefHeight(100);
        button.setPrefWidth(200);

        button.setFont(Font.font("sans-serif", 40));

        button.setBackground(new Background(new BackgroundFill(Paint.valueOf("#0e90db"),
                new CornerRadii(10), new Insets(10))));
        button.setCursor(Cursor.HAND);

        button.setBorder(new Border(new BorderStroke(Paint.valueOf("#8E44AD"),
                BorderStrokeStyle.DOTTED,new CornerRadii(10),new BorderWidths(5)
                )));




        Button button2 = new Button();
        button2.setText("测试点击事件按钮");
        button2.setLayoutX(310);
        button2.setLayoutY(100);
        button2.setPrefWidth(330);
        button2.setPrefHeight(100);

        // 设置样式
        button2.setStyle(
                "-fx-background-color: #201bff;" +
                "-fx-font-size: 40;" +
                "-fx-background-radius: 10;"+
                "-fx-text-fill: #ff3a50;"
        );

        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                // 获取点击事件的元素
                Button source = (Button) actionEvent.getSource();

                System.out.println("点击了"+source.getText());
            }
        });


        Button button3 = new Button("按钮3");
        button3.setLayoutX(100);
        button3.setLayoutY(230);

        button3.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("测试按钮被点击了");
                if(event.getClickCount() == 2){
                    System.out.println("双击");
                }
            }
        });


        Group group = new Group();
        group.getChildren().add(button);
        group.getChildren().add(button2);
        group.getChildren().add(button3);

        Scene scene = new Scene(group);

        stage.setScene(scene);

        stage.setTitle("JavaFX-Button");
        stage.setWidth(800);
        stage.setHeight(500);
        stage.show();

    }
}
