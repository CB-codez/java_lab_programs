import java.sql.*;

public class Dbcon {
    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "password";

        try {
               Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish the connection
String u="jdbc:mysql://localhost:3306/testdb";
            Connection con = DriverManager.getConnection(u, "root","Bhagavan029#");
            System.out.println("Connection established successfully!");

            // Step 3: Create a statement
            Statement stmt = con.createStatement();

            // Step 4: Execute a query
            ResultSet rs = stmt.executeQuery("SELECT id, name FROM students");

            // Step 5: Process the results
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println(id + " - " + name);
            }

            // Step 6: Close resources
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}