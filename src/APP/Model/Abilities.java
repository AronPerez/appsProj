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

    public int ProcessDots(String eType, String eAction) {
        switch (eType) {
            case "driv":
                if (eAction.contains("up") && Drive < 4) {
                    Drive++;
                } else if (eAction.contains("down") && Drive > 0) {
                    Drive--;
                } return Drive;
            case "etiq":
                if (eAction.contains("up") && Etiquette < 4) {
                    Etiquette++;
                } else if (eAction.contains("down") && Etiquette > 0) {
                    Etiquette--;
                } return Etiquette;
            case "fire":
                if (eAction.contains("up") && Firearms < 4) {
                    Firearms++;
                } else if (eAction.contains("down") && Firearms > 0) {
                    Firearms--;
                } return Firearms;
            case "mart":
                if (eAction.contains("up") && MartialArts < 4) {
                    MartialArts++;
                } else if (eAction.contains("down") && MartialArts > 0) {
                    MartialArts--;
                } return MartialArts;
            case "med":
                if (eAction.contains("up") && Meditation < 4) {
                    Meditation++;
                } else if (eAction.contains("down") && Meditation > 0) {
                    Meditation--;
                } return Meditation;
            case "mel":
                if (eAction.contains("up") && Melee < 4) {
                    Melee++;
                } else if (eAction.contains("down") && Melee > 0) {
                    Melee--;
                } return Melee;
            case "rese":
                if (eAction.contains("up") && Research < 4) {
                    Research++;
                } else if (eAction.contains("down") && Research > 0) {
                    Research--;
                } return Research;
            case "stea":
                if (eAction.contains("up") && Stealth < 4) {
                    Stealth++;
                } else if (eAction.contains("down") && Stealth > 0) {
                    Stealth--;
                } return Stealth;
            case "surv":
                if (eAction.contains("up") && Survival < 4) {
                    Survival++;
                } else if (eAction.contains("down") && Survival > 0) {
                    Survival--;
                } return Survival;
            case "tech":
                if (eAction.contains("up") && Technology < 4) {
                    Technology++;
                } else if (eAction.contains("down") && Technology > 0) {
                    Technology--;
                } return Technology;
            case "aca":
                if (eAction.contains("up") && Academics < 4) {
                    Academics++;
                } else if (eAction.contains("down") && Academics > 0) {
                    Academics--;
                } return Academics;
            case "comp":
                if (eAction.contains("up") && Computer < 4) {
                    Computer++;
                } else if (eAction.contains("down") && Computer > 0) {
                    Computer--;
                }return Computer;
            case "cosm":
                if (eAction.contains("up") && Cosmology < 4) {
                    Cosmology++;
                } else if (eAction.contains("down") && Cosmology > 0) {
                    Cosmology--;
                } return Cosmology;

            case "enig":
                if (eAction.contains("up") && Enigma < 4) {
                    Enigma++;
                } else if (eAction.contains("down") && Enigma > 0) {
                    Enigma--;
                } return Enigma;

            case "esot":
                if (eAction.contains("up") && Esoterica < 4) {
                    Esoterica++;
                } else if (eAction.contains("down") && Esoterica > 0) {
                    Esoterica--;
                } return Esoterica;

            case "inv":
                if (eAction.contains("up") && Investigation < 4) {
                    Investigation++;
                } else if (eAction.contains("down") && Investigation > 0) {
                    Investigation--;
                } return Investigation;

            case "law":
                if (eAction.contains("up") && Law < 4) {
                    Law++;
                } else if (eAction.contains("down") && Law > 0) {
                    Law--;
                }return Law;

            case "medi":
                if (eAction.contains("up") && Medicine < 4) {
                    Medicine++;
                } else if (eAction.contains("down") && Medicine > 0) {
                    Medicine--;
                } return Medicine;

            case "occ":
                if (eAction.contains("up") && Occult < 4) {
                    Occult++;
                } else if (eAction.contains("down") && Occult > 0) {
                    Occult--;
                } return Occult;

            case "pol":
                if (eAction.contains("up") && Politics < 4) {
                    Politics++;
                } else if (eAction.contains("down") && Politics > 0) {
                    Politics--;
                } return Politics;

            case "sci":
                if (eAction.contains("up") && Science < 4) {
                    Science++;
                } else if (eAction.contains("down") && Science > 0) {
                    Science--;
                } return Science;

            case "craft":
                if (eAction.contains("up") && Crafts < 4) {
                    Crafts++;
                } else if (eAction.contains("down") && Crafts > 0) {
                    Crafts--;
                } return Crafts;

            case "alrt":
                if (eAction.contains("up") && Alertness < 4) {
                    Alertness++;
                } else if (eAction.contains("down") && Alertness > 0) {
                    Alertness--;
                } return Alertness;

            case "art":
                if (eAction.contains("up") && Art < 4) {
                    Art++;
                } else if (eAction.contains("down") && Art > 0) {
                    Art--;
                } return Art;
            case "ath":
                if (eAction.contains("up") && Athletics < 4) {
                    Athletics++;
                } else if (eAction.contains("down") && Athletics > 0) {
                    Athletics--;
                } return Athletics;
            case "awar":
                if (eAction.contains("up") && Awareness < 4) {
                    Awareness++;
                } else if (eAction.contains("down") && Awareness > 0) {
                    Awareness--;
                } return Awareness;
            case "bra":
                if (eAction.contains("up") && Brawl < 4) {
                    Brawl++;
                } else if (eAction.contains("down") && Brawl > 0) {
                    Brawl--;
                } return Brawl;
            case "emp":
                if (eAction.contains("up") && Empathy < 4) {
                    Empathy++;
                } else if (eAction.contains("down") && Empathy > 0) {
                    Empathy--;
                } return Empathy;
            case "expr":
                if (eAction.contains("up") && Expression < 4) {
                    Expression++;
                } else if (eAction.contains("down") && Expression > 0) {
                    Expression--;
                } return Expression;
            case "inti":
                if (eAction.contains("up") && Intimidation < 4) {
                    Intimidation++;
                } else if (eAction.contains("down") && Intimidation > 0) {
                    Intimidation--;
                } return Intimidation;
            case "lead":
                if (eAction.contains("up") && Leadership < 4) {
                    Leadership++;
                } else if (eAction.contains("down") && Leadership > 0) {
                    Leadership--;
                } return Leadership;
            case "stre":
                if (eAction.contains("up") && Streetwise < 4) {
                    Streetwise++;
                } else if (eAction.contains("down") && Streetwise > 0) {
                    Streetwise--;
                } return Streetwise;
            case "subt":
                if (eAction.contains("up") && Subterfuge < 4) {
                    Subterfuge++;
                } else if (eAction.contains("down") && Subterfuge > 0) {
                    Subterfuge--;
                } return Subterfuge;
            default:
                System.out.print("\nBUTTON DEFAULTED\n");
                return 0;
        }
    }
}