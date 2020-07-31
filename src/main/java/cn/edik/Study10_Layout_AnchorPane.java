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

public class Study10_Layout_AnchorPane extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {

        Group group = new Group();
        Scene scene = new Scene(group);

        stage.setTitle("JavaFx布局之AnchorPane");
        stage.setWidth(800);
        stage.setHeight(500);
        stage.setScene(scene);



        stage.show();
    }
}
