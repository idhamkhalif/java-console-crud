package DDL;
import DB.DatabaseConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    static Connection conn;
    static Statement st;
    static String sql;

    public static void main(String[] args) throws SQLException {
        conn = new DatabaseConnection().setConnection();
        try{
            sql = "CREATE TABLE tbl_coba"
            + "(id_user VARCHAR(5) NOT NULL,"
            + "username VARCHAR(45),"
            + "password VARCHAR(45),"
            + "sex CHAR(1),"
            + "dob date,"
            + "phone_number VARCHAR(12),"
            + "email VARCHAR (25),"
            + "address TEXT,"
                + "PRIMARY KEY (id_user))";
            }catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
        st = conn.createStatement();
        st.execute(sql);
    }
}
