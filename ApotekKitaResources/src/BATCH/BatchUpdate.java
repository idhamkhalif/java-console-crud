package BATCH;

import DB.DatabaseConnection;
import java.sql.*;

public class BatchUpdate {
    static Connection conn;
    static Statement st;
    static String sql;
    
    public static void main(String[] args) throws SQLException {  
        conn = new DatabaseConnection().setConnection();
        conn.setAutoCommit(false);
        st = conn.createStatement();
        try{
            sql = "INSERT INTO tbl_user VALUES ('US009', 'Toma', 'admin', 'M',"
                    + "'1991/09/03', '0812', 'tirta@gmail.com', 'Depok Kukel',"
                    + "'user')";
            st.addBatch(sql);
            sql = "INSERT INTO tbl_user VALUES ('US010', 'Toma', 'admin', 'M',"
                    + "'1991/09/03', '0812', 'tirta@gmail.com', 'Depok Kukel',"
                    + "'user')";
            st.addBatch(sql);
            sql = "INSERT INTO tbl_user VALUES ('US011', 'Toma', 'admin', 'M',"
                    + "'1991/09/03', '0812', 'tirta@gmail.com', 'Depok Kukel',"
                    + "'user')";
            st.addBatch(sql);
            int[] batch = st.executeBatch();
            conn.commit();
        }catch(SQLException e){
            System.out.println("Error"+e.getMessage());
        }
    }
}
// Akbar, Alem, Jean, Got'i, Sulthan, Suta, Brian, Hafizh, Anggie, Aditya, Roland, Casey, Ester