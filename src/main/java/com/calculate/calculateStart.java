package com.calculate;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;



public class calculateStart extends Application {

   
        


    public void start (Stage stage) throws IOException{  


    Parent root = FXMLLoader.load(getClass().getResource( "calculateinterface.fxml" )); // une instance root pour contenir une vue uelconque
    Scene scene = new Scene(root,300,310); // Scene contient une vue et definie une dimenssion precise ou sera represente ceztte vue.
    stage.setScene(scene); // Wird scene erzeugt
    stage.setTitle("Calculate"); // Title unser App angeben
    stage.setResizable(false); // Dimension in dem das Project erzeugt wird kann nicht verändert werden.
    stage.show();   // Das Projekt wird genau auf dem Bildschirm gezeigt.
    
 }

public static void main(String[] args) {
    launch(args);
}

    
}
