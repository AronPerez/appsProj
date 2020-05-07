package APP.Controller;

import APP.Model.Character;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Controller {

    public Character CharSheet = new Character();


    @FXML
    void handleButton(ActionEvent event) throws IOException {
        // determining which button is pressed
        // i.e. - attr_str_up
        var buttonInfo = event.getSource().toString().replaceAll(",", "");
        var ID = buttonInfo.substring(buttonInfo.indexOf("id=")+3).split(" ")[0].split("_");

        // turning button info to variables
        // i.e. - attr
        String eClass = ID[0];
        // i.e. - str
        String eType = ID[1];
        // i.e. - up
        String eAction = ID[2];

        // adding dots to element from the class that holds the element
        // using the ProcessDots() method inside each class

        if (CharSheet.currentXP != CharSheet.maxXP) {
            switch(eClass) {
                case "attr":
                    this.CharSheet.Attributes.ProcessDots(eType, eAction);
                    break;
                case "sphr":
                    this.CharSheet.Spheres.ProcessDots(eType, eAction);
                    break;
                case "abil":
                    this.CharSheet.Abilities.ProcessDots(eType, eAction);
                    break;
                case "advn":
                    this.CharSheet.Advantages.ProcessDots(eType, eAction);
                    break;
                default:
                    System.out.print("\nBUTTON DEFAULTED\n");
        }
        }

        System.out.println(eClass +", "+ eType +", "+ eAction);
    }


}
