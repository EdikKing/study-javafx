package cn.edik;

import javafx.application.Application;
import javafx.collections.ListChangeListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Study6_Group extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Button button1 = new Button("按钮1");
        Button button2 = new Button("按钮2");
        Button button3 = new Button("按钮3");

        button1.setLayoutX(100);
        button1.setLayoutY(10);

        button2.setLayoutX(300);
        button2.setLayoutY(10);

        button3.setLayoutX(500);
        button3.setLayoutY(10);

        Group group = new Group();
        // 设置group不自动管理子组件宽高
//        group.setAutoSizeChildren(false);
        group.getChildren().addAll(button1, button2, button3);

        group.getChildren().addListener(new ListChangeListener<Node>() {
            @Override
            public void onChanged(Change<? extends Node> change) {
                System.out.println("当前组件数量 = " + change.getList().size());
            }
        });

        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                group.getChildren().add(new Button("按钮4"));
            }
        });

        // 检测某个坐标上是否有子组件，只能检测子组件的左上角坐标
//        System.out.println(group.contains(100,10));

        // 设置组件的透明度，子组件也会有相同的透明度
//        group.setOpacity(0.5);

        // 清楚组件下的所有子组件
//        group.getChildren().clear();

        Scene scene = new Scene(group);

        stage.setScene(scene);

        stage.setTitle("JavaFX-Group");
        stage.setWidth(800);
        stage.setHeight(500);
        stage.show();
    }
}
