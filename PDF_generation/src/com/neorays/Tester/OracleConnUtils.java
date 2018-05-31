package com.neorays.Tester;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnUtils {
	 
    public static Connection getOracleConnection()
            throws ClassNotFoundException, SQLException {
        String hostName = "localhost";
        String sid = "xe";
        String userName = "scott";
        String password = "tiger";
 
        return getOracleConnection(hostName, sid, userName, password);
    }
 
    public static Connection getOracleConnection(String hostName, String sid,
            String userName, String password) throws ClassNotFoundException,
            SQLException {
 
      
        Class.forName("oracle.jdbc.driver.OracleDriver");
 
 
        String connectionURL = "jdbc:oracle:thin:@" + hostName + ":1521:" + sid;
 
        Connection conn = DriverManager.getConnection(connectionURL, userName,
                password);
        return conn;
    }
}