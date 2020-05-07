package APP.Model;

public class Element{
    public int Dots;

    public Element(int dots) {
        Dots = dots;
    }

    public void addDot() {

        if(Dots <= 4 && Dots > 0) {
            this.Dots++;
        }
    }

    public void removeDot() {
        if (Dots <= 4 && Dots > 0) {
            this.Dots--;
        }
    }

}
