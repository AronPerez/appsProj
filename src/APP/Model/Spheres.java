package APP.Model;

public class Spheres {

    public Element Correspondence, Entropy, Forces, Life, Matter, Mind, Prime,
            Spirit, Time;

    public Spheres() {

        Correspondence = new Element(0);
        Entropy = new Element(0);
        Forces = new Element(0);
        Life = new Element(0);
        Matter = new Element(0);
        Mind = new Element(0);
        Prime = new Element(0);
        Spirit = new Element(0);
        Time = new Element(0);

    }

    public String toString(){
        return null;
    }

    public void ProcessDots(String eType, String eAction) {

        switch(eType) {
            case "corr":
                if (eAction == "up") {
                    Correspondence.addDot();
                } else if (eAction == "down") {
                    Correspondence.removeDot();
                }
            case "ent":
                if (eAction == "up") {
                    Entropy.addDot();
                } else if (eAction == "down") {
                    Entropy.removeDot();
                }
            case "forces":
                if (eAction == "up") {
                    Forces.addDot();
                } else if (eAction == "down") {
                    Forces.removeDot();
                }
            case "life":
                if (eAction == "up") {
                    Life.addDot();
                } else if (eAction == "down") {
                    Life.removeDot();
                }
            case "matter":
                if (eAction == "up") {
                    Matter.addDot();
                } else if (eAction == "down") {
                    Matter.removeDot();
                }
            case "mind":
                if (eAction == "up") {
                    Mind.addDot();
                } else if (eAction == "down") {
                    Mind.removeDot();
                }
            case "prime":
                if (eAction == "up") {
                    Prime.addDot();
                } else if (eAction == "down") {
                    Prime.removeDot();
                }
            case "spirit":
                if (eAction == "up") {
                    Spirit.addDot();
                } else if (eAction == "down") {
                    Spirit.removeDot();
                }
            case "time":
                if (eAction == "up") {
                    Time.addDot();
                } else if (eAction == "down") {
                    Time.removeDot();
                }
            default:
                System.out.print("\nDEFAULTED\n");

        }
    }
}
