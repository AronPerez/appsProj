package APP.Model;

public class Abilities {

    Element Alertness, Art, Athletics, Awareness, Brawl, Empathy, Expression, Intimidation,
            Leadership, Streetwise, Subterfuge, Crafts, Drive, Etiquette, Firearms,
            MartialArts, Meditation, Melee, Research, Stealth, Survival, Technology,
            Academics, Computer, Cosmology, Enigma, Esoterica, Investigation, Law,
            Medicine, Occult, Politics, Science;

    public Abilities() {

        Drive = new Element(0);
        Etiquette = new Element(0);
        Firearms = new Element(0);
        MartialArts = new Element(0);
        Meditation = new Element(0);
        Melee = new Element(0);
        Research = new Element(0);
        Stealth = new Element(0);
        Survival = new Element(0);
        Technology = new Element(0);
        Academics = new Element(0);
        Computer = new Element(0);
        Cosmology = new Element(0);
        Enigma = new Element(0);
        Esoterica = new Element(0);
        Investigation = new Element(0);
        Law = new Element(0);
        Medicine = new Element(0);
        Occult = new Element(0);
        Politics = new Element(0);
        Science = new Element(0);
        Crafts = new Element(0);
        Alertness = new Element(0);
        Art = new Element(0);
        Athletics = new Element(0);
        Awareness = new Element(0);
        Brawl = new Element(0);
        Empathy = new Element(0);
        Expression = new Element(0);
        Intimidation = new Element(0);
        Leadership = new Element(0);
        Streetwise = new Element(0);
        Subterfuge = new Element(0);

    }
    public String toString(){
        return null;
    }

    public void ProcessDots(String eType, String eAction) {
        switch (eType) {
            case "driv":
                if (eAction == "up") {
                    Drive.addDot();
                } else if (eAction == "down") {
                    Drive.removeDot();
                }
            case "etiq":
                if (eAction == "up") {
                    Etiquette.addDot();
                } else if (eAction == "down") {
                    Etiquette.removeDot();
                }
            case "fire":
                if (eAction == "up") {
                    Firearms.addDot();
                } else if (eAction == "down") {
                    Firearms.removeDot();
                }
            case "mart":
                if (eAction == "up") {
                    MartialArts.addDot();
                } else if (eAction == "down") {
                    MartialArts.removeDot();
                }
            case "med":
                if (eAction == "up") {
                    Meditation.addDot();
                } else if (eAction == "down") {
                    Meditation.removeDot();
                }
            case "mel":
                if (eAction == "up") {
                    Melee.addDot();
                } else if (eAction == "down") {
                    Melee.removeDot();
                }
            case "rese":
                if (eAction == "up") {
                    Research.addDot();
                } else if (eAction == "down") {
                    Research.removeDot();
                }
            case "stea":
                if (eAction == "up") {
                    Stealth.addDot();
                } else if (eAction == "down") {
                    Stealth.removeDot();
                }
            case "surv":
                if (eAction == "up") {
                    Survival.addDot();
                } else if (eAction == "down") {
                    Survival.removeDot();
                }
            case "tech":
                if (eAction == "up") {
                    Technology.addDot();
                } else if (eAction == "down") {
                    Technology.removeDot();
                }
            case "aca":
                if (eAction == "up") {
                    Academics.addDot();
                } else if (eAction == "down") {
                    Academics.removeDot();
                }
            case "comp":
                if (eAction == "up") {
                    Computer.addDot();
                } else if (eAction == "down") {
                    Computer.removeDot();
                }
            case "cosm":
                if (eAction == "up") {
                    Cosmology.addDot();
                } else if (eAction == "down") {
                    Cosmology.removeDot();
                }
            case "enig":
                if (eAction == "up") {
                    Enigma.addDot();
                } else if (eAction == "down") {
                    Enigma.removeDot();
                }
            case "esot":
                if (eAction == "up") {
                    Esoterica.addDot();
                } else if (eAction == "down") {
                    Esoterica.removeDot();
                }
            case "inv":
                if (eAction == "up") {
                    Investigation.addDot();
                } else if (eAction == "down") {
                    Investigation.removeDot();
                }
            case "law":
                if (eAction == "up") {
                    Law.addDot();
                } else if (eAction == "down") {
                    Law.removeDot();
                }
            case "medi":
                if (eAction == "up") {
                    Medicine.addDot();
                } else if (eAction == "down") {
                    Medicine.removeDot();
                }
            case "occ":
                if (eAction == "up") {
                    Occult.addDot();
                } else if (eAction == "down") {
                    Occult.removeDot();
                }
            case "pol":
                if (eAction == "up") {
                    Politics.addDot();
                } else if (eAction == "down") {
                    Politics.removeDot();
                }
            case "sci":
                if (eAction == "up") {
                    Science.addDot();
                } else if (eAction == "down") {
                    Science.removeDot();
                }
            case "craft":
                if (eAction == "up") {
                    Crafts.addDot();
                } else if (eAction == "down") {
                    Crafts.removeDot();
                }
            case "alrt":
                if (eAction == "up") {
                    Alertness.addDot();
                } else if (eAction == "down") {
                    Alertness.removeDot();
                }
            case "art":
                if (eAction == "up") {
                    Art.addDot();
                } else if (eAction == "down") {
                    Art.removeDot();
                }
            case "ath":
                if (eAction == "up") {
                    Athletics.addDot();
                } else if (eAction == "down") {
                    Athletics.removeDot();
                }
            case "awar":
                if (eAction == "up") {
                    Awareness.addDot();
                } else if (eAction == "down") {
                    Awareness.removeDot();
                }
            case "bra":
                if (eAction == "up") {
                    Brawl.addDot();
                } else if (eAction == "down") {
                    Brawl.removeDot();
                }
            case "emp":
                if (eAction == "up") {
                    Empathy.addDot();
                } else if (eAction == "down") {
                    Empathy.removeDot();
                }
            case "expr":
                if (eAction == "up") {
                    Expression.addDot();
                } else if (eAction == "down") {
                    Expression.removeDot();
                }
            case "inti":
                if (eAction == "up") {
                    Intimidation.addDot();
                } else if (eAction == "down") {
                    Intimidation.removeDot();
                }
            case "lead":
                if (eAction == "up") {
                    Leadership.addDot();
                } else if (eAction == "down") {
                    Leadership.removeDot();
                }
            case "stre":
                if (eAction == "up") {
                    Streetwise.addDot();
                } else if (eAction == "down") {
                    Streetwise.removeDot();
                }
            case "subt":
                if (eAction == "up") {
                    Subterfuge.addDot();
                } else if (eAction == "down") {
                    Subterfuge.removeDot();
                }
            default:
                System.out.print("\nDEFAULTED\n");
        }
    }
}