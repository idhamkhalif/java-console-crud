package METADATA;

import DB.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;

public class DatabaseMetadaInterface {

    static Connection conn;
    static ResultSet rs;
    static String sql;
    static DatabaseMetaData dbmd;
    static ArrayList tables;

    public static void getTablesMetadata() throws SQLException {
        dbmd = conn.getMetaData();
        String[] tipe_Tabel = {"TABLE"};
        rs = dbmd.getTables(null, null, null, tipe_Tabel);
        while (rs.next()) {
            System.out.println(rs.getString("TABLE_NAME"));
        }
        System.out.println("\n");
    }
    
    public static ArrayList getTablesDetailsMetadata() throws SQLException {
        dbmd = conn.getMetaData();
        String[] tipe_Tabel = {"TABLE"};
        rs = dbmd.getTables(null, null, null, tipe_Tabel);
        tables = new ArrayList();
        while (rs.next()) {
            tables.add(rs.getString("TABLE_NAME"));
        }
        return tables;
    }

    public static void getColumnsMetadata(ArrayList tables) throws SQLException {
        for (Object actualTable : tables) {
            rs = dbmd.getColumns(null, null, (String) actualTable, null);
            System.out.println(actualTable);
            while (rs.next()) {
                System.out.println(rs.getString("COLUMN_NAME") + " "
                        + rs.getString("TYPE_NAME") + " "
                        + rs.getString("COLUMN_SIZE"));
            }
            System.out.println("\n");
        }
    }

    public static void getGeneralMetadata() throws SQLException {
        dbmd = conn.getMetaData();
        System.out.println("Driver Name: " + dbmd.getDriverName());
        System.out.println("Driver Version: " + dbmd.getDriverVersion());
        System.out.println("UserName: " + dbmd.getUserName());
        System.out.println("Database Product Name: " + dbmd.getDatabaseProductName());
        System.out.println("Database Product Version: " + dbmd.getDatabaseProductVersion());
        System.out.println("\n");
    }

    public static void main(String[] args) {
        conn = new DatabaseConnection().setConnection();
        try {
            System.out.println("======GENERAL DATA=======");
            getGeneralMetadata();
            System.out.println("======TABLES NAME=======");
            getTablesMetadata();
            System.out.println("======TABLES DETAIL=======");
            getTablesDetailsMetadata();
            getColumnsMetadata(tables);
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}
