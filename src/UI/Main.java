package UI;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.stage.StageStyle;

import java.util.concurrent.atomic.AtomicReference;

public class Main extends Application {
    public void Init_Window(Stage stage) {
        String Icon = "file:resources/images/XL++.png";
        String Title = "旋律Plus 启动器";
        stage.setTitle(Title);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setResizable(false);
        stage.getIcons().add(new Image(Icon));
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        AtomicReference<Double> xOffSet = new AtomicReference<>((double) 0);
        AtomicReference<Double> yOffSet = new AtomicReference<>((double) 0);
        root.setOnMousePressed(event -> {
            xOffSet.set(event.getSceneX());
            yOffSet.set(event.getSceneY());
        });

        root.setOnMouseDragged(event -> {
            primaryStage.setX(event.getScreenX() - xOffSet.get());
            primaryStage.setY(event.getScreenY() - yOffSet.get());
        });
        Scene Scene = new Scene(root, 710, 440);
        Init_Window(primaryStage);
        primaryStage.setScene(Scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
