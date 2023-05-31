package DML;

import DB.DatabaseConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class UpdateDB {
    static Connection conn;
    static Statement st;
    static String sql; 
    public static void main(String[] args) throws SQLException {    
        conn = new DatabaseConnection().setConnection();
        try{
            sql = "UPDATE TABLE tbl_user SET phone_number = '12345'"
                    + "WHERE id_user = 'US001'";
        }catch(Exception e){
            System.out.println("Error"+e.getMessage());
        }
        st = conn.createStatement();
        st.executeUpdate(sql);
    }
}
