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
                Map<String, Object> villa = new HashMap<>();
                villa.put("id", rs.getInt("id"));
                villa.put("name", rs.getString("name"));
                villa.put("description", rs.getString("description"));
                villa.put("address", rs.getString("address"));
                list.add(villa);
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
                villa.put("address", rs.getString("address"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return villa;
    }

    public void create(Map<String, Object> data) {
        String sql = "INSERT INTO villas (name, description, address) VALUES (?, ?, ?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, (String) data.get("name"));
            pstmt.setString(2, (String) data.get("description"));
            pstmt.setString(3, (String) data.get("address"));
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Update villa
    public void update(int id, Map<String, Object> data) {
        String sql = "UPDATE villas SET name = ?, description = ?, address = ? WHERE id = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, (String) data.get("name"));
            pstmt.setString(2, (String) data.get("description"));
            pstmt.setString(3, (String) data.get("address"));
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

    public List<Map<String, Object>> getRoomsByVillaId(int villaId) {
        List<Map<String, Object>> rooms = new ArrayList<>();
        String sql = "SELECT * FROM rooms WHERE villa_id = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, villaId);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Map<String, Object> room = new HashMap<>();
                room.put("id", rs.getInt("id"));
                room.put("villa_id", rs.getInt("villa_id"));
                room.put("name", rs.getString("name"));
                room.put("price", rs.getDouble("price"));
                room.put("capacity", rs.getInt("capacity"));
                rooms.add(room);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rooms;
    }

    public List<Map<String, Object>> getBookingsByVillaId(int villaId) {
        List<Map<String, Object>> bookings = new ArrayList<>();
        String sql = "SELECT * FROM bookings WHERE villa_id = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, villaId);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Map<String, Object> booking = new HashMap<>();
                booking.put("id", rs.getInt("id"));
                booking.put("villa_id", rs.getInt("villa_id"));
                booking.put("customer_id", rs.getInt("customer_id"));
                booking.put("check_in", rs.getString("check_in"));
                booking.put("check_out", rs.getString("check_out"));
                bookings.add(booking);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return bookings;
    }

    public List<Map<String, Object>> getReviewsByVillaId(int villaId) {
        List<Map<String, Object>> reviews = new ArrayList<>();
        String sql = "SELECT * FROM reviews WHERE villa_id = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, villaId);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Map<String, Object> review = new HashMap<>();
                review.put("id", rs.getInt("id"));
                review.put("villa_id", rs.getInt("villa_id"));
                review.put("customer_id", rs.getInt("customer_id"));
                review.put("rating", rs.getInt("rating"));
                review.put("comment", rs.getString("comment"));
                reviews.add(review);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return reviews;
    }

    public List<Map<String, Object>> searchAvailability(String startDate, String endDate) {
        List<Map<String, Object>> available = new ArrayList<>();
        String sql = "SELECT * FROM villas WHERE id NOT IN " +
                "(SELECT villa_id FROM bookings WHERE check_in < ? AND check_out > ?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, endDate);
            pstmt.setString(2, startDate);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Map<String, Object> villa = new HashMap<>();
                villa.put("id", rs.getInt("id"));
                villa.put("name", rs.getString("name"));
                villa.put("description", rs.getString("description"));
                villa.put("address", rs.getString("address"));
                available.add(villa);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return available;
    }

    public void createRoomForVilla(int villaId, Map<String, Object> data) {
        String sql = "INSERT INTO rooms (villa_id, name, price, capacity) VALUES (?, ?, ?, ?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, villaId);
            pstmt.setString(2, (String) data.get("name"));
            pstmt.setDouble(3, (double) data.get("price"));
            pstmt.setInt(4, (int) data.get("capacity"));
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateRoomInVilla(int villaId, int roomId, Map<String, Object> data) {
        String sql = "UPDATE rooms SET name = ?, price = ?, capacity = ? WHERE id = ? AND villa_id = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, (String) data.get("name"));
            pstmt.setDouble(2, (double) data.get("price"));
            pstmt.setInt(3, (int) data.get("capacity"));
            pstmt.setInt(4, roomId);
            pstmt.setInt(5, villaId);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Map<String, Object> getRoomById(int roomId) {
        String sql = "SELECT * FROM rooms WHERE id = ?";
        Map<String, Object> room = new HashMap<>();

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, roomId);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                room.put("id", rs.getInt("id"));
                room.put("villa_id", rs.getInt("villa_id"));
                room.put("name", rs.getString("name"));
                room.put("price", rs.getDouble("price"));
                room.put("capacity", rs.getInt("capacity"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return room;
    }

    public void deleteRoomFromVilla(int villaId, int roomId) {
        String sql = "DELETE FROM rooms WHERE id = ? AND villa_id = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, roomId);
            pstmt.setInt(2, villaId);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
