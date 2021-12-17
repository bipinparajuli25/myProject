package dao;

import java.sql.*;

public class Mysqlconn {

    public ResultSet mySqlConn(String query) throws SQLException {
     Connection connection = null;
     String url = "jdbc:mysql://localhost:3306/bipin";
    String username = "root";
    String password = "Swissbank.1";
    System.out.println ("Connecting database...");

     try { connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database is connected!");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        return resultSet;

        } catch(SQLException e){
                throw new IllegalStateException("Cannot connect the database!", e);
            }

        }
    }
