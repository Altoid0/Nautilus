import com.weather.ApiCall;



public class Weather {
    public static void main(String[] args) {


        @RequestMapping(value ="/weather")
        public String currentTemp (Model model) {
            ApiCall test = new ApiCall("Los Angeles");
            String current_temp = test.returnCurrent().toString();
            model.addAttribute(current_temp);

            return "weather";


        }




    }
}

