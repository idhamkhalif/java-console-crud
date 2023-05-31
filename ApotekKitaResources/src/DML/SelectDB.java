package DML;
import DB.DatabaseConnection;
import java.sql.*;
public class SelectDB {
    static Connection conn;
    static Statement st;
    static ResultSet rs;
    static String sql;
    public static void main(String[] args) throws SQLException {
        conn = new DatabaseConnection().setConnection();
        try{
            sql = "SELECT * FROM tbl_user";
        }catch(Exception e){
            System.out.println("Error Coy "+e.getMessage());
        }
        st = conn.createStatement();
        rs = st.executeQuery(sql);
    while(rs.next()){
        System.out.println(rs.getString(1)+"\n"+rs.getString(2)+"\n"+
                rs.getString(3)+"\n"+rs.getString(4)+
                rs.getDate(5)+"\n"+rs.getString(6)+"\n"+
                rs.getString(7)+"\n"+rs.getString(8));
        }
    }
}
