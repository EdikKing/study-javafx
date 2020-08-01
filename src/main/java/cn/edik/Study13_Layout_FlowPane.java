package cn.edik;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Study13_Layout_FlowPane extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FlowPane flowPane = new FlowPane();
        flowPane.setStyle("-fx-background-color: #A569BD");
        // 设置元素水平间距
        flowPane.setHgap(10);
        // 设置元素垂直间距
        flowPane.setVgap(10);

        // 设置元素默认排列方向
        flowPane.setOrientation(Orientation.VERTICAL);

        Scene scene = new Scene(flowPane);
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

        flowPane.getChildren().addAll(bt1,bt2,bt3,bt4,bt5,bt6,bt7);

    }
}
