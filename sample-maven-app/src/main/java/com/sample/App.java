package com.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) throws InterruptedException  {
        System.out.println("-------- MySQL JDBC Connection Testing ------------");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found");
            e.printStackTrace();
            return;
        }

        System.out.println("MySQL JDBC Driver Registered!");
        Connection connection = null;

        Thread.sleep(30000);

        try {
            connection = DriverManager.getConnection("jdbc:mysql://mysql:3306/mysql", "root", "root");

        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;
        }

        if (connection != null) {
            System.out.println("You are now successfully connected to SQL database!");
        } else {
            System.out.println("Failed to make connection!");
        }
    }
}
