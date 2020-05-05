package APP.Model;
import javafx.event.*;
import javafx.fxml.FXML;

public class Character {
    APP.Model.Attributes Attributes;
    APP.Model.Spheres Spheres;
    APP.Model.Abilities Abilities;
    APP.Model.Advantages Advantages;

    String Name, Player, Chronicle, Nature, Demeanor,Essence,
            Affiliation,Sect,Concept;

    public Character() {
        Spheres = new Spheres();
        Advantages = new Advantages();
        Attributes = new Attributes();
        Abilities = new Abilities();
    }

    public String toString(){
        return "CHARACTER\n";
    }

//    @FXML
//    public void handle(ActionEvent event){
//        System.out.print(event.getSource());
//    }

}