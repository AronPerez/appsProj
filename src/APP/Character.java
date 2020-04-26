package APP;

public class Character {
    Attributes Attributes;
    Spheres Spheres;
    Advantages Advantages;
    Abilities Abilities;
    String Name, Player, Chronicle, Nature, Demeanor,Essence,
            Affiliation,Sect,Concept;

    public Character() {
        Spheres = new Spheres();
        Advantages = new Advantages();
        Attributes = new Attributes();
        Abilities = new Abilities();
    }



}