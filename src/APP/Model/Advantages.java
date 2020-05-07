package APP.Model;

public class Advantages{

    public int Health, Willpower, Arete;
    String Background;

    public Advantages() {
        Arete = 0;
        Health = 0;
        Willpower = 0;

    }
    public String toString(){
        return "ADVANTAGES";
    }

    public int ProcessDots(String eType, String eAction) {
        System.out.println("PROCESSING "+ eType + " , " + eAction);
        switch(eType) {
            case "arete":
                if (eAction.contains("up")) {
                    Arete++;


                } else if (eAction.contains("down")) {
                    Arete--;
                }
               return Arete;
            case "health":
                if (eAction.contains("up")) {
                    Health++;
                } else if (eAction.contains("down")) {
                    Health--;
                }
               return Health;
            case "will":
                if (eAction.contains("up")) {
                    Willpower++;
                } else if (eAction.contains("down")) {
                    Willpower--;
                }
               return Willpower;
            default:
                System.out.print("\nBUTTON DEFAULTED\n");
                return 0;
        }
    }
}
