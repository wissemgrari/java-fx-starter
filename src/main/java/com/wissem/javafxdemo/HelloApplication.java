package com.wissem.javafxdemo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
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
    // a scene is a drawing surface for graphical content and a container for various nodes
    Scene scene = new Scene(root,600, 600, Color.LIGHTSKYBLUE);
    
    Text text = new Text("WHOOOOOOOOOA!!");
    text.setX(50);
    text.setY(50);
    text.setFont(Font.font("Poppins", 50));
    text.setFill(Color.LIMEGREEN);
    
    Line line = new Line();
    line.setStartX(200);
    line.setStartY(200);
    line.setEndX(500);
    line.setEndY(200);
    line.setStrokeWidth(5);
    line.setStroke(Color.RED);
    
    // add the text, line nodes to the root node
    root.getChildren().add(text);
    root.getChildren().add(line);
    
    stage.setScene(scene);
    stage.show();
  }
  
}
