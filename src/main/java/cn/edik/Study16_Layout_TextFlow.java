package cn.edik;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class Study16_Layout_TextFlow extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        TextFlow textFlow = new TextFlow();
        textFlow.setStyle("-fx-background-color: #A569BD");

        Text text1 = new Text("测试文本1");
        Text text2 = new Text("测试文本2");
        Text text3 = new Text("测试文本3");
        Text text4 = new Text("测试文本4");

        text1.setFont(new Font(20));

        textFlow.getChildren().addAll(text1,text2,text3,text4);

        Scene scene = new Scene(textFlow);
        stage.setTitle("JavaFX TextFlow");
        stage.setWidth(800);
        stage.setHeight(800);
        stage.setScene(scene);

        stage.show();

    }
}
