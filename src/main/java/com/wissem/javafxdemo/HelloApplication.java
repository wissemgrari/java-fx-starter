package com.wissem;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {
  
  public static void main(String[] args) {
    launch(args);
  }
  
  @Override
  public void start(Stage stage) throws Exception {
    
    Group root = new Group();
    Scene scene = new Scene(root, Color.PINK);
    
    Image icon = new Image("me.jpg");
    stage.getIcons().add(icon);
    stage.setTitle("Stage Demo program");
    stage.setWidth(420);
    stage.setHeight(420);
//    stage.setX(50);
//    stage.setY(50);
    stage.setFullScreen(true);
    stage.setFullScreenExitHint("You can't escape unless you press q");
    stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
    stage.setResizable(false);
    stage.setScene(scene);
    stage.show();
  }
  
}
