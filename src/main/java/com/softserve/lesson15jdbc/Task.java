package com.softserve.lesson15jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;


public class Task {
    private static Connection connect = null;
    private static final String username = "root";
    private static final String password = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/nasibov";

    public static void main(String[] args) throws SQLException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = 0;
        System.out.println("Start...");
        connect = DriverManager.getConnection(URL, username, password);
        if (connect != null) {
            System.out.println("Connection Successful! \n");
        } else {
            System.out.println("Connection ERROR \n");
            System.exit(1);
        }
        Statement stat = connect.createStatement();
        //    stat.execute("CREATE DATABASE Nasibov;");
        String queryMySql = "CREATE TABLE cars "
                + "( id int unsigned not null auto_increment primary key, "
                + "model varchar(20), "
                + "year_of_production int );";
        // stat.execute(queryMySql);
        String query = "INSERT INTO cars (id,model,year_of_production) VALUES (1,'Ford',1975);";
        System.out.println("Read year of production car ");
        try {
            year = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        ResultSet rs = stat.executeQuery("select * from cars where year_of_production = " + year + ";");
        int columnCount = rs.getMetaData().getColumnCount();
        // Resultset.getMetaData () get the information
        for (int i = 1; i <= columnCount; i++) {
            System.out.print(rs.getMetaData().getColumnName(i) + "\t");
        }

        System.out.println();
        // output file
        while (rs.next()) {
            for (int i = 1; i <= columnCount; i++) {
                //String node = rs.getString(i) == null ? "it is null" : rs.getString(i);
                //System.out.print(node + "\t");
                System.out.print(rs.getString(i) + "\t");
            }
            System.out.println();
        }
        System.out.println("before close");
        if (rs != null)
            rs.close();
        if (stat != null) {
            stat.close();
        }
        if (connect != null) {
            connect.close();
        }
        System.out.println("DONE");
    }
}



