package weather;

import org.json.JSONArray;
import org.json.JSONObject;

public class analysisAll {
    private String status;
    private String count;
    private String info;
    private String infocode;
    private String city;
    private String adcode;
    private String province;
    private String reporttime;
    private String []date=new String[4];
    private String []week=new String[4];
    private String []dayweather=new String[4];
    private String []nightweather=new String[4];
    private String []daytemp=new String[4];
    private String []nighttemp=new String[4];
    private String []daywind=new String[4];
    private String []nightwind=new String[4];
    private String []daypower=new String[4];
    private String []nightpower=new String[4];
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
    String getReporttime(){
        return reporttime;
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

    String []getDate(){
        return date;
    }
    String []getWeek(){
        return week;
    }
    String []getDayweather(){
        return dayweather;
    }
    String []getNightweather(){
        return nightweather;
    }
    String []getDaytemp(){
        return daytemp;
    }
    String []getNighttemp(){
        return nighttemp;
    }
    String []getDaywind(){
        return daywind;
    }
    String []getNightwind(){
        return nightwind;
    }
    String []getDaypower(){
        return daypower;
    }
    String []getNightpower(){
        return nightpower;
    }

    public  void analysisAll(String jsonString){
        try{
            JSONObject json = new JSONObject(jsonString);
            //获取大括号里的属性
             status=json.getString("status");
             count=json.getString("count");
             info=json.getString("info");
             infocode=json.getString("infocode");
            //获取被中括号包括的属性，获取JSONArray对象,遍历即可
            JSONArray forecasts=json.getJSONArray("forecasts");
            //for(int i=0;i<forecasts.length();i++){
                JSONObject forecast=forecasts.getJSONObject(0);
                ;
                 city= forecast.getString("city");
                 adcode= forecast.getString("adcode");
                 province= forecast.getString("province");
                 reporttime= forecast.getString("reporttime");
                //

                JSONArray casts=forecast.getJSONArray("casts");///!!!!!!
                for(int j=0;j<casts.length();j++){


                    JSONObject cast=casts.getJSONObject(j);

                     date[j]= cast.getString("date");

                     week[j]= cast.getString("week");

                    dayweather[j]= cast.getString("dayweather");
                    nightweather[j]= cast.getString("nightweather");

                    daytemp[j]= cast.getString("daytemp");

                    nighttemp[j]= cast.getString("nighttemp");

                    daywind[j]= cast.getString("daywind");
                    nightwind[j]=cast.getString("nightwind");
                    daypower[j]= cast.getString("daypower");
                    nightpower[j]= cast.getString("nightpower");

        }
            //}
        }
        catch(Exception e){
            System.out.println(e.getMessage());

        }
    }
}
