import java.sql.*;     // Use classes in java.sql package
 
public class JdbcInsertTest {    // Save as "JdbcUpdateTest.java"
   public static void main(String[] args) {
      try (
         // Step 1: Allocate a database 'Connection' object
         Connection conn = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
               "newuser", ""); // for MySQL only
 
         // Step 2: Allocate a 'Statement' object in the Connection
         Statement stmt = conn.createStatement();
      ) {
         // Step 3 & 4: Execute a SQL INSERT|DELETE statement via executeUpdate(),
         //   which returns an int indicating the number of rows affected.
 
         // DELETE records with id>=3000 and id<4000
         String sqlDelete = "DELETE FROM books WHERE id >= 3000 AND id < 4000";
         System.out.println("The SQL statement is: " + sqlDelete + "\n");  // Echo for debugging
         int countDeleted = stmt.executeUpdate(sqlDelete);
         System.out.println(countDeleted + " records deleted.\n");
 
         // INSERT a record
         String sqlInsert = "INSERT INTO books VALUES (8001, 'Java ABC', 'Kevin Jones', 15.55, 55)";
         System.out.println("The SQL statement is: " + sqlInsert + "\n");  // Echo for debugging
         int countInserted = stmt.executeUpdate(sqlInsert);
         System.out.println(countInserted + " records inserted.\n");
 
         // INSERT multiple records
         sqlInsert = "INSERT INTO books VALUES "
               + "(8002, 'Java XYZ', 'Kevin Jones', 25.55, 55),"
               + "(8004, 'Java XYZT', 'Kevin Jones', 25.55, 55)";
         System.out.println("The SQL statement is: " + sqlInsert + "\n");  // Echo for debugging
         countInserted = stmt.executeUpdate(sqlInsert);
         System.out.println(countInserted + " records inserted.\n");
 
         // Step 3 & 4: Issue a SELECT (via executeQuery()) to check the changes
         String strSelect = "SELECT * FROM books";
         System.out.println("The SQL statement is: " + strSelect + "\n");  // Echo For debugging
         ResultSet rset = stmt.executeQuery(strSelect);
         while(rset.next()) {   // Move the cursor to the next row
            System.out.println(rset.getInt("id") + ", "
                    + rset.getString("author") + ", "
                    + rset.getString("title") + ", "
                    + rset.getDouble("price") + ", "
                    + rset.getInt("qty"));
         }
      } catch(SQLException ex) {
         ex.printStackTrace();
      }  // Step 5: Close conn and stmt - Done automatically by try-with-resources
   }
}