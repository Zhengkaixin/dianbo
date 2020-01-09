package weather;


import org.json.JSONArray;
import org.json.JSONObject;

public class analysisBase {

    private String status;
    private String count;
    private String info;
    private String infocode;

    private String province;
    private String city;
    private String adcode;
    private String weather;
    private String temperature;
    private String winddirection;
    private String windpower;
    private String humidity;
    private String reporttime;

    String getStatus(){
        return status;
    }
    String getCount(){
        return count;
    }
    String getInfo(){
        return info;
    }
    String getInfocode(){
        return infocode;
    }

    String getProvince(){
        return province;
    }
    String getCity(){
        return city;
    }
    String getAdcode(){
        return adcode;
    }
    String getWeather(){
        return weather;
    }
    String getTemperature(){
        return temperature;
    }
    String getWinddirection(){
        return winddirection;
    }
    String getWindpower(){
        return windpower;
    }
    String getHumidity(){
        return humidity;
    }
    String getReporttime(){
        return reporttime;
    }

    public void analysisBase(String jsonString){

        try{
            JSONObject json = new JSONObject(jsonString);
            //获取大括号里的属性
            status=json.getString("status");
             count=json.getString("count");
             info=json.getString("info");
             infocode=json.getString("infocode");
            //获取被中括号包括的属性，获取JSONArray对象,遍历即可
            JSONArray lives=json.getJSONArray("lives");
            for(int i=0;i<lives.length();i++){
                JSONObject live=lives.getJSONObject(i);
                     province= live.getString("province");
                     city= live.getString("city");
                     adcode= live.getString("adcode");
                     weather= live.getString("weather");
                     temperature= live.getString("temperature");
                     winddirection= live.getString("winddirection");
                     windpower= live.getString("windpower");
                     humidity= live.getString("humidity");
                     reporttime= live.getString("reporttime");
            }
            //JSONObject live=lives.getJSONObject(0);

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
