//import com.weather.ApiCall;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//@Controller
//
//
//
//public class Weather {
//
//    @RequestMapping(value ="/weather", method=RequestMethod.GET)
//    public String currentTemp (Model model) {
//        ApiCall test = new ApiCall("Los Angeles");
//        String current_temp = test.returnCurrent().toString();
//        model.addAttribute("current_temp", current_temp);
//        return "weather.html";
//    }
//}
import com.weather.ApiCall;

public class Weather {
    public static void main(String[] args) {
        ApiCall test = new ApiCall("Los Angeles");
        String feels = test.returnFeels().toString();
        System.out.println(feels);
        System.out.println(test.returnFeels());
        System.out.println(test.returnForecast());


    }
}