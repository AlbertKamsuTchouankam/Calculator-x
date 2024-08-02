package com.calculate;
//import javafx.collections.FXCollections;
//import javafx.fxml.FXML;
//import javafx.scene.control.Button;
//import javafx.event.ActionEvent;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

import java.lang.Math;
import java.util.ResourceBundle;

import static com.calculate.Basen.facto;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//import java.io.IOException;
//import javafx.application.Application;
//import javafx.scene.Node;

//import javafx.animation.Animation;
//import javafx.animation.KeyFrame;
//import javafx.animation.Timeline;
//import javafx.scene.shape.Rectangle;
//import javafx.util.Duration;
//import javafx.scene.paint.Color;
//import java.net.URL;
//import java.util.ResourceBundle;





public class CalculateController {

    @FXML
    private Label screen;
   

    private boolean  screenOn= true;
    private double OP1 = 0; // Premier opérande
    private double OP2 = 0; // Deuxième opérande
    private String operation = "";



    // Méthode appelée lorsque le bouton est cliqué
    @FXML
    private void handleDigitClick (ActionEvent event) {
        String V = screen.getText();
        String digit = ((Button)event.getSource()).getText(); // En cas de click sur le button le recuperer en tant qu'objet de type bouton puis donner le texte correspondant
        String currentText = screen.getText(); // Je recupere le texte a l'ecran en ce moment.
        screen.setText(currentText + digit );  // Puis je renvois a l'ecran la valeur concantene avec digit
    }

    @FXML
    private void clearOnClick ( ){

      screen.setText("");

    }
    @FXML
    private void toggleScreen(ActionEvent event) {
        screenOn = !screenOn; // Inverse l'état de l'écran
        screen.setVisible(screenOn); 

    }

    @FXML 
    private void Mul (ActionEvent event){
        
       OP1 = Double.parseDouble(screen.getText());
       
        screen.setText("");
        operation = "*";
    }

    @FXML 
    private void addi (ActionEvent event){
        
       OP1 = Double.parseDouble(screen.getText());
       
        screen.setText("");
        operation = "+";
    }

    @FXML 
    private void div (ActionEvent event){
        
       OP1 = Double.parseDouble(screen.getText());
       
        screen.setText("");
        operation = "/";
    }


    @FXML 
    private void Mod (ActionEvent event){
        
       OP1 = Double.parseDouble(screen.getText());
       
        screen.setText("");
        operation = "%";
    }

    @FXML 
    private void sous (ActionEvent event){
        
       OP1 = Double.parseDouble(screen.getText());
       
        screen.setText("");
        operation = "-";
    }




    @FXML

    private void equals ( ActionEvent event){

        OP2 = Double.parseDouble(screen.getText());

          double result = 0;

        if(operation.equals("+")) { result = OP1+OP2; } screen.setText(String.valueOf(result));
        if(operation.equals("-")) { result = OP1-OP2; } screen.setText(String.valueOf(result));
        if(operation.equals("*")) { result = OP1*OP2; } screen.setText(String.valueOf(result));
        if(operation.equals("/")) { result = OP1/OP2; } screen.setText(String.valueOf(result));
        if(operation.equals("%")) { result = OP1%OP2; } screen.setText(String.valueOf(result));
        if(operation.equals("x^y")) { result = Math.pow(OP1,OP2); } screen.setText(String.valueOf(result));
        if(operation.equals("*10Exp")) { result = OP1*Math.pow(10,OP2); } screen.setText(String.valueOf(result));
           /* case "-": screen.setText(String.valueOf(OP1-OP2));
            case "/": screen.setText(String.valueOf(OP1/OP2));
            case "*": screen.setText(String.valueOf(OP1*OP2));
            case "%": screen.setText(String.valueOf(OP1%OP2));*/
            
        
    }

    /*
     * Ici nous alloms implementer le controlleur de notre interface pour les calculs implicant la trigonometrie et le logarithme 
     */

    @FXML 
    private void sqrt (ActionEvent event){
        
       OP1 = Double.parseDouble(screen.getText());
       
        String result = String.valueOf(Math.sqrt(OP1));

        screen.setText(result);
    }
   // Sinus
    @FXML 
    private void sin (ActionEvent event){
        
       OP1 = Double.parseDouble(screen.getText());
       
        String result = String.valueOf(Math.sin(OP1));

        screen.setText(result);
    }

    // Cosinus
    @FXML
     private void cos (ActionEvent event){
    
            OP1 = Double.parseDouble(screen.getText());
            
             String result = String.valueOf(Math.cos(OP1));
     
             screen.setText(result);
         }


         // Tan
         
    @FXML
     private void tan (ActionEvent event){
        
                OP1 = Double.parseDouble(screen.getText());
                
                 String result = String.valueOf(Math.tan(OP1));
         
                 screen.setText(result);
             }

    
             
  @FXML
    private void ln (ActionEvent event){
            
                 OP1 = Double.parseDouble(screen.getText());
                    
                 String result = String.valueOf(Math.log(OP1));
             
                 screen.setText(result);
             }

   @FXML
    private void log (ActionEvent event){
                         
                     OP1 = Double.parseDouble(screen.getText());
                                 
                     String result = String.valueOf(Math.log(OP1));
                          
                      screen.setText(result);
             }
             
  // Exponentiell

 @FXML
     private void e (ActionEvent event){
                     
                    OP1 = Double.parseDouble(screen.getText());
                             
                    String result = String.valueOf(Math.exp(OP1));
                      
                    screen.setText(result);
                          }
// x Expo y
@FXML
    private void xExpy (ActionEvent event){
                                  
      OP1 = Double.parseDouble(screen.getText());
                                          
             screen.setText("");
             operation = "x^y";
                            }
 // 10 Exp
 
 @FXML
    private void m10Exp (ActionEvent event){
            
                    OP1 = Double.parseDouble(screen.getText());
             
                     screen.setText("");
                     operation = "*10Exp";
                 }
//fact
@FXML
private void fact (ActionEvent event){
        
                OP1 = Double.parseDouble(screen.getText());
                screen.setText(String.valueOf(facto(OP1)));
         
            
             }
// PI 
@FXML
private void pi (ActionEvent event){
        
           OP1 = Math.PI;

           screen.setText(String.valueOf(OP1));
         
            
             }

//NewView
/*@FXML
private void newView (ActionEvent event) throws IOException {
    // Charge la nouvelle vue
    Parent nouvelleVueParent = FXMLLoader.load(getClass().getResource("2calculateInterface.fxml"));
    Scene nouvelleVueScene = new Scene(nouvelleVueParent,300,200);

    // Obtient la fenêtre actuelle
    Stage fenetre = (Stage) ((Node) event.getSource()).getScene().getWindow();

    // Change la vue
    fenetre.setScene(nouvelleVueScene);
    fenetre.show();
}*/


//PreView
/*@FXML
private void preView (ActionEvent event) throws IOException {
    // Charge la nouvelle vue
    Parent nouvelleVueParent = FXMLLoader.load(getClass().getResource("calculateInterface.fxml"));
    Scene nouvelleVueScene = new Scene(nouvelleVueParent,300,200);

    // Obtient la fenêtre actuelle
    Stage fenetre = (Stage) ((Node) event.getSource()).getScene().getWindow();

    // Change la vue
    fenetre.setScene(nouvelleVueScene);
    fenetre.show();*/

}



    




