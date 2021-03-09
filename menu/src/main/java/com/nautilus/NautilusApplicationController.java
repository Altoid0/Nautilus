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

        model.addAttribute("openStock1", test.returnOpenStock1());
        model.addAttribute("closedStock1", test.returnClosedStock1());
        model.addAttribute("stockHi1", test.returnStockHi1());
        model.addAttribute("stockLo1", test.returnStockLo1());

        model.addAttribute("openStock2", test.returnOpenStock2());
        model.addAttribute("closedStock2", test.returnClosedStock2());
        model.addAttribute("stockHi2", test.returnStockHi2());
        model.addAttribute("stockLo2", test.returnStockLo2());

        model.addAttribute("openStock3", test.returnOpenStock3());
        model.addAttribute("closedStock3", test.returnClosedStock3());
        model.addAttribute("stockHi3", test.returnStockHi3());
        model.addAttribute("stockLo3", test.returnStockLo3());

        model.addAttribute("openStock4", test.returnOpenStock4());
        model.addAttribute("closedStock4", test.returnClosedStock4());
        model.addAttribute("stockHi4", test.returnStockHi4());
        model.addAttribute("stockLo4", test.returnStockLo4());

        model.addAttribute("openStock5", test.returnOpenStock5());
        model.addAttribute("closedStock5", test.returnClosedStock5());
        model.addAttribute("stockHi5", test.returnStockHi5());
        model.addAttribute("stockLo5", test.returnStockLo5());

        model.addAttribute("openStock6", test.returnOpenStock6());
        model.addAttribute("closedStock6", test.returnClosedStock6());
        model.addAttribute("stockHi6", test.returnStockHi6());
        model.addAttribute("stockLo6", test.returnStockLo6());

        return "stock";
    }

    @GetMapping("/calendar")
    public String calendar(Model model) throws IOException, GeneralSecurityException {

        model.addAttribute("eventsarray", CalendarRequest.setEvents());
        //model.addAttribute("summaries", CalendarRequest.getSummaries());
        //model.addAttribute("datetimes", CalendarRequest.getDates());
        //model.addAttribute("locations", CalendarRequest.getLocations());
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
        model.addAttribute("article8", test.article9());
        model.addAttribute("article9", test.article10());
        model.addAttribute("article10", test.article13());

        return "news";
    }
}
