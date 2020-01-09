package weather;

import java.sql.*;

public class connection {

    private static String SQLURL = "jdbc:mysql://127.0.0.1:3306/zhengkaixin1?useSSL=false&useUnicode=true&characterEncoding=UTF8&serverTimezone=GMT";
    //连接数据库的URL
    private static String USER = "zhengkaixin";
    //用户名
    private static String PASSWORD = "Jun6889981";
    //密码
    private static String DRIVER;

    static {
        DRIVER = "com.mysql.cj.jdbc.Driver";
    }


    public static void connectionTest() throws SQLException, ClassNotFoundException {
        Class.forName(DRIVER);
        /*Connection conn = DriverManager.getConnection(SQLURL, USER, PASSWORD);
        //System.out.println("1");
        PreparedStatement stat = (PreparedStatement) conn.prepareStatement("create database zhengkaixin1");
        //创建数据库zhengkaixin
        stat.executeUpdate();
        stat.close();
        conn.close();*/
        String url = "jdbc:mysql://127.0.0.1:3306/zhengkaixin?useSSL=false&useUnicode=true&characterEncoding=UTF8&serverTimezone=GMT";

        //创建表testBase
        try {
            Connection conn = DriverManager.getConnection(SQLURL, USER, PASSWORD);

            PreparedStatement stat = (PreparedStatement) conn.prepareStatement("create table testBase(province varchar(40), city varchar(40), adcode varchar(40)," + "status varchar(40), count varchar(40), info varchar(40), infocode varchar(40),  weather varchar(40)," +
                    "temperature varchar(40),winddirection varchar(40),windpower varchar(40),humidity varchar(40), reporttime varchar(40))");
            

            stat.executeUpdate();
            
            stat.close();
            conn.close();

            //创建表testAll_1
            conn = DriverManager.getConnection(SQLURL, USER, PASSWORD);
            stat = (PreparedStatement) conn.prepareStatement("create table testAll_1(province varchar(40), city varchar(40), adcode varchar(40), reporttime varchar(40))");
            stat.executeUpdate();
            stat.close();
            conn.close();
            

            //创建表testAll_2
            conn = DriverManager.getConnection(SQLURL, USER, PASSWORD);
            PreparedStatement stat2 = (PreparedStatement) conn.prepareStatement("create table testAll_2(adcode varchar(40), data varchar(40), week varchar(40), dayweather varchar(40),nightweather varchar(40)," +
                    " daytemp varchar(40), nighttemp varchar(40), daywind varchar(40),nightwind varchar(40), daypower varchar(40), nightpower varchar(40))");
            /*("create table testAll_2(adcode varchar(40), date varchar(40), week varchar(40)," +
                    "dayweather varchar(40), nightweather varchar(40), daytemp varchar(40), nighttemp varchar(40),daywind varchar(40)," +
                    "nightwind varchar(40),daypower varchar(40),nightpower varchar(40)");*/


            stat2.executeUpdate();


            stat2.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    //给testBase表添加数据
    static void updateMysqltestBase(analysisBase anaBase) throws SQLException {
        try {

            String url = "jdbc:mysql://127.0.0.1:3306/mysql?useSSL=false&useUnicode=true&characterEncoding=UTF8&serverTimezone=GMT";
            Connection conn = ConTool.getConnection(DRIVER, SQLURL, USER, PASSWORD);
            String sql = "insert into testBase values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stat = conn.prepareStatement(sql);

            //添加数据
            stat.setString(1, anaBase.getProvince());
            stat.setString(2, anaBase.getCity());
            stat.setString(3, anaBase.getAdcode());
            stat.setString(4, anaBase.getStatus());
            stat.setString(5, anaBase.getCount());
            stat.setString(6, anaBase.getInfo());
            stat.setString(7, anaBase.getInfocode());
            stat.setString(8, anaBase.getWeather());
            stat.setString(9, anaBase.getTemperature());
            stat.setString(10, anaBase.getWinddirection());
            stat.setString(11, anaBase.getWindpower());
            stat.setString(12, anaBase.getHumidity());
            stat.setString(13, anaBase.getReporttime());
            stat.executeUpdate();

            //关闭数据库
            stat.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //查询数据
       /*ResultSet result = stat.executeQuery("select * from test");
        while (result.next())
        {
            System.out.println(result.getInt("id") + " " + result.getString("name"));
        }*/

        //result.close();

    }

    static void updateMysqltestAll_1(analysisAll anaAll) throws SQLException {
        try {
            String url = "jdbc:mysql://127.0.0.1:3306/mysql?useSSL=false&useUnicode=true&characterEncoding=UTF8&serverTimezone=GMT";
            Connection conn = ConTool.getConnection(DRIVER, SQLURL, USER, PASSWORD);
            String sql = "insert into testAll_1 values(?,?,?,?)";
            PreparedStatement stat = conn.prepareStatement(sql);

            stat.setString(1, anaAll.getProvince());
            stat.setString(2, anaAll.getCity());
            stat.setString(3, anaAll.getAdcode());
            stat.setString(4, anaAll.getReporttime());


            stat.executeUpdate();

            //添加数据

            //查询数据
       /* ResultSet result = stat.executeQuery("select * from test");
        while (result.next())
        {
            System.out.println(result.getInt("id") + " " + result.getString("name"));
        }
        //关闭数据库
        result.close();*/
            stat.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void updateMysqltestAll_2(analysisAll anaAll) throws SQLException {
        try {
            String url = "jdbc:mysql://127.0.0.1:3306/mysql?useSSL=false&useUnicode=true&characterEncoding=UTF8&serverTimezone=GMT";
            Connection conn = ConTool.getConnection(DRIVER, SQLURL, USER, PASSWORD);

            for (int i = 0; i < 4; i++) {
                //添加数据
                String sql = "insert into testAll_2 values(?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.setString(1, anaAll.getAdcode());
                stat.setString(2, anaAll.getDate()[i]);
                stat.setString(3, anaAll.getWeek()[i]);
                stat.setString(4, anaAll.getDayweather()[i]);
                stat.setString(5, anaAll.getNightweather()[i]);
                stat.setString(6, anaAll.getDaytemp()[i]);
                stat.setString(7, anaAll.getNighttemp()[i]);
                stat.setString(8, anaAll.getDaywind()[i]);
                stat.setString(9, anaAll.getNightwind()[i]);
                stat.setString(10, anaAll.getDaypower()[i]);
                stat.setString(11, anaAll.getNightpower()[i]);

                stat.executeUpdate();
                stat.close();
            }


            //查询数据
       /* ResultSet result = stat.executeQuery("select * from test");
        while (result.next())
        {
            System.out.println(result.getInt("id") + " " + result.getString("name"));
        }
        //关闭数据库
        result.close();*/

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}