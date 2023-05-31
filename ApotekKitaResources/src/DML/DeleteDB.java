package DML;
// Millenia, Efnal, Nanda, Zidane
import DB.DatabaseConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDB {
    static Connection conn;
    static Statement st;
    static String sql;
    
    public static void main(String[] args) throws SQLException {    
        conn = new DatabaseConnection().setConnection();
        try{
            sql = "";
        }catch(Exception e){
            System.out.println("Error"+e.getMessage());
        }
        st = conn.createStatement();
        st.executeUpdate(sql);
    }
}
