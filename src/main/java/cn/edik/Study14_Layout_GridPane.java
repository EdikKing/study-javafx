package cn.edik;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Study14_Layout_GridPane extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        GridPane gridPane = new GridPane();
        gridPane.setStyle("-fx-background-color: #A569BD");
        // 设置元素水平间距
        gridPane.setHgap(10);
        // 设置元素垂直间距
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10));


        Scene scene = new Scene(gridPane);
        stage.setTitle("JavaFX FlowPane");
        stage.setWidth(800);
        stage.setHeight(800);
        stage.setScene(scene);

        stage.show();


        Button bt1 = new Button("button1");
        Button bt2 = new Button("button2");
        Button bt3 = new Button("button3");
        Button bt4 = new Button("button4");
        Button bt5 = new Button("button5");
        Button bt6 = new Button("button6");
        Button bt7 = new Button("button7");
        Button bt8 = new Button("button8");

        gridPane.add(bt1,0,0);
        gridPane.add(bt2,1,0);
        gridPane.add(bt3,2,0);
        gridPane.add(bt4,3,0);
        gridPane.add(bt5,0,1);
        gridPane.add(bt6,1,1);
        gridPane.add(bt7,2,1);
        gridPane.add(bt8,3,1);


    }
}
