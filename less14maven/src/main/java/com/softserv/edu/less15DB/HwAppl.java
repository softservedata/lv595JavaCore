package com.softserv.edu.less15DB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HwAppl {
    public static void main(String[] args) throws SQLException {
        System.out.println("Satrting main");
    Hw hw = new Hw();
    hw.run();
    hw.del();
    }
}

class Hw{
    private Connection con ;//= null;
    // Mysql
    private String username ;//= "devops";
    private String password ;//= "DevOps_553";
    private String URL ;//= "jdbc:mysql://192.168.153.134:3306/lv595";
    BufferedReader br;

    public Hw(){
        con = null;
        // Mysql
        username = "root";
        password = "Gerber";
        URL = "jdbc:mysql://127.0.0.1:3306";
    }

    public Hw(Connection con, String username, String password, String URL){
        this.con = con;
        // Mysql
        this.username = username;
        this.password = password;
        this.URL = URL;
    }

    void run() throws SQLException {
        System.out.println("Start...");
        //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        //DriverManager.registerDriver(new org.postgresql.Driver());
        try {
            con = DriverManager.getConnection(URL, username, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        if (con != null) {
            System.out.println("Connection Successful! \n");
        } else {
            System.out.println("Connection ERROR \n");
            System.exit(1);
        }

        Statement st = null;
        try {
            st = con.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            st.execute("CREATE DATABASE VaSQL;");
            System.out.println("DB created.");

        } catch (SQLException throwables) {
            System.out.println("DB not created...");
            throwables.printStackTrace();
            System.exit(1);
        }

        List<String> querysMySql = new ArrayList<>();

        querysMySql.add("CREATE TABLE vasql.car "
                + "( id int unsigned not null auto_increment primary key, "
                + "model varchar(20), "
                + "yearOfProduction int );");

        querysMySql.add("INSERT INTO vasql.car (model,yearOfProduction) VALUES ('Octavia',2003);");
        querysMySql.add("INSERT INTO vasql.car (model,yearOfProduction) VALUES ('Megan',2013);");
        querysMySql.add("INSERT INTO vasql.car (model,yearOfProduction) VALUES ('Xara',2018);");
        querysMySql.add("INSERT INTO vasql.car (model,yearOfProduction) VALUES ('Passat',2009);");
        querysMySql.add("INSERT INTO vasql.car (model,yearOfProduction) VALUES ('A5SportBack',2012);");



        for(String queryMySql : querysMySql)
try {
            st.execute(queryMySql);
            System.out.println("record {" + queryMySql + "} added.");

        } catch (SQLException throwables) {
            System.out.println("record {" + queryMySql + "} NOT added!!!");
            throwables.printStackTrace();
            System.exit(1);

        }
        if (st != null) {
            st.close();
        }
        if (con != null) {
            con.close();
        }
        System.out.println("All done!");

    }




//delete procedure
    void del() throws SQLException {
        try {
            con = DriverManager.getConnection(URL, username, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        if (con != null) {
            System.out.println("Connection Successful! \n");
        } else {
            System.out.println("Connection ERROR \n");
            System.exit(1);
        }
        Statement st = null;
        try {
            st = con.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        System.out.println("Here are nex record in table car:");
        ResultSet rs = st.executeQuery("select * from vasql.car;");
        resultSetPrint(rs);
/*        int columnCount = rs.getMetaData().getColumnCount();
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
*/
        System.out.println("Enter year XXXX to remove older cars");
        br = new BufferedReader(new InputStreamReader(System.in));
        int yearToDelete = 1800;
        try {
            yearToDelete = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Start delete...");
        String querySql = "DELETE FROM vasql.car WHERE yearOfProduction<"+yearToDelete+ ";";
        st.execute(querySql);
        rs = st.executeQuery("select * from vasql.car;");
        System.out.println("Here are nex record in table car:");
        resultSetPrint(rs);
        System.out.println("All done!");

    }


    public void resultSetPrint(ResultSet rs) throws SQLException {
//        ResultSet rs = st.executeQuery("select * from vasql.car;");
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

    }

}