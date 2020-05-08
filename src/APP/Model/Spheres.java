package APP.Model;

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
                    Correspondence++;
                } else if (eAction.contains("down") && Correspondence > 0) {
                    Correspondence--;
                }
               return Correspondence;
            case "ent":
                if (eAction.contains("up") && Entropy < 5) {
                    Entropy++;
                } else if (eAction.contains("down") && Entropy > 0) {
                    Entropy--;
                }
               return Entropy;
            case "forces":
                if (eAction.contains("up") && Forces < 5) {
                    Forces++;
                } else if (eAction.contains("down") && Forces > 0) {
                    Forces--;
                }
               return Forces;
            case "life":
                if (eAction.contains("up") && Life < 5) {
                    Life++;
                } else if (eAction.contains("down") && Life > 0) {
                    Life--;
                }
               return Life;
            case "matter":
                if (eAction.contains("up") && Matter < 5) {
                    Matter++;
                } else if (eAction.contains("down") && Matter > 0) {
                    Matter--;
                }
               return Matter;
            case "mind":
                if (eAction.contains("up") && Mind < 5) {
                    Mind++;
                } else if (eAction.contains("down") && Mind > 0) {
                    Mind--;
                }
               return Mind;
            case "prime":
                if (eAction.contains("up") && Prime < 5) {
                    Prime++;
                } else if (eAction.contains("down") && Prime > 0) {
                    Prime--;
                }
               return Prime;
            case "spirit":
                if (eAction.contains("up") && Spirit < 5) {
                    Spirit++;
                } else if (eAction.contains("down") && Spirit > 0) {
                    Spirit--;
                }
               return Spirit;
            case "time":
                if (eAction.contains("up") && Time < 5) {
                    Time++;
                } else if (eAction.contains("down") && Time > 0) {
                    Time--;
                }
               return Time;
            default:
                System.out.print("\nBUTTON DEFAULTED\n");
                return 0;
        }
    }
}
