package com.wissem.javafxdemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloApplication extends Application {
  
  public static void main(String[] args) {
    launch(args);
  }
  
  @Override
  public void start(Stage stage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
    stage.setTitle("Hello World!");
    stage.setScene(new Scene(root));
    stage.show();
  }
  
}
