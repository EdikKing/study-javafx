package cn.edik;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class Study3_Platform extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("start方法内的线程名 = " + Thread.currentThread().getName());

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                // 可以在此更新组件
                // 可以用来更新倒计时之类的任务，不适合处理大量的任务，容易造成堵塞

                System.out.println("run方法内的线程名 = " + Thread.currentThread().getName());

                System.out.println("dfwfwegfewg");
                int i=1;
                while (i<=10){

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("i = "+i);
                    i++;
                }
            }
        });

//        stage.show();
    }
}
