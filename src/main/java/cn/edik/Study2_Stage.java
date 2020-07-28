package cn.edik;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Study2_Stage extends Application {
    public static void main(String[] args) {
//        launch(args);
        // 这种启动方法可以绕过Application启动检查，不然会在打包后报错"缺少javafx运行时组件
        Application.launch(Study2_Stage.class,args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        Stage stage1 = new Stage();
        stage1.setTitle("s1");
        stage1.show();

//        Stage stage2 = new Stage();
//        stage2.setTitle("s2");
//        stage2.show();
//
        Stage stage3 = new Stage();
        stage3.setTitle("s3");
        // 只能操作当前窗口的内容，前边打开的窗口都不能操作，除非关闭当前窗口
        stage3.initModality(Modality.APPLICATION_MODAL);
        stage3.show();
    }
}
