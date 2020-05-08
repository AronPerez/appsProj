package APP.Controller;

import APP.Model.Character;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;

public class Controller {


    public Character CharSheet = new Character();

    @FXML
    public TextField ExpInField;

//    @FXML
//    public Label attr_str_bar ,attr_dex_bar, attr_stam_bar, attr_char_bar,attr_man_bar,
//            attr_app_bar, attr_perc_bar, attr_int_bar, attr_wit_bar;
//            sphr_time_bar, sphr_mind_bar, sphr_prime_bar;
            //sphr_forces_bar sphr_life_bar, sphr_corr_bar, sphr_ent_bar

    @FXML
    public Text attr_str_bar, abil_alrt_bar,abil_art_bar,abil_ath_bar, abil_sci_bar,
            abil_awar_bar,abil_bra_bar, abil_emp_bar,abil_expr_bar,abil_inti_bar,abil_lead_bar,abil_stre_bar,
            abil_subt_bar, abil_craf_bar,abil_driv_bar,abil_etiq_bar,abil_fire_bar,abil_mart_bar,abil_med_bar,
            abil_mel_bar, abil_rese_bar,abil_stea_bar,abil_surv_bar,abil_tech_bar,abil_aca_bar,abil_comp_bar,
            abil_cosm_bar, abil_enig_bar,abil_esot_bar,abil_inv_bar,abil_law_bar,abil_occ_bar,abil_pol_bar;

    void updateProgress(int Value, String eType) {
        var barVal = Value + "/5";
        switch(eType) {
            case "str":
                attr_str_bar.setText(barVal);
                break;
            case "dex":
//                attr_app_bar.
                break;
            case "char":
            case "chara":
//                attr_char_bar.setProgress(barVal);
                break;
            case "app":
//                attr_app_bar.setProgress(barVal);
                break;
            case "perc":
//                attr_perc_bar.setProgress(barVal);
                break;
            case "int":
//                attr_int_bar.setProgress(barVal);
                break;
            case "wit":
//                attr_wit_bar.setProgress(barVal);
                break;
//            case "time":
//                sphr_time_bar.setProgress(barVal);
//                break;
//            case "mind":
//                sphr_mind_bar.setProgress(barVal);
//                break;
//            case "prime":
//                sphr_prime_bar.setProgress(barVal);
//                break;
//            case "forces":
//                sphr_forces_bar.setProgress(barVal);
//                break;
//            case "life":
//                sphr_life_bar.setProgress(barVal);
//                break;
//            case "corr":
//                sphr_corr_bar.setProgress(barVal);
//                break;
//            case "ent":
//                sphr_ent_bar.setProgress(barVal);
//                break;
//            case "art":
//                abil_art_bar.setProgress(barVal);
//                break;
//            case "ath":
//                abil_ath_bar.setProgress(barVal);
//                break;
//            case "awar":
//                abil_awar_bar.setProgress(barVal);
//                break;
//            case "bra":
//                abil_bra_bar.setProgress(barVal);
//                break;
//            case "emp":
//                abil_emp_bar.setProgress(barVal);
//                break;
//            case "expr":
//                abil_expr_bar.setProgress(barVal);
//                break;
//            case "subt":
//                abil_subt_bar.setProgress(barVal);
//                break;
//            case "craf":
//                abil_craf_bar.setProgress(barVal);
//                break;
//            case "driv":
//                abil_driv_bar.setProgress(barVal);
//                break;
//            case "etiq":
//                abil_etiq_bar.setProgress(barVal);
//                break;
//            case "fire":
//                abil_fire_bar.setProgress(barVal);
//                break;
//            case "mart":
//                abil_mart_bar.setProgress(barVal);
//                break;
//            case "med":
//                abil_med_bar.setProgress(barVal);
//                break;
//            case "alrt":
//                abil_alrt_bar.setProgress(barVal);
//                break;
//            case "mel":
//                abil_mel_bar.setProgress(barVal);
//                break;
//            case "rese":
//                abil_rese_bar.setProgress(barVal);
//                break;
//            case "stea":
//                abil_stea_bar.setProgress(barVal);
//                break;
//            case "surv":
//                abil_surv_bar.setProgress(barVal);
//                break;
//            case "tech":
//                abil_tech_bar.setProgress(barVal);
//                break;
//            case "aca":
//                abil_aca_bar.setProgress(barVal);
//                break;
//            case "comp":
//                abil_comp_bar.setProgress(barVal);
//                break;
//            case "cosm":
//                abil_cosm_bar.setProgress(barVal);
//                break;
//            case "enig":
//                abil_enig_bar.setProgress(barVal);
//                break;
//            case "esot":
//                abil_esot_bar.setProgress(barVal);
//                break;
//            case "inv":
//                abil_inv_bar.setProgress(barVal);
//                break;
//            case "law":
//                abil_law_bar.setProgress(barVal);
//                break;
//            case "occ":
//                abil_occ_bar.setProgress(barVal);
//                break;
//            case "pol":
//                abil_pol_bar.setProgress(barVal);
//                break;
            case "sci":
//                abil_sci_bar.setProgress(barVal);
                break;
            default:
                System.out.print("\nPROG. BAR DEFAULTED\n");

        }
    }

    @FXML
    void handleApply(ActionEvent event){
        var EXP = Integer.parseInt(ExpInField.getText());
        CharSheet.maxEXP = EXP;
        CharSheet.currentEXP = EXP;
        System.out.print(CharSheet.maxEXP);
    }
    @FXML
    void handleCancel(ActionEvent event){
        System.exit(0);
        return;
    }

    @FXML
    void handleButton(ActionEvent event) throws IOException {
        int tempDots = 0;

        // determining which button is pressed
        // i.e. - attr_str_up
        var buttonInfo = event.getSource().toString().replaceAll(",", "");
        var ID = buttonInfo.substring(buttonInfo.indexOf("id=")+3).split(" ")[0].split("_");

        // turning button info to variables
        // i.e. - attr
        String eClass = ID[0];
        // i.e. - str
        String eType = ID[1];
        // i.e. - up
        String eAction = ID[2];

//        // changing character current XP
//        if (eAction == "up" && CharSheet.currentEXP > 0) {
//            CharSheet.currentEXP++;
//        }
//        else if (eAction == "up" && CharSheet.currentEXP < CharSheet.currentEXP) {
//            CharSheet.currentEXP--;
//        }

        // changing data values
        if (CharSheet.currentEXP != CharSheet.currentEXP) {
            switch(eClass) {
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
                    System.out.print("\nEXP CHANGE DEFAULTED\n");
            }
            updateProgress(tempDots, eType);
        }
    }


}
