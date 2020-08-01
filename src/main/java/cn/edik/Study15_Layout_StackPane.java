package cn.edik;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Study15_Layout_StackPane extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        StackPane stackPane = new StackPane();
        stackPane.setStyle("-fx-background-color: #A569BD");
        // 设置子组件对齐方式
        stackPane.setAlignment(Pos.BOTTOM_LEFT);
        // 设置内边距
        stackPane.setPadding(new Insets(10));

        Button bt1 = new Button("button1");
        Button bt2 = new Button("button2");
        Button bt3 = new Button("button3");
        Button bt4 = new Button("button4");
        Button bt5 = new Button("button5");
        Button bt6 = new Button("button6");
        Button bt7 = new Button("button7");
        Button bt8 = new Button("button8");

        stackPane.getChildren().addAll(bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8);




        Scene scene = new Scene(stackPane);
        stage.setTitle("JavaFX FlowPane");
        stage.setWidth(800);
        stage.setHeight(800);
        stage.setScene(scene);

        stage.show();





    }
}
