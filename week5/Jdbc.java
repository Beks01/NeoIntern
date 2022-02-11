//package week5;

import java.sql.*;

import static java.sql.DriverManager.getConnection;

//public class Jdbc {
//    static final String DB_URL = "jdbc:mysql://localhost/"; //This is for creating certain DB
//    static final String USER = "root";
//    static final String PASS = "Qs8092750341";


//    static final String DB_URL = "jdbc:mysql://localhost/BEGIN"; // This part for connecting to certain DataBase
//    static final String USER = "root";
//    static final String PASS = "Qs8092750341";


//    static final String DB_URL = "jdbc:mysql://localhost/BEGIN"; // This part for inserting to certain DataBase
//    static final String USER = "root";
//    static final String PASS = "Qs8092750341";


//    static final String DB_URL = "jdbc:mysql://localhost/BEGIN"; // This part for inserting to certain DataBase
//    static final String USER = "root";
//    static final String PASS = "Qs8092750341";


//    static final String DB_URL = "jdbc:mysql://localhost/BEGIN"; // This part for selecting certain queries
//    static final String USER = "root";
//    static final String PASS = "Qs8092750341";
//    static final String QUERY = "SELECT CustomerID, Name, Surname FROM begin.customer";


//    static final String DB_URL = "jdbc:mysql://localhost/BEGIN";// This part for Updating certain queries
//    static final String USER = "root";
//    static final String PASS = "Qs8092750341";
//    static final String QUERY = "SELECT CustomerID, Name, Surname FROM begin.customer";


//    static final String DB_URL = "jdbc:mysql://localhost/BEGIN";// This part for Deleting certain queries
//    static final String USER = "root";
//    static final String PASS = "Qs8092750341";
//    static final String QUERY = "SELECT CustomerID, Name, Surname FROM begin.customer";


//    public static void main(String[] args) {


//        try (Connection conn = getConnection(DB_URL, USER, PASS);// This is for creating certain DB
//             Statement stmt = conn.createStatement();
//        ) {
//            String sql = "CREATE DATABASE BEGIN";
//            stmt.executeUpdate(sql);
//            System.out.println("Database created successfully...");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }


//        System.out.println("Connecting to a selected database...");// This part for connecting to certain DataBase
//        // Open a connection
//        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {
//            System.out.println("Connected database successfully...");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }


//        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);// This is for inserting certain values.
//             Statement stmt = conn.createStatement();
//        ) {
        // Execute a query
//            System.out.println("Inserting records into the table...");
//            String sql = "INSERT INTO begin.customer VALUES (3, 'Dastan', 'Sazanov')";
//            stmt.executeUpdate(sql);
//            sql = "INSERT INTO begin.products VALUES (5,'Juice',45)";
//            stmt.executeUpdate(sql);
//            sql = "INSERT INTO begin.empoloyee  VALUES (4,'Director','Human')";
//            stmt.executeUpdate(sql);
//            sql = "INSERT INTO begin.soldproducts VALUES(1,'22.01.28',2)";
//            stmt.executeUpdate(sql);
//            System.out.println("Inserted records into the table...");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }


//        // Open a connection
//        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);// This part for selecting certain queries
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery(QUERY);
//        ) {
//            while(rs.next()){
//                //Display values
//                System.out.print("CustomerID: " + rs.getInt("CustomerID"));
//                System.out.print(", Name: " + rs.getString("Name"));
//                System.out.println(", Surname: " + rs.getString("Surname"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }


//        // Open a connection
//        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);// This part for Updating certain queries
//             Statement stmt = conn.createStatement();
//
//        ) {
//            String sql = "UPDATE begin.customer " +
//                    "SET begin.customer.CustomerID = 1 WHERE begin.customer.CustomerID =2";
//            stmt.executeUpdate(sql);
//            ResultSet rs = stmt.executeQuery(QUERY);
//
//            while (rs.next()) {
//                //Display values
//                System.out.print("CustomerID: " + rs.getInt("CustomerID"));
//                System.out.print(", Name: " + rs.getString("Name"));
//                System.out.println(", Surname: " + rs.getString("Surname"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }


        // Open a connection
//        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);// This part for Deleting certain queries
//             Statement stmt = conn.createStatement();
//
//        ) {
//
//            String sql = "DELETE FROM begin.customer " +
//                    "WHERE CustomerID = 1";
//            stmt.executeUpdate(sql);
//            ResultSet rs = stmt.executeQuery(QUERY);
//
//            while (rs.next()) {
//                //Display values
//                System.out.print("CustomerID: " + rs.getInt("CustomerID"));
//                System.out.print(", Name: " + rs.getString("Name"));
//                System.out.println(", Surname: " + rs.getString("Surname"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
