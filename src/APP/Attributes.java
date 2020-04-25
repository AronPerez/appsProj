package APP;

public class Attributes{

        ElementGroup Physical, Social, Mental;

        Element Strength, Dexterity, Stamina,Charisma,Manipulation
                ,Appearances,Perception,Intelligence,Wits;

        public void Attributes() {
            Physical = new ElementGroup();
            Social = new ElementGroup();
            Mental = new ElementGroup();

            Strength = new Element(1);
            Dexterity = new Element(1);
            Stamina = new Element(1);
            Charisma = new Element(1);
            Manipulation = new Element(1);
            Appearances = new Element(1);
            Perception = new Element(1);
            Intelligence = new Element(1);
            Wits = new Element(1);

            Physical.addElement(Strength);
            Physical.addElement(Dexterity);
            Physical.addElement(Stamina);

            Social.addElement(Charisma);
            Social.addElement(Manipulation);
            Social.addElement(Appearances);

            Mental.addElement(Perception);
            Mental.addElement(Intelligence);
            Mental.addElement(Wits);
    }
}