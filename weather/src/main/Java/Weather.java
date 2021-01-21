


import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller



public class Weather {

        @GetMapping("/weather_files")

        public String currentTemp (Model model) {
            ApiCall test = new ApiCall("Los Angeles");
            String current_temp = test.returnCurrent().toString();
            model.addAttribute(current_temp);

            return "weather";


        }


}

