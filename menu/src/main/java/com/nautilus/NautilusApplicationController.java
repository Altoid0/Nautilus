package com.nautilus;

import com.weather.ApiCall;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;

@Controller
public class NautilusApplicationController {

    @GetMapping("/weather")
    public String weather(@RequestParam(name="location", required = true, defaultValue = "San Diego") String location, Model model) {
        ApiCall test = new ApiCall(location);
        model.addAttribute("location", location);
        return "weather";
    }
}
