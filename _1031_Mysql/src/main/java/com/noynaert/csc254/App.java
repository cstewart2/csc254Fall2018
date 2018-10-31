package com.noynaert.csc254;


import java.sql.*;
import java.util.Scanner;

public class App {
    private static String server = "turing.cs.missouriwestern.edu";
    private static String database="misc";
    private static String user = "csc254";

    public static void main(String[] args) {
        String password;
        System.out.println("Password? ");
        Scanner input = new Scanner(System.in);
        password = input.nextLine();
        System.out.println("Password is " + password);

        try {
            String connectionString = String.format("jdbc:mysql://%s/%s?user=%s&password=%s",server,database,user,password);
            System.out.println("Connection String: " + connectionString);
            Connection conn = DriverManager.getConnection( connectionString );
            String queryString = "SELECT * FROM weather WHERE place LIKE 'st%' AND state LIKE 'mo'";

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(queryString);

            while(rs.next()){
                String city = rs.getString("place");
                int elevation = rs.getInt("elevation");
                //System.out.printf("%s has an elevation of %d meters\n",city, elevation);
                WeatherStation station = new WeatherStation(city, elevation);
                System.out.println(station);
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        System.out.println("Hello World!");
    }
}
