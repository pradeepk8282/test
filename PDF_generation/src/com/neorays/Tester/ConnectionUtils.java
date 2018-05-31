package com.neorays.Tester;

import java.sql.Connection;

import java.sql.Connection;
import java.sql.SQLException;
 
public class ConnectionUtils {
 
    public static Connection getConnection() throws SQLException,
            ClassNotFoundException {
        return OracleConnUtils.getOracleConnection();
    }
 
    public  void main(String[] args) throws SQLException,
            ClassNotFoundException {
 
        System.out.println("Get connection ... ");
 
        // Get a Connection object
        Connection conn = ConnectionUtils.getConnection();
 
        System.out.println("Get connection " + conn);
 
        System.out.println("Done!");
    }
}