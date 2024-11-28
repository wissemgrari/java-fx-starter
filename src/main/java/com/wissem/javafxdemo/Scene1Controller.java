package com.wissem.javafxdemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene1Controller {
  
  @FXML
  TextField username;
  
  public void login(ActionEvent event) throws IOException {
    
    String username = this.username.getText();
    
    FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
    Parent root = loader.load();
    
    Scene2Controller scene2Controller = loader.getController();
    scene2Controller.displayName(username);
    
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }
  
}
