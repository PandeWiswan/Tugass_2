package Tugas2.Dao;

import java.sql.*;
import java.util.*;

public class BookingDao {
    private final String url = "jdbc:sqlite:./Villa.db";

    private Connection connect() throws SQLException {
        return DriverManager.getConnection(url);
    }

    public List<Map<String, Object>> getAll() {
        List<Map<String, Object>> list = new ArrayList<>();
        String sql = "SELECT * FROM bookings";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Map<String, Object> row = new HashMap<>();
                row.put("id", rs.getInt("id"));
                row.put("customer", rs.getInt("customer"));
                row.put("room_type", rs.getInt("room_type"));
                row.put("checkin_date", rs.getString("checkin_date"));
                row.put("checkout_date", rs.getString("checkout_date"));
                row.put("price", rs.getInt("price"));
                row.put("voucher", rs.getInt("voucher"));
                row.put("final_price", rs.getInt("final_price"));
                row.put("payment_status", rs.getString("payment_status"));
                row.put("has_checkedin", rs.getInt("has_checkedin"));
                row.put("has_checkedout", rs.getInt("has_checkedout"));
                list.add(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public Map<String, Object> getById(int id) {
        String sql = "SELECT * FROM bookings WHERE id = ?";
        Map<String, Object> booking = new HashMap<>();

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                booking.put("id", rs.getInt("id"));
                booking.put("customer", rs.getInt("customer"));
                booking.put("room_type", rs.getInt("room_type"));
                booking.put("checkin_date", rs.getString("checkin_date"));
                booking.put("checkout_date", rs.getString("checkout_date"));
                booking.put("price", rs.getInt("price"));
                booking.put("voucher", rs.getInt("voucher"));
                booking.put("final_price", rs.getInt("final_price"));
                booking.put("payment_status", rs.getString("payment_status"));
                booking.put("has_checkedin", rs.getInt("has_checkedin"));
                booking.put("has_checkedout", rs.getInt("has_checkedout"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return booking;
    }

    public void create(Map<String, Object> data) {
        String sql = "INSERT INTO bookings(customer, room_type, checkin_date, checkout_date, price, voucher, final_price, payment_status) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, (Integer) data.get("customer"));
            pstmt.setInt(2, (Integer) data.get("room_type"));
            pstmt.setString(3, (String) data.get("checkin_date"));
            pstmt.setString(4, (String) data.get("checkout_date"));
            pstmt.setInt(5, (Integer) data.get("price"));
            pstmt.setInt(6, (Integer) data.get("voucher"));
            pstmt.setInt(7, (Integer) data.get("final_price"));
            pstmt.setString(8, (String) data.get("payment_status"));
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(int id, Map<String, Object> data) {
        String sql = "UPDATE bookings SET customer = ?, room_type = ?, checkin_date = ?, checkout_date = ?, price = ?, voucher = ?, final_price = ?, payment_status = ?, has_checkedin = ?, has_checkedout = ? WHERE id = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, (Integer) data.get("customer"));
            pstmt.setInt(2, (Integer) data.get("room_type"));
            pstmt.setString(3, (String) data.get("checkin_date"));
            pstmt.setString(4, (String) data.get("checkout_date"));
            pstmt.setInt(5, (Integer) data.get("price"));
            pstmt.setInt(6, (Integer) data.get("voucher"));
            pstmt.setInt(7, (Integer) data.get("final_price"));
            pstmt.setString(8, (String) data.get("payment_status"));
            pstmt.setInt(9, (Integer) data.get("has_checkedin"));
            pstmt.setInt(10, (Integer) data.get("has_checkedout"));
            pstmt.setInt(11, id);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM bookings WHERE id = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
