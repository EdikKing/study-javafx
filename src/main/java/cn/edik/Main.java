package cn.edik;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
//        launch(args);
        // 这种启动方法可以绕过Application启动检查，不然会在打包后报错"缺少javafx运行时组件
        Application.launch(Main.class,args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("窗口1");

        stage.getIcons().add(new Image(getClass().getResource("/icon.png").toURI().toString()));
        stage.show();
    }
}
