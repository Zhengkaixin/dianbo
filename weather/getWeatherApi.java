package weather;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class getWeatherApi {
    public static void main(String[] args) throws Exception {
        // WeatherAPI.json("北京");


        connection Connection = new connection();
        Connection.connectionTest();


        int[] cityArraylist = {110000, 120000, 130000, 140000, 150000, 210000, 220000, 230000, 310000, 320000, 330000, 340000, 350000, 360000, 370000
                , 410000, 420000, 430000, 440000, 450000, 460000, 500000, 510000, 520000, 530000, 540000, 610000, 620000, 630000, 640000, 650000};
        for (int i = 0; i < cityArraylist.length; i++) {
            String a = String.valueOf(cityArraylist[i]);
            String url = "https://restapi.amap.com/v3/weather/weatherInfo?city=" + a.toString() + "&key=c38a6ad0afe59975456ca109abf3ec8f";
            String urlBase = url + "&extensions=base";
            // System.out.println(getHttpRequestDataBase(urlBase));
            String urlAll = url + "&extensions=all";


            getHttpRequestDataBase apiBase = new getHttpRequestDataBase();
            getHttpRequestDataAll apiAll = new getHttpRequestDataAll();
            apiBase.getHttpRequestDataBase(urlBase);
            apiAll.getHttpRequestDataAll(urlAll);


        }
    }

}
