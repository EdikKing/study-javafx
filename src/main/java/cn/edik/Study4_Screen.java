package cn.edik;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Study4_Screen extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // 获取屏幕宽高

        Screen screen = Screen.getPrimary();

        double dpi = screen.getDpi();

        System.out.println("---- dpi -----");
        System.out.println(dpi);

        Rectangle2D bounds = screen.getBounds();

        Rectangle2D visualBounds = screen.getVisualBounds();

        System.out.println("---- bounds -----");
        System.out.println("左上角x= " + bounds.getMinX() + " 左上角Y = " + bounds.getMinY());
        System.out.println("右下角x= " + bounds.getMaxX() + " 右下角Y = " + bounds.getMaxY());

        System.out.println("---- visualBounds -----");
        System.out.println("左上角x= " + visualBounds.getMinX() + " 左上角Y = " + visualBounds.getMinY());
        System.out.println("右下角x= " + visualBounds.getMaxX() + " 右下角Y = " + visualBounds.getMaxY());

        Platform.exit();

    }
}
