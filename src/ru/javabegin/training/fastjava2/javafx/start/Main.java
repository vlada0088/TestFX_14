package ru.javabegin.training.fastjava2.javafx.start;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/main.fxml"));
        primaryStage.setTitle("Database of employees");
        primaryStage.setMinHeight(600);
        primaryStage.setMinWidth(400);
        primaryStage.setScene(new Scene(root, 575, 700));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
