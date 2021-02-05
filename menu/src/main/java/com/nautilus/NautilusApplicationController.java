package com.nautilus;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NautilusApplicationController {

    @GetMapping("/weather")
    public String weather(@RequestParam(name="location", required=true, defaultValue = "San Diego") String location, Model model) {
        ApiCall test = new ApiCall(location);
        model.addAttribute("location", location);
        model.addAttribute("current_temp", test.returnCurrent());
        model.addAttribute("feels_temp", test.returnFeels());
        model.addAttribute("forecast", test.returnForecast());
        model.addAttribute("max_temp", test.returnMax());
        model.addAttribute("min_temp", test.returnMin());
        model.addAttribute("sunrise", test.returnSunrise());
        model.addAttribute("sunset", test.returnSunset());
        model.addAttribute("humidity", test.returnHumidity());

        return "weather";
    }
}
