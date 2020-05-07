package APP.Controller;

import APP.Model.Character;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Controller {

    public Character CharSheet = new Character();

    public ProgressBar attr_str_bar ,attr_dex_bar, attr_stam_bar, attr_char_bar;
//            attr_stam_bar,attr_app_bar,
//            attr_perc_bar,attr_int_bar,attr_wit_bar, sphr_time_bar, sphr_mind_bar, sphr_prime_bar,
//            sphr_forces_bar, sphr_life_bar, sphr_corr_bar, sphr_ent_bar,abil_alrt_bar,abil_art_bar,abil_ath_bar,
//            abil_awar_bar,abil_bra_bar, abil_emp_bar,abil_expr_bar,abil_inti_bar,abil_lead_bar,abil_stre_bar,
//            abil_subt_bar, abil_craf_bar,abil_driv_bar,abil_etiq_bar,abil_fire_bar,abil_mart_bar,abil_med_bar,
//            abil_mel_bar, abil_rese_bar,abil_stea_bar,abil_surv_bar,abil_tech_bar,abil_aca_bar,abil_comp_bar,
//            abil_cosm_bar, abil_enig_bar,abil_esot_bar,abil_inv_bar,abil_law_bar,abil_occ_bar,abil_pol_bar,
//            abil_sci_bar;

    void updateBar(int Value, String eType, String eAction) {
        System.out.println(eType + "  " + Value);

        switch(eType) {
            case "str":
                attr_str_bar.setProgress((double)(Value)/5);
                break;
            case "dex":
                attr_dex_bar.setProgress((double)(Value)/5);
                break;
            case "char":
            case "chara":
                attr_char_bar.setProgress((double)(Value)/5);
                break;

        }
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

        // CharSheet.maxXP = INPUT

        // changing data values
        if (CharSheet.currentXP != CharSheet.maxXP) {
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
                    System.out.print("\nBUTTON DEFAULTED\n");
            }
            updateBar(tempDots, eType, eAction);
        }
    }


}
