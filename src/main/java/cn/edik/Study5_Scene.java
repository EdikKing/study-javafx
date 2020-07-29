package cn.edik;

import javafx.application.Application;
import javafx.application.HostServices;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;

public class Study5_Scene extends Application {

    public static void main(String[] args) {
        launch(args);
//        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        // 可以打开网页
//        HostServices hostServices = getHostServices();
//        hostServices.showDocument("https://www.edik.cn");

        Button button = new Button("按钮");
        button.setMaxWidth(200);
        button.setMaxHeight(200);

        Group group = new Group();
        group.getChildren().add(button);

        Scene scene = new Scene(group);
        // 改变鼠标样式
//        scene.setCursor(Cursor.CROSSHAIR);

        // 自定义鼠标样式图片
        URL url = getClass().getClassLoader().getResource("icon.png");
        String path = url.toExternalForm();

        scene.setCursor(Cursor.cursor(path));

        stage.setScene(scene);

        stage.setTitle("Scene");
        stage.setWidth(800);
        stage.setHeight(500);
        stage.show();
    }
}
