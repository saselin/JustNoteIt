package de.thb.justnoteit.repository;

import java.sql.*;

public class JdbcTest {
    protected Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/jeedb", "root", "");
        }catch (SQLException slqex) {
            slqex.printStackTrace();
            return null;}
        catch (Exception ex) {
            ex.printStackTrace();
            return null;}
        }
        public void findAllTest(){
            Connection con = null;
            ResultSet rs = null;
            PreparedStatement ps = null;
            String sqlStr = "SELECT * FROM notebook";

            try {
                con = getConnection();
                ps = con.prepareStatement(sqlStr);
                rs = ps.executeQuery();

                while (rs.next()) {
                    System.out.println("Hier: " + rs.getString("name"));
                }
            } catch (SQLException sqlEx) {
                sqlEx.printStackTrace();
        }
    }
}
