package Tugas2.Dao;

import java.sql.*;
import java.util.*;

public class VillaDao {
    private final String url = "jdbc:sqlite:./Villa.db";

    private Connection connect() throws SQLException {
        return DriverManager.getConnection(url);
    }

    public List<Map<String, Object>> getAll() {
        List<Map<String, Object>> list = new ArrayList<>();
        String sql = "SELECT * FROM villas";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Map<String, Object> row = new HashMap<>();
                row.put("id", rs.getInt("id"));
                row.put("name", rs.getString("name"));
                row.put("description", rs.getString("description"));
                row.put("address", rs.getDouble("address"));
                list.add(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public Map<String, Object> getById(int id) {
        String sql = "SELECT * FROM villas WHERE id = ?";
        Map<String, Object> villa = new HashMap<>();

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                villa.put("id", rs.getInt("id"));
                villa.put("name", rs.getString("name"));
                villa.put("description", rs.getString("description"));
                villa.put("address", rs.getDouble("address"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return villa;
    }

    public void create(Map<String, Object> data) {
        String sql = "INSERT INTO villas(name, location, price) VALUES(?, ?, ?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, (String) data.get("name"));
            pstmt.setString(2, (String) data.get("location"));
            pstmt.setDouble(3, Double.parseDouble(data.get("price").toString()));
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(int id, Map<String, Object> data) {
        String sql = "UPDATE villas SET name = ?, description = ?, address = ? WHERE id = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, (String) data.get("name"));
            pstmt.setString(2, (String) data.get("description"));
            pstmt.setDouble(3, Double.parseDouble(data.get("address").toString()));
            pstmt.setInt(4, id);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM villas WHERE id = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
