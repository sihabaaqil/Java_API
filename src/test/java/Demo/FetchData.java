package Demo;

import java.sql.*;

public class FetchData {
    private static String userName;
    private static String password;
    private static String dbURL;
    private static Connection connection;

    public static void main(String[] args) throws ClassNotFoundException {
        try {

//            Host: localhost
//            Port: 3306
//            User: root
//            SSL: enabled with TLS_AES_128_GCM_SHA256

            userName = "root";
            password = "admin123";
            dbURL = "jdbc:mysql://localhost:3306/grdatabase";
            //jdbc:mysql://localhost:3306/?user=root grdatabase
//            try {
//                Class.forName("com.mysql.jdbc.Driver");
//            }
//            catch (ClassNotFoundException e) {
//                System.out.println("MySQL JDBC driver not found.");
//                e.printStackTrace();
//            }
            try {
                connection = DriverManager. getConnection(dbURL, userName, password);
                Statement st = connection.createStatement();
                String sqlStr = "select * from acq_cxt_forms where BRAND =\"SpecificBeauty\"";
                ResultSet rs = st.executeQuery(sqlStr);
                while (rs.next()) {
                    System.out.println(rs.getString("BRAND"));
                }

            } catch (SQLException e) {
                System.out.println("Connection to MySQL db failed");
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    } // function ends
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            //root@localhost:3306
//            //jdbc:mysql://localhost:3306/?user=root grdatabase
//            Connection con=DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/database","root","admin123");
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("select * from acq_cxt_forms");
//            while (rs.next()) System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
//            con.close();
//        } catch (Exception e) {
//            System.out.println("Error : "+e);
//        }
//    }
//        // Database credentials
//       // String jdbcURL = "jdbc:mysql://localhost:3306/admin";
//        String jdbcURL = "jdbc:mysql://127.0.0.1:3306/admin";
//        String username = "root";
//        String password = "admin123";
//
//        // SQL query
//        String sql = "select * from acq_cxt_forms;";//"SELECT id, name, position FROM employees";
//
//        // Establishing the connection
//        try (Connection connection = DriverManager.getConnection(jdbcURL, username, password)) {
//            System.out.println("Connected to the database");
//
//            // Creating a statement
//            Statement statement = connection.createStatement();
//
//            // Executing the query
//            ResultSet resultSet = statement.executeQuery(sql);
//
//            // Processing the result set
//            while (resultSet.next()) {
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                String position = resultSet.getString("position");
//
//                System.out.println("ID: " + id + ", Name: " + name + ", Position: " + position);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
}

