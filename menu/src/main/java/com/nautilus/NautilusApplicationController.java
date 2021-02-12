package com.nautilus;

import com.calendar.CalendarRequest;
import com.google.api.client.util.DateTime;
import com.google.api.services.calendar.model.Event;
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
        model.addAttribute("prevOpenStock", test.returnPrevOpenStock());
        model.addAttribute("prevClosedStock", test.returnPrevClosedStock());
        model.addAttribute("prevStockHi", test.returnPrevStockHi());
        model.addAttribute("prevStockLo", test.returnPrevStockLo());
        model.addAttribute("percentGain", test.returnStockGain());

        return "stock";
    }

    @GetMapping("/calendar")
    public String calendar(Model model) throws IOException, GeneralSecurityException {

        List<Event> items = CalendarRequest.getEvents().getItems();
        if (items.isEmpty()) {
            System.out.println("No upcoming events found.");
        } else {
            System.out.println("Upcoming events");
            for (Event event : items) {
                DateTime start = event.getStart().getDateTime();
                if (start == null) {
                    start = event.getStart().getDate();
                }
                String evenSummary = event.getSummary();
                DateTime eventStart = start;
                String eventLocation = event.getLocation();
                System.out.printf("%s (%s)\n", event.getSummary(), start);
            }
        }
        return "calendar";
    }
}
