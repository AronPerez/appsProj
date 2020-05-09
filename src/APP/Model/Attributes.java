package APP.Model;

import APP.Controller.Controller;

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

            switch(eType) {
                case "str":
                    if (eAction.contains("down") && Strength == 1) {
                        Controller.changeEXP(eAction, 1);
                        return -1;
                    }else if (eAction.contains("up") && Strength < 5) {
                        Controller.changeEXP(eAction, 0);
                        Strength++;
                    }
                    else if(eAction.contains("down") && Strength > 1) {
                        Controller.changeEXP(eAction, 0);
                        Strength--;
                    } else {
                        return 0;
                    }
                    return Strength;
                case "dex":
                    if (eAction.contains("down")&& Dexterity == 1) {
                        Controller.changeEXP(eAction, 1);
                        return -1;
                    }else if (eAction.contains("up") && Dexterity < 5) {
                        Controller.changeEXP(eAction, 0);
                        Dexterity++;
                    } else if (eAction.contains("down") && Dexterity > 1) {
                        Controller.changeEXP(eAction, 0);
                        Dexterity--;
                    }else {
                        return 0;
                    }
                    return Dexterity;
                case "stam":
                    if (eAction.contains("down") &&Stamina == 1) {
                        Controller.changeEXP(eAction, 1);
                        return -1;
                    }else if (eAction.contains("up") && Stamina < 5) {
                        Controller.changeEXP(eAction, 0);
                        Stamina++;
                    }
                    else if (eAction.contains("down") && Stamina > 1) {
                        Controller.changeEXP(eAction, 0);
                        Stamina--;
                    }else {
                        return 0;
                    }
                    return Stamina;
                case "char":
                    if (eAction.contains("down") &&Charisma == 1) {
                        Controller.changeEXP(eAction, 1);
                        return -1;
                    }else if (eAction.contains("up") && Charisma < 5) {
                        Controller.changeEXP(eAction, 0);
                        Charisma++;
                    }
                    else if (eAction.contains("down") && Charisma > 1) {
                        Controller.changeEXP(eAction, 0);
                        Charisma--;
                    }else {
                        return 0;
                    }
                   return Charisma;
                case "man":
                    if (eAction.contains("down")&& Manipulation == 1) {
                        Controller.changeEXP(eAction, 1);
                        return -1;
                    }else if (eAction.contains("up") && Manipulation < 5) {
                        Controller.changeEXP(eAction, 0);
                        Manipulation++;
                    }
                    else if (eAction.contains("down") && Manipulation > 1) {
                        Controller.changeEXP(eAction, 0);
                        Manipulation--;
                    }else {
                        return 0;
                    }
                   return Manipulation;
                case "app":
                    if (eAction.contains("down")&& Appearances == 1) {
                        Controller.changeEXP(eAction, 1);
                        return -1;
                    }else if (eAction.contains("up") && Appearances < 5) {
                        Controller.changeEXP(eAction, 0);
                        Appearances++;
                    }
                    else if (eAction.contains("down") && Appearances > 1) {
                        Controller.changeEXP(eAction, 0);
                        Appearances--;
                    }else {
                        return 0;
                    }
                   return Appearances;
                case "perc":
                    if (eAction.contains("down")&& Perception == 1) {
                        Controller.changeEXP(eAction, 1);
                        return -1;

                    }else if (eAction.contains("up") && Perception < 5) {
                        Controller.changeEXP(eAction, 0);
                        Perception++;
                    }
                    else if (eAction.contains("down") && Perception > 1) {
                        Controller.changeEXP(eAction, 0);
                        Perception--;
                    }else {
                        return 0;
                    }
                   return Perception;
                case "int":
                    if (eAction.contains("down") && Intelligence == 1) {
                        Controller.changeEXP(eAction, 1);
                        return -1;
                    }else if (eAction.contains("up") && Intelligence < 5) {
                        Controller.changeEXP(eAction, 0);
                        Intelligence++;
                    }
                    else if (eAction.contains("down") && Intelligence > 1) {
                        Controller.changeEXP(eAction, 0);
                        Intelligence--;
                    }else {
                        return 0;
                    }
                   return Intelligence;
                case "wits":
                    if (eAction.contains("down") && Wits == 1) {
                        Controller.changeEXP(eAction, 1);
                        return -1;
                    }else if (eAction.contains("up") && Wits < 5) {
                        Controller.changeEXP(eAction, 0);
                        Wits++;
                    }
                    else if (eAction.contains("down") && Wits > 1) {
                        Controller.changeEXP(eAction, 0);
                        Wits--;
                    }else {
                        return 0;
                    }
                   return Wits;
                default:
                    System.out.print("\nBUTTON DEFAULTED: \n" + eType);
                    return 0;
            }
    }
}