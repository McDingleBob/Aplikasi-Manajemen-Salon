package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    public static final String URL = "jdbc:mysql://localhost:3306/database_salon";
    public static final String USER = "root";
    public static final String PASSWORD = "";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Koneksi gagal ke database");
            e.printStackTrace();
        }
        return conn;
    }

}
