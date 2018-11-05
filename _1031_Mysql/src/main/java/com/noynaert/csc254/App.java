package com.noynaert.csc254;


import java.sql.*;
import java.util.Arrays;
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

        //And array of weather stations
        WeatherStation[] stations = new WeatherStation[6];
        int n = 0;

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
                stations[n++] = station;
            }

            conn.close();



        } catch (SQLException e) {
            e.printStackTrace();
        }
        print(stations,"Before we sort");

        Arrays.sort(stations);
        print(stations, "After the sort");
        System.out.println("Hello World!");
    }

    public static void print(WeatherStation[] stations, String message){
        System.out.printf("\n-------- %s -------------\n", message);
        for(int i=0;i<stations.length;i++){
            System.out.printf("%d. %s\n", i, stations[i]);
        }
    }
}
