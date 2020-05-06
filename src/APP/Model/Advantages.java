package APP.Model;

public class Advantages {

    Element Health, Willpower, Arete;
    String Background;

    public Advantages() {
        Arete = new Element(0);
        Health = new Element(0);
        Willpower = new Element(0);
        Background = null;

    }
    public String toString(){
        return null;
    }

    public void ProcessDots(String eType, String eAction) {
        switch(eType) {
            case "arete":
                if (eAction == "up") {
                    Arete.addDot();
                } else if (eAction == "down") {
                    Arete.removeDot();
                }
            case "health":
                if (eAction == "up") {
                    Health.addDot();
                } else if (eAction == "down") {
                    Health.removeDot();
                }
            case "will":
                if (eAction == "up") {
                    Willpower.addDot();
                } else if (eAction == "down") {
                    Willpower.removeDot();
                }
            default:
                System.out.print("\nDEFAULTED\n");
        }
    }
}
