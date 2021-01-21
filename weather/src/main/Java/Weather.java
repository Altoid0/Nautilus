import com.weather.ApiCall;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



public class Weather {

        @RequestMapping(value ="/weather")
        public String currentTemp (Model model) {
            ApiCall test = new ApiCall("Los Angeles");
            String current_temp = test.returnCurrent().toString();
            model.addAttribute(current_temp);

            return "weather";


        }


}

