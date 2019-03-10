import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.io.IOException;
import java.sql.*;
import java.util.List;

public class SQL {
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static String Surname = "root";
    private static String PAssword = "";








    public static void creare(String el1, String el2, String el3) {


        try {

            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);

        } catch (
                SQLException e) {
            e.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection(URL, Surname, PAssword);
            java.sql.Statement statement = connection.createStatement();




                statement.execute("INSERT INTO weather (DATE, MIN, MAX ) values  (" + el1 + "," + el2 + "," + el3 + ")"); //добавление данных

                statement.executeBatch();

//              statement.clearBatch();


        } catch (SQLException e) {
            e.printStackTrace();


        }
    }

        public static void get_result(String name ) throws  SQLException {
            try {
                Driver driver = new FabricMySQLDriver();
                DriverManager.registerDriver(driver);


            } catch (SQLException e) {
                e.printStackTrace();
            }


            Connection connection = DriverManager.getConnection(URL, Surname, PAssword);
            java.sql.Statement statement = connection.createStatement();

            statement.clearBatch();
            ResultSet res = statement.executeQuery("select * from "+ name);
            while (res.next()) {


                String id = res.getString(1) +" "+ res.getString(2)+ " " + res.getString(3)+ " " +res.getString(4);
                System.out.println(id);


            }

        }



}
