package com.shittygamer.mrtheplague;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by msmith on 11/13/16.
 */
public class Chat extends Application implements Runnable {
    public void run() {
        launch();
    }


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/sample.fxml"));
        primaryStage.setTitle("Chat");
        primaryStage.setScene(new Scene(root, 400, 600));
        primaryStage.show();
    }
}
