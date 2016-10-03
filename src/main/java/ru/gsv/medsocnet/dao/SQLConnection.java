package ru.gsv.medsocnet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by user on 01.10.2016.
 */
public class SQLConnection {

        private static final String URL = "jdbc:mysql://localhost:3306/medsocnet?useUnicode=true&serverTimezone=UTC&autoReconnect=true&useSSL=false";
        private static final String USER = "root";
        private static final String PASSWORD = "12345";

        private static SQLConnection instance;

        public static SQLConnection getInstance(){
            if (instance == null){
                instance = new SQLConnection();
            }
            return instance;
        }

        public Connection getConnection() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }

        private SQLConnection(){}

}
