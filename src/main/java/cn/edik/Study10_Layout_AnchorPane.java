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
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Study10_Layout_AnchorPane extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {

        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setStyle("-fx-background-color: #E5E7E9;");
        anchorPane.setFocusTraversable(false);
        Scene scene = new Scene(anchorPane);

        stage.setTitle("JavaFx布局之AnchorPane");
        stage.setWidth(800);
        stage.setHeight(500);
        stage.setScene(scene);


        Button button = new Button("bt1");
        AnchorPane.setTopAnchor(button,10.0);
        AnchorPane.setLeftAnchor(button,10.0);
        button.setFocusTraversable(false);

        Button button1 = new Button("bt2");
        AnchorPane.setTopAnchor(button1,10.0);
        AnchorPane.setLeftAnchor(button1,50.0);
        button1.setFocusTraversable(false);

        anchorPane.getChildren().addAll(button,button1);


        stage.show();
    }
}
