package Tugas2.Dao;

import java.sql.*;
import java.util.*;

public class CustomerDao {
    private final String url = "jdbc:sqlite:./Villa.db";

    private Connection connect() throws SQLException {
        return DriverManager.getConnection(url);
    }

    public List<Map<String, Object>> getAll() {
        List<Map<String, Object>> list = new ArrayList<>();
        String sql = "SELECT * FROM customers";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Map<String, Object> row = new HashMap<>();
                row.put("id", rs.getInt("id"));
                row.put("name", rs.getString("name"));
                row.put("email", rs.getString("email"));
                row.put("phone", rs.getString("phone"));
                list.add(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public Map<String, Object> getById(int id) {
        String sql = "SELECT * FROM customers WHERE id = ?";
        Map<String, Object> customer = new HashMap<>();

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                customer.put("id", rs.getInt("id"));
                customer.put("name", rs.getString("name"));
                customer.put("email", rs.getString("email"));
                customer.put("phone", rs.getString("phone"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return customer;
    }

    public void create(Map<String, Object> data) {
        String sql = "INSERT INTO customers(name, email, phone) VALUES(?, ?, ?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, (String) data.get("name"));
            pstmt.setString(2, (String) data.get("email"));
            pstmt.setString(3, (String) data.get("phone"));
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(int id, Map<String, Object> data) {
        String sql = "UPDATE customers SET name = ?, email = ?, phone = ? WHERE id = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, (String) data.get("name"));
            pstmt.setString(2, (String) data.get("email"));
            pstmt.setString(3, (String) data.get("phone"));
            pstmt.setInt(4, id);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM customers WHERE id = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
