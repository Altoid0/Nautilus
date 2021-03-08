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

    @GetMapping("/news")
    public String news(Model model) {
        NewsCall test = new NewsCall();
        model.addAttribute("article1", test.article1());
        model.addAttribute("article2", test.article2());
        model.addAttribute("article3", test.article3());
        model.addAttribute("article4", test.article4());
        model.addAttribute("article5", test.article5());
        model.addAttribute("article6", test.article6());
        model.addAttribute("article7", test.article7());
        model.addAttribute("article8", test.article8());
        model.addAttribute("article9", test.article9());
        model.addAttribute("article10", test.article10());
        model.addAttribute("article11", test.article11());
        model.addAttribute("article12", test.article12());
        model.addAttribute("article13", test.article13());
        model.addAttribute("article14", test.article14());
        model.addAttribute("article15", test.article15());
        return "news";
    }
}
