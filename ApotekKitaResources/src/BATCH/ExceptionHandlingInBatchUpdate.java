package BATCH;

import DB.DatabaseConnection;
import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ExceptionHandlingInBatchUpdate {
    static Connection conn;
    static Statement st;
    static String sql, sql1, sql2;
    
    public static void main(String[] args) throws SQLException {    
        conn = new DatabaseConnection().setConnection();
        conn.setAutoCommit(false);
        st = conn.createStatement();
        try{
            sql = "INSERT INTO tbl_user VALUES ('US015', 'Toma', 'admin', 'M', '1991/09/03', '0812', 'tirta@gmail.com', 'Depok Kukel', 'user')";
            st.addBatch(sql);
            sql = "INSERT INTO tbl_user VALUES ('US016', 'Toma', 'admin', 'M', '1991/09/03', '0812', 'tirta@gmail.com', 'Depok Kukel', 'user')";
            st.addBatch(sql);
            sql = "INSERT INTO tbl_user VALUES ('US017', 'Toma', 'admin', M, '1991/09/03', '0812', 'tirta@gmail.com', 'Depok Kukel', 'user')";
            st.addBatch(sql);
            int[] batch = st.executeBatch();
            conn.commit();
        }catch(BatchUpdateException e){
            System.err.println("SQLException: "+e.getMessage());
            System.err.println("Update Counts:");
            int[] batch = e.getUpdateCounts();
            for(int i=0; i<=batch.length; i++){
                System.err.println(batch[i]);
            }
        }
    }
}
