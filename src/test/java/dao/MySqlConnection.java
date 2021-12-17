//package dao;
//
//import java.sql.*;
//
//public class MySqlConnection {
//
//    public ResultSet mySqlconnection(String query) {
//        Connection connection = null;
//        String url = "jdbc:mysql://localhost:3306/";
//        String username = "root";
//        String password = "Swissbank.1";
//        System.out.println("Connecting database...");
//
//        try {
//                connection = DriverManager.getConnection(url, username, password);
//                System.out.println("Database connected!");
//            Statement stmt = connection.createStatement();
//            ResultSet rs = stmt.executeQuery(query);
//            return rs;
//        } catch (SQLException e) {
//            throw new IllegalStateException("Cannot connect the database!", e);
//
//        }
//
//    }
//
//}
