package APP.Controller;

import APP.Model.Character;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import java.io.IOException;


public class Controller {


    private static Character CharSheet = new Character();
    public static int tempDots;

    @FXML
    public TextField ExpInField, Name, Player, Chronicle, Nature, Demeanor,
            Essence, Affiliation, Sect, Concept;

    @FXML
    public Button applyEXP, cancelEXP;

    @FXML
    public ProgressBar advn_arete_bar, advn_arete1_bar;

    @FXML
    public Text
            attr_app_bar, attr_dex_bar, attr_stam_bar, attr_char_bar, attr_perc_bar,
            attr_str_bar, attr_int_bar, attr_wits_bar, attr_man_bar;
    @FXML
    public Text
            attr_app1_bar, attr_dex1_bar, attr_stam1_bar, attr_char1_bar, attr_perc1_bar,
            attr_str1_bar, attr_int1_bar, attr_wits1_bar, attr_man1_bar;

    @FXML
    public Text
            abil_alrt_bar, abil_art_bar, abil_ath_bar, abil_sci_bar,
            abil_awar_bar, abil_bra_bar, abil_emp_bar, abil_expr_bar, abil_inti_bar, abil_lead_bar, abil_stre_bar,
            abil_subt_bar, abil_craft_bar, abil_driv_bar, abil_etiq_bar, abil_fire_bar, abil_mart_bar,
            abil_med_bar, abil_mel_bar, abil_rese_bar, abil_stea_bar, abil_surv_bar, abil_tech_bar, abil_aca_bar, abil_comp_bar,
            abil_cosm_bar, abil_enig_bar, abil_esot_bar, abil_inv_bar, abil_law_bar, abil_occ_bar, abil_pol_bar, abil_medi_bar;
    @FXML
    public Text
            abil_alrt1_bar, abil_art1_bar, abil_ath1_bar, abil_sci1_bar,
            abil_awar1_bar, abil_bra1_bar, abil_emp1_bar, abil_expr1_bar, abil_inti1_bar, abil_lead1_bar, abil_stre1_bar,
            abil_subt1_bar, abil_craft1_bar, abil_driv1_bar, abil_etiq1_bar, abil_fire1_bar, abil_mart1_bar,
            abil_med1_bar, abil_mel1_bar, abil_rese1_bar, abil_stea1_bar, abil_surv1_bar, abil_tech1_bar, abil_aca1_bar, abil_comp1_bar,
            abil_cosm1_bar, abil_enig1_bar, abil_esot1_bar, abil_inv1_bar, abil_law1_bar, abil_occ1_bar, abil_pol1_bar, abil_medi1_bar;

    @FXML
    public Text
            sphr_time_bar, sphr_mind_bar, sphr_prime_bar, sphr_forces_bar,
            sphr_life_bar, sphr_corr_bar, sphr_spirit_bar, sphr_matter_bar, sphr_ent_bar;

    @FXML
    public Text
            sphr_time1_bar, sphr_mind1_bar, sphr_prime1_bar, sphr_forces1_bar,
            sphr_life1_bar, sphr_corr1_bar, sphr_spirit1_bar, sphr_matter1_bar, sphr_ent1_bar, ExperienceBar;

    // updates progress values
    void updateProgress(int Value, String eType) {
        var barVal = Value + "/5";
        switch (eType) {
            case "str":
                attr_str_bar.setText(barVal);
                attr_str1_bar.setText(barVal);
                break;
            case "dex":
                attr_dex_bar.setText(barVal);
                attr_dex1_bar.setText(barVal);
                break;
            case "stam":
                attr_stam_bar.setText(barVal);
                attr_stam1_bar.setText(barVal);
                break;
            case "char":
                attr_char_bar.setText(barVal);
                attr_char1_bar.setText(barVal);
                break;
            case "man":
                attr_man_bar.setText(barVal);
                attr_char1_bar.setText(barVal);
                break;
            case "app":
                attr_app_bar.setText(barVal);
                attr_app1_bar.setText(barVal);
                break;
            case "perc":
                attr_perc_bar.setText(barVal);
                attr_perc1_bar.setText(barVal);
                break;
            case "int":
                attr_int_bar.setText(barVal);
                attr_int1_bar.setText(barVal);
                break;
            case "wits":
                attr_wits_bar.setText(barVal);
                attr_wits1_bar.setText(barVal);
                break;
            case "art":
                abil_art_bar.setText(barVal);
                abil_art1_bar.setText(barVal);
                break;
            case "ath":
                abil_ath_bar.setText(barVal);
                abil_ath1_bar.setText(barVal);
                break;
            case "awar":
                abil_awar_bar.setText(barVal);
                abil_awar1_bar.setText(barVal);
                break;
            case "bra":
                abil_bra_bar.setText(barVal);
                abil_bra1_bar.setText(barVal);
                break;
            case "emp":
                abil_emp_bar.setText(barVal);
                abil_emp1_bar.setText(barVal);
                break;
            case "expr":
                abil_expr_bar.setText(barVal);
                abil_expr1_bar.setText(barVal);
                break;
            case "subt":
                abil_subt_bar.setText(barVal);
                abil_subt1_bar.setText(barVal);
                break;
            case "craft":
                abil_craft_bar.setText(barVal);
                abil_craft1_bar.setText(barVal);
                break;
            case "driv":
                abil_driv_bar.setText(barVal);
                abil_driv1_bar.setText(barVal);
                break;
            case "etiq":
                abil_etiq_bar.setText(barVal);
                abil_etiq1_bar.setText(barVal);
                break;
            case "fire":
                abil_fire_bar.setText(barVal);
                abil_fire1_bar.setText(barVal);
                break;
            case "mart":
                abil_mart_bar.setText(barVal);
                abil_mart1_bar.setText(barVal);
                break;
            case "medi":
                abil_medi_bar.setText(barVal);
                abil_med1_bar.setText(barVal);
                break;
            case "med":
                abil_med_bar.setText(barVal);
                abil_med1_bar.setText(barVal);
                break;
            case "alrt":
                abil_alrt_bar.setText(barVal);
                abil_alrt1_bar.setText(barVal);
                break;
            case "mel":
                abil_mel_bar.setText(barVal);
                abil_mel1_bar.setText(barVal);
                break;
            case "rese":
                abil_rese_bar.setText(barVal);
                abil_rese1_bar.setText(barVal);
                break;
            case "inti":
                abil_inti_bar.setText(barVal);
                abil_inti1_bar.setText(barVal);
                break;
            case "stea":
                abil_stea_bar.setText(barVal);
                abil_stea1_bar.setText(barVal);
                break;
            case "surv":
                abil_surv_bar.setText(barVal);
                abil_surv1_bar.setText(barVal);
                break;
            case "tech":
                abil_tech_bar.setText(barVal);
                abil_tech1_bar.setText(barVal);
                break;
            case "aca":
                abil_aca_bar.setText(barVal);
                abil_aca1_bar.setText(barVal);
                break;
            case "comp":
                abil_comp_bar.setText(barVal);
                abil_comp1_bar.setText(barVal);
                break;
            case "cosm":
                abil_cosm_bar.setText(barVal);
                abil_cosm1_bar.setText(barVal);
                break;
            case "enig":
                abil_enig_bar.setText(barVal);
                abil_enig1_bar.setText(barVal);
                break;
            case "lead":
                abil_lead_bar.setText(barVal);
                abil_lead1_bar.setText(barVal);
                break;
            case "stre":
                abil_stre_bar.setText(barVal);
                abil_stre1_bar.setText(barVal);
                break;
            case "esot":
                abil_esot_bar.setText(barVal);
                abil_esot1_bar.setText(barVal);
                break;
            case "inv":
                abil_inv_bar.setText(barVal);
                abil_inv1_bar.setText(barVal);
                break;
            case "law":
                abil_law_bar.setText(barVal);
                abil_law1_bar.setText(barVal);
                break;
            case "occ":
                abil_occ_bar.setText(barVal);
                abil_occ1_bar.setText(barVal);
                break;
            case "pol":
                abil_pol_bar.setText(barVal);
                abil_pol1_bar.setText(barVal);
                break;
            case "sci":
                abil_sci_bar.setText(barVal);
                abil_sci1_bar.setText(barVal);
                break;
            case "time":
                sphr_time_bar.setText(barVal);
                sphr_time1_bar.setText(barVal);
                break;
            case "mind":
                sphr_mind_bar.setText(barVal);
                sphr_mind1_bar.setText(barVal);
                break;
            case "prime":
                sphr_prime_bar.setText(barVal);
                sphr_prime1_bar.setText(barVal);
                break;
            case "forces":
                sphr_forces_bar.setText(barVal);
                sphr_forces1_bar.setText(barVal);
                break;
            case "life":
                sphr_life_bar.setText(barVal);
                sphr_life1_bar.setText(barVal);
                break;
            case "corr":
                sphr_corr_bar.setText(barVal);
                sphr_corr1_bar.setText(barVal);
                break;
            case "spirit":
                sphr_spirit_bar.setText(barVal);
                sphr_spirit1_bar.setText(barVal);
                break;
            case "matter":
                sphr_matter_bar.setText(barVal);
                sphr_matter1_bar.setText(barVal);
                break;
            case "ent":
                sphr_ent_bar.setText(barVal);
                sphr_ent1_bar.setText(barVal);
            case "arete":
                double barBa = (double) Value / 10;
                System.out.println(barBa);
                advn_arete_bar.setProgress(barBa);
                advn_arete1_bar.setProgress(barBa);

            default:
                System.out.print("\nPROG. BAR DEFAULTED\n");

        }
    }

    @FXML
    void handleApply(ActionEvent event) {
        int EXP = Integer.parseInt(ExpInField.getText());
        ExperienceBar.setText(ExpInField.getText());
        CharSheet.maxEXP = EXP;
        CharSheet.currentEXP = EXP;
        System.out.println("EXP: " + CharSheet.currentEXP);
    }

    @FXML
    void handleCancel(ActionEvent event) {
        System.exit(0);
        return;
    }

    // changes experience in the data
    @FXML
    public static void changeEXP(String eAction, int Attr) {
        // checking if safe to spend EXP
        if ((CharSheet.currentEXP != 0)) {
            if (Attr == 1) {
                tempDots = 0;
                System.out.println("ATTRIBUTE AT 1 (min)");
                return;
            }
            switch (eAction) {
                case "down":
                    if ((CharSheet.currentEXP == CharSheet.maxEXP)) {
                        System.out.println("EXP AT MAX, or attribute is at 1\n" + CharSheet.currentEXP);
                        return;
                    }
                    if (CharSheet.currentEXP < CharSheet.maxEXP) {
                        CharSheet.currentEXP++;
                        System.out.println("DOWN: " + CharSheet.currentEXP);
                    }
                    break;

                case "up":
                    if (CharSheet.currentEXP == 0) {
                        System.out.println("EXP AT 0 (min)");
                        return;
                    }
                    if (CharSheet.currentEXP > 0) {
                        CharSheet.currentEXP = CharSheet.currentEXP - 1;
                        System.out.println("UP: " + CharSheet.currentEXP);
                    }
                    break;

                default:
                    System.out.println("EXP CHANGE ERROR\n");
                    return;
            }

        } else {
            System.out.println("GO TO MISC AND ADD EXP");
            return;
        }

    }

    // handles the exp buttons
    @FXML
    void handleButton(ActionEvent event) throws IOException {
        String eClass, eType, eAction;

        // determining which button is pressed
        // i.e. - attr_str_up
        var buttonInfo = event.getSource().toString().replaceAll(",", "");
        var ID = buttonInfo.substring(buttonInfo.indexOf("id=") + 3).split(" ")[0].split("_");

        // turning button info to variables
        // i.e. - attr
        eClass = ID[0];
        // i.e. - str
        eType = ID[1];
        // i.e. - up
        eAction = ID[2];

        switch (eClass) {
            case "attr":

                tempDots = this.CharSheet.Attributes.ProcessDots(eType, eAction);
                break;

            case "sphr":
                tempDots = this.CharSheet.Spheres.ProcessDots(eType, eAction);
                break;

            case "abil":
                tempDots = this.CharSheet.Abilities.ProcessDots(eType, eAction);
                break;

            case "advn":
                tempDots = this.CharSheet.Advantages.ProcessDots(eType, eAction);
                break;

            default:
                System.out.print("\nDOTS CHANGE DEFAULTED\n");
                return;
        }


        if (tempDots == 0 | tempDots == -1) {
            System.out.print("\nDOTS UNCHANGED\n");
            return;
        } else {
            updateProgress(tempDots, eType);
            ExperienceBar.setText(CharSheet.currentEXP + "");
        }

        // setting dots in data

    }


    // handles the text fields in quick view
    @FXML
    void handleQuickViewB(ActionEvent event) {
        CharSheet.Name = Name.getText();
        CharSheet.Player = Player.getText();
        CharSheet.Chronicle = Chronicle.getText();
        CharSheet.Nature = Nature.getText();
        CharSheet.Demeanor =Demeanor.getText();
        CharSheet.Essence = Essence.getText();
//        CharSheet.Sect = Sect.getText();
//        CharSheet.Concept = Concept.getText();
//        CharSheet.Affiliation = Affiliation.getText();

    }

    // loads character save file from save dir
    @FXML
    void loadCharacter()  {
//        String currentDirectory = System.getProperty("user.dir");
    }

    // saves character info to save file
    @FXML
    void saveCharacter() {

    }

    @FXML
    void handleClear() {
        ExperienceBar.setText("0");
        CharSheet.maxEXP = 0;
        CharSheet.currentEXP = 0;
    }
}