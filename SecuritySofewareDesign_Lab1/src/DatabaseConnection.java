import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
  
  private String databaseServer = "127.0.0.1";

  public final Connection getConnection() throws SQLException {
    return DriverManager.getConnection("jdbc:mysql://" + databaseServer + "/dbName", 
        "username", "password");
  }
}