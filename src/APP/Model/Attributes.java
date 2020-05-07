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

    public void ProcessDots(String eType, String eAction) {
        System.out.print("ASDASDSA");
            switch(eType) {
                case "str":
                    if (eAction.contains("up")) {

                        Strength++;
                    }
                    else if (eAction.contains("down")) {
                        Strength--;
                    }
                case "dex":
                    if (eAction.contains("up")) {
                        Dexterity++;
                    }
                    else if (eAction.contains("down")) {
                        Dexterity--;
                    }
                case "stam":
                    if (eAction.contains("up")) {
                        Stamina++;
                    }
                    else if (eAction.contains("down")) {
                        Stamina--;
                    }
                case "char":
                    if (eAction.contains("up")) {
                        Charisma++;
                    }
                    else if (eAction.contains("down")) {
                        Charisma--;
                    }
                case "man":
                    if (eAction.contains("up")) {
                        Manipulation++;
                    }
                    else if (eAction.contains("down")) {
                        Manipulation--;
                    }
                case "app":
                    if (eAction.contains("up")) {
                        Appearances++;
                    }
                    else if (eAction.contains("down")) {
                        Appearances--;
                    }
                case "perc":
                    if (eAction.contains("up")) {
                        Perception++;
                    }
                    else if (eAction.contains("down")) {
                        Perception--;
                    }
                case "int":
                    if (eAction.contains("up")) {
                        Intelligence++;
                    }
                    else if (eAction.contains("down")) {
                        Intelligence--;
                    }
                case "wits":
                    if (eAction.contains("up")) {
                        Wits++;
                    }
                    else if (eAction.contains("down")) {
                        Wits--;
                    }
                default:
                    System.out.print("\nBUTTON DEFAULTED\n");

            }

    }
}