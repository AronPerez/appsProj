package APP.Model;

public class Character {
    APP.Model.Attributes Attributes;
    APP.Model.Spheres Spheres;
    APP.Model.Advantages Advantages;
    APP.Model.Abilities Abilities;
    String Name, Player, Chronicle, Nature, Demeanor,Essence,
            Affiliation,Sect,Concept;

    public Character() {
        Spheres = new Spheres();
        Advantages = new Advantages();
        Attributes = new Attributes();
        Abilities = new Abilities();
    }


}