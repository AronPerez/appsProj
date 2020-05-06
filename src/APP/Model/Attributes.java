package APP.Model;

public class Attributes{

        public Element Strength, Dexterity, Stamina,Charisma,Manipulation,
                Appearances,Perception,Intelligence,Wits;
        public void Attributes() {

            Strength = new Element(1);
            Dexterity = new Element(1);
            Stamina = new Element(1);
            Charisma = new Element(1);
            Manipulation = new Element(1);
            Appearances = new Element(1);
            Perception = new Element(1);
            Intelligence = new Element(1);
            Wits = new Element(1);

    }
    public String toString(){
        return null;
    }

    public void ProcessDots(String eType, String eAction) {
            switch(eType) {
                case "str":
                    if (eAction == "up") {
                        Strength.addDot();
                    }
                    else if (eAction == "down") {
                        Strength.removeDot();
                    }
                case "dex":
                    if (eAction == "up") {
                        Dexterity.addDot();
                    }
                    else if (eAction == "down") {
                        Dexterity.removeDot();
                    }
                case "stam":
                    if (eAction == "up") {
                        Stamina.addDot();
                    }
                    else if (eAction == "down") {
                        Stamina.removeDot();
                    }
                case "char":
                    if (eAction == "up") {
                        Charisma.addDot();
                    }
                    else if (eAction == "down") {
                        Charisma.removeDot();
                    }
                case "man":
                    if (eAction == "up") {
                        Manipulation.addDot();
                    }
                    else if (eAction == "down") {
                        Manipulation.removeDot();
                    }
                case "app":
                    if (eAction == "up") {
                        Appearances.addDot();
                    }
                    else if (eAction == "down") {
                        Appearances.removeDot();
                    }
                case "perc":
                    if (eAction == "up") {
                        Perception.addDot();
                    }
                    else if (eAction == "down") {
                        Perception.removeDot();
                    }
                case "int":
                    if (eAction == "up") {
                        Intelligence.addDot();
                    }
                    else if (eAction == "down") {
                        Intelligence.removeDot();
                    }
                case "wits":
                    if (eAction == "up") {
                        Wits.addDot();
                    }
                    else if (eAction == "down") {
                        Wits.removeDot();
                    }
                default:
                    System.out.print("\nDEFAULTED\n");

            }

    }
}