package Tugas2.Dao;

import java.sql.*;
import java.util.*;

public class RoomDao {
    private final String url = "jdbc:sqlite:./Villa.db";

    private Connection connect() throws SQLException {
        return DriverManager.getConnection(url);
    }

    public List<Map<String, Object>> getAll() {
        List<Map<String, Object>> list = new ArrayList<>();
        String sql = "SELECT * FROM room_types";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Map<String, Object> row = new HashMap<>();
                row.put("id", rs.getInt("id"));
                row.put("villa", rs.getInt("villa"));
                row.put("name", rs.getString("name"));
                row.put("quantity", rs.getInt("quantity"));
                row.put("capacity", rs.getInt("capacity"));
                row.put("price", rs.getInt("price"));
                row.put("bed_size", rs.getString("bed_size"));
                row.put("has_desk", rs.getInt("has_desk"));
                row.put("has_ac", rs.getInt("has_ac"));
                row.put("has_tv", rs.getInt("has_tv"));
                row.put("has_wifi", rs.getInt("has_wifi"));
                row.put("has_shower", rs.getInt("has_shower"));
                row.put("has_hotwater", rs.getInt("has_hotwater"));
                row.put("has_fridge", rs.getInt("has_fridge"));
                list.add(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public Map<String, Object> getById(int id) {
        String sql = "SELECT * FROM room_types WHERE id = ?";
        Map<String, Object> roomType = new HashMap<>();

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                roomType.put("id", rs.getInt("id"));
                roomType.put("villa", rs.getInt("villa"));
                roomType.put("name", rs.getString("name"));
                roomType.put("quantity", rs.getInt("quantity"));
                roomType.put("capacity", rs.getInt("capacity"));
                roomType.put("price", rs.getInt("price"));
                roomType.put("bed_size", rs.getString("bed_size"));
                roomType.put("has_desk", rs.getInt("has_desk"));
                roomType.put("has_ac", rs.getInt("has_ac"));
                roomType.put("has_tv", rs.getInt("has_tv"));
                roomType.put("has_wifi", rs.getInt("has_wifi"));
                roomType.put("has_shower", rs.getInt("has_shower"));
                roomType.put("has_hotwater", rs.getInt("has_hotwater"));
                roomType.put("has_fridge", rs.getInt("has_fridge"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return roomType;
    }

    public void create(Map<String, Object> data) {
        String sql = "INSERT INTO room_types(villa, name, quantity, capacity, price, bed_size, has_desk, has_ac, has_tv, has_wifi, has_shower, has_hotwater, has_fridge) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, (Integer) data.get("villa"));
            pstmt.setString(2, (String) data.get("name"));
            pstmt.setInt(3, (Integer) data.get("quantity"));
            pstmt.setInt(4, (Integer) data.get("capacity"));
            pstmt.setInt(5, (Integer) data.get("price"));
            pstmt.setString(6, (String) data.get("bed_size"));
            pstmt.setInt(7, (Integer) data.get("has_desk"));
            pstmt.setInt(8, (Integer) data.get("has_ac"));
            pstmt.setInt(9, (Integer) data.get("has_tv"));
            pstmt.setInt(10, (Integer) data.get("has_wifi"));
            pstmt.setInt(11, (Integer) data.get("has_shower"));
            pstmt.setInt(12, (Integer) data.get("has_hotwater"));
            pstmt.setInt(13, (Integer) data.get("has_fridge"));
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(int id, Map<String, Object> data) {
        String sql = "UPDATE room_types SET villa = ?, name = ?, quantity = ?, capacity = ?, price = ?, bed_size = ?, has_desk = ?, has_ac = ?, has_tv = ?, has_wifi = ?, has_shower = ?, has_hotwater = ?, has_fridge = ? WHERE id = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, (Integer) data.get("villa"));
            pstmt.setString(2, (String) data.get("name"));
            pstmt.setInt(3, (Integer) data.get("quantity"));
            pstmt.setInt(4, (Integer) data.get("capacity"));
            pstmt.setInt(5, (Integer) data.get("price"));
            pstmt.setString(6, (String) data.get("bed_size"));
            pstmt.setInt(7, (Integer) data.get("has_desk"));
            pstmt.setInt(8, (Integer) data.get("has_ac"));
            pstmt.setInt(9, (Integer) data.get("has_tv"));
            pstmt.setInt(10, (Integer) data.get("has_wifi"));
            pstmt.setInt(11, (Integer) data.get("has_shower"));
            pstmt.setInt(12, (Integer) data.get("has_hotwater"));
            pstmt.setInt(13, (Integer) data.get("has_fridge"));
            pstmt.setInt(14, id);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM room_types WHERE id = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
