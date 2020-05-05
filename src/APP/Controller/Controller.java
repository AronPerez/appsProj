package APP.Controller;

import APP.Model.Character;
import javafx.event.*;
import javafx.fxml.FXML;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class Controller {

    Character CharSheet = new Character();

//    @FXML
//    Button attr_str_up;
//            sphr_sprint_down, sphr_prime_down, sphr_mind_up, sphr_matter_up,
//            sphr_life_up, sphr_forces_up, sphr_ent_up, sphr_corr_up, sphr_time_down, sphr_sprint_up,
//            sphr_prime_up, sphr_mind_down, sphr_matter_down, sphr_life_down, sphr_forces_down,
//            sphr_ent_down, sphr_corr_down, attr_str_up, attr_dex_down, attr_stam_down, attr_char_up,
//            attr_man_up, attr_app_up, attr_perc_up, attr_int_up, attr_wits_up, attr_str_down,
//            attr_dex_up, attr_stam_up, attr_char_down, attr_man_down, attr_app_down, attr_perc_down,
//            attr_int_down, attr_wits_down;

//    @FXML
//    private ProgressBar char_arete_bar, attr_dex_bar, attr_str_bar, attr_char_bar, attr_perc_bar,
//            attr_app_bar, attr_man_bar, attr_int_bar, attr_wit_bar, sphr_time_bar, sphr_spri,
//            sphr_mind_bar, sphr_prime_bar, sphr_forces_bar, sphr_life_bar,sphr_corr_bar, sphr_ent_bar;

    @FXML
    void handleButton(ActionEvent event) throws IOException {
        // getting FXID of button
        var buttonInfo = event.getSource().toString().replaceAll(",","");
        var ID = buttonInfo.substring(buttonInfo.indexOf("id=")+3).split(" ")[0];

        var eClass = ID.split("_")[0];
        var eType = ID.split("_")[1];
        var eAction = ID.split("_")[2];

    }


}
