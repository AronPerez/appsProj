package APP.Model;
import APP.Model.*;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Character {
    public Attributes Attributes;
    public Spheres Spheres;
    public Abilities Abilities;
    public Advantages Advantages;

    public String Name, Player, Chronicle, Nature, Demeanor,
            Essence,Affiliation,Sect,Concept,currentXP, maxXP;

    public Character() {
        Spheres = new Spheres();
        Advantages = new Advantages();
        Attributes = new Attributes();
        Abilities = new Abilities();
        Name = null;

    }

    public String toString(){
        return "CHARACTER\n";
    }


}