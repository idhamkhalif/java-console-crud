package STOREDPROCEDURE;

import DB.DatabaseConnection;
import java.sql.*;

public class CreateStoreProcedureWithParameter {
    static Connection conn;
    static Statement st;
    static String sql, queryDrop;
    public static void main(String[] args) {
        conn = new DatabaseConnection().setConnection();
        try{
            sql = "CREATE OR REPLACE PROCEDURE User_info_parameters"
                    + "(IN uid VARCHAR(5),OUT nama VARCHAR(45),"
                    + " OUT adds VARCHAR(50)) "
                    + "SELECT username, address INTO nama, adds "
                    + "FROM tbl_user "
                    + "WHERE id_user = uid";
            st = conn.createStatement();
            int rt = st.executeUpdate(sql);
        }catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
    }
}
// Fatiya, Got'i, Pinkan, Adinda, Hanan, Kemal, Suta, Ester, Aditya, Casey