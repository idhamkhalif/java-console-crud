package STOREDPROCEDURE;

import DB.DatabaseConnection;
import java.sql.*;

public class CallingStoreProcedureWithParameter {
    static Connection conn;
    static CallableStatement ct;
    static ResultSet rs;
    static String sql, queryDrop, name, adds;
    public static void main(String[] args) {
        conn = new DatabaseConnection().setConnection();
        try{
            sql = "{CALL User_info_parameters(?, ?, ?)}";
            ct = conn.prepareCall(sql);
            ct.setString("uid", "US001");
            ct.registerOutParameter(2, java.sql.Types.VARCHAR);
            ct.registerOutParameter(3, java.sql.Types.VARCHAR);
            ct.execute();
            name = ct.getString(2);
            adds = ct.getString(3);
            System.out.println("INFORMATION:");
            System.out.println("Username: "+name);
            System.out.println("Address: "+adds);
        }catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
    }
}
// Dinda, Hanan, Casey, Suta, Fatiya, Ester, Got'i