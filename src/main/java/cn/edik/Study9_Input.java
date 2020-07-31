package cn.edik;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Study9_Input extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {

        Group group = new Group();
        Scene scene = new Scene(group);

        stage.setTitle("JavaFx 输入框");
        stage.setWidth(800);
        stage.setHeight(500);
        stage.setScene(scene);

        Button button = new Button("按钮");
        button.setLayoutX(100);
        button.setLayoutY(20);
        group.getChildren().add(button);

        // ------ 输入框 Start ----------
        TextField textField = new TextField();
        // 设置文本内容
        textField.setText("我是输入文本");
        textField.setLayoutX(100);
        textField.setLayoutY(50);
        textField.setFont(Font.font(14));
        // 设置鼠标悬停提示
        textField.setTooltip(new Tooltip("这是文本框的提示"));
        // 设置文本输入提示
        textField.setPromptText("请输入用户名");
        // 取消节点默认获取焦点
        textField.setFocusTraversable(false);

        // 监听文本输入
        textField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String oldVal, String newVal) {
                System.out.println("输入的文本："+newVal);
            }
        });

        // 监听选择的文本
        textField.selectedTextProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                System.out.println("选择的文本："+t1);
            }
        });

        // 回车事件监听
        textField.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("回车事件触发");
            }
        });

        group.getChildren().add(textField);
        // ------ 输入框 End ----------


        PasswordField passwordField = new PasswordField();
        passwordField.setLayoutX(100);
        passwordField.setLayoutY(100);
        passwordField.setPromptText("请输入密码");


        group.getChildren().add(passwordField);


        Label label = new Label("我是标签");
        label.setLayoutX(100);
        label.setLayoutX(100);
        label.setLayoutY(80);

        label.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("label的点击事件");
            }
        });

        group.getChildren().add(label);

        stage.show();
    }
}
