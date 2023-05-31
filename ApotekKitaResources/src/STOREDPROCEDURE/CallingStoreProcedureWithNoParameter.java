package STOREDPROCEDURE;

import DB.DatabaseConnection;
import java.sql.*;

public class CallingStoreProcedureWithNoParameter {
    static Connection conn;
    static CallableStatement ct;
    static ResultSet rs;
    static String sql, queryDrop;
    public static void main(String[] args) {
        conn = new DatabaseConnection().setConnection();
        // CALLING PROCEDURE WITH NO PARAMETER
        try{
            sql = "CALL User_info;";
            ct = conn.prepareCall(sql);
            rs = ct.executeQuery();
            while(rs.next()){
                System.out.println("User Address:\t\t"+rs.getString(1)+
                        "\nUser Phone Number:\t"+rs.getString(2));
            }
        }catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
    }
}
// Suta, Kemal, Hanan, Fatiya
