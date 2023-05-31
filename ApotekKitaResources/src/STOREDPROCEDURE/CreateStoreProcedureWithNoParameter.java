package STOREDPROCEDURE;

import DB.DatabaseConnection;
import java.sql.*;

public class CreateStoreProcedureWithNoParameter {
    static Connection conn;
    static Statement st;
    static String sql, queryDrop;
    public static void main(String[] args) {
        conn = new DatabaseConnection().setConnection();
        // queryDrop = "DROP PROCEDURE IF EXISTS User_info";
        // CREATE PROCEDURE WITH NO PARAMETER
        try{
            sql = "CREATE OR REPLACE PROCEDURE User_info() "
                    + "SELECT s.address, s.phone_number "
                    + "FROM tbl_user s "
                    + "WHERE s.username = 'Tirta' "
                    + "ORDER BY s.address";
            st = conn.createStatement();
            //st.execute(queryDrop);
            int rt = st.executeUpdate(sql);
        }catch(Exception e){
            System.out.println("ErrorSatu"+e.getMessage());
        }
    }
}
// Suta, Jean, Ale, Adinda, Aditya, Casey, Hanan, Hafizh, Kemal, Fatiya