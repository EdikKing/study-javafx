package cn.edik;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Study1_Stage extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
//        primaryStage.setTitle("FX应用程序");
//        primaryStage.setScene(new Login().getScene());
//        primaryStage.show();

        Stage stage = new Stage();
        stage.setTitle("窗口1");

        stage.getIcons().add(new Image(getClass().getResource("/icon.png").toURI().toString()));

//        stage.setIconified(true); // 设置窗口最小化

//        stage.setMaximized(true); // 设置窗口最大化

//        stage.close();// 关闭窗口
//
        stage.setWidth(500); // 设置窗口宽度
        stage.setHeight(500);// 设置窗口高度
//        stage.setResizable(false); // 设置不可改变窗口大小

//        stage.setMaxHeight(800);
//        stage.setMaxWidth(800);
//        stage.setMinHeight(300);
//        stage.setMinWidth(300);

        // 监听窗口高度变化 宽度一样
//        stage.heightProperty().addListener(new ChangeListener<Number>() {
//            @Override
//            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
//                System.out.println(t1.doubleValue());
//            }
//        });

//        stage.setFullScreen(true);// 设置窗口全屏显示，必须设置Scene
//        stage.setScene(new Scene(new Group()));

//        stage.setOpacity(0.5);// 设置窗口透明度 值为0-1

//        stage.setAlwaysOnTop(true);// 设置窗口置顶

//        stage.setX(100);//设置窗口X轴初始位置
//        stage.setY(100);//设置窗口Y轴初始位置
//
//        // 监听窗口X轴坐标变化 Y轴一样
//        stage.xProperty().addListener(new ChangeListener<Number>() {
//            @Override
//            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
//                System.out.println("X轴坐标：" + t1.doubleValue());
//            }
//        });

//        stage.initStyle(StageStyle.DECORATED); // 默认
//        stage.initStyle(StageStyle.TRANSPARENT); // 透明的
//        stage.initStyle(StageStyle.UNDECORATED); // 白色的
//        stage.initStyle(StageStyle.UNIFIED);
//        stage.initStyle(StageStyle.UTILITY);// 只有关闭按钮


        stage.show();

//        System.out.println("窗口宽度：" + stage.getWidth());
//        System.out.println("窗口高度：" + stage.getHeight());

//        Platform.exit();// 退出系统，关闭所有窗口

    }

}
