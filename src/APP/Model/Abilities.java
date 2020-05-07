package APP.Model;

public class Abilities{

    public int Alertness, Art, Athletics, Awareness, Brawl, Empathy, Expression, Intimidation,
            Leadership, Streetwise, Subterfuge, Crafts, Drive, Etiquette, Firearms,
            MartialArts, Meditation, Melee, Research, Stealth, Survival, Technology,
            Academics, Computer, Cosmology, Enigma, Esoterica, Investigation, Law,
            Medicine, Occult, Politics, Science;

    public Abilities() {

        Drive =  0;
        Etiquette =  0;
        Firearms =  0;
        MartialArts =  0;
        Meditation =  0;
        Melee =  0;
        Research =  0;
        Stealth =  0;
        Survival =  0;
        Technology =  0;
        Academics =  0;
        Computer =  0;
        Cosmology =  0;
        Enigma =  0;
        Esoterica =  0;
        Investigation =  0;
        Law =  0;
        Medicine =  0;
        Occult =  0;
        Politics =  0;
        Science =  0;
        Crafts =  0;
        Alertness =  0;
        Art =  0;
        Athletics =  0;
        Awareness =  0;
        Brawl =  0;
        Empathy =  0;
        Expression =  0;
        Intimidation =  0;
        Leadership =  0;
        Streetwise =  0;
        Subterfuge =  0;

    }
    public String toString(){
        return null;
    }

    public void ProcessDots(String eType, String eAction) {
        switch (eType) {
            case "driv":
                if (eAction.contains("up")) {
                    Drive++;
                } else if (eAction.contains("down")) {
                    Drive--;
                }
            case "etiq":
                if (eAction.contains("up")) {
                    Etiquette++;
                } else if (eAction.contains("down")) {
                    Etiquette--;
                }
            case "fire":
                if (eAction.contains("up")) {
                    Firearms++;
                } else if (eAction.contains("down")) {
                    Firearms--;
                }
            case "mart":
                if (eAction.contains("up")) {
                    MartialArts++;
                } else if (eAction.contains("down")) {
                    MartialArts--;
                }
            case "med":
                if (eAction.contains("up")) {
                    Meditation++;
                } else if (eAction.contains("down")) {
                    Meditation--;
                }
            case "mel":
                if (eAction.contains("up")) {
                    Melee++;
                } else if (eAction.contains("down")) {
                    Melee--;
                }
            case "rese":
                if (eAction.contains("up")) {
                    Research++;
                } else if (eAction.contains("down")) {
                    Research--;
                }
            case "stea":
                if (eAction.contains("up")) {
                    Stealth++;
                } else if (eAction.contains("down")) {
                    Stealth--;
                }
            case "surv":
                if (eAction.contains("up")) {
                    Survival++;
                } else if (eAction.contains("down")) {
                    Survival--;
                }
            case "tech":
                if (eAction.contains("up")) {
                    Technology++;
                } else if (eAction.contains("down")) {
                    Technology--;
                }
            case "aca":
                if (eAction.contains("up")) {
                    Academics++;
                } else if (eAction.contains("down")) {
                    Academics--;
                }
            case "comp":
                if (eAction.contains("up")) {
                    Computer++;
                } else if (eAction.contains("down")) {
                    Computer--;
                }
            case "cosm":
                if (eAction.contains("up")) {
                    Cosmology++;
                } else if (eAction.contains("down")) {
                    Cosmology--;
                }
            case "enig":
                if (eAction.contains("up")) {
                    Enigma++;
                } else if (eAction.contains("down")) {
                    Enigma--;
                }
            case "esot":
                if (eAction.contains("up")) {
                    Esoterica++;
                } else if (eAction.contains("down")) {
                    Esoterica--;
                }
            case "inv":
                if (eAction.contains("up")) {
                    Investigation++;
                } else if (eAction.contains("down")) {
                    Investigation--;
                }
            case "law":
                if (eAction.contains("up")) {
                    Law++;
                } else if (eAction.contains("down")) {
                    Law--;
                }
            case "medi":
                if (eAction.contains("up")) {
                    Medicine++;
                } else if (eAction.contains("down")) {
                    Medicine--;
                }
            case "occ":
                if (eAction.contains("up")) {
                    Occult++;
                } else if (eAction.contains("down")) {
                    Occult--;
                }
            case "pol":
                if (eAction.contains("up")) {
                    Politics++;
                } else if (eAction.contains("down")) {
                    Politics--;
                }
            case "sci":
                if (eAction.contains("up")) {
                    Science++;
                } else if (eAction.contains("down")) {
                    Science--;
                }
            case "craft":
                if (eAction.contains("up")) {
                    Crafts++;
                } else if (eAction.contains("down")) {
                    Crafts--;
                }
            case "alrt":
                if (eAction.contains("up")) {
                    Alertness++;
                } else if (eAction.contains("down")) {
                    Alertness--;
                }
            case "art":
                if (eAction.contains("up")) {
                    Art++;
                } else if (eAction.contains("down")) {
                    Art--;
                }
            case "ath":
                if (eAction.contains("up")) {
                    Athletics++;
                } else if (eAction.contains("down")) {
                    Athletics--;
                }
            case "awar":
                if (eAction.contains("up")) {
                    Awareness++;
                } else if (eAction.contains("down")) {
                    Awareness--;
                }
            case "bra":
                if (eAction.contains("up")) {
                    Brawl++;
                } else if (eAction.contains("down")) {
                    Brawl--;
                }
            case "emp":
                if (eAction.contains("up")) {
                    Empathy++;
                } else if (eAction.contains("down")) {
                    Empathy--;
                }
            case "expr":
                if (eAction.contains("up")) {
                    Expression++;
                } else if (eAction.contains("down")) {
                    Expression--;
                }
            case "inti":
                if (eAction.contains("up")) {
                    Intimidation++;
                } else if (eAction.contains("down")) {
                    Intimidation--;
                }
            case "lead":
                if (eAction.contains("up")) {
                    Leadership++;
                } else if (eAction.contains("down")) {
                    Leadership--;
                }
            case "stre":
                if (eAction.contains("up")) {
                    Streetwise++;
                } else if (eAction.contains("down")) {
                    Streetwise--;
                }
            case "subt":
                if (eAction.contains("up")) {
                    Subterfuge++;
                } else if (eAction.contains("down")) {
                    Subterfuge--;
                }
            default:
                System.out.print("\nBUTTON DEFAULTED\n");
        }
    }
}