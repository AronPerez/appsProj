package APP.Controller;

import APP.Model.*;
import javafx.event.*;
import javafx.fxml.FXML;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {

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
        Pattern pattern = Pattern.compile("id=[a-z_]+");
        String buttonInfo = event.getSource().toString();
        Matcher matcher = pattern.matcher(buttonInfo);

//        int indexOfID = buttonInfo.indexOf("id=");
//        String ID = buttonInfo.substring(indexOfID+3).split(" ")[0].r;
        System.out.print("sajdajksdajks");
    }
}
