package com.nautilus;

import com.calendar.CalendarRequest;
import com.google.api.client.util.DateTime;
import com.google.api.services.calendar.model.Event;
import com.google.api.services.calendar.model.Events;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.calendar.CalendarRequest.*;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

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

    @GetMapping("/stock")
    public String stock(@RequestParam(name="ticker", required=true, defaultValue = "GME") String ticker, Model model) {
        StockEval test = new StockEval(ticker);
        model.addAttribute("ticker", ticker);
        model.addAttribute("openStock", test.returnOpenStock());
        model.addAttribute("closedStock", test.returnClosedStock());
        model.addAttribute("stockHi", test.returnStockHi());
        model.addAttribute("stockLo", test.returnStockLo());

        return "stock";
    }

    @GetMapping("/calendar")
    public String calendar(Model model) throws IOException, GeneralSecurityException {
        model.addAttribute("summaries", CalendarRequest.getSummaries());
        model.addAttribute("datetimes", CalendarRequest.getDates());
        model.addAttribute("locations", CalendarRequest.getLocations());
        return "calendar";
    }
}
