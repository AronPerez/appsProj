package APP.Model;

import APP.Controller.Controller;

public class Spheres{

    public int Correspondence, Entropy, Forces, Life, Matter, Mind, Prime,
            Spirit, Time;

    public Spheres() {
        Correspondence = 0;
        Entropy = 0;
        Forces = 0;
        Life = 0;
        Matter = 0;
        Mind = 0;
        Prime = 0;
        Spirit = 0;
        Time = 0;
    }

    public String toString(){
        return "SPHERES";
    }

    public int ProcessDots(String eType, String eAction) {

        switch(eType) {
            case "corr":
                if (eAction.contains("up") && Correspondence < 5) {
                    Controller.changeEXP(eAction, 0);
                    Correspondence++;
                } else if (eAction.contains("down") && Correspondence > 0) {
                    Controller.changeEXP(eAction, 0);
                    Correspondence--;
                }else {
                    return 0;
                }
               return Correspondence;
            case "ent":
                if (eAction.contains("up") && Entropy < 5) {
                    Controller.changeEXP(eAction, 0);
                    Entropy++;
                } else if (eAction.contains("down") && Entropy > 0) {
                    Controller.changeEXP(eAction, 0);
                    Entropy--;
                }else {
                    return 0;
                }
               return Entropy;
            case "forces":
                if (eAction.contains("up") && Forces < 5) {
                    Controller.changeEXP(eAction, 0);
                    Forces++;
                } else if (eAction.contains("down") && Forces > 0) {
                    Controller.changeEXP(eAction, 0);
                    Forces--;
                }else {
                    return 0;
                }
               return Forces;
            case "life":
                if (eAction.contains("up") && Life < 5) {
                    Controller.changeEXP(eAction, 0);
                    Life++;
                } else if (eAction.contains("down") && Life > 0) {
                    Controller.changeEXP(eAction, 0);
                    Life--;
                }else {
                    return 0;
                }
               return Life;
            case "matter":
                if (eAction.contains("up") && Matter < 5) {
                    Controller.changeEXP(eAction, 0);
                    Matter++;
                } else if (eAction.contains("down") && Matter > 0) {
                    Controller.changeEXP(eAction, 0);
                    Matter--;
                }else {
                    return 0;
                }
               return Matter;
            case "mind":
                if (eAction.contains("up") && Mind < 5) {
                    Controller.changeEXP(eAction, 0);
                    Mind++;
                } else if (eAction.contains("down") && Mind > 0) {
                    Controller.changeEXP(eAction, 0);
                    Mind--;
                }else {
                    return 0;
                }
               return Mind;
            case "prime":
                if (eAction.contains("up") && Prime < 5) {
                    Controller.changeEXP(eAction, 0);
                    Prime++;
                } else if (eAction.contains("down") && Prime > 0) {
                    Controller.changeEXP(eAction, 0);
                    Prime--;
                }else {
                    return 0;
                }
               return Prime;
            case "spirit":
                if (eAction.contains("up") && Spirit < 5) {
                    Controller.changeEXP(eAction, 0);
                    Spirit++;
                } else if (eAction.contains("down") && Spirit > 0) {
                    Controller.changeEXP(eAction, 0);
                    Spirit--;
                }else {
                    return 0;
                }
               return Spirit;
            case "time":
                if (eAction.contains("up") && Time < 5) {
                    Controller.changeEXP(eAction, 0);
                    Time++;
                } else if (eAction.contains("down") && Time > 0) {
                    Controller.changeEXP(eAction, 0);
                    Time--;
                }else {
                    return 0;
                }
               return Time;
            default:
                System.out.print("\nBUTTON DEFAULTED\n");
                return 0;
        }
    }
}
