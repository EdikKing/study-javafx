package cn.edik;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

public class Study8_HotKey extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Button button = new Button("按钮");

        Group group = new Group();
        group.getChildren().add(button);

        Scene scene = new Scene(group);

        KeyCombination kccb = new KeyCodeCombination(KeyCode.C, KeyCombination.ALT_DOWN, KeyCombination.CONTROL_DOWN);
        scene.getAccelerators().put(kccb, new Runnable() {
            @Override
            public void run() {
                System.out.println("按了快捷键");
            }
        });

        stage.setTitle("HotKey");
        stage.setWidth(800);
        stage.setHeight(500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
