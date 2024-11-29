package com.wissem.javafxdemo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Objects;

public class Controller {
  
  // ImageView is a Node used for painting images loaded with Images
  // Image = picture
  // ImageView = picture frame
  
  @FXML ImageView myImageView;
  @FXML Button myButton;
  
  Image myImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/shrek2.jpg")));
  
  public void displayImage() {
    myImageView.setImage(myImage);
  }
}
