

import java.sql.*;

public class DB {
    private final String user = "root";
    private final String password = "";
    private final String url = "jdbc:mysql://localhost/project_ms";
    
    public Connection connect()  throws SQLException
    {
         return DriverManager.getConnection(url, user, password);
    }
}
    
    
      

