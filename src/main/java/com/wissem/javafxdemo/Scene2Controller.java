package com.wissem.javafxdemo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Scene2Controller {
  
  @FXML
  Label username;
  
  public void displayName(String username) {
    this.username.setText(username);
  }

}
