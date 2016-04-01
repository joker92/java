package Province;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import mysqlconn.ConnectionManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Regione {

    protected int id;
    protected String nome;
    protected ArrayList<String> province;
    protected ConnectionManager Cm;
    protected MysqlDataSource Db;

    public Regione(int id) {
        this.id = id;
        province = new ArrayList<String>();
    }

    public ArrayList<String> getNomiProvince(){

        ResultSet rs = null;
        Statement st = null;
        Connection con = null;

        try {

            con = ConnectionManager.getConnection();
            st = con.createStatement();

            // Query
            String query="select nome from provincia where regione="+this.id;
            System.out.println(query);
            rs = st.executeQuery(query);

            while( rs.next() ) {
                province.add( rs.getString("nome") );
            }

            // Close
            rs.close();
            st.close();
            con.close();

        } catch (SQLException ex) {
            System.out.println("Errore in getNumeroProvince: " + ex.getMessage());
            ex.printStackTrace();
        }
        return province;

    }



}
