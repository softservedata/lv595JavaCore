package com.softserve.edu22db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ApplDB {
    private static Connection con = null;
    // Mysql
    private static String username = "devops";
    private static String password = "DevOps_553";
    private static String URL = "jdbc:mysql://192.168.153.134:3306/lv595";
    /*-
    // Postgresql
    private static String username = "postgres";
    private static String password = "root";
    private static String URL = "jdbc:postgresql://localhost:5432/lv595";
    */

    public static void main(String[] args) throws SQLException {
        System.out.println("Start...");
        //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        //DriverManager.registerDriver(new org.postgresql.Driver());
        con = DriverManager.getConnection(URL, username, password);
        if (con != null) {
            System.out.println("Connection Successful! \n");
        } else {
            System.out.println("Connection ERROR \n");
            System.exit(1);
        }
        Statement st = con.createStatement();
        /*-
        //st.execute("CREATE DATABASE lv595;");
        String queryMySql = "CREATE TABLE temp "
                + "( id int unsigned not null auto_increment primary key, "
                + "name varchar(20), "
                + "login varchar(20), "
                + "password varchar(30), "
                + "age int );";
        String queryPostGre = "CREATE TABLE temp1 "
                + "( id integer not null primary key, "
                + "name varchar(20), "
                + "login varchar(20), "
                + "password varchar(30), "
                + "age int );";
        */
        //MySQL
        //String query = "INSERT INTO temp (name,login,password,age) VALUES ('Ivan','iva','qwerty',21);";
        //String query = "INSERT INTO temp (name,login,password,age) VALUES ('Petro','pet','123456',22);";
        // String query = "INSERT INTO temp (name,login,password,age) VALUES ('Tolik','pet','123456',22);";
        // String query = "INSERT INTO temp (name,login,password,age) VALUES ('Tolik',NULL,'123456',22);";
        //
        // PostGre
        //String query = "INSERT INTO temp1 (id,name,login,password,age) VALUES (1,'Ivan','iva','qwerty',21);";
        //String query = "INSERT INTO temp1 (id,name,login,password,age) VALUES (2,'Petro','pet','123456',22);";
        //
        // st.execute(queryMySql);
        //st.execute(queryPostGre);
        // st.execute(query);
        //st.execute("DELETE FROM temp WHERE name='Tolik';");
        //st.execute("UPDATE temp SET name='Taras' WHERE login LIKE 'p%';");
        // st.executeUpdate("UPDATE temp SET name='Artur' WHERE login LIKE 'p%';");
        //
        /*-
        try {
            con.setAutoCommit(false);
            st.executeUpdate("UPDATE temp SET name='Tolik' WHERE login LIKE 'p%';");
            st.executeUpdate("UPDATE temp SET login='tar' WHERE id=5;");
            if (con != null) {
                //throw new Exception("ha-ha-ha");
            }
            con.commit();
        } catch (Exception e) {
            System.out.println("con.rollback();");
            con.rollback();
        }
        con.setAutoCommit(true);
        */
        //
        /*-
        String queryStr = "UPDATE temp SET name='Taras' WHERE id=?;";
        PreparedStatement pstmt = con.prepareStatement(queryStr);
        pstmt.setString(1, "2");
        int num = pstmt.executeUpdate();
        System.out.println("num = " + num);
        pstmt.close();
        */
        //
        // /*-
        ResultSet rs = st.executeQuery("select * from temp;");
        int columnCount = rs.getMetaData().getColumnCount();
        // Resultset.getMetaData () get the information
        for (int i = 1; i <= columnCount; i++) {
            System.out.print(rs.getMetaData().getColumnName(i) + "\t");
        }
        //        System.out.println();
        //        for (int i = 1; i <= columnCount; i++) {
        //            System.out.print(rs.getMetaData().getColumnLabel(i) + "\t");
        //        }
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
        if (rs != null) {
            rs.close();
        }
        // */
        if (st != null) {
            st.close();
        }
        if (con != null) {
            con.close();
        }
        System.out.println("DONE");
    }

}
