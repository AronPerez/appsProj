package APP.Model;

public class Attributes{

        public int Strength, Dexterity, Stamina,Charisma,Manipulation,
                Appearances,Perception,Intelligence,Wits;

        public Attributes() {

            Strength = 1;
            Dexterity = 1;
            Stamina = 1;
            Charisma = 1;
            Manipulation = 1;
            Appearances = 1;
            Perception = 1;
            Intelligence = 1;
            Wits = 1;

    }


    public String toString(){
        return "ATTRIBUTES";
    }

    public int ProcessDots(String eType, String eAction) {

            switch(eType) {
                case "str":
                    if (eAction.contains("up")) {
                        Strength++;
                    }
                    else if (eAction.contains("down")) {
                        Strength--;
                    }
                    return Strength;
                case "dex":
                    if (eAction.contains("up")) {
                        Dexterity++;
                    }
                    else if (eAction.contains("down")) {
                        Dexterity--;
                    }
                    return Dexterity;
                case "stam":
                    if (eAction.contains("up")) {
                        Stamina++;
                    }
                    else if (eAction.contains("down")) {
                        Stamina--;
                    }
                    return Stamina;
                case "char":
                    if (eAction.contains("up")) {
                        Charisma++;
                    }
                    else if (eAction.contains("down")) {
                        Charisma--;
                    }
                   return Charisma;
                case "man":
                    if (eAction.contains("up")) {
                        Manipulation++;
                    }
                    else if (eAction.contains("down")) {
                        Manipulation--;
                    }
                   return Manipulation;
                case "app":
                    if (eAction.contains("up")) {
                        Appearances++;
                    }
                    else if (eAction.contains("down")) {
                        Appearances--;
                    }
                   return Appearances;
                case "perc":
                    if (eAction.contains("up")) {
                        Perception++;
                    }
                    else if (eAction.contains("down")) {
                        Perception--;
                    }
                   return Perception;
                case "int":
                    if (eAction.contains("up")) {
                        Intelligence++;
                    }
                    else if (eAction.contains("down")) {
                        Intelligence--;
                    }
                   return Intelligence;
                case "wits":
                    if (eAction.contains("up")) {
                        Wits++;
                    }
                    else if (eAction.contains("down")) {
                        Wits--;
                    }
                   return Wits;
                default:
                    System.out.print("\nBUTTON DEFAULTED: \n" + eType);
                    return 0;
            }
    }
}