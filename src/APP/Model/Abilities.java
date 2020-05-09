package APP.Model;

import APP.Controller.Controller;

// contains Abilities values
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

    public int ProcessDots(String eType, String eAction) {
        switch (eType) {
            case "driv":
                if (eAction.contains("up") && Drive < 5) {
                    Controller.changeEXP(eAction, 0);
                    Drive++;
                } else if (eAction.contains("down") && Drive > 0) {
                    Controller.changeEXP(eAction, 0);
                    Drive--;
                }
                else {
                    return 0;
                }
                return Drive;
            case "etiq":
                if (eAction.contains("up") && Etiquette < 5) {
                    Controller.changeEXP(eAction, 0);
                    Etiquette++;
                } else if (eAction.contains("down") && Etiquette > 0) {
                    Controller.changeEXP(eAction, 0);
                    Etiquette--;
                } return Etiquette;
            case "fire":
                if (eAction.contains("up") && Firearms < 5) {
                    Controller.changeEXP(eAction, 0);
                    Firearms++;
                } else if (eAction.contains("down") && Firearms > 0) {
                    Controller.changeEXP(eAction, 0);
                    Firearms--;
                } else {
                    return 0;
                }return Firearms;
            case "mart":
                if (eAction.contains("up") && MartialArts < 5) {
                    Controller.changeEXP(eAction, 0);
                    MartialArts++;
                } else if (eAction.contains("down") && MartialArts > 0) {
                    Controller.changeEXP(eAction, 0);
                    MartialArts--;
                } else {
                    return 0;
                }
                return MartialArts;
            case "med":
                if (eAction.contains("up") && Meditation < 5) {
                    Controller.changeEXP(eAction, 0);
                    Meditation++;
                } else if (eAction.contains("down") && Meditation > 0) {
                    Controller.changeEXP(eAction, 0);
                    Meditation--;
                } else {
                    return 0;
                }return Meditation;
            case "mel":
                if (eAction.contains("up") && Melee < 5) {
                    Controller.changeEXP(eAction, 0);
                    Melee++;
                } else if (eAction.contains("down") && Melee > 0) {
                    Controller.changeEXP(eAction, 0);
                    Melee--;
                } else {
                    return 0;
                }return Melee;
            case "rese":
                if (eAction.contains("up") && Research < 5) {
                    Controller.changeEXP(eAction, 0);
                    Research++;
                } else if (eAction.contains("down") && Research > 0) {
                    Controller.changeEXP(eAction, 0);
                    Research--;
                } else {
                    return 0;
                }return Research;
            case "stea":
                if (eAction.contains("up") && Stealth < 5) {
                    Controller.changeEXP(eAction, 0);
                    Stealth++;
                } else if (eAction.contains("down") && Stealth > 0) {
                    Controller.changeEXP(eAction, 0);
                    Stealth--;
                } else {
                    return 0;
                }return Stealth;
            case "surv":
                if (eAction.contains("up") && Survival < 5) {
                    Controller.changeEXP(eAction, 0);
                    Survival++;
                } else if (eAction.contains("down") && Survival > 0) {
                    Controller.changeEXP(eAction, 0);
                    Survival--;
                } else {
                    return 0;
                }return Survival;
            case "tech":
                if (eAction.contains("up") && Technology < 5) {
                    Controller.changeEXP(eAction, 0);
                    Technology++;
                } else if (eAction.contains("down") && Technology > 0) {
                    Controller.changeEXP(eAction, 0);
                    Technology--;
                } else {
                    return 0;
                }return Technology;
            case "aca":
                if (eAction.contains("up") && Academics < 5) {
                    Controller.changeEXP(eAction, 0);
                    Academics++;
                } else if (eAction.contains("down") && Academics > 0) {
                    Controller.changeEXP(eAction, 0);
                    Academics--;
                }else {
                    return 0;
                } return Academics;
            case "comp":
                if (eAction.contains("up") && Computer < 5) {
                    Controller.changeEXP(eAction, 0);
                    Computer++;
                } else if (eAction.contains("down") && Computer > 0) {
                    Controller.changeEXP(eAction, 0);
                    Computer--;
                }else {
                    return 0;
                }return Computer;
            case "cosm":
                if (eAction.contains("up") && Cosmology < 5) {
                    Controller.changeEXP(eAction, 0);
                    Cosmology++;
                } else if (eAction.contains("down") && Cosmology > 0) {
                    Controller.changeEXP(eAction, 0);
                    Cosmology--;
                }else {
                    return 0;
                } return Cosmology;

            case "enig":
                if (eAction.contains("up") && Enigma < 5) {
                    Controller.changeEXP(eAction, 0);
                    Enigma++;
                } else if (eAction.contains("down") && Enigma > 0) {
                    Controller.changeEXP(eAction, 0);
                    Enigma--;
                }else {
                    return 0;
                } return Enigma;

            case "esot":
                if (eAction.contains("up") && Esoterica < 5) {
                    Controller.changeEXP(eAction, 0);
                    Esoterica++;
                } else if (eAction.contains("down") && Esoterica > 0) {
                    Controller.changeEXP(eAction, 0);
                    Esoterica--;
                } else {
                    return 0;
                }return Esoterica;

            case "inv":
                if (eAction.contains("up") && Investigation < 5) {
                    Controller.changeEXP(eAction, 0);
                    Investigation++;
                } else if (eAction.contains("down") && Investigation > 0) {
                    Controller.changeEXP(eAction, 0);
                    Investigation--;
                } else {
                    return 0;
                }return Investigation;

            case "law":
                if (eAction.contains("up") && Law < 5) {
                    Controller.changeEXP(eAction, 0);
                    Law++;
                } else if (eAction.contains("down") && Law > 0) {
                    Controller.changeEXP(eAction, 0);
                    Law--;
                }return Law;

            case "medi":
                if (eAction.contains("up") && Medicine < 5) {
                    Controller.changeEXP(eAction, 0);
                    Medicine++;
                } else if (eAction.contains("down") && Medicine > 0) {
                    Controller.changeEXP(eAction, 0);
                    Medicine--;
                }else {
                    return 0;
                } return Medicine;

            case "occ":
                if (eAction.contains("up") && Occult < 5) {
                    Controller.changeEXP(eAction, 0);
                    Occult++;
                } else if (eAction.contains("down") && Occult > 0) {
                    Controller.changeEXP(eAction, 0);
                    Occult--;
                }else {
                    return 0;
                } return Occult;

            case "pol":
                if (eAction.contains("up") && Politics < 5) {
                    Controller.changeEXP(eAction, 0);
                    Politics++;
                } else if (eAction.contains("down") && Politics > 0) {
                    Controller.changeEXP(eAction, 0);
                    Politics--;
                } else {
                    return 0;
                }return Politics;

            case "sci":
                if (eAction.contains("up") && Science < 5) {
                    Controller.changeEXP(eAction, 0);
                    Science++;
                } else if (eAction.contains("down") && Science > 0) {
                    Controller.changeEXP(eAction, 0);
                    Science--;
                } else {
                    return 0;
                }return Science;

            case "craft":
                if (eAction.contains("up") && Crafts < 5) {
                    Controller.changeEXP(eAction, 0);
                    Crafts++;
                } else if (eAction.contains("down") && Crafts > 0) {
                    Controller.changeEXP(eAction, 0);
                    Crafts--;
                } else {
                    return 0;
                }return Crafts;

            case "alrt":
                if (eAction.contains("up") && Alertness < 5) {
                    Controller.changeEXP(eAction, 0);
                    Alertness++;
                } else if (eAction.contains("down") && Alertness > 0) {
                    Controller.changeEXP(eAction, 0);
                    Alertness--;
                } else {
                    return 0;
                }return Alertness;

            case "art":
                if (eAction.contains("up") && Art < 5) {
                    Controller.changeEXP(eAction, 0);
                    Art++;
                } else if (eAction.contains("down") && Art > 0) {
                    Controller.changeEXP(eAction, 0);
                    Art--;
                } else {
                    return 0;
                }return Art;
            case "ath":
                if (eAction.contains("up") && Athletics < 5) {
                    Controller.changeEXP(eAction, 0);
                    Athletics++;
                } else if (eAction.contains("down") && Athletics > 0) {
                    Controller.changeEXP(eAction, 0);
                    Athletics--;
                } else {
                    return 0;
                }return Athletics;
            case "awar":
                if (eAction.contains("up") && Awareness < 5) {
                    Controller.changeEXP(eAction, 0);
                    Awareness++;
                } else if (eAction.contains("down") && Awareness > 0) {
                    Controller.changeEXP(eAction, 0);
                    Awareness--;
                } return Awareness;
            case "bra":
                if (eAction.contains("up") && Brawl < 5) {
                    Controller.changeEXP(eAction, 0);
                    Brawl++;
                } else if (eAction.contains("down") && Brawl > 0) {
                    Controller.changeEXP(eAction, 0);
                    Brawl--;
                } else {
                    return 0;
                }return Brawl;
            case "emp":
                if (eAction.contains("up") && Empathy < 5) {
                    Controller.changeEXP(eAction, 0);
                    Empathy++;
                } else if (eAction.contains("down") && Empathy > 0) {
                    Controller.changeEXP(eAction, 0);
                    Empathy--;
                } else {
                    return 0;
                }return Empathy;
            case "expr":
                if (eAction.contains("up") && Expression < 5) {
                    Controller.changeEXP(eAction, 0);
                    Expression++;
                } else if (eAction.contains("down") && Expression > 0) {
                    Controller.changeEXP(eAction, 0);
                    Expression--;
                }else {
                    return 0;
                } return Expression;
            case "inti":
                if (eAction.contains("up") && Intimidation < 5) {
                    Controller.changeEXP(eAction, 0);
                    Intimidation++;
                } else if (eAction.contains("down") && Intimidation > 0) {
                    Controller.changeEXP(eAction, 0);
                    Intimidation--;
                }else {
                    return 0;
                } return Intimidation;
            case "lead":
                if (eAction.contains("up") && Leadership < 5) {
                    Controller.changeEXP(eAction, 0);
                    Leadership++;
                } else if (eAction.contains("down") && Leadership > 0) {
                    Controller.changeEXP(eAction, 0);
                    Leadership--;
                } else {
                    return 0;
                }return Leadership;
            case "stre":
                if (eAction.contains("up") && Streetwise < 5) {
                    Controller.changeEXP(eAction, 0);
                    Streetwise++;
                } else if (eAction.contains("down") && Streetwise > 0) {
                    Controller.changeEXP(eAction, 0);
                    Streetwise--;
                } else {
                    return 0;
                }return Streetwise;
            case "subt":
                if (eAction.contains("up") && Subterfuge < 5) {
                    Controller.changeEXP(eAction, 0);
                    Subterfuge++;
                } else if (eAction.contains("down") && Subterfuge > 0) {
                    Controller.changeEXP(eAction, 0);
                    Subterfuge--;
                } else {
                    return 0;
                }return Subterfuge;
            default:
                System.out.print("\nBUTTON DEFAULTED\n");
                return 0;
        }
    }
}