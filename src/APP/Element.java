package APP;

public class Element {
    int Dots;

    public Element(int dots) {
        Dots = dots;
    }

    public int getDots() {
        return this.Dots;
    }

    public void addDot() {
        this.Dots++;
    }

    public void setDots(int num) {
        if (num <= 4 && num >= 0)
            this.Dots = num;
    }
}
