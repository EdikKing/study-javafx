package cn.edik;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Study10_Layout_AnchorPane2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {

        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setStyle("-fx-background-color: #A569BD;");
        anchorPane.setFocusTraversable(false);
        Scene scene = new Scene(anchorPane);

        stage.setTitle("JavaFx布局之AnchorPane");
        stage.setWidth(800);
        stage.setHeight(500);
        stage.setScene(scene);


        Button button1 = new Button("bt1");
        Button button2 = new Button("bt2");
        Button button3 = new Button("bt3");
        Button button4 = new Button("bt4");

        // 设置组件不被父元素管理
//        button1.setManaged(false);
        // 设置元素是否可见
//        button1.setVisible(false);
        // 设置元素透明度
        button1.setOpacity(0.5);

//        anchorPane.getChildren().addAll(button1,button2);

        AnchorPane pane2 = new AnchorPane();
        pane2.setStyle("-fx-background-color: #3498DB");
        pane2.getChildren().add(button1);
        AnchorPane.setBottomAnchor(button1,0.0);
        AnchorPane.setRightAnchor(button1,0.0);


        anchorPane.getChildren().add(pane2);


        stage.show();

        AnchorPane.setTopAnchor(pane2,0.0);
        AnchorPane.setLeftAnchor(pane2,0.0);
        AnchorPane.setRightAnchor(pane2,anchorPane.getWidth()/2);
        AnchorPane.setBottomAnchor(pane2,anchorPane.getHeight()/2);

        stage.heightProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                AnchorPane.setBottomAnchor(pane2,anchorPane.getHeight()/2);
            }
        });
        stage.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                AnchorPane.setRightAnchor(pane2,anchorPane.getWidth()/2);
            }
        });

    }
}
