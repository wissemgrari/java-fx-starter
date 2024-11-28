package com.wissem.javafxdemo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloApplication extends Application {

  public static void main(String[] args) {
    launch(args);
  }
  
  
  @Override
  public void start(Stage stage) throws Exception {
    
    // Group is a type of Nodes in JavaFX ( There are various types of Root Nodes, Think of them like Layout Manager)
    // We need at least a root node to construct the scene
    Group root = new Group();
    Scene scene = new Scene(root,Color.LIGHTSKYBLUE);
    
    Image icon = new Image("me.jpg");
    stage.getIcons().add(icon);
    stage.setTitle("Stage Demo Program w00t w00t");
    stage.setWidth(420);
    stage.setHeight(420);
    stage.setResizable(false);
    stage.setX(50);
    stage.setY(50);
    stage.setFullScreen(true);
    stage.setFullScreenExitHint("YOU CAN'T ESCAPE unless you press q");
    stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
    
    stage.setScene(scene);
    stage.show();
  }
  
}
