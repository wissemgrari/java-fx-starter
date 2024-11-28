package com.wissem.javafxdemo;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {

  public static void main(String[] args) {
    launch(args);
  }
  
  
  @Override
  public void start(Stage stage) throws Exception {
    
    // Group is a type of Nodes in JavaFX ( There are various types of Root Nodes, Think of them like Layout Manager)
    // We need at least a root node to construct the scene
    Group root = new Group();
    Scene scene = new Scene(root,Color.LIGHTSKYBLUE);
    
    stage.setScene(scene);
    stage.show();
  }
  
}
