package APP.Model;
import APP.Model.*;
import javafx.event.*;
import javafx.fxml.FXML;

public class Character {
    public Attributes Attributes;
    public Spheres Spheres;
    public Abilities Abilities;
    public Advantages Advantages;

    String Name, Player, Chronicle, Nature, Demeanor,Essence,
            Affiliation,Sect,Concept;

    public Character() {
        Spheres = new Spheres();
        Advantages = new Advantages();
        Attributes = new Attributes();
        Abilities = new Abilities();
        Name = null;
    }

//    public Spheres getSpheres() {
//        return this.Spheres;
//    }
//    public Advantages getAdvantages() {
//        return this.Advantages;
//    }
//    public Attributes getAttributes() {
//        return this.Attributes;
//    }
//    public Abilities getAbilities() {
//        return this.Abilities;
//    }

    public String toString(){
        return "CHARACTER\n";
    }


}