package mysqlconn;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.*;
public class ConnectionManager {

	private static Connection connection;

	public static Connection getConnectionWithDataSource() throws SQLException {
		if (connection == null) {
			MysqlDataSource ds = null;
			ds = new MysqlDataSource();
			ds.setUser("softuser");
			ds.setPassword("_s0ft*");
			ds.setServerName("a22docente");
			ds.setDatabaseName("soft2015");
			// ds.setPortNumber(portNumber);
			connection = ds.getConnection();
		}
		System.out.println(" - Connected to database - ");
		return connection;
	}

	public static Connection getConnection() throws SQLException {
		if (connection == null || connection.isClosed()) {
			try
				{
					Class.forName("com.mysql.jdbc.Driver");
				}
			catch (ClassNotFoundException ex) {
			System.out.println("Errore in getConnection: " + ex.getMessage());
			ex.printStackTrace();
        }

			connection = DriverManager.getConnection("jdbc:mysql://a22docente/soft2015","softuser","_s0ft*");
		}
		System.out.println(" - Connected to database - ");
		return connection;
	}

    public static int getNumeroProvince(int idRegione)
    {
        ResultSet rs = null;
		Statement st = null;
		Connection con = null;
        int province=0;

		try {
			con = ConnectionManager.getConnection();
			st = con.createStatement();
            String query="select count(*) from provincia where regione="+idRegione;
			rs = st.executeQuery(query);
            while(rs.next())
                province=rs.getInt(1);
            rs.close();
            st.close();
            con.close();

		} catch (SQLException ex) {
			System.out.println("Errore in getNumeroProvince: " + ex.getMessage());
			ex.printStackTrace();
        }
        return province;
    }

    public static int getIdRegione(String nome)
    {

    	ResultSet rs = null;
			Statement st = null;
			Connection con = null;
      int  idRegione=0;

		try {
			con = ConnectionManager.getConnection();
			st = con.createStatement();
			String query="select id from regione where nome='"+nome+"'";
			rs=st.executeQuery(query);
			rs.next();
			idRegione=rs.getInt("id");
			rs.close();
         	st.close();
         	con.close();

			} catch (SQLException ex) {
			System.out.println("Errore in getIdRegione: " + ex.getMessage());
			ex.printStackTrace();
        }

		return idRegione;
    }

    public static void main(String[]args)
    {
    		System.out.println(getNumeroProvince(3));
    		System.out.println(getIdRegione("Piemonte"));
    }

}

/*Per compilare ed eseguire da linea di comando senza aver messo nel classpath il jar di mysql connector:
* javac -classpath ./mysql-connector-java-5.1.15-bin.jar ConnectionManager.java
*(windows) java -cp .;mysql-connector-java-5.1.15-bin.jar ConnectionManager
*(unix) java -cp .:mysql-connector-java-5.1.15-bin.jar ConnectionManager
*/
