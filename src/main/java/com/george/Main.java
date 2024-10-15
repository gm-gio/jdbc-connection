package com.george;

import database.MySqlConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        //Used Java Try-with-resources for automatic resource closing
        try(Connection connection = MySqlConnection.getConnection(); Statement statement = connection.createStatement()) {

/*            Using the Statement and Resultset interface
            statement.execute("insert into mydbtest.users(name, age, email) values ('giorgi', 30, 'giorgimeshve@gmail,com')");
            int res = statement.executeUpdate("update mydbtest.users set name='new_name' where id = 8;");
            System.out.println(res);
            ResultSet rs = statement.executeQuery("select * from mydbtest.users");
*/
            System.out.println("connection successful");
            System.out.println(connection.isClosed());
        } catch (SQLException e){
            System.out.println("DB connection error :" + e.getErrorCode());
        }
    }
}