package APP.Model;

public class Spheres{

    public int Correspondence, Entropy, Forces, Life, Matter, Mind, Prime,
            Spirit, Time;

    public Spheres() {

        Correspondence = 0;;
        Entropy = 0;;
        Forces = 0;;
        Life = 0;;
        Matter = 0;;
        Mind = 0;;
        Prime = 0;;
        Spirit = 0;;
        Time = 0;;
    }

    public String toString(){
        return "SPHERES";
    }

    public void ProcessDots(String eType, String eAction) {

        switch(eType) {
            case "corr":
                if (eAction.contains("up")) {
                    Correspondence++;
                } else if (eAction.contains("down")) {
                    Correspondence--;
                }
            case "ent":
                if (eAction.contains("up")) {
                    Entropy++;
                } else if (eAction.contains("down")) {
                    Entropy--;
                }
            case "forces":
                if (eAction.contains("up")) {
                    Forces++;
                } else if (eAction.contains("down")) {
                    Forces--;
                }
            case "life":
                if (eAction.contains("up")) {
                    Life++;
                } else if (eAction.contains("down")) {
                    Life--;
                }
            case "matter":
                if (eAction.contains("up")) {
                    Matter++;
                } else if (eAction.contains("down")) {
                    Matter--;
                }
            case "mind":
                if (eAction.contains("up")) {
                    Mind++;
                } else if (eAction.contains("down")) {
                    Mind--;
                }
            case "prime":
                if (eAction.contains("up")) {
                    Prime++;
                } else if (eAction.contains("down")) {
                    Prime--;
                }
            case "spirit":
                if (eAction.contains("up")) {
                    Spirit++;
                } else if (eAction.contains("down")) {
                    Spirit--;
                }
            case "time":
                if (eAction.contains("up")) {
                    Time++;
                } else if (eAction.contains("down")) {
                    Time--;
                }
            default:
                System.out.print("\nBUTTON DEFAULTED\n");

        }
    }
}
