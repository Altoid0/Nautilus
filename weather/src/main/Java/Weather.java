import com.weather.ApiCall;



public class Weather {
    public static void main(String[] args) {
        ApiCall test = new ApiCall("Los Angeles");
        System.out.println(test.returnFeels());
        System.out.println(test.returnForecast());


    }
}

