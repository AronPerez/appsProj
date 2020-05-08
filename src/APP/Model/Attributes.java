package APP.Model;

public class Attributes{

        public int Strength, Dexterity, Stamina,Charisma,Manipulation,
                Appearances,Perception,Intelligence,Wits;

        public Attributes() {
            // Default by one
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
            System.out.println("ASDASDASD");
            switch(eType) {
                case "str":
                    if (eAction.contains("up") && Strength < 4) {
                        Strength++;
                    }
                   if(eAction.contains("down")&& Strength > 1) {
                        Strength--;
                    }
                    return Strength;
                case "dex":
                    if (eAction.contains("up") && Dexterity < 4) {
                        Dexterity++;
                    } else if (eAction.contains("down") && Dexterity > 1) {
                        Dexterity--;
                    }
                    return Dexterity;
                case "stam":
                    if (eAction.contains("up") && Stamina < 4) {
                        Stamina++;
                    }
                    else if (eAction.contains("down") && Stamina > 1) {
                        Stamina--;
                    }
                    return Stamina;
                case "char":
                    if (eAction.contains("up") && Charisma < 4) {
                        Charisma++;
                    }
                    else if (eAction.contains("down") && Charisma > 1) {
                        Charisma--;
                    }
                   return Charisma;
                case "man":
                    if (eAction.contains("up") && Manipulation < 4) {
                        Manipulation++;
                    }
                    else if (eAction.contains("down") && Manipulation > 1) {
                        Manipulation--;
                    }
                   return Manipulation;
                case "app":
                    if (eAction.contains("up") && Appearances < 4) {
                        Appearances++;
                    }
                    else if (eAction.contains("down") && Appearances > 1) {
                        Appearances--;
                    }
                   return Appearances;
                case "perc":
                    if (eAction.contains("up") && Perception < 4) {
                        Perception++;
                    }
                    else if (eAction.contains("down") && Perception > 1) {
                        Perception--;
                    }
                   return Perception;
                case "int":
                    if (eAction.contains("up") && Intelligence < 4) {
                        Intelligence++;
                    }
                    else if (eAction.contains("down") && Intelligence > 1) {
                        Intelligence--;
                    }
                   return Intelligence;
                case "wits":
                    if (eAction.contains("up") && Wits < 4) {
                        Wits++;
                    }
                    else if (eAction.contains("down") && Wits > 1) {
                        Wits--;
                    }
                   return Wits;
                default:
                    System.out.print("\nBUTTON DEFAULTED: \n" + eType);
                    return 0;
            }
    }
}