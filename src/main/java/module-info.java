module com.wissem.javafxdemo {
  requires javafx.controls;
  requires javafx.fxml;
  
  requires org.controlsfx.controls;
  requires org.kordamp.bootstrapfx.core;
  
  opens com.wissem.javafxdemo to javafx.fxml;
  exports com.wissem.javafxdemo;
}
