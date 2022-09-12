package qa.learning.DataManagement;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import java.sql.*;

public class SQLConnector {

    public Connection connection;
    public static Statement statement;
    public static ResultSet rs;

    @Before
    public void setUp()  {
        String databaseURL = "jdbc:oracle:thin:@//localhost:1521/orcl";
        String user = "sys as sysdba";
        String password = "Oracle@2507";
        connection = null;
        try {
            System.out.println("Connecting to Database...");
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(databaseURL, user, password);
            statement = connection.createStatement();
            if (connection != null) {
                System.out.println("Connected to the Database...");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    /*@Test
    public void getEmployeesFromDataBase() {
        try {
            String query = "select * from LEARNING";
            statement = connection.createStatement();
            rs = statement.executeQuery(query);

            while(rs.next()){
                String EmpId= rs.getString("NAME");
                int EmpName= rs.getInt("AGE");
                String EmpDept=rs.getString("COUNTRY");
                System.out.println(EmpId+"\t"+EmpName+"\t"+EmpDept);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }*/

    @After
    public void tearDown() {
        if (connection != null) {
            try {
                System.out.println("Closing Database Connection...");
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}