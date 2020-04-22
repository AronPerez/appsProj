package APP;

public class Element {
    String Name;
    int Dots;

    public Element(String name, int dots) {
        Name = name;
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
