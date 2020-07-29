package cn.edik;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class Study3_Platform2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        // false时只有调用Platform.exit()方法才能完全关闭程序
        // 可以让程序在后台运行
        Platform.setImplicitExit(false);


        stage.show();
    }
}
